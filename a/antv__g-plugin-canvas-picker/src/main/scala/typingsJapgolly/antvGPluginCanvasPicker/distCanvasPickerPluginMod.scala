package typingsJapgolly.antvGPluginCanvasPicker

import typingsJapgolly.antvGLite.distServicesRenderingContextMod.RenderingContext
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingPlugin
import typingsJapgolly.antvGLite.distServicesRenderingServiceMod.RenderingService
import typingsJapgolly.antvGLite.distTypesMod.BaseStyleProps
import typingsJapgolly.antvGLite.distTypesMod.CanvasConfig
import typingsJapgolly.antvGLite.distTypesMod.Shape
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.OffscreenCanvasCreator
import typingsJapgolly.antvGLite.mod.Point
import typingsJapgolly.antvGLite.mod.Syringe.DefinedToken
import typingsJapgolly.antvGPluginCanvasPathGenerator.distInterfacesMod.PathGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCanvasPickerPluginMod {
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/CanvasPickerPlugin", "CanvasPickerPlugin")
  @js.native
  open class CanvasPickerPlugin protected ()
    extends StObject
       with RenderingPlugin {
    def this(
      renderingContext: RenderingContext,
      canvasConfig: CanvasConfig,
      offscreenCanvas: OffscreenCanvasCreator,
      pathGeneratorFactory: js.Function1[/* tagName */ Shape | String, PathGenerator[Any]],
      pointInPathPickerFactory: js.Function1[/* tagName */ Shape | String, PointInPathPicker[Any]]
    ) = this()
    
    /* CompleteClass */
    @JSName("apply")
    override def apply(renderer: RenderingService): Unit = js.native
    @JSName("apply")
    def apply(renderingService: typingsJapgolly.antvGLite.mod.RenderingService): Unit = js.native
    
    /* private */ var canvasConfig: Any = js.native
    
    /* private */ var isHit: Any = js.native
    
    /**
      * use native picking method
      * @see https://developer.mozilla.org/zh-CN/docs/Web/API/CanvasRenderingContext2D/isPointInPath
      */
    /* private */ var isPointInPath: Any = js.native
    
    /* private */ var offscreenCanvas: Any = js.native
    
    /* private */ var pathGeneratorFactory: Any = js.native
    
    /* private */ var pathGeneratorFactoryCache: Any = js.native
    
    /* private */ var pick: Any = js.native
    
    /* private */ var pointInPathPickerFactory: Any = js.native
    
    /* private */ var renderingContext: Any = js.native
  }
  /* static members */
  object CanvasPickerPlugin {
    
    @JSImport("@antv/g-plugin-canvas-picker/dist/CanvasPickerPlugin", "CanvasPickerPlugin")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-plugin-canvas-picker/dist/CanvasPickerPlugin", "CanvasPickerPlugin.tag")
    @js.native
    def tag: String = js.native
    inline def tag_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tag")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g-plugin-canvas-picker/dist/CanvasPickerPlugin", "PointInPathPickerFactory")
  @js.native
  val PointInPathPickerFactory: DefinedToken = js.native
  
  type PointInPathPicker[T /* <: BaseStyleProps */] = js.Function3[
    /* displayObject */ DisplayObject[T, Any], 
    /* point */ Point, 
    /* isPointInPath */ js.UndefOr[
      js.Function2[/* displayObject */ DisplayObject[T, Any], /* point */ Point, Boolean]
    ], 
    Boolean
  ]
}
