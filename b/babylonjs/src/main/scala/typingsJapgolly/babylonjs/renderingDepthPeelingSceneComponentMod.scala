package typingsJapgolly.babylonjs

import typingsJapgolly.babylonjs.renderingDepthPeelingRendererMod.DepthPeelingRenderer
import typingsJapgolly.babylonjs.sceneComponentMod.ISceneComponent
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingDepthPeelingSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/depthPeelingSceneComponent", "DepthPeelingSceneComponent")
  @js.native
  open class DepthPeelingSceneComponent protected ()
    extends StObject
       with ISceneComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /**
      * Disposes the component and the associated ressources.
      */
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /**
      * The name of the component. Each component must have a unique name.
      */
    /* CompleteClass */
    var name: String = js.native
    
    /**
      * Rebuilds the elements related to this component in case of
      * context lost for instance.
      */
    /* CompleteClass */
    override def rebuild(): Unit = js.native
    
    /**
      * Register the component to one instance of a scene.
      */
    /* CompleteClass */
    override def register(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsSceneAugmentingMod {
    
    trait Scene extends StObject {
      
      /** @internal (Backing field) */
      var _depthPeelingRenderer: Nullable[DepthPeelingRenderer]
      
      /** @internal */
      var _useOrderIndependentTransparency: Boolean
      
      /**
        * The depth peeling renderer
        */
      var depthPeelingRenderer: Nullable[DepthPeelingRenderer]
      
      /**
        * Flag to indicate if we want to use order independent transparency, despite the performance hit
        */
      var useOrderIndependentTransparency: Boolean
    }
    object Scene {
      
      inline def apply(_useOrderIndependentTransparency: Boolean, useOrderIndependentTransparency: Boolean): typingsJapgolly.babylonjs.renderingDepthPeelingSceneComponentMod.babylonjsSceneAugmentingMod.Scene = {
        val __obj = js.Dynamic.literal(_useOrderIndependentTransparency = _useOrderIndependentTransparency.asInstanceOf[js.Any], useOrderIndependentTransparency = useOrderIndependentTransparency.asInstanceOf[js.Any], _depthPeelingRenderer = null, depthPeelingRenderer = null)
        __obj.asInstanceOf[typingsJapgolly.babylonjs.renderingDepthPeelingSceneComponentMod.babylonjsSceneAugmentingMod.Scene]
      }
      
      extension [Self <: typingsJapgolly.babylonjs.renderingDepthPeelingSceneComponentMod.babylonjsSceneAugmentingMod.Scene](x: Self) {
        
        inline def setDepthPeelingRenderer(value: Nullable[DepthPeelingRenderer]): Self = StObject.set(x, "depthPeelingRenderer", value.asInstanceOf[js.Any])
        
        inline def setDepthPeelingRendererNull: Self = StObject.set(x, "depthPeelingRenderer", null)
        
        inline def setUseOrderIndependentTransparency(value: Boolean): Self = StObject.set(x, "useOrderIndependentTransparency", value.asInstanceOf[js.Any])
        
        inline def set_depthPeelingRenderer(value: Nullable[DepthPeelingRenderer]): Self = StObject.set(x, "_depthPeelingRenderer", value.asInstanceOf[js.Any])
        
        inline def set_depthPeelingRendererNull: Self = StObject.set(x, "_depthPeelingRenderer", null)
        
        inline def set_useOrderIndependentTransparency(value: Boolean): Self = StObject.set(x, "_useOrderIndependentTransparency", value.asInstanceOf[js.Any])
      }
    }
  }
}
