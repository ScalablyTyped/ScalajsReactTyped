package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import typingsJapgolly.babylonjs.anon.PartialIGlowLayerOptions
import typingsJapgolly.babylonjs.anon.PartialIHighlightLayerOpt
import typingsJapgolly.babylonjs.mathsMathDotcolorMod.Color4
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layersIndexMod {
  
  /* note: abstract class */ @JSImport("babylonjs/Layers/index", "EffectLayer")
  @js.native
  open class EffectLayer protected ()
    extends typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer {
    /**
      * Instantiates a new effect Layer and references it in the scene.
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      */
    def this(/** The Friendly of the effect in the scene */
    name: String) = this()
    def this(/** The Friendly of the effect in the scene */
    name: String, scene: Scene) = this()
  }
  /* static members */
  object EffectLayer {
    
    @JSImport("babylonjs/Layers/index", "EffectLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates an effect layer from parsed effect layer data
      * @param parsedEffectLayer defines effect layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the effect layer information
      * @returns a parsed effect Layer
      */
    inline def Parse(parsedEffectLayer: Any, scene: Scene, rootUrl: String): typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedEffectLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer]
    
    /**
      * @internal
      */
    inline def _SceneComponentInitialization(scene: Scene): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_SceneComponentInitialization")(scene.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("babylonjs/Layers/index", "EffectLayerSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class EffectLayerSceneComponent ()
    extends typingsJapgolly.babylonjs.layersEffectLayerSceneComponentMod.EffectLayerSceneComponent {
    def this(scene: Scene) = this()
  }
  
  @JSImport("babylonjs/Layers/index", "GlowLayer")
  @js.native
  open class GlowLayer protected ()
    extends typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer {
    /**
      * Instantiates a new glow Layer and references it to the scene.
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      * @param options Sets of none mandatory options to use with the layer (see IGlowLayerOptions for more information)
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Unit, options: PartialIGlowLayerOptions) = this()
    def this(name: String, scene: Scene, options: PartialIGlowLayerOptions) = this()
  }
  /* static members */
  object GlowLayer {
    
    @JSImport("babylonjs/Layers/index", "GlowLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The default blur kernel size used for the glow.
      */
    @JSImport("babylonjs/Layers/index", "GlowLayer.DefaultBlurKernelSize")
    @js.native
    def DefaultBlurKernelSize: Double = js.native
    inline def DefaultBlurKernelSize_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultBlurKernelSize")(x.asInstanceOf[js.Any])
    
    /**
      * The default texture size ratio used for the glow.
      */
    @JSImport("babylonjs/Layers/index", "GlowLayer.DefaultTextureRatio")
    @js.native
    def DefaultTextureRatio: Double = js.native
    inline def DefaultTextureRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultTextureRatio")(x.asInstanceOf[js.Any])
    
    /**
      * Effect Name of the layer.
      */
    @JSImport("babylonjs/Layers/index", "GlowLayer.EffectName")
    @js.native
    val EffectName: String = js.native
    
    /**
      * Creates a Glow Layer from parsed glow layer data
      * @param parsedGlowLayer defines glow layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the glow layer information
      * @returns a parsed Glow Layer
      */
    inline def Parse(parsedGlowLayer: Any, scene: Scene, rootUrl: String): typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedGlowLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer]
  }
  
  @JSImport("babylonjs/Layers/index", "HighlightLayer")
  @js.native
  open class HighlightLayer protected ()
    extends typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer {
    /**
      * Instantiates a new highlight Layer and references it to the scene..
      * @param name The name of the layer
      * @param scene The scene to use the layer in
      * @param options Sets of none mandatory options to use with the layer (see IHighlightLayerOptions for more information)
      */
    def this(name: String) = this()
    def this(name: String, scene: Scene) = this()
    def this(name: String, scene: Unit, options: PartialIHighlightLayerOpt) = this()
    def this(name: String, scene: Scene, options: PartialIHighlightLayerOpt) = this()
  }
  /* static members */
  object HighlightLayer {
    
    @JSImport("babylonjs/Layers/index", "HighlightLayer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Effect Name of the highlight layer.
      */
    @JSImport("babylonjs/Layers/index", "HighlightLayer.EffectName")
    @js.native
    val EffectName: String = js.native
    
    /**
      * Stencil value used for glowing meshes.
      */
    @JSImport("babylonjs/Layers/index", "HighlightLayer.GlowingMeshStencilReference")
    @js.native
    def GlowingMeshStencilReference: Double = js.native
    inline def GlowingMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("GlowingMeshStencilReference")(x.asInstanceOf[js.Any])
    
    /**
      * The neutral color used during the preparation of the glow effect.
      * This is black by default as the blend operation is a blend operation.
      */
    @JSImport("babylonjs/Layers/index", "HighlightLayer.NeutralColor")
    @js.native
    def NeutralColor: Color4 = js.native
    inline def NeutralColor_=(x: Color4): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NeutralColor")(x.asInstanceOf[js.Any])
    
    /**
      * Stencil value used for the other meshes in the scene.
      */
    @JSImport("babylonjs/Layers/index", "HighlightLayer.NormalMeshStencilReference")
    @js.native
    def NormalMeshStencilReference: Double = js.native
    inline def NormalMeshStencilReference_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NormalMeshStencilReference")(x.asInstanceOf[js.Any])
    
    /**
      * Creates a Highlight layer from parsed Highlight layer data
      * @param parsedHightlightLayer defines the Highlight layer data
      * @param scene defines the current scene
      * @param rootUrl defines the root URL containing the Highlight layer information
      * @returns a parsed Highlight layer
      */
    inline def Parse(parsedHightlightLayer: Any, scene: Scene, rootUrl: String): typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer = (^.asInstanceOf[js.Dynamic].applyDynamic("Parse")(parsedHightlightLayer.asInstanceOf[js.Any], scene.asInstanceOf[js.Any], rootUrl.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer]
  }
  
  @JSImport("babylonjs/Layers/index", "Layer")
  @js.native
  open class Layer protected ()
    extends typingsJapgolly.babylonjs.layersLayerMod.Layer {
    /**
      * Instantiates a new layer.
      * This represents a full screen 2d layer.
      * This can be useful to display a picture in the  background of your scene for instance.
      * @see https://www.babylonjs-playground.com/#08A2BS#1
      * @param name Define the name of the layer in the scene
      * @param imgUrl Define the url of the texture to display in the layer
      * @param scene Define the scene the layer belongs to
      * @param isBackground Defines whether the layer is displayed in front or behind the scene
      * @param color Defines a color for the layer
      */
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene]
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Boolean
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Boolean,
      color: Color4
    ) = this()
    def this(
      /**
      * Define the name of the layer.
      */
    name: String,
      imgUrl: Nullable[String],
      scene: Nullable[Scene],
      isBackground: Unit,
      color: Color4
    ) = this()
  }
  
  @JSImport("babylonjs/Layers/index", "LayerSceneComponent")
  @js.native
  /**
    * Creates a new instance of the component for the given scene
    * @param scene Defines the scene to register the component in
    */
  open class LayerSceneComponent ()
    extends typingsJapgolly.babylonjs.layersLayerSceneComponentMod.LayerSceneComponent {
    def this(scene: Scene) = this()
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /**
        * Adds the given effect layer to this scene
        * @param newEffectLayer defines the effect layer to add
        */
      def addEffectLayer(newEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer): Unit
      
      /**
        * The list of effect layers (highlights/glow) added to the scene
        * @see https://doc.babylonjs.com/how_to/highlight_layer
        * @see https://doc.babylonjs.com/how_to/glow_layer
        */
      var effectLayers: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer]
      
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
        * The list of layers (background and foreground) of the scene
        */
      var layers: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer]
      
      /**
        * Removes the given effect layer from this scene.
        * @param toRemove defines the effect layer to remove
        * @returns the index of the removed effect layer
        */
      def removeEffectLayer(toRemove: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer): Double
    }
    object AbstractScene {
      
      inline def apply(
        addEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Callback,
        effectLayers: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer],
        getGlowLayerByName: String => Nullable[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer],
        getHighlightLayerByName: String => Nullable[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer],
        layers: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer],
        removeEffectLayer: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Double
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(addEffectLayer = js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer) => addEffectLayer(t0).runNow()), effectLayers = effectLayers.asInstanceOf[js.Any], getGlowLayerByName = js.Any.fromFunction1(getGlowLayerByName), getHighlightLayerByName = js.Any.fromFunction1(getHighlightLayerByName), layers = layers.asInstanceOf[js.Any], removeEffectLayer = js.Any.fromFunction1(removeEffectLayer))
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setAddEffectLayer(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Callback): Self = StObject.set(x, "addEffectLayer", js.Any.fromFunction1((t0: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer) => value(t0).runNow()))
        
        inline def setEffectLayers(value: js.Array[typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer]): Self = StObject.set(x, "effectLayers", value.asInstanceOf[js.Any])
        
        inline def setEffectLayersVarargs(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer*): Self = StObject.set(x, "effectLayers", js.Array(value*))
        
        inline def setGetGlowLayerByName(value: String => Nullable[typingsJapgolly.babylonjs.layersGlowLayerMod.GlowLayer]): Self = StObject.set(x, "getGlowLayerByName", js.Any.fromFunction1(value))
        
        inline def setGetHighlightLayerByName(value: String => Nullable[typingsJapgolly.babylonjs.layersHighlightLayerMod.HighlightLayer]): Self = StObject.set(x, "getHighlightLayerByName", js.Any.fromFunction1(value))
        
        inline def setLayers(value: js.Array[typingsJapgolly.babylonjs.layersLayerMod.Layer]): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
        
        inline def setLayersVarargs(value: typingsJapgolly.babylonjs.layersLayerMod.Layer*): Self = StObject.set(x, "layers", js.Array(value*))
        
        inline def setRemoveEffectLayer(value: typingsJapgolly.babylonjs.layersEffectLayerMod.EffectLayer => Double): Self = StObject.set(x, "removeEffectLayer", js.Any.fromFunction1(value))
      }
    }
  }
}
