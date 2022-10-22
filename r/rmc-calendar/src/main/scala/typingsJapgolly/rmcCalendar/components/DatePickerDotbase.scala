package typingsJapgolly.rmcCalendar.components

import typingsJapgolly.rmcCalendar.libDatePickerDotbaseMod.default
import typingsJapgolly.rmcCalendar.libDatePickerPropsMod.PropsType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DatePickerDotbase {
  
  @JSImport("rmc-calendar/lib/DatePicker.base", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: DatePickerDotbase.type): SharedBuilder_PropsType_1247022500[default] = new SharedBuilder_PropsType_1247022500[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: PropsType): SharedBuilder_PropsType_1247022500[default] = new SharedBuilder_PropsType_1247022500[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
