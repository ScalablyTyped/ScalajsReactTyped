package typingsJapgolly.antvGLite

import japgolly.scalajs.react.Callback
import typingsJapgolly.antvGLite.anon.AfterRender
import typingsJapgolly.antvGLite.anon.PartialCanvasConfig
import typingsJapgolly.antvGLite.anon.Rendered
import typingsJapgolly.antvGLite.distCameraInterfacesMod.ICamera
import typingsJapgolly.antvGLite.distCssInterfacesMod.StyleValueRegistry
import typingsJapgolly.antvGLite.distDisplayObjectsMod.DisplayObject
import typingsJapgolly.antvGLite.distServicesInterfacesMod.SceneGraphService
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.EventPosition
import typingsJapgolly.manaSyringe.libContributionMod.Contribution.Provider
import typingsJapgolly.manaSyringe.mod.Syringe.DefinedToken
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distServicesRenderingServiceMod {
  
  @JSImport("@antv/g-lite/dist/services/RenderingService", "RenderingPluginContribution")
  @js.native
  val RenderingPluginContribution: DefinedToken = js.native
  
  @JSImport("@antv/g-lite/dist/services/RenderingService", "RenderingService")
  @js.native
  open class RenderingService protected () extends StObject {
    def this(
      renderingPluginProvider: Provider[RenderingPlugin],
      canvasConfig: CanvasConfig,
      renderingContext: RenderingContext,
      sceneGraphService: SceneGraphService,
      styleValueRegistry: StyleValueRegistry,
      camera: ICamera
    ) = this()
    
    /* private */ var camera: Any = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    def destroy(): Unit = js.native
    
    def dirtify(): Unit = js.native
    
    /**
      * Meet the following conditions:
      * * disable DirtyRectangleRendering
      * * camera changed
      */
    def disableDirtyRectangleRendering(): Boolean = js.native
    
    def getStats(): Rendered = js.native
    
    var hooks: AfterRender = js.native
    
    def init(): js.Promise[Unit] = js.native
    
    /* private */ var inited: Any = js.native
    
    def render(canvasConfig: PartialCanvasConfig): Unit = js.native
    
    /* private */ var renderDisplayObject: Any = js.native
    
    /**
      * avoid re-creating too many custom events
      */
    /* private */ var renderOrderChangedEvent: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var renderingPluginProvider: Any = js.native
    
    /* private */ var sceneGraphService: Any = js.native
    
    /* private */ var stats: Any = js.native
    
    /* private */ var styleValueRegistry: Any = js.native
    
    /* private */ var zIndexCounter: Any = js.native
  }
  
  trait PickingResult extends StObject {
    
    var picked: js.Array[DisplayObject[Any, Any]]
    
    /**
      * position in canvas coordinate
      */
    var position: EventPosition
    
    /**
      * only return the topmost object if there are multiple objects overlapped
      */
    var topmost: js.UndefOr[Boolean] = js.undefined
  }
  object PickingResult {
    
    inline def apply(picked: js.Array[DisplayObject[Any, Any]], position: EventPosition): PickingResult = {
      val __obj = js.Dynamic.literal(picked = picked.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickingResult]
    }
    
    extension [Self <: PickingResult](x: Self) {
      
      inline def setPicked(value: js.Array[DisplayObject[Any, Any]]): Self = StObject.set(x, "picked", value.asInstanceOf[js.Any])
      
      inline def setPickedVarargs(value: (DisplayObject[Any, Any])*): Self = StObject.set(x, "picked", js.Array(value*))
      
      inline def setPosition(value: EventPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setTopmost(value: Boolean): Self = StObject.set(x, "topmost", value.asInstanceOf[js.Any])
      
      inline def setTopmostUndefined: Self = StObject.set(x, "topmost", js.undefined)
    }
  }
  
  trait RenderingPlugin extends StObject {
    
    @JSName("apply")
    def apply(renderer: RenderingService): Unit
  }
  object RenderingPlugin {
    
    inline def apply(apply: RenderingService => Callback): RenderingPlugin = {
      val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1((t0: RenderingService) => apply(t0).runNow()))
      __obj.asInstanceOf[RenderingPlugin]
    }
    
    extension [Self <: RenderingPlugin](x: Self) {
      
      inline def setApply(value: RenderingService => Callback): Self = StObject.set(x, "apply", js.Any.fromFunction1((t0: RenderingService) => value(t0).runNow()))
    }
  }
}
