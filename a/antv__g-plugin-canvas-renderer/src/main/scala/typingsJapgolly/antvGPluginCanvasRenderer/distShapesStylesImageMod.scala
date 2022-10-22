package typingsJapgolly.antvGPluginCanvasRenderer

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distDisplayObjectsImageMod.ParsedImageStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.RenderingService
import typingsJapgolly.antvGPluginCanvasRenderer.distShapesStylesInterfacesMod.StyleRenderer
import typingsJapgolly.antvGPluginImageLoader.mod.ImagePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesStylesImageMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Image", "ImageRenderer")
  @js.native
  open class ImageRenderer protected ()
    extends StObject
       with StyleRenderer {
    def this(imagePool: ImagePool) = this()
    
    /* private */ var imagePool: Any = js.native
    
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedImageStyleProps,
      `object`: DisplayObject[Any, Any]
    ): Unit = js.native
    /* CompleteClass */
    override def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit = js.native
  }
}
