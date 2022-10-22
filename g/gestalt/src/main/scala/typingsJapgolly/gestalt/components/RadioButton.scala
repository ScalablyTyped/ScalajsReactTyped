package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.RadioButtonProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object RadioButton {
  
  @JSImport("gestalt", "RadioButton")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: RadioButton.type): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[RadioButtonProps] & RefAttributes[HTMLInputElement]): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
