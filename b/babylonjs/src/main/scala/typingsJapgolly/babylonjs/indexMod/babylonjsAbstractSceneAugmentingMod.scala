package typingsJapgolly.babylonjs.indexMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.renderingSubSurfaceConfigurationMod.SubSurfaceConfiguration
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* augmented module */
object babylonjsAbstractSceneAugmentingMod {
  
  trait AbstractScene extends StObject {
    
    /** @internal (Backing field) */
    var _prePassRenderer: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /** @internal (Backing field) */
    var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    
    /**
      * Adds the given effect layer to this scene
      * @param newEffectLayer defines the effect layer to add
      */
    def addEffectLayer(newEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer): Unit
    
    /**
      * Adds the given lens flare system to this scene
      * @param newLensFlareSystem The lens flare system to add
      */
    def addLensFlareSystem(newLensFlareSystem: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Unit
    
    /**
      * Adds the given reflection probe to this scene.
      * @param newReflectionProbe The reflection probe to add
      */
    def addReflectionProbe(newReflectionProbe: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe): Unit
    
    /**
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit
    
    /**
      * The list of effect layers (highlights/glow) added to the scene
      * @see https://doc.babylonjs.com/how_to/highlight_layer
      * @see https://doc.babylonjs.com/how_to/glow_layer
      */
    var effectLayers: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer]
    
    /**
      * Enables the prepass and associates it with the scene
      * @returns the PrePassRenderer
      */
    def enablePrePassRenderer(): Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /**
      * Enables the subsurface effect for prepass
      * @returns the SubSurfaceConfiguration
      */
    def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration]
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @returns The highlight layer if found otherwise null.
      */
    def getGlowLayerByName(name: String): Nullable[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer]
    
    /**
      * Return a the first highlight layer of the scene with a given name.
      * @param name The name of the highlight layer to look for.
      * @returns The highlight layer if found otherwise null.
      */
    def getHighlightLayerByName(name: String): Nullable[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      * @deprecated Please use getLensFlareSystemById instead
      */
    def getLensFlareSystemByID(id: String): Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its Id
      * @param id defines the Id to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemById(id: String): Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets a lens flare system using its name
      * @param name defines the name to look for
      * @returns the lens flare system or null if not found
      */
    def getLensFlareSystemByName(name: String): Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * The list of layers (background and foreground) of the scene
      */
    var layers: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer]
    
