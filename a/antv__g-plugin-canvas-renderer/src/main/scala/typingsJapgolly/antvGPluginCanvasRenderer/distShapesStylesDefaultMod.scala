package typingsJapgolly.antvGPluginCanvasRenderer

import org.scalajs.dom.CanvasRenderingContext2D
import typingsJapgolly.antvGLite.distTypesMod.ParsedBaseStyleProps
import typingsJapgolly.antvGLite.mod.DisplayObject
import typingsJapgolly.antvGLite.mod.RenderingService
import typingsJapgolly.antvGPluginCanvasRenderer.distShapesStylesInterfacesMod.StyleRenderer
import typingsJapgolly.antvGPluginImageLoader.mod.ImagePool
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distShapesStylesDefaultMod {
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Default", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@antv/g-plugin-canvas-renderer/dist/shapes/styles/Default", "DefaultRenderer")
  @js.native
  open class DefaultRenderer protected ()
    extends StObject
       with StyleRenderer {
    def this(imagePool: ImagePool) = this()
    
    /* private */ var clearShadowAndFilter: Any = js.native
    
    /* private */ var fill: Any = js.native
    
    /* private */ var getColor: Any = js.native
    
    /* private */ var getPattern: Any = js.native
    
    /* private */ var imagePool: Any = js.native
    
    /* CompleteClass */
    override def render(
      context: CanvasRenderingContext2D,
      parsedStyle: ParsedBaseStyleProps,
      `object`: DisplayObject[Any, Any],
      renderingService: RenderingService
    ): Unit = js.native
    
    /* private */ var stroke: Any = js.native
  }
  
  inline def setShadowAndFilter(`object`: DisplayObject[Any, Any], context: CanvasRenderingContext2D, hasShadow: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setShadowAndFilter")(`object`.asInstanceOf[js.Any], context.asInstanceOf[js.Any], hasShadow.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
