package typingsJapgolly.qrcodeReact.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.qrcodeReact.mod.CanvasQRCodeProps
import typingsJapgolly.qrcodeReact.mod.SvgQRCodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object QrcodeDotreact {
  
  def apply(p: (CanvasQRCodeProps | SvgQRCodeProps) & js.Object): Default[js.Object] = new Default[js.Object](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("qrcode.react", JSImport.Namespace)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: QrcodeDotreact.type): Default[js.Object] = new Default[js.Object](js.Array(this.component, js.Dictionary.empty))()
}
