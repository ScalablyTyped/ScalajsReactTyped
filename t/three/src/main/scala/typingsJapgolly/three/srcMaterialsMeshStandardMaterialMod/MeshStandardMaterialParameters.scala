package typingsJapgolly.three.srcMaterialsMeshStandardMaterialMod

import typingsJapgolly.three.srcConstantsMod.Blending
import typingsJapgolly.three.srcConstantsMod.BlendingDstFactor
import typingsJapgolly.three.srcConstantsMod.BlendingEquation
import typingsJapgolly.three.srcConstantsMod.BlendingSrcFactor
import typingsJapgolly.three.srcConstantsMod.Colors
import typingsJapgolly.three.srcConstantsMod.DepthModes
import typingsJapgolly.three.srcConstantsMod.NormalMapTypes
import typingsJapgolly.three.srcConstantsMod.Side
import typingsJapgolly.three.srcConstantsMod.StencilFunc
import typingsJapgolly.three.srcConstantsMod.StencilOp
import typingsJapgolly.three.srcMaterialsMaterialMod.MaterialParameters
import typingsJapgolly.three.srcMathColorMod.Color
import typingsJapgolly.three.srcMathPlaneMod.Plane
import typingsJapgolly.three.srcMathVector2Mod.Vector2
import typingsJapgolly.three.srcTexturesTextureMod.Texture
import typingsJapgolly.three.threeStrings.highp
import typingsJapgolly.three.threeStrings.lowp
import typingsJapgolly.three.threeStrings.mediump
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshStandardMaterialParameters extends MaterialParameters {
  var alphaMap: js.UndefOr[Texture | Null] = js.undefined
  var aoMap: js.UndefOr[Texture | Null] = js.undefined
  var aoMapIntensity: js.UndefOr[Double] = js.undefined
  var bumpMap: js.UndefOr[Texture | Null] = js.undefined
  var bumpScale: js.UndefOr[Double] = js.undefined
  var color: js.UndefOr[Color | String | Double] = js.undefined
  var displacementBias: js.UndefOr[Double] = js.undefined
  var displacementMap: js.UndefOr[Texture | Null] = js.undefined
  var displacementScale: js.UndefOr[Double] = js.undefined
  var emissive: js.UndefOr[Color | String | Double] = js.undefined
  var emissiveIntensity: js.UndefOr[Double] = js.undefined
  var emissiveMap: js.UndefOr[Texture | Null] = js.undefined
  var envMap: js.UndefOr[Texture | Null] = js.undefined
  var envMapIntensity: js.UndefOr[Double] = js.undefined
  var lightMap: js.UndefOr[Texture | Null] = js.undefined
  var lightMapIntensity: js.UndefOr[Double] = js.undefined
  var map: js.UndefOr[Texture | Null] = js.undefined
  var metalness: js.UndefOr[Double] = js.undefined
  var metalnessMap: js.UndefOr[Texture | Null] = js.undefined
  var morphNormals: js.UndefOr[Boolean] = js.undefined
  var morphTargets: js.UndefOr[Boolean] = js.undefined
  var normalMap: js.UndefOr[Texture | Null] = js.undefined
  var normalMapType: js.UndefOr[NormalMapTypes] = js.undefined
  var normalScale: js.UndefOr[Vector2] = js.undefined
  var refractionRatio: js.UndefOr[Double] = js.undefined
  var roughness: js.UndefOr[Double] = js.undefined
  var roughnessMap: js.UndefOr[Texture | Null] = js.undefined
  var skinning: js.UndefOr[Boolean] = js.undefined
  var wireframe: js.UndefOr[Boolean] = js.undefined
  var wireframeLinewidth: js.UndefOr[Double] = js.undefined
}

