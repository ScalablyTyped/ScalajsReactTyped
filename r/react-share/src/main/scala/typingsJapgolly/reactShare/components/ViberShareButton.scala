package typingsJapgolly.reactShare.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.reactShare.anon.OmitPropstitlestringundefAriaautocomplete
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ViberShareButton {
  
  inline def apply(url: String): SharedBuilder_OmitPropstitlestringundefAriaautocomplete_760186475[HTMLButtonElement] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_OmitPropstitlestringundefAriaautocomplete_760186475[HTMLButtonElement](js.Array(this.component, __props.asInstanceOf[OmitPropstitlestringundefAriaautocomplete]))
  }
  
  @JSImport("react-share", "ViberShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitPropstitlestringundefAriaautocomplete): SharedBuilder_OmitPropstitlestringundefAriaautocomplete_760186475[HTMLButtonElement] = new SharedBuilder_OmitPropstitlestringundefAriaautocomplete_760186475[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
