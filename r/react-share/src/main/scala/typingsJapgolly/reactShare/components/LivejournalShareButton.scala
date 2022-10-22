package typingsJapgolly.reactShare.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.reactShare.anon.OmitPropstitlestringundefAbout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object LivejournalShareButton {
  
  inline def apply(url: String): SharedBuilder_OmitPropstitlestringundefAbout539472333[HTMLButtonElement] = {
    val __props = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    new SharedBuilder_OmitPropstitlestringundefAbout539472333[HTMLButtonElement](js.Array(this.component, __props.asInstanceOf[OmitPropstitlestringundefAbout]))
  }
  
  @JSImport("react-share", "LivejournalShareButton")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: OmitPropstitlestringundefAbout): SharedBuilder_OmitPropstitlestringundefAbout539472333[HTMLButtonElement] = new SharedBuilder_OmitPropstitlestringundefAbout539472333[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
