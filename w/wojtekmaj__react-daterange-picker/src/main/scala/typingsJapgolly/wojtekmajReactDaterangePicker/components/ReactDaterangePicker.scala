package typingsJapgolly.wojtekmajReactDaterangePicker.components

import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.FocusEvent
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wojtekmajReactDaterangePicker.mod.DateRangePickerProps
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.century
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.decade
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.month
import typingsJapgolly.wojtekmajReactDaterangePicker.wojtekmajReactDaterangePickerStrings.year
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ReactDaterangePicker {
  
  inline def apply(value: (String | js.Date) | (js.Array[String | js.Date])): Builder = {
    val __props = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DateRangePickerProps[String | js.Date]]))
  }
  
  @JSImport("@wojtekmaj/react-daterange-picker", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def calendarAriaLabel(value: String): this.type = set("calendarAriaLabel", value.asInstanceOf[js.Any])
    
    inline def calendarClassName(value: String | js.Array[String]): this.type = set("calendarClassName", value.asInstanceOf[js.Any])
    
    inline def calendarClassNameVarargs(value: String*): this.type = set("calendarClassName", js.Array(value*))
    
    inline def calendarIcon(value: VdomNode): this.type = set("calendarIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def calendarIconNull: this.type = set("calendarIcon", null)
    
    inline def calendarIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("calendarIcon", js.Array(value*))
    
    inline def calendarIconVdomElement(value: VdomElement): this.type = set("calendarIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String | js.Array[String]): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def classNameVarargs(value: String*): this.type = set("className", js.Array(value*))
    
    inline def clearAriaLabel(value: String): this.type = set("clearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def clearIcon(value: VdomNode): this.type = set("clearIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def clearIconNull: this.type = set("clearIcon", null)
    
    inline def clearIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("clearIcon", js.Array(value*))
    
    inline def clearIconVdomElement(value: VdomElement): this.type = set("clearIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def closeCalendar(value: Boolean): this.type = set("closeCalendar", value.asInstanceOf[js.Any])
    
    inline def dayAriaLabel(value: String): this.type = set("dayAriaLabel", value.asInstanceOf[js.Any])
    
    inline def dayPlaceholder(value: String): this.type = set("dayPlaceholder", value.asInstanceOf[js.Any])
    
    inline def disableCalendar(value: Boolean): this.type = set("disableCalendar", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def format(value: String): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def isOpen(value: Boolean): this.type = set("isOpen", value.asInstanceOf[js.Any])
    
    inline def locale(value: String): this.type = set("locale", value.asInstanceOf[js.Any])
    
    inline def maxDate(value: js.Date): this.type = set("maxDate", value.asInstanceOf[js.Any])
    
    inline def maxDetail(value: century | decade | year | month): this.type = set("maxDetail", value.asInstanceOf[js.Any])
    
    inline def minDate(value: js.Date): this.type = set("minDate", value.asInstanceOf[js.Any])
    
    inline def minDetail(value: century | decade | year | month): this.type = set("minDetail", value.asInstanceOf[js.Any])
    
    inline def monthAriaLabel(value: String): this.type = set("monthAriaLabel", value.asInstanceOf[js.Any])
    
    inline def monthPlaceholder(value: String): this.type = set("monthPlaceholder", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def nativeInputAriaLabel(value: String): this.type = set("nativeInputAriaLabel", value.asInstanceOf[js.Any])
    
    inline def onCalendarClose(value: CallbackTo[js.UndefOr[Unit]]): this.type = set("onCalendarClose", value.toJsFn)
    
    inline def onCalendarOpen(value: CallbackTo[js.UndefOr[Unit]]): this.type = set("onCalendarOpen", value.toJsFn)
    
    inline def onChange(value: String | js.Date => js.UndefOr[Unit]): this.type = set("onChange", js.Any.fromFunction1(value))
    
    inline def onFocus(value: /* event */ FocusEvent => js.UndefOr[Unit]): this.type = set("onFocus", js.Any.fromFunction1(value))
    
    inline def openCalendarOnFocus(value: Boolean): this.type = set("openCalendarOnFocus", value.asInstanceOf[js.Any])
    
    inline def rangeDivider(value: VdomNode): this.type = set("rangeDivider", value.rawNode.asInstanceOf[js.Any])
    
    inline def rangeDividerNull: this.type = set("rangeDivider", null)
    
    inline def rangeDividerVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("rangeDivider", js.Array(value*))
    
    inline def rangeDividerVdomElement(value: VdomElement): this.type = set("rangeDivider", value.rawElement.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def showLeadingZeros(value: Boolean): this.type = set("showLeadingZeros", value.asInstanceOf[js.Any])
    
    inline def yearAriaLabel(value: String): this.type = set("yearAriaLabel", value.asInstanceOf[js.Any])
    
    inline def yearPlaceholder(value: String): this.type = set("yearPlaceholder", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DateRangePickerProps[String | js.Date]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
