package typingsJapgolly.reactInfiniteCalendar.components

import typingsJapgolly.reactInfiniteCalendar.mod.ReactInfiniteCalendarProps
import typingsJapgolly.reactInfiniteCalendar.mod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactInfiniteCalendar {
  
  @JSImport("react-infinite-calendar", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: ReactInfiniteCalendar.type): SharedBuilder_ReactInfiniteCalendarProps_510301624[default] = new SharedBuilder_ReactInfiniteCalendarProps_510301624[default](js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: ReactInfiniteCalendarProps): SharedBuilder_ReactInfiniteCalendarProps_510301624[default] = new SharedBuilder_ReactInfiniteCalendarProps_510301624[default](js.Array(this.component, p.asInstanceOf[js.Any]))
}
