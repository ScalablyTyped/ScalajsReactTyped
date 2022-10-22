package typingsJapgolly.rmcCalendar.components

import typingsJapgolly.rmcCalendar.libDatePickerPropsMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePicker {
  
  @JSImport("rmc-calendar", "DatePicker")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePicker.type): SharedBuilder_PropsType_1247022500[typingsJapgolly.rmcCalendar.mod.DatePicker] = new SharedBuilder_PropsType_1247022500[typingsJapgolly.rmcCalendar.mod.DatePicker](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): SharedBuilder_PropsType_1247022500[typingsJapgolly.rmcCalendar.mod.DatePicker] = new SharedBuilder_PropsType_1247022500[typingsJapgolly.rmcCalendar.mod.DatePicker](js.Array(this.component, p.asInstanceOf[js.Any]))
}
