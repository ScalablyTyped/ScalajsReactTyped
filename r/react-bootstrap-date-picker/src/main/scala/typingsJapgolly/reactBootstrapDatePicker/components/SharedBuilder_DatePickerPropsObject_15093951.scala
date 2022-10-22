package typingsJapgolly.reactBootstrapDatePicker.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.ComponentClassP
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_DatePickerPropsObject_15093951 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
  
  inline def calendarContainer(value: Any): this.type = set("calendarContainer", value.asInstanceOf[js.Any])
  
  inline def calendarPlacement(value: String): this.type = set("calendarPlacement", value.asInstanceOf[js.Any])
  
  inline def cellPadding(value: String): this.type = set("cellPadding", value.asInstanceOf[js.Any])
  
  inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
  
  inline def clearButtonElement(value: VdomNode): this.type = set("clearButtonElement", value.rawNode.asInstanceOf[js.Any])
  
  inline def clearButtonElementNull: this.type = set("clearButtonElement", null)
  
  inline def clearButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearButtonElement", js.Array(value*))
  
  inline def clearButtonElementVdomElement(value: VdomElement): this.type = set("clearButtonElement", value.rawElement.asInstanceOf[js.Any])
  
  inline def customControl(value: FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): this.type = set("customControl", value.asInstanceOf[js.Any])
  
  inline def dateFormat(value: String): this.type = set("dateFormat", value.asInstanceOf[js.Any])
  
  inline def dayLabels(value: js.Array[String]): this.type = set("dayLabels", value.asInstanceOf[js.Any])
  
  inline def dayLabelsVarargs(value: String*): this.type = set("dayLabels", js.Array(value*))
  
  inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def maxDate(value: String): this.type = set("maxDate", value.asInstanceOf[js.Any])
  
  inline def minDate(value: String): this.type = set("minDate", value.asInstanceOf[js.Any])
  
  inline def monthLabels(value: js.Array[String]): this.type = set("monthLabels", value.asInstanceOf[js.Any])
  
  inline def monthLabelsVarargs(value: String*): this.type = set("monthLabels", js.Array(value*))
  
  inline def nextButtonElement(value: VdomNode): this.type = set("nextButtonElement", value.rawNode.asInstanceOf[js.Any])
  
  inline def nextButtonElementNull: this.type = set("nextButtonElement", null)
  
  inline def nextButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("nextButtonElement", js.Array(value*))
  
  inline def nextButtonElementVdomElement(value: VdomElement): this.type = set("nextButtonElement", value.rawElement.asInstanceOf[js.Any])
  
  inline def onBlur(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onChange(value: (/* value */ String, /* formattedValue */ String) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* value */ String, t1: /* formattedValue */ String) => (value(t0, t1)).runNow()))
  
  inline def onClear(value: Callback): this.type = set("onClear", value.toJsFn)
  
  inline def onFocus(value: ReactFocusEventFrom[Any & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[Any & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def previousButtonElement(value: VdomNode): this.type = set("previousButtonElement", value.rawNode.asInstanceOf[js.Any])
  
  inline def previousButtonElementNull: this.type = set("previousButtonElement", null)
  
  inline def previousButtonElementVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("previousButtonElement", js.Array(value*))
  
  inline def previousButtonElementVdomElement(value: VdomElement): this.type = set("previousButtonElement", value.rawElement.asInstanceOf[js.Any])
  
  inline def showClearButton(value: Boolean): this.type = set("showClearButton", value.asInstanceOf[js.Any])
  
  inline def showTodayButton(value: Boolean): this.type = set("showTodayButton", value.asInstanceOf[js.Any])
  
  inline def style(value: Any): this.type = set("style", value.asInstanceOf[js.Any])
  
  inline def todayButtonLabel(value: String): this.type = set("todayButtonLabel", value.asInstanceOf[js.Any])
  
  inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  
  inline def weekStartsOnMonday(value: Boolean): this.type = set("weekStartsOnMonday", value.asInstanceOf[js.Any])
}
