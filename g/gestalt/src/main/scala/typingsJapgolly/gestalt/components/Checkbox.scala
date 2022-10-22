package typingsJapgolly.gestalt.components

import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.gestalt.mod.CheckboxProps
import typingsJapgolly.react.mod.PropsWithoutRef
import typingsJapgolly.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Checkbox {
  
  @JSImport("gestalt", "Checkbox")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Checkbox.type): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsWithoutRef[CheckboxProps] & RefAttributes[HTMLInputElement]): Default[HTMLInputElement] = new Default[HTMLInputElement](js.Array(this.component, p.asInstanceOf[js.Any]))
}
