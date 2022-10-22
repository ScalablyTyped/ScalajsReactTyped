package typingsJapgolly.babylonjs.renderingIndexMod

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
      * Disables the prepass associated with the scene
      */
    def disablePrePassRenderer(): Unit
    
    /**
      * Disables the subsurface effect for prepass
      */
    def disableSubSurfaceForPrePass(): Unit
    
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
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var prePassRenderer: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]
    
    /**
      * Gets or Sets the current prepass renderer associated to the scene.
      */
    var subSurfaceConfiguration: Nullable[SubSurfaceConfiguration]
  }
  object AbstractScene {
    
    inline def apply(
      disablePrePassRenderer: Callback,
      disableSubSurfaceForPrePass: Callback,
      enablePrePassRenderer: CallbackTo[Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]],
      enableSubSurfaceForPrePass: CallbackTo[Nullable[SubSurfaceConfiguration]]
    ): AbstractScene = {
      val __obj = js.Dynamic.literal(disablePrePassRenderer = disablePrePassRenderer.toJsFn, disableSubSurfaceForPrePass = disableSubSurfaceForPrePass.toJsFn, enablePrePassRenderer = enablePrePassRenderer.toJsFn, enableSubSurfaceForPrePass = enableSubSurfaceForPrePass.toJsFn, _prePassRenderer = null, _subSurfaceConfiguration = null, prePassRenderer = null, subSurfaceConfiguration = null)
      __obj.asInstanceOf[AbstractScene]
    }
    
    extension [Self <: AbstractScene](x: Self) {
      
      inline def setDisablePrePassRenderer(value: Callback): Self = StObject.set(x, "disablePrePassRenderer", value.toJsFn)
      
      inline def setDisableSubSurfaceForPrePass(value: Callback): Self = StObject.set(x, "disableSubSurfaceForPrePass", value.toJsFn)
      
      inline def setEnablePrePassRenderer(value: CallbackTo[Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]]): Self = StObject.set(x, "enablePrePassRenderer", value.toJsFn)
      
      inline def setEnableSubSurfaceForPrePass(value: CallbackTo[Nullable[SubSurfaceConfiguration]]): Self = StObject.set(x, "enableSubSurfaceForPrePass", value.toJsFn)
      
      inline def setPrePassRenderer(value: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def setPrePassRendererNull: Self = StObject.set(x, "prePassRenderer", null)
      
      inline def setSubSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def setSubSurfaceConfigurationNull: Self = StObject.set(x, "subSurfaceConfiguration", null)
      
      inline def set_prePassRenderer(value: Nullable[typingsJapgolly.babylonjs.renderingPrePassRendererMod.PrePassRenderer]): Self = StObject.set(x, "_prePassRenderer", value.asInstanceOf[js.Any])
      
      inline def set_prePassRendererNull: Self = StObject.set(x, "_prePassRenderer", null)
      
      inline def set_subSurfaceConfiguration(value: Nullable[SubSurfaceConfiguration]): Self = StObject.set(x, "_subSurfaceConfiguration", value.asInstanceOf[js.Any])
      
      inline def set_subSurfaceConfigurationNull: Self = StObject.set(x, "_subSurfaceConfiguration", null)
    }
  }
}
