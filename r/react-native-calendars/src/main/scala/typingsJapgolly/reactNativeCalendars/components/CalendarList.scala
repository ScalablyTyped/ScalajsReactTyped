package typingsJapgolly.reactNativeCalendars.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeCalendars.mod.CalendarListBaseProps
import typingsJapgolly.reactNativeCalendars.mod.CalendarMarkingProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object CalendarList {
  
  def apply(p: CalendarMarkingProps & CalendarListBaseProps): Default[typingsJapgolly.reactNativeCalendars.mod.CalendarList] = new Default[typingsJapgolly.reactNativeCalendars.mod.CalendarList](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-calendars", "CalendarList")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: CalendarList.type): Default[typingsJapgolly.reactNativeCalendars.mod.CalendarList] = new Default[typingsJapgolly.reactNativeCalendars.mod.CalendarList](js.Array(this.component, js.Dictionary.empty))()
}
