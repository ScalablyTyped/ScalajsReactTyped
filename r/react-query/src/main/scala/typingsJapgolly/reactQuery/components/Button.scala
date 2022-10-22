package typingsJapgolly.reactQuery.components

import org.scalajs.dom.HTMLButtonElement
import typingsJapgolly.reactQuery.anon.PickDetailedHTMLPropsButt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Button {
  
  @JSImport("react-query/types/devtools/styledComponents", "Button")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Button.type): SharedBuilder_PickDetailedHTMLPropsButt_101607913[HTMLButtonElement] = new SharedBuilder_PickDetailedHTMLPropsButt_101607913[HTMLButtonElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickDetailedHTMLPropsButt): SharedBuilder_PickDetailedHTMLPropsButt_101607913[HTMLButtonElement] = new SharedBuilder_PickDetailedHTMLPropsButt_101607913[HTMLButtonElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
