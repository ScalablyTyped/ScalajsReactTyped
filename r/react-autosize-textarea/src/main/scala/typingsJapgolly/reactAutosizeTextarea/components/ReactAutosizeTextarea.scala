package typingsJapgolly.reactAutosizeTextarea.components

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.reactAutosizeTextarea.anon.PickHTMLPropsHTMLTextArea
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactAutosizeTextarea {
  
  @JSImport("react-autosize-textarea", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactAutosizeTextarea.type): SharedBuilder_PickHTMLPropsHTMLTextArea1234167464[HTMLTextAreaElement] = new SharedBuilder_PickHTMLPropsHTMLTextArea1234167464[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PickHTMLPropsHTMLTextArea): SharedBuilder_PickHTMLPropsHTMLTextArea1234167464[HTMLTextAreaElement] = new SharedBuilder_PickHTMLPropsHTMLTextArea1234167464[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
