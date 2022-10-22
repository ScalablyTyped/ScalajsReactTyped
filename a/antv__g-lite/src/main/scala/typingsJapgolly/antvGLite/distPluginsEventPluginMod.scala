package typingsJapgolly.antvGLite

import typingsJapgolly.antvGLite.distServicesContextServiceMod.ContextService
import typingsJapgolly.antvGLite.distServicesMod.EventService
import typingsJapgolly.antvGLite.distServicesMod.RenderingService
import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPluginsEventPluginMod {
  
  @JSImport("@antv/g-lite/dist/plugins/EventPlugin", "EventPlugin")
  @js.native
  open class EventPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      canvasConfig: CanvasConfig,
      contextService: ContextService[Any],
      renderingService: RenderingService,
      renderingContext: RenderingContext,
      eventService: EventService
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: RenderingService): Unit = js.native
    
    /* private */ var autoPreventDefault: Any = js.native
    
    /* private */ var bootstrapEvent: Any = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var contextService: Any = js.native
    
    /* private */ var eventService: Any = js.native
    
    /* private */ var normalizeToPointerEvent: Any = js.native
    
    /* private */ var normalizeWheelEvent: Any = js.native
    
    /* private */ var onPointerMove: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
    
    /* private */ var renderingService: Any = js.native
    
    /* private */ var rootPointerEvent: Any = js.native
    
    /* private */ var rootWheelEvent: Any = js.native
    
    /* private */ var setCursor: Any = js.native
    
    /**
      * Transfers base & mouse event data from the nativeEvent to the federated event.
      */
    /* private */ var transferMouseData: Any = js.native
  }
  /* static members */
  object EventPlugin {
    
    @JSImport("@antv/g-lite/dist/plugins/EventPlugin", "EventPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-lite/dist/plugins/EventPlugin", "EventPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
}
