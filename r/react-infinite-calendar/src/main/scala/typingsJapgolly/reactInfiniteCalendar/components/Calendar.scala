package typingsJapgolly.reactInfiniteCalendar.components

import typingsJapgolly.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Calendar {
  
  @JSImport("react-infinite-calendar", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Calendar.type): SharedBuilder_ReactInfiniteCalendarProps_510301624[typingsJapgolly.reactInfiniteCalendar.mod.Calendar] = new SharedBuilder_ReactInfiniteCalendarProps_510301624[typingsJapgolly.reactInfiniteCalendar.mod.Calendar](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactInfiniteCalendarProps): SharedBuilder_ReactInfiniteCalendarProps_510301624[typingsJapgolly.reactInfiniteCalendar.mod.Calendar] = new SharedBuilder_ReactInfiniteCalendarProps_510301624[typingsJapgolly.reactInfiniteCalendar.mod.Calendar](js.Array(this.component, p.asInstanceOf[js.Any]))
}
