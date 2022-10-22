package typingsJapgolly.html2canvas

import org.scalajs.dom.CanvasRenderingContext2D
import org.scalajs.dom.HTMLCanvasElement
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLImageElement
import org.scalajs.dom.Node
import typingsJapgolly.html2canvas.distTypesCoreContextMod.Context
import typingsJapgolly.html2canvas.distTypesRenderCanvasCanvasRendererMod.RenderConfigurations
import typingsJapgolly.html2canvas.distTypesRenderRendererMod.Renderer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesRenderCanvasForeignobjectRendererMod {
  
  @JSImport("html2canvas/dist/types/render/canvas/foreignobject-renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("html2canvas/dist/types/render/canvas/foreignobject-renderer", "ForeignObjectRenderer")
  @js.native
  open class ForeignObjectRenderer protected () extends Renderer {
    def this(context: Context, options: RenderConfigurations) = this()
    
    var canvas: HTMLCanvasElement = js.native
    
    var ctx: CanvasRenderingContext2D = js.native
    
    def render(element: HTMLElement): js.Promise[HTMLCanvasElement] = js.native
  }
  
  inline def loadSerializedSVG(svg: Node): js.Promise[HTMLImageElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("loadSerializedSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[js.Promise[HTMLImageElement]]
}
