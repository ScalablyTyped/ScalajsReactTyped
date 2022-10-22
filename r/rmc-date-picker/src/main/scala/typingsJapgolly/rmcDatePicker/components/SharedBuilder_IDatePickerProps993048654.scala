package typingsJapgolly.rmcDatePicker.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_IDatePickerProps993048654[R <: js.Object] (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[R] {
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def date(value: Any): this.type = set("date", value.asInstanceOf[js.Any])
  
  inline def defaultDate(value: Any): this.type = set("defaultDate", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def formatDay(value: (/* day */ Double, /* date */ js.UndefOr[Any]) => Any): this.type = set("formatDay", js.Any.fromFunction2(value))
  
  inline def formatMonth(value: (/* month */ Double, /* date */ js.UndefOr[Any]) => Any): this.type = set("formatMonth", js.Any.fromFunction2(value))
  
  inline def itemStyle(value: Any): this.type = set("itemStyle", value.asInstanceOf[js.Any])
  
  inline def locale(value: Any): this.type = set("locale", value.asInstanceOf[js.Any])
  
  inline def maxDate(value: Any): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  inline def maxHour(value: Double): this.type = set("maxHour", value.asInstanceOf[js.Any])
  
  inline def maxMinute(value: Double): this.type = set("maxMinute", value.asInstanceOf[js.Any])
  
  inline def minDate(value: Any): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  inline def minHour(value: Double): this.type = set("minHour", value.asInstanceOf[js.Any])
  
  inline def minMinute(value: Double): this.type = set("minMinute", value.asInstanceOf[js.Any])
  
  inline def minuteStep(value: Double): this.type = set("minuteStep", value.asInstanceOf[js.Any])
  
  inline def mode(value: String): this.type = set("mode", value.asInstanceOf[js.Any])
  
  inline def onDateChange(value: /* date */ Any => Callback): this.type = set("onDateChange", js.Any.fromFunction1((t0: /* date */ Any) => value(t0).runNow()))
  
  inline def onScrollChange(value: (/* date */ Any, /* vals */ Any, /* index */ Double) => Callback): this.type = set("onScrollChange", js.Any.fromFunction3((t0: /* date */ Any, t1: /* vals */ Any, t2: /* index */ Double) => (value(t0, t1, t2)).runNow()))
  
  inline def onValueChange(value: (/* vals */ Any, /* index */ Double) => Callback): this.type = set("onValueChange", js.Any.fromFunction2((t0: /* vals */ Any, t1: /* index */ Double) => (value(t0, t1)).runNow()))
  
  inline def pickerPrefixCls(value: String): this.type = set("pickerPrefixCls", value.asInstanceOf[js.Any])
  
  inline def prefixCls(value: String): this.type = set("prefixCls", value.asInstanceOf[js.Any])
  
  inline def rootNativeProps(value: js.Object): this.type = set("rootNativeProps", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def use12Hours(value: Boolean): this.type = set("use12Hours", value.asInstanceOf[js.Any])
}
