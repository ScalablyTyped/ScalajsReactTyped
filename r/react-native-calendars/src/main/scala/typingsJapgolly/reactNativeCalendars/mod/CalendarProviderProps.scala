package typingsJapgolly.reactNativeCalendars.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarProviderProps extends StObject {
  
  var children: js.UndefOr[Node] = js.undefined
  
  /**
    * Initial date in 'yyyy-MM-dd' format. Default = Date()
    */
  var date: js.Date | String | Double
  
  /**
    * The opacity for the disabled today button (0-1)
    */
  var disabledOpacity: js.UndefOr[Double] = js.undefined
  
  /**
    * Callback for date change event
    */
  var onDateChanged: js.UndefOr[js.Function2[/* date */ String, /* updateSource */ UpdateSource, Unit]] = js.undefined
  
  /**
    * Callback for month change event
    */
  var onMonthChange: js.UndefOr[js.Function2[/* date */ DateObject, /* updateSource */ UpdateSource, Unit]] = js.undefined
  
  /**
    * Whether to show the today button
    */
  var showTodayButton: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Today button's top position
    */
  var todayBottomMargin: js.UndefOr[Double] = js.undefined
  
  /**
    * Today button's style
    */
  var todayButtonStyle: js.UndefOr[ViewStyle | js.Array[ViewStyle]] = js.undefined
}
object CalendarProviderProps {
  
  inline def apply(date: js.Date | String | Double): CalendarProviderProps = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarProviderProps]
  }
  
  extension [Self <: CalendarProviderProps](x: Self) {
    
    inline def setChildren(value: VdomNode): Self = StObject.set(x, "children", value.rawNode.asInstanceOf[js.Any])
    
    inline def setChildrenNull: Self = StObject.set(x, "children", null)
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setChildrenVdomElement(value: VdomElement): Self = StObject.set(x, "children", value.rawElement.asInstanceOf[js.Any])
    
    inline def setDate(value: js.Date | String | Double): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDisabledOpacity(value: Double): Self = StObject.set(x, "disabledOpacity", value.asInstanceOf[js.Any])
    
    inline def setDisabledOpacityUndefined: Self = StObject.set(x, "disabledOpacity", js.undefined)
    
    inline def setOnDateChanged(value: (/* date */ String, /* updateSource */ UpdateSource) => Callback): Self = StObject.set(x, "onDateChanged", js.Any.fromFunction2((t0: /* date */ String, t1: /* updateSource */ UpdateSource) => (value(t0, t1)).runNow()))
    
    inline def setOnDateChangedUndefined: Self = StObject.set(x, "onDateChanged", js.undefined)
    
    inline def setOnMonthChange(value: (/* date */ DateObject, /* updateSource */ UpdateSource) => Callback): Self = StObject.set(x, "onMonthChange", js.Any.fromFunction2((t0: /* date */ DateObject, t1: /* updateSource */ UpdateSource) => (value(t0, t1)).runNow()))
    
    inline def setOnMonthChangeUndefined: Self = StObject.set(x, "onMonthChange", js.undefined)
    
    inline def setShowTodayButton(value: Boolean): Self = StObject.set(x, "showTodayButton", value.asInstanceOf[js.Any])
    
    inline def setShowTodayButtonUndefined: Self = StObject.set(x, "showTodayButton", js.undefined)
    
    inline def setTodayBottomMargin(value: Double): Self = StObject.set(x, "todayBottomMargin", value.asInstanceOf[js.Any])
    
    inline def setTodayBottomMarginUndefined: Self = StObject.set(x, "todayBottomMargin", js.undefined)
    
    inline def setTodayButtonStyle(value: ViewStyle | js.Array[ViewStyle]): Self = StObject.set(x, "todayButtonStyle", value.asInstanceOf[js.Any])
    
    inline def setTodayButtonStyleUndefined: Self = StObject.set(x, "todayButtonStyle", js.undefined)
    
    inline def setTodayButtonStyleVarargs(value: ViewStyle*): Self = StObject.set(x, "todayButtonStyle", js.Array(value*))
  }
}
