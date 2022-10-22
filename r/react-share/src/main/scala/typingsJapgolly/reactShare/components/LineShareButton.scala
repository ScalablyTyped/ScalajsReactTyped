package typingsJapgolly.reactShare.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.reactShare.anon.OmitPropstitlestringundef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LineShareButton {
  
  inline def apply(url: String): SharedBuilder_OmitPropstitlestringundef1890993791[HTMLButtonElement] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_OmitPropstitlestringundef1890993791[HTMLButtonElement](js.Array(this.component, __props.asInstanceOf[OmitPropstitlestringundef]))
  }
  
  @JSImport("react-share", "LineShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitPropstitlestringundef): SharedBuilder_OmitPropstitlestringundef1890993791[HTMLButtonElement] = new SharedBuilder_OmitPropstitlestringundef1890993791[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
