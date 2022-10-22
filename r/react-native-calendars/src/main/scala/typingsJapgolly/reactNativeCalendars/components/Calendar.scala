package typingsJapgolly.reactNativeCalendars.components

import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.reactNativeCalendars.mod.CalendarProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* The props of this component has an unsupported shape. You can use `set` manually to use it, but with no compiler support :/ . Support for combinations of intersection and union types not implemented */
object Calendar {
  
  def apply(p: CalendarProps): Default[typingsJapgolly.reactNativeCalendars.mod.Calendar] = new Default[typingsJapgolly.reactNativeCalendars.mod.Calendar](js.Array(this.component, p.asInstanceOf[js.Any]))
  
  @JSImport("react-native-calendars", "Calendar")
  @js.native
  val component: js.Object = js.native
  
  implicit def make(companion: Calendar.type): Default[typingsJapgolly.reactNativeCalendars.mod.Calendar] = new Default[typingsJapgolly.reactNativeCalendars.mod.Calendar](js.Array(this.component, js.Dictionary.empty))()
}
