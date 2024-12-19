package vcd.minefishing.mixin.entity;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.FishingBobberEntity;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static vcd.minefishing.WebRods.fishing_rods;

@Mixin(FishingBobberEntity.class)
public class FishingHookMixin {

    @Unique
    FishingBobberEntity fishinghook = (FishingBobberEntity)(Object)this;

    @Inject(method = "removeIfInvalid", at = @At("HEAD"), cancellable = true)
    private void injectedRemoveIfInvalid(PlayerEntity player, CallbackInfoReturnable<Boolean> cir) {
        ItemStack mainHandStack = player.getMainHandStack();
        ItemStack offHandStack = player.getOffHandStack();
        boolean isRod = fishing_rods.contains(mainHandStack.getItem()) || fishing_rods.contains(offHandStack.getItem());
        if (isRod) {
            if (!player.isRemoved() && player.isAlive() && !(fishinghook.distanceTo(player) > 1024.0)) {
                cir.setReturnValue(false);
            } else {
                fishinghook.discard();
                cir.setReturnValue(true);
            }
        }
    }
}