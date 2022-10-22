package typingsJapgolly.reactBigCalendar.components

import typingsJapgolly.reactBigCalendar.mod.WeekProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WorkWeek {
  
  inline def apply(date: js.Date): SharedBuilder_WeekProps63572226[typingsJapgolly.reactBigCalendar.mod.WorkWeek] = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new SharedBuilder_WeekProps63572226[typingsJapgolly.reactBigCalendar.mod.WorkWeek](js.Array(this.component, __props.asInstanceOf[WeekProps]))
  }
  
  @JSImport("react-big-calendar", "WorkWeek")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: WeekProps): SharedBuilder_WeekProps63572226[typingsJapgolly.reactBigCalendar.mod.WorkWeek] = new SharedBuilder_WeekProps63572226[typingsJapgolly.reactBigCalendar.mod.WorkWeek](js.Array(this.component, p.asInstanceOf[js.Any]))
}