object MeshStandardMaterialParameters {
  @scala.inline
  def apply(
    alphaMap: Texture = null,
    alphaTest: Int | Double = null,
    aoMap: Texture = null,
    aoMapIntensity: Int | Double = null,
    blendDst: BlendingDstFactor = null,
    blendDstAlpha: Int | Double = null,
    blendEquation: BlendingEquation = null,
    blendEquationAlpha: Int | Double = null,
    blendSrc: BlendingSrcFactor | BlendingDstFactor = null,
    blendSrcAlpha: Int | Double = null,
    blending: Blending = null,
    bumpMap: Texture = null,
    bumpScale: Int | Double = null,
    clipIntersection: js.UndefOr[Boolean] = js.undefined,
    clipShadows: js.UndefOr[Boolean] = js.undefined,
    clippingPlanes: js.Array[Plane] = null,
    color: Color | String | Double = null,
    colorWrite: js.UndefOr[Boolean] = js.undefined,
    depthFunc: DepthModes = null,
    depthTest: js.UndefOr[Boolean] = js.undefined,
    depthWrite: js.UndefOr[Boolean] = js.undefined,
    displacementBias: Int | Double = null,
    displacementMap: Texture = null,
    displacementScale: Int | Double = null,
    dithering: js.UndefOr[Boolean] = js.undefined,
    emissive: Color | String | Double = null,
    emissiveIntensity: Int | Double = null,
    emissiveMap: Texture = null,
    envMap: Texture = null,
    envMapIntensity: Int | Double = null,
    flatShading: js.UndefOr[Boolean] = js.undefined,
    fog: js.UndefOr[Boolean] = js.undefined,
    lightMap: Texture = null,
    lightMapIntensity: Int | Double = null,
    map: Texture = null,
    metalness: Int | Double = null,
    metalnessMap: Texture = null,
    morphNormals: js.UndefOr[Boolean] = js.undefined,
    morphTargets: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    normalMap: Texture = null,
    normalMapType: NormalMapTypes = null,
    normalScale: Vector2 = null,
    opacity: Int | Double = null,
    overdraw: Int | Double = null,
    polygonOffset: js.UndefOr[Boolean] = js.undefined,
    polygonOffsetFactor: Int | Double = null,
    polygonOffsetUnits: Int | Double = null,
    precision: highp | mediump | lowp = null,
    premultipliedAlpha: js.UndefOr[Boolean] = js.undefined,
    refractionRatio: Int | Double = null,
    roughness: Int | Double = null,
    roughnessMap: Texture = null,
    shadowSide: Side = null,
    side: Side = null,
    skinning: js.UndefOr[Boolean] = js.undefined,
    stencilFail: StencilOp = null,
    stencilFunc: StencilFunc = null,
    stencilMask: Int | Double = null,
    stencilRef: Int | Double = null,
    stencilWrite: js.UndefOr[Boolean] = js.undefined,
    stencilZFail: StencilOp = null,
    stencilZPass: StencilOp = null,
    toneMapped: js.UndefOr[Boolean] = js.undefined,
    transparent: js.UndefOr[Boolean] = js.undefined,
    vertexColors: Colors = null,
    vertexTangents: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined,
    wireframe: js.UndefOr[Boolean] = js.undefined,
    wireframeLinewidth: Int | Double = null
  ): MeshStandardMaterialParameters = {
    val __obj = js.Dynamic.literal()
    if (alphaMap != null) __obj.updateDynamic("alphaMap")(alphaMap.asInstanceOf[js.Any])
    if (alphaTest != null) __obj.updateDynamic("alphaTest")(alphaTest.asInstanceOf[js.Any])
    if (aoMap != null) __obj.updateDynamic("aoMap")(aoMap.asInstanceOf[js.Any])
    if (aoMapIntensity != null) __obj.updateDynamic("aoMapIntensity")(aoMapIntensity.asInstanceOf[js.Any])
    if (blendDst != null) __obj.updateDynamic("blendDst")(blendDst.asInstanceOf[js.Any])
    if (blendDstAlpha != null) __obj.updateDynamic("blendDstAlpha")(blendDstAlpha.asInstanceOf[js.Any])
    if (blendEquation != null) __obj.updateDynamic("blendEquation")(blendEquation.asInstanceOf[js.Any])
    if (blendEquationAlpha != null) __obj.updateDynamic("blendEquationAlpha")(blendEquationAlpha.asInstanceOf[js.Any])
    if (blendSrc != null) __obj.updateDynamic("blendSrc")(blendSrc.asInstanceOf[js.Any])
    if (blendSrcAlpha != null) __obj.updateDynamic("blendSrcAlpha")(blendSrcAlpha.asInstanceOf[js.Any])
    if (blending != null) __obj.updateDynamic("blending")(blending.asInstanceOf[js.Any])
    if (bumpMap != null) __obj.updateDynamic("bumpMap")(bumpMap.asInstanceOf[js.Any])
    if (bumpScale != null) __obj.updateDynamic("bumpScale")(bumpScale.asInstanceOf[js.Any])
    if (!js.isUndefined(clipIntersection)) __obj.updateDynamic("clipIntersection")(clipIntersection.asInstanceOf[js.Any])
    if (!js.isUndefined(clipShadows)) __obj.updateDynamic("clipShadows")(clipShadows.asInstanceOf[js.Any])
    if (clippingPlanes != null) __obj.updateDynamic("clippingPlanes")(clippingPlanes.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWrite)) __obj.updateDynamic("colorWrite")(colorWrite.asInstanceOf[js.Any])
    if (depthFunc != null) __obj.updateDynamic("depthFunc")(depthFunc.asInstanceOf[js.Any])
    if (!js.isUndefined(depthTest)) __obj.updateDynamic("depthTest")(depthTest.asInstanceOf[js.Any])
    if (!js.isUndefined(depthWrite)) __obj.updateDynamic("depthWrite")(depthWrite.asInstanceOf[js.Any])
    if (displacementBias != null) __obj.updateDynamic("displacementBias")(displacementBias.asInstanceOf[js.Any])
    if (displacementMap != null) __obj.updateDynamic("displacementMap")(displacementMap.asInstanceOf[js.Any])
    if (displacementScale != null) __obj.updateDynamic("displacementScale")(displacementScale.asInstanceOf[js.Any])
    if (!js.isUndefined(dithering)) __obj.updateDynamic("dithering")(dithering.asInstanceOf[js.Any])
    if (emissive != null) __obj.updateDynamic("emissive")(emissive.asInstanceOf[js.Any])
    if (emissiveIntensity != null) __obj.updateDynamic("emissiveIntensity")(emissiveIntensity.asInstanceOf[js.Any])
    if (emissiveMap != null) __obj.updateDynamic("emissiveMap")(emissiveMap.asInstanceOf[js.Any])
    if (envMap != null) __obj.updateDynamic("envMap")(envMap.asInstanceOf[js.Any])
    if (envMapIntensity != null) __obj.updateDynamic("envMapIntensity")(envMapIntensity.asInstanceOf[js.Any])
    if (!js.isUndefined(flatShading)) __obj.updateDynamic("flatShading")(flatShading.asInstanceOf[js.Any])
    if (!js.isUndefined(fog)) __obj.updateDynamic("fog")(fog.asInstanceOf[js.Any])
    if (lightMap != null) __obj.updateDynamic("lightMap")(lightMap.asInstanceOf[js.Any])
    if (lightMapIntensity != null) __obj.updateDynamic("lightMapIntensity")(lightMapIntensity.asInstanceOf[js.Any])
    if (map != null) __obj.updateDynamic("map")(map.asInstanceOf[js.Any])
    if (metalness != null) __obj.updateDynamic("metalness")(metalness.asInstanceOf[js.Any])
    if (metalnessMap != null) __obj.updateDynamic("metalnessMap")(metalnessMap.asInstanceOf[js.Any])
    if (!js.isUndefined(morphNormals)) __obj.updateDynamic("morphNormals")(morphNormals.asInstanceOf[js.Any])
    if (!js.isUndefined(morphTargets)) __obj.updateDynamic("morphTargets")(morphTargets.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (normalMap != null) __obj.updateDynamic("normalMap")(normalMap.asInstanceOf[js.Any])
    if (normalMapType != null) __obj.updateDynamic("normalMapType")(normalMapType.asInstanceOf[js.Any])
    if (normalScale != null) __obj.updateDynamic("normalScale")(normalScale.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (overdraw != null) __obj.updateDynamic("overdraw")(overdraw.asInstanceOf[js.Any])
    if (!js.isUndefined(polygonOffset)) __obj.updateDynamic("polygonOffset")(polygonOffset.asInstanceOf[js.Any])
    if (polygonOffsetFactor != null) __obj.updateDynamic("polygonOffsetFactor")(polygonOffsetFactor.asInstanceOf[js.Any])
    if (polygonOffsetUnits != null) __obj.updateDynamic("polygonOffsetUnits")(polygonOffsetUnits.asInstanceOf[js.Any])
    if (precision != null) __obj.updateDynamic("precision")(precision.asInstanceOf[js.Any])
    if (!js.isUndefined(premultipliedAlpha)) __obj.updateDynamic("premultipliedAlpha")(premultipliedAlpha.asInstanceOf[js.Any])
    if (refractionRatio != null) __obj.updateDynamic("refractionRatio")(refractionRatio.asInstanceOf[js.Any])
    if (roughness != null) __obj.updateDynamic("roughness")(roughness.asInstanceOf[js.Any])
    if (roughnessMap != null) __obj.updateDynamic("roughnessMap")(roughnessMap.asInstanceOf[js.Any])
    if (shadowSide != null) __obj.updateDynamic("shadowSide")(shadowSide.asInstanceOf[js.Any])
    if (side != null) __obj.updateDynamic("side")(side.asInstanceOf[js.Any])
    if (!js.isUndefined(skinning)) __obj.updateDynamic("skinning")(skinning.asInstanceOf[js.Any])
    if (stencilFail != null) __obj.updateDynamic("stencilFail")(stencilFail.asInstanceOf[js.Any])
    if (stencilFunc != null) __obj.updateDynamic("stencilFunc")(stencilFunc.asInstanceOf[js.Any])
    if (stencilMask != null) __obj.updateDynamic("stencilMask")(stencilMask.asInstanceOf[js.Any])
    if (stencilRef != null) __obj.updateDynamic("stencilRef")(stencilRef.asInstanceOf[js.Any])
    if (!js.isUndefined(stencilWrite)) __obj.updateDynamic("stencilWrite")(stencilWrite.asInstanceOf[js.Any])
    if (stencilZFail != null) __obj.updateDynamic("stencilZFail")(stencilZFail.asInstanceOf[js.Any])
    if (stencilZPass != null) __obj.updateDynamic("stencilZPass")(stencilZPass.asInstanceOf[js.Any])
    if (!js.isUndefined(toneMapped)) __obj.updateDynamic("toneMapped")(toneMapped.asInstanceOf[js.Any])
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent.asInstanceOf[js.Any])
    if (vertexColors != null) __obj.updateDynamic("vertexColors")(vertexColors.asInstanceOf[js.Any])
    if (!js.isUndefined(vertexTangents)) __obj.updateDynamic("vertexTangents")(vertexTangents.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(wireframe)) __obj.updateDynamic("wireframe")(wireframe.asInstanceOf[js.Any])
    if (wireframeLinewidth != null) __obj.updateDynamic("wireframeLinewidth")(wireframeLinewidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshStandardMaterialParameters]
  }
}

