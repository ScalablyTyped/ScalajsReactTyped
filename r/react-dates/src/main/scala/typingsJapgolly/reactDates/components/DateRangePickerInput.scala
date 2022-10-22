package typingsJapgolly.reactDates.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLButtonElement
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.reactDates.mod.DateRangePickerInputCls
import typingsJapgolly.reactDates.mod.DateRangePickerInputPhrases
import typingsJapgolly.reactDates.mod.DateRangePickerInputShape
import typingsJapgolly.reactDates.mod.DisabledShape
import typingsJapgolly.reactDates.mod.IconPositionShape
import typingsJapgolly.reactDates.mod.OpenDirectionShape
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DateRangePickerInput {
  
  @JSImport("react-dates", "DateRangePickerInput")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[DateRangePickerInputCls] {
    
    inline def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
    
    inline def customArrowIcon(value: VdomNode): this.type = set("customArrowIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def customArrowIconNull: this.type = set("customArrowIcon", null)
    
    inline def customArrowIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customArrowIcon", js.Array(value*))
    
    inline def customArrowIconVdomElement(value: VdomElement): this.type = set("customArrowIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def customCloseIcon(value: VdomNode): this.type = set("customCloseIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def customCloseIconNull: this.type = set("customCloseIcon", null)
    
    inline def customCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customCloseIcon", js.Array(value*))
    
    inline def customCloseIconVdomElement(value: VdomElement): this.type = set("customCloseIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def customInputIcon(value: VdomNode): this.type = set("customInputIcon", value.rawNode.asInstanceOf[js.Any])
    
    inline def customInputIconNull: this.type = set("customInputIcon", null)
    
    inline def customInputIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customInputIcon", js.Array(value*))
    
    inline def customInputIconVdomElement(value: VdomElement): this.type = set("customInputIcon", value.rawElement.asInstanceOf[js.Any])
    
    inline def disabled(value: DisabledShape): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def endDate(value: String): this.type = set("endDate", value.asInstanceOf[js.Any])
    
    inline def endDateAriaLabel(value: String): this.type = set("endDateAriaLabel", value.asInstanceOf[js.Any])
    
    inline def endDateId(value: String): this.type = set("endDateId", value.asInstanceOf[js.Any])
    
    inline def endDatePlaceholderText(value: String): this.type = set("endDatePlaceholderText", value.asInstanceOf[js.Any])
    
    inline def inputIconPosition(value: IconPositionShape): this.type = set("inputIconPosition", value.asInstanceOf[js.Any])
    
    inline def isEndDateFocused(value: Boolean): this.type = set("isEndDateFocused", value.asInstanceOf[js.Any])
    
    inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
    
    inline def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
    
    inline def isStartDateFocused(value: Boolean): this.type = set("isStartDateFocused", value.asInstanceOf[js.Any])
    
    inline def noBorder(value: Boolean): this.type = set("noBorder", value.asInstanceOf[js.Any])
    
    inline def onClearDates(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClearDates", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEndDateChange(value: /* dateString */ String => Callback): this.type = set("onEndDateChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def onEndDateFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onEndDateFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEndDateTab(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onEndDateTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDownArrowDown(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownArrowDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDownQuestionMark(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownQuestionMark", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStartDateChange(value: /* dateString */ String => Callback): this.type = set("onStartDateChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
    
    inline def onStartDateFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onStartDateFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onStartDateShiftTab(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onStartDateShiftTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def openDirection(value: OpenDirectionShape): this.type = set("openDirection", value.asInstanceOf[js.Any])
    
    inline def phrases(value: DateRangePickerInputPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def regular(value: Boolean): this.type = set("regular", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def screenReaderMessage(value: String): this.type = set("screenReaderMessage", value.asInstanceOf[js.Any])
    
    inline def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
    
    inline def showClearDates(value: Boolean): this.type = set("showClearDates", value.asInstanceOf[js.Any])
    
    inline def showDefaultInputIcon(value: Boolean): this.type = set("showDefaultInputIcon", value.asInstanceOf[js.Any])
    
    inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
    
    inline def startDate(value: String): this.type = set("startDate", value.asInstanceOf[js.Any])
    
    inline def startDateAriaLabel(value: String): this.type = set("startDateAriaLabel", value.asInstanceOf[js.Any])
    
    inline def startDateId(value: String): this.type = set("startDateId", value.asInstanceOf[js.Any])
    
    inline def startDatePlaceholderText(value: String): this.type = set("startDatePlaceholderText", value.asInstanceOf[js.Any])
    
    inline def verticalSpacing(value: Double): this.type = set("verticalSpacing", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: DateRangePickerInput.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: DateRangePickerInputShape): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
