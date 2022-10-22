package typingsJapgolly.reactNativeCalendars.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeCalendars.mod.CalendarProviderProps
import typingsJapgolly.reactNativeCalendars.mod.DateObject
import typingsJapgolly.reactNativeCalendars.mod.UpdateSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object CalendarProvider {
  
  inline def apply(date: js.Date | String | Double): Builder = {
    val __props = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[CalendarProviderProps]))
  }
  
  @JSImport("react-native-calendars", "CalendarProvider")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.reactNativeCalendars.mod.CalendarProvider] {
    
    inline def disabledOpacity(value: Double): this.type = set("disabledOpacity", value.asInstanceOf[js.Any])
    
    inline def onDateChanged(value: (/* date */ String, /* updateSource */ UpdateSource) => Callback): this.type = set("onDateChanged", js.Any.fromFunction2((t0: /* date */ String, t1: /* updateSource */ UpdateSource) => (value(t0, t1)).runNow()))
    
    inline def onMonthChange(value: (/* date */ DateObject, /* updateSource */ UpdateSource) => Callback): this.type = set("onMonthChange", js.Any.fromFunction2((t0: /* date */ DateObject, t1: /* updateSource */ UpdateSource) => (value(t0, t1)).runNow()))
    
    inline def showTodayButton(value: Boolean): this.type = set("showTodayButton", value.asInstanceOf[js.Any])
    
    inline def todayBottomMargin(value: Double): this.type = set("todayBottomMargin", value.asInstanceOf[js.Any])
    
    inline def todayButtonStyle(value: ViewStyle | js.Array[ViewStyle]): this.type = set("todayButtonStyle", value.asInstanceOf[js.Any])
    
    inline def todayButtonStyleVarargs(value: ViewStyle*): this.type = set("todayButtonStyle", js.Array(value*))
  }
  
  def withProps(p: CalendarProviderProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
