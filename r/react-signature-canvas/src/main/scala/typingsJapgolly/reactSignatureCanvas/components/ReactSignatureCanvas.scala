package typingsJapgolly.reactSignatureCanvas.components

import org.scalajs.dom.HTMLCanvasElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.CanvasHTMLAttributes
import typingsJapgolly.reactSignatureCanvas.mod.ReactSignatureCanvasProps
import typingsJapgolly.reactSignatureCanvas.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactSignatureCanvas {
  
  @JSImport("react-signature-canvas", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[default] {
    
    inline def canvasProps(value: CanvasHTMLAttributes[HTMLCanvasElement]): this.type = set("canvasProps", value.asInstanceOf[js.Any])
    
    inline def clearOnResize(value: Boolean): this.type = set("clearOnResize", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: ReactSignatureCanvas.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactSignatureCanvasProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
