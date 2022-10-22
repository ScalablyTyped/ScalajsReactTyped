package typingsJapgolly.antvGPluginCanvasRenderer

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distDisplayObjectsTextMod.ParsedTextStyleProps
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.RenderingService
import typingsJapgolly.antvGPluginCanvasRenderer.distShapesStylesInterfacesMod.StyleRenderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesStylesTextMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Text", "TextRenderer")
  @js.native
  open class TextRenderer ()
    extends StObject
       with StyleRenderer {
    
    /* private */ var drawLetterSpacing: Any = js.native
    
    /* private */ var fillText: Any = js.native
    
    def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedTextStyleProps,
      `object`: DisplayObject[Any, Any]
    ): Unit = js.native
    /* CompleteClass */
    override def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit = js.native
    
    /* private */ var strokeText: Any = js.native
  }
}
