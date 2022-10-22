package typingsJapgolly.babylonjs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.babylonjs.renderingSubSurfaceConfigurationMod.SubSurfaceConfiguration
import typingsJapgolly.babylonjs.sceneComponentMod.ISceneSerializableComponent
import typingsJapgolly.babylonjs.sceneMod.Scene
import typingsJapgolly.babylonjs.typesMod.Nullable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderingSubSurfaceSceneComponentMod {
  
  @JSImport("babylonjs/Rendering/subSurfaceSceneComponent", "SubSurfaceSceneComponent")
  @js.native
  open class SubSurfaceSceneComponent protected ()
    extends StObject
       with ISceneSerializableComponent {
    /**
      * Creates a new instance of the component for the given scene
      * @param scene Defines the scene to register the component in
      */
    def this(scene: Scene) = this()
    
    /**
      * Adds all the elements from the container to the scene
      */
    def addFromContainer(): Unit = js.native
    
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
      * Removes all the elements in the container from the scene
      */
    def removeFromContainer(): Unit = js.native
    
    /**
      * The scene the component belongs to.
      */
    /* CompleteClass */
    var scene: Scene = js.native
  }
  
  /* augmented module */
  object babylonjsAbstractSceneAugmentingMod {
    
    trait AbstractScene extends StObject {
      
      /** @internal (Backing field) */
      var _subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
      
      /**
        * Disables the subsurface effect for prepass
        */
      def disableSubSurfaceForPrePass(): Unit
      
      /**
        * Enables the subsurface effect for prepass
        * @returns the SubSurfaceConfiguration
        */
      def enableSubSurfaceForPrePass(): Nullable[SubSurfaceConfiguration]
      
      /**
        * Gets or Sets the current prepass renderer associated to the scene.
        */
      var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
    }
    object AbstractScene {
      
      inline def apply(
        disableSubSurfaceForPrePass: Callback,
        enableSubSurfaceForPrePass: CallbackTo[Nullable[SubSurfaceConfiguration]]
      ): AbstractScene = {
        val __obj = js.Dynamic.literal(disableSubSurfaceForPrePass = disableSubSurfaceForPrePass.toJsFn, enableSubSurfaceForPrePass = enableSubSurfaceForPrePass.toJsFn, _subSurfaceConfiguration = null, subSurfaceConfiguration = null)
        __obj.asInstanceOf[AbstractScene]
      }
      
      extension [Self <: AbstractScene](x: Self) {
        
        inline def setDisableSubSurfaceForPrePass(value: Callback): Self = StObject.set(x, "disableSubSurfaceForPrePass", value.toJsFn)
        
        inline def setEnableSubSurfaceForPrePass(value: CallbackTo[Nullable[SubSurfaceConfiguration]]): Self = StObject.set(x, "enableSubSurfaceForPrePass", value.toJsFn)
        
        inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
        
        inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
        
        inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
      }
    }
  }
}
