package typingsJapgolly.bizcharts.components

import org.scalajs.dom.HTMLElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.antvGCanvas.mod.Renderer
import typingsJapgolly.bizcharts.libGComponentsCanvasMod.ICanvasProps
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Canvas {
  
  @JSImport("bizcharts", "GComponents.Canvas")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def capture(value: Boolean): this.type = set("capture", value.asInstanceOf[js.Any])
    
    inline def container(value: String | HTMLElement): this.type = set("container", value.asInstanceOf[js.Any])
    
    inline def cursor(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Cursor */ Any
    ): this.type = set("cursor", value.asInstanceOf[js.Any])
    
    inline def height(value: Double): this.type = set("height", value.asInstanceOf[js.Any])
    
    inline def renderer(value: Renderer): this.type = set("renderer", value.asInstanceOf[js.Any])
    
    inline def width(value: Double): this.type = set("width", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Canvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: (Pick[ICanvasProps, String | Double]) & RefAttributes[Any]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
