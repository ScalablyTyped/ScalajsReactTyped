package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.TextAreaProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TextArea {
  
  @JSImport("gestalt", "TextArea")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: TextArea.type): Default[HTMLTextAreaElement] = new Default[HTMLTextAreaElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[TextAreaProps] & RefAttributes[HTMLTextAreaElement]): Default[HTMLTextAreaElement] = new Default[HTMLTextAreaElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