    /**
      * The list of lens flare system added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_lens_flares
      */
    var lensFlareSystems: js.Array[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /**
      * The list of procedural textures added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_procedural_textures
      */
    var proceduralTextures: js.Array[
        typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
      ]
    
    /**
      * The list of reflection probes added to the scene
      * @see https://doc.babylonjs.com/how_to/how_to_use_reflection_probes
      */
    var reflectionProbes: js.Array[typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe]
    
    /**
      * Removes the given effect layer from this scene.
      * @param toRemove defines the effect layer to remove
      * @returns the index of the removed effect layer
      */
    def removeEffectLayer(toRemove: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer): Double
    
    /**
      * Removes the given lens flare system from this scene.
      * @param toRemove The lens flare system to remove
      * @returns The index of the removed lens flare system
      */
    def removeLensFlareSystem(toRemove: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem): Double
    
    /**
      * Removes the given reflection probe from this scene.
      * @param toRemove The reflection probe to remove
      * @returns The index of the removed reflection probe
      */
    def removeReflectionProbe(toRemove: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe): Double
    
    /**
      * The list of sounds used in the scene.
      */
    var sounds: Nullable[js.Array[typingsJapgolly.babylonjs.audioSoundMod.Sound]]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      addEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Callback,
      addLensFlareSystem: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Callback,
      addReflectionProbe: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe => Callback,
      disablePrePassRenderer: Callback,
      disableSubSurfaceForPrePass: Callback,
      effectLayers: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer],
      enablePrePassRenderer: CallbackTo[Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]],
      enableSubSurfaceForPrePass: CallbackTo[Nullable[SubSurfaceConfiguration]],
      getGlowLayerByName: String => Nullable[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer],
      getHighlightLayerByName: String => Nullable[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer],
      getLensFlareSystemByID: String => Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemById: String => Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      getLensFlareSystemByName: String => Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      layers: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer],
      lensFlareSystems: js.Array[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem],
      proceduralTextures: js.Array[
          typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
        ],
      reflectionProbes: js.Array[typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe],
      removeEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Double,
      removeLensFlareSystem: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double,
      removeReflectionProbe: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double
    ): typingsJapgolly.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene = {
      val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer) => addEffectLayer(t0).runNow()), addLensFlareSystem = js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem) => addLensFlareSystem(t0).runNow()), addReflectionProbe = js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe) => addReflectionProbe(t0).runNow()), disablePrePassRenderer = disablePrePassRenderer.toJsFn, disableSubSurfaceForPrePass = disableSubSurfaceForPrePass.toJsFn, effectLayers = effectLayers.asInstanceOf[js.Any], enablePrePassRenderer = enablePrePassRenderer.toJsFn, enableSubSurfaceForPrePass = enableSubSurfaceForPrePass.toJsFn, getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), getLensFlareSystemByID = js.Any.fromFunction1(getLensFlareSystemByID), getLensFlareSystemById = js.Any.fromFunction1(getLensFlareSystemById), getLensFlareSystemByName = js.Any.fromFunction1(getLensFlareSystemByName), layers = layers.asInstanceOf[js.Any], lensFlareSystems = lensFlareSystems.asInstanceOf[js.Any], proceduralTextures = proceduralTextures.asInstanceOf[js.Any], reflectionProbes = reflectionProbes.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer), removeLensFlareSystem = js.Any.fromFunction1(removeLensFlareSystem), removeReflectionProbe = js.Any.fromFunction1(removeReflectionProbe), _prePassRenderer = null, _subSurfaceConfiguration = null, prePassRenderer = null, sounds = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[typingsJapgolly.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene]
    }
    
    extension [Self <: typingsJapgolly.babylonjs.indexMod.babylonjsAbstractSceneAugmentingMod.AbstractScene](x: Self) {
      
      inline def setAddEffectLayer(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Callback): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer) => value(t0).runNow()))
      
      inline def setAddLensFlareSystem(value: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Callback): Self = StObject.set(x, "addLensFlareSystem", js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem) => value(t0).runNow()))
      
      inline def setAddReflectionProbe(value: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe => Callback): Self = StObject.set(x, "addReflectionProbe", js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe) => value(t0).runNow()))
      
      inline def setDisablePrePassRenderer(value: Callback): Self = StObject.set(x, "disablePrePassRenderer", value.toJsFn)
      
      inline def setDisableSubSurfaceForPrePass(value: Callback): Self = StObject.set(x, "disableSubSurfaceForPrePass", value.toJsFn)
      
      inline def setEffectLayers(value: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
      
      inline def setEffectLayersVarargs(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value*))
      
      inline def setEnablePrePassRenderer(value: CallbackTo[Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]]): Self = StObject.set(x, "enablePrePassRenderer", value.toJsFn)
      
      inline def setEnableSubSurfaceForPrePass(value: CallbackTo[Nullable[SubSurfaceConfiguration]]): Self = StObject.set(x, "enableSubSurfaceForPrePass", value.toJsFn)
      
      inline def setGetGlowLayerByName(value: String => Nullable[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetHighlightLayerByName(value: String => Nullable[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByID(value: String => Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByID", js.Any.fromFunction1(value))
      
      inline def setGetLensFlareSystemByName(value: String => Nullable[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "getLensFlareSystemByName", js.Any.fromFunction1(value))
      
      inline def setLayers(value: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
      
      inline def setLayersVarargs(value: typingsJapgolly.babylonjs.layersLayerMod.Layer*): Self = StObject.set(x, "layers", js.Array(value*))
      
      inline def setLensFlareSystems(value: js.Array[typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem]): Self = StObject.set(x, "lensFlareSystems", value.asInstanceOf[js.Any])
      
      inline def setLensFlareSystemsVarargs(value: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem*): Self = StObject.set(x, "lensFlareSystems", js.Array(value*))
      
      inline def setPrePassRenderer(value: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setProceduralTextures(
        value: js.Array[
              typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture
            ]
      ): Self = StObject.set(x, "proceduralTextures", value.asInstanceOf[js.Any])
      
      inline def setProceduralTexturesVarargs(
        value: typingsJapgolly.babylonjs.materialsTexturesProceduralsProceduralTextureMod.ProceduralTexture*
      ): Self = StObject.set(x, "proceduralTextures", js.Array(value*))
      
      inline def setReflectionProbes(value: js.Array[typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe]): Self = StObject.set(x, "reflectionProbes", value.asInstanceOf[js.Any])
      
      inline def setReflectionProbesVarargs(value: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe*): Self = StObject.set(x, "reflectionProbes", js.Array(value*))
      
      inline def setRemoveEffectLayer(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      
      inline def setRemoveLensFlareSystem(value: typingsJapgolly.babylonjs.lensFlaresLensFlareSystemMod.LensFlareSystem => Double): Self = StObject.set(x, "removeLensFlareSystem", js.Any.fromFunction1(value))
      
      inline def setRemoveReflectionProbe(value: typingsJapgolly.babylonjs.probesReflectionProbeMod.ReflectionProbe => Double): Self = StObject.set(x, "removeReflectionProbe", js.Any.fromFunction1(value))
      
      inline def setSounds(value: Nullable[js.Array[typingsJapgolly.babylonjs.audioSoundMod.Sound]]): Self = StObject.set(x, "sounds", value.asInstanceOf[js.Any])
      
      inline def setSoundsNull: Self = StObject.set(x, "sounds", null)
      
      inline def setSoundsVarargs(value: typingsJapgolly.babylonjs.audioSoundMod.Sound*): Self = StObject.set(x, "sounds", js.Array(value*))
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_prePassRenderer(value: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
