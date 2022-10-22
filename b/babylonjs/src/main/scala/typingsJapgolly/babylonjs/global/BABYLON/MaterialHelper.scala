package typingsJapgolly.babylonjs.global.BABYLON

import typingsJapgolly.babylonjs.BABYLON.IEffectCreationOptions
import typingsJapgolly.babylonjs.BABYLON.Nullable
import typingsJapgolly.babylonjs.anon.LightmapMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("BABYLON.MaterialHelper")
@js.native
open class MaterialHelper ()
  extends StObject
     with typingsJapgolly.babylonjs.BABYLON.MaterialHelper
/* static members */
object MaterialHelper {
  
  @JSGlobal("BABYLON.MaterialHelper")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Binds the bones information from the mesh to the effect.
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param prePassConfiguration Configuration for the prepass, in case prepass is activated
    */
  inline def BindBonesParameters(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")().asInstanceOf[Unit]
  inline def BindBonesParameters(
    mesh: Unit,
    effect: Unit,
    prePassConfiguration: typingsJapgolly.babylonjs.BABYLON.PrePassConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], prePassConfiguration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindBonesParameters(mesh: Unit, effect: typingsJapgolly.babylonjs.BABYLON.Effect): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindBonesParameters(
    mesh: Unit,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    prePassConfiguration: typingsJapgolly.babylonjs.BABYLON.PrePassConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], prePassConfiguration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindBonesParameters(mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def BindBonesParameters(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: Unit,
    prePassConfiguration: typingsJapgolly.babylonjs.BABYLON.PrePassConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], prePassConfiguration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindBonesParameters(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindBonesParameters(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    prePassConfiguration: typingsJapgolly.babylonjs.BABYLON.PrePassConfiguration
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindBonesParameters")(mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], prePassConfiguration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the clip plane information from the scene to the effect.
    * @param effect The effect we are binding the data to
    * @param scene The scene the clip plane information are extracted from
    */
  inline def BindClipPlane(effect: typingsJapgolly.babylonjs.BABYLON.Effect, scene: typingsJapgolly.babylonjs.BABYLON.Scene): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindClipPlane")(effect.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the fog information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param linearSpace Defines if the fog effect is applied in linear space
    */
  inline def BindFogParameters(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindFogParameters")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindFogParameters(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    linearSpace: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindFogParameters")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], linearSpace.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param light Light to bind
    * @param lightIndex Light index
    * @param scene The scene where the light belongs to
    * @param effect The effect we are binding the data to
    * @param useSpecular Defines if specular is supported
    * @param receiveShadows Defines if the effect (mesh) we bind the light for receives shadows
    */
  inline def BindLight(
    light: typingsJapgolly.babylonjs.BABYLON.Light,
    lightIndex: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    useSpecular: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLight")(light.asInstanceOf[js.Any], lightIndex.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], useSpecular.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindLight(
    light: typingsJapgolly.babylonjs.BABYLON.Light,
    lightIndex: Double,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    useSpecular: Boolean,
    receiveShadows: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLight")(light.asInstanceOf[js.Any], lightIndex.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], useSpecular.asInstanceOf[js.Any], receiveShadows.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the light information to the effect.
    * @param light The light containing the generator
    * @param effect The effect we are binding the data to
    * @param lightIndex The light index in the effect used to render
    */
  inline def BindLightProperties(
    light: typingsJapgolly.babylonjs.BABYLON.Light,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    lightIndex: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLightProperties")(light.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], lightIndex.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the lights information from the scene to the effect for the given mesh.
    * @param scene The scene the lights belongs to
    * @param mesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    * @param defines The generated defines for the effect
    * @param maxSimultaneousLights The maximum number of light that can be bound to the effect
    */
  inline def BindLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    defines: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def BindLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    defines: Any,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the logarithmic depth information from the scene to the effect for the given defines.
    * @param defines The generated defines used in the effect
    * @param effect The effect we are binding the data to
    * @param scene The scene we are willing to render with logarithmic scale for
    */
  inline def BindLogDepth(
    defines: Any,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindLogDepth")(defines.asInstanceOf[js.Any], effect.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the morph targets information from the mesh to the effect.
    * @param abstractMesh The mesh we are binding the information to render
    * @param effect The effect we are binding the data to
    */
  inline def BindMorphTargetParameters(
    abstractMesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    effect: typingsJapgolly.babylonjs.BABYLON.Effect
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindMorphTargetParameters")(abstractMesh.asInstanceOf[js.Any], effect.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds the scene's uniform buffer to the effect.
    * @param effect defines the effect to bind to the scene uniform buffer
    * @param sceneUbo defines the uniform buffer storing scene data
    */
  inline def BindSceneUniformBuffer(
    effect: typingsJapgolly.babylonjs.BABYLON.Effect,
    sceneUbo: typingsJapgolly.babylonjs.BABYLON.UniformBuffer
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindSceneUniformBuffer")(effect.asInstanceOf[js.Any], sceneUbo.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Binds a texture matrix value to its corresponding uniform
    * @param texture The texture to bind the matrix for
    * @param uniformBuffer The uniform buffer receiving the data
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  inline def BindTextureMatrix(
    texture: typingsJapgolly.babylonjs.BABYLON.BaseTexture,
    uniformBuffer: typingsJapgolly.babylonjs.BABYLON.UniformBuffer,
    key: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("BindTextureMatrix")(texture.asInstanceOf[js.Any], uniformBuffer.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Gets the current status of the fog (should it be enabled?)
    * @param mesh defines the mesh to evaluate for fog support
    * @param scene defines the hosting scene
    * @returns true if fog must be enabled
    */
  inline def GetFogState(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("GetFogState")(mesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * This helps decreasing rank by rank the shadow quality (0 being the highest rank and quality)
    * @param defines The defines to update while falling back
    * @param fallbacks The authorized effect fallbacks
    * @param maxSimultaneousLights The maximum number of lights allowed
    * @param rank the current rank of the Effect
    * @returns The newly affected rank
    */
  inline def HandleFallbacksForShadows(defines: Any, fallbacks: typingsJapgolly.babylonjs.BABYLON.EffectFallbacks): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HandleFallbacksForShadows")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def HandleFallbacksForShadows(
    defines: Any,
    fallbacks: typingsJapgolly.babylonjs.BABYLON.EffectFallbacks,
    maxSimultaneousLights: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HandleFallbacksForShadows")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def HandleFallbacksForShadows(
    defines: Any,
    fallbacks: typingsJapgolly.babylonjs.BABYLON.EffectFallbacks,
    maxSimultaneousLights: Double,
    rank: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HandleFallbacksForShadows")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def HandleFallbacksForShadows(
    defines: Any,
    fallbacks: typingsJapgolly.babylonjs.BABYLON.EffectFallbacks,
    maxSimultaneousLights: Unit,
    rank: Double
  ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("HandleFallbacksForShadows")(defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any], rank.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Prepares the list of attributes required for baked vertex animations according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param defines The current Defines of the effect
    */
  inline def PrepareAttributesForBakedVertexAnimation(attribs: js.Array[String], mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareAttributesForBakedVertexAnimation")(attribs.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the list of attributes required for bones according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the bones attributes for
    * @param defines The current Defines of the effect
    * @param fallbacks The current effect fallback strategy
    */
  inline def PrepareAttributesForBones(
    attribs: js.Array[String],
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    fallbacks: typingsJapgolly.babylonjs.BABYLON.EffectFallbacks
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareAttributesForBones")(attribs.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], fallbacks.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Check and prepare the list of attributes required for instances according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param defines The current MaterialDefines of the effect
    */
  inline def PrepareAttributesForInstances(attribs: js.Array[String], defines: typingsJapgolly.babylonjs.BABYLON.MaterialDefines): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareAttributesForInstances")(attribs.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param defines The current Defines of the effect
    */
  inline def PrepareAttributesForMorphTargets(attribs: js.Array[String], mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareAttributesForMorphTargets")(attribs.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the list of attributes required for morph targets according to the effect defines.
    * @param attribs The current list of supported attribs
    * @param mesh The mesh to prepare the morph targets attributes for
    * @param influencers The number of influencers
    */
  inline def PrepareAttributesForMorphTargetsInfluencers(
    attribs: js.Array[String],
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    influencers: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareAttributesForMorphTargetsInfluencers")(attribs.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], influencers.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines used in the shader depending on the attributes data available in the mesh
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    * @param useVertexColor Precise whether vertex colors should be used or not (override mesh info)
    * @param useBones Precise whether bones should be used or not (override mesh info)
    * @param useMorphTargets Precise whether morph targets should be used or not (override mesh info)
    * @param useVertexAlpha Precise whether vertex alpha should be used or not (override mesh info)
    * @param useBakedVertexAnimation Precise whether baked vertex animation should be used or not (override mesh info)
    * @returns false if defines are considered not dirty and have not been checked
    */
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean,
    useVertexAlpha: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean,
    useVertexAlpha: Boolean,
    useBakedVertexAnimation: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any], useBakedVertexAnimation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Boolean,
    useVertexAlpha: Unit,
    useBakedVertexAnimation: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any], useBakedVertexAnimation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Unit,
    useVertexAlpha: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Unit,
    useVertexAlpha: Boolean,
    useBakedVertexAnimation: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any], useBakedVertexAnimation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForAttributes(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    useVertexColor: Boolean,
    useBones: Boolean,
    useMorphTargets: Unit,
    useVertexAlpha: Unit,
    useBakedVertexAnimation: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForAttributes")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useVertexColor.asInstanceOf[js.Any], useBones.asInstanceOf[js.Any], useMorphTargets.asInstanceOf[js.Any], useVertexAlpha.asInstanceOf[js.Any], useBakedVertexAnimation.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Prepares the defines for baked vertex animation
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  inline def PrepareDefinesForBakedVertexAnimation(mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForBakedVertexAnimation")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines for bones
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  inline def PrepareDefinesForBones(mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForBones")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Helper used to prepare the list of defines associated with frame values for shader compilation
    * @param scene defines the current scene
    * @param engine defines the current engine
    * @param defines specifies the list of active defines
    * @param useInstances defines if instances have to be turned on
    * @param useClipPlane defines if clip plane have to be turned on
    * @param useThinInstances defines if thin instances have to be turned on
    */
  inline def PrepareDefinesForFrameBoundValues(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    defines: Any,
    useInstances: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForFrameBoundValues")(scene.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useInstances.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareDefinesForFrameBoundValues(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    defines: Any,
    useInstances: Boolean,
    useClipPlane: Unit,
    useThinInstances: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForFrameBoundValues")(scene.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useInstances.asInstanceOf[js.Any], useClipPlane.asInstanceOf[js.Any], useThinInstances.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareDefinesForFrameBoundValues(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    defines: Any,
    useInstances: Boolean,
    useClipPlane: Nullable[Boolean]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForFrameBoundValues")(scene.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useInstances.asInstanceOf[js.Any], useClipPlane.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareDefinesForFrameBoundValues(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    engine: typingsJapgolly.babylonjs.BABYLON.Engine,
    defines: Any,
    useInstances: Boolean,
    useClipPlane: Nullable[Boolean],
    useThinInstances: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForFrameBoundValues")(scene.asInstanceOf[js.Any], engine.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], useInstances.asInstanceOf[js.Any], useClipPlane.asInstanceOf[js.Any], useThinInstances.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param light The light the effect is compiling for
    * @param lightIndex The index of the light
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param state Defines the current state regarding what is needed (normals, etc...)
    * @param state.needNormals
    * @param state.needRebuild
    * @param state.shadowEnabled
    * @param state.specularEnabled
    * @param state.lightmapMode
    */
  inline def PrepareDefinesForLight(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    light: typingsJapgolly.babylonjs.BABYLON.Light,
    lightIndex: Double,
    defines: Any,
    specularSupported: Boolean,
    state: LightmapMode
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForLight")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], light.asInstanceOf[js.Any], lightIndex.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], specularSupported.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines related to the light information passed in parameter
    * @param scene The scene we are intending to draw
    * @param mesh The mesh the effect is compiling for
    * @param defines The defines to update
    * @param specularSupported Specifies whether specular is supported or not (override lights data)
    * @param maxSimultaneousLights Specifies how manuy lights can be added to the effect at max
    * @param disableLighting Specifies whether the lighting is disabled (override scene and light)
    * @returns true if normals will be required for the rest of the effect
    */
  inline def PrepareDefinesForLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    specularSupported: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], specularSupported.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], specularSupported.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Double,
    disableLighting: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], specularSupported.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any], disableLighting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def PrepareDefinesForLights(
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    defines: Any,
    specularSupported: Boolean,
    maxSimultaneousLights: Unit,
    disableLighting: Boolean
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForLights")(scene.asInstanceOf[js.Any], mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], specularSupported.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any], disableLighting.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Helps preparing the defines values about the UVs in used in the effect.
    * UVs are shared as much as we can across channels in the shaders.
    * @param texture The texture we are preparing the UVs for
    * @param defines The defines to update
    * @param key The channel key "diffuse", "specular"... used in the shader
    */
  inline def PrepareDefinesForMergedUV(texture: typingsJapgolly.babylonjs.BABYLON.BaseTexture, defines: Any, key: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForMergedUV")(texture.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Helper used to prepare the list of defines associated with misc. values for shader compilation
    * @param mesh defines the current mesh
    * @param scene defines the current scene
    * @param useLogarithmicDepth defines if logarithmic depth has to be turned on
    * @param pointsCloud defines if point cloud rendering has to be turned on
    * @param fogEnabled defines if fog has to be turned on
    * @param alphaTest defines if alpha testing has to be turned on
    * @param defines defines the current list of defines
    */
  inline def PrepareDefinesForMisc(
    mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh,
    scene: typingsJapgolly.babylonjs.BABYLON.Scene,
    useLogarithmicDepth: Boolean,
    pointsCloud: Boolean,
    fogEnabled: Boolean,
    alphaTest: Boolean,
    defines: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForMisc")(mesh.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], useLogarithmicDepth.asInstanceOf[js.Any], pointsCloud.asInstanceOf[js.Any], fogEnabled.asInstanceOf[js.Any], alphaTest.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines for morph targets
    * @param mesh The mesh containing the geometry data we will draw
    * @param defines The defines to update
    */
  inline def PrepareDefinesForMorphTargets(mesh: typingsJapgolly.babylonjs.BABYLON.AbstractMesh, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForMorphTargets")(mesh.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines related to multiview
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    */
  inline def PrepareDefinesForMultiview(scene: typingsJapgolly.babylonjs.BABYLON.Scene, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForMultiview")(scene.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines related to order independant transparency
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    * @param needAlphaBlending Determines if the material needs alpha blending
    */
  inline def PrepareDefinesForOIT(scene: typingsJapgolly.babylonjs.BABYLON.Scene, defines: Any, needAlphaBlending: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForOIT")(scene.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], needAlphaBlending.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the defines related to the prepass
    * @param scene The scene we are intending to draw
    * @param defines The defines to update
    * @param canRenderToMRT Indicates if this material renders to several textures in the prepass
    */
  inline def PrepareDefinesForPrePass(scene: typingsJapgolly.babylonjs.BABYLON.Scene, defines: Any, canRenderToMRT: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareDefinesForPrePass")(scene.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], canRenderToMRT.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect (for a specific light)
    * @param lightIndex defines the light index
    * @param uniformsList The uniform list
    * @param samplersList The sampler list
    * @param projectedLightTexture defines if projected texture must be used
    * @param uniformBuffersList defines an optional list of uniform buffers
    * @param updateOnlyBuffersList True to only update the uniformBuffersList array
    */
  inline def PrepareUniformsAndSamplersForLight(lightIndex: Double, uniformsList: js.Array[String], samplersList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Any
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Any,
    uniformBuffersList: Unit,
    updateOnlyBuffersList: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any], updateOnlyBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Any,
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Any,
    uniformBuffersList: Nullable[js.Array[String]],
    updateOnlyBuffersList: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any], updateOnlyBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Unit,
    uniformBuffersList: Unit,
    updateOnlyBuffersList: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any], updateOnlyBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Unit,
    uniformBuffersList: Nullable[js.Array[String]]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersForLight(
    lightIndex: Double,
    uniformsList: js.Array[String],
    samplersList: js.Array[String],
    projectedLightTexture: Unit,
    uniformBuffersList: Nullable[js.Array[String]],
    updateOnlyBuffersList: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersForLight")(lightIndex.asInstanceOf[js.Any], uniformsList.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], projectedLightTexture.asInstanceOf[js.Any], uniformBuffersList.asInstanceOf[js.Any], updateOnlyBuffersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Prepares the uniforms and samplers list to be used in the effect
    * @param uniformsListOrOptions The uniform names to prepare or an EffectCreationOptions containing the list and extra information
    * @param samplersList The sampler list
    * @param defines The defines helping in the list generation
    * @param maxSimultaneousLights The maximum number of simultaneous light allowed in the effect
    */
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: js.Array[String], defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: Any,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: js.Array[String],
    defines: Unit,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: js.Array[String], samplersList: Unit, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: Unit,
    defines: Any,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: js.Array[String],
    samplersList: Unit,
    defines: Unit,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: js.Array[String], defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: Any,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: js.Array[String],
    defines: Unit,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(uniformsListOrOptions: IEffectCreationOptions, samplersList: Unit, defines: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: Unit,
    defines: Any,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def PrepareUniformsAndSamplersList(
    uniformsListOrOptions: IEffectCreationOptions,
    samplersList: Unit,
    defines: Unit,
    maxSimultaneousLights: Double
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PrepareUniformsAndSamplersList")(uniformsListOrOptions.asInstanceOf[js.Any], samplersList.asInstanceOf[js.Any], defines.asInstanceOf[js.Any], maxSimultaneousLights.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  /**
    * Add the list of attributes required for instances to the attribs array.
    * @param attribs The current list of supported attribs
    * @param needsPreviousMatrices If the shader needs previous matrices
    */
  inline def PushAttributesForInstances(attribs: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("PushAttributesForInstances")(attribs.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def PushAttributesForInstances(attribs: js.Array[String], needsPreviousMatrices: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("PushAttributesForInstances")(attribs.asInstanceOf[js.Any], needsPreviousMatrices.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("BABYLON.MaterialHelper._CopyBonesTransformationMatrices")
  @js.native
  def _CopyBonesTransformationMatrices: Any = js.native
  inline def _CopyBonesTransformationMatrices_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_CopyBonesTransformationMatrices")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MaterialHelper._TempFogColor")
  @js.native
  def _TempFogColor: Any = js.native
  inline def _TempFogColor_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TempFogColor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("BABYLON.MaterialHelper._TmpMorphInfluencers")
  @js.native
  def _TmpMorphInfluencers: Any = js.native
  inline def _TmpMorphInfluencers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_TmpMorphInfluencers")(x.asInstanceOf[js.Any])
}
