package typingsJapgolly.antd.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.antd.anon.DropdownClassName
import typingsJapgolly.antd.libDatePickerGeneratePickerMod.PickerProps
import typingsJapgolly.moment.mod.Moment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object DatePicker {
  
  def apply(p: PickerProps[Moment] & DropdownClassName): Default[typingsJapgolly.antd.mod.DatePicker] = new Default[typingsJapgolly.antd.mod.DatePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("antd", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePicker.type): Default[typingsJapgolly.antd.mod.DatePicker] = new Default[typingsJapgolly.antd.mod.DatePicker](js.Array(this.component, js.Dictionary.empty))()
}
