package com.izofar.bygonenether.client.renderer;

import com.izofar.bygonenether.BygoneNetherMod;
import com.izofar.bygonenether.client.model.WitherBruteModel;
import com.izofar.bygonenether.entity.WitherBrute;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.resources.ResourceLocation;

public class WitherBruteRenderer extends HumanoidMobRenderer<WitherBrute, WitherBruteModel> {

    private static final ResourceLocation BRUTE_LOCATION = new ResourceLocation(BygoneNetherMod.MODID, "textures/entity/wither/wither_brute.png");

    public WitherBruteRenderer(EntityRendererProvider.Context context) { super(context, new WitherBruteModel(WitherBruteModel.createBodyLayer().bakeRoot()), 0.5F); }

    @Override
    public ResourceLocation getTextureLocation(WitherBrute wither){ return BRUTE_LOCATION; }

    protected void scale(WitherBrute witherBrute, PoseStack stack, float f) {
        stack.scale(1.2F, 1.2F, 1.2F);
    }
}