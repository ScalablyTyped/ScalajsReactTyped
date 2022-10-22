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
import typingsJapgolly.reactDates.mod.IconPositionShape
import typingsJapgolly.reactDates.mod.OpenDirectionShape
import typingsJapgolly.reactDates.mod.SingleDatePickerInputPhrases
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
open class SharedBuilder_SingleDatePickerInputShape1360821916 (val args: js.Array[Any])
  extends AnyVal
     with StBuildingComponent[scala.Nothing] {
  
  inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
  
  inline def block(value: Boolean): this.type = set("block", value.asInstanceOf[js.Any])
  
  inline def customCloseIcon(value: VdomNode): this.type = set("customCloseIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def customCloseIconNull: this.type = set("customCloseIcon", null)
  
  inline def customCloseIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customCloseIcon", js.Array(value*))
  
  inline def customCloseIconVdomElement(value: VdomElement): this.type = set("customCloseIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def customInputIcon(value: VdomNode): this.type = set("customInputIcon", value.rawNode.asInstanceOf[js.Any])
  
  inline def customInputIconNull: this.type = set("customInputIcon", null)
  
  inline def customInputIconVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customInputIcon", js.Array(value*))
  
  inline def customInputIconVdomElement(value: VdomElement): this.type = set("customInputIcon", value.rawElement.asInstanceOf[js.Any])
  
  inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
  
  inline def displayValue(value: String): this.type = set("displayValue", value.asInstanceOf[js.Any])
  
  inline def focused(value: Boolean): this.type = set("focused", value.asInstanceOf[js.Any])
  
  inline def inputIconPosition(value: IconPositionShape): this.type = set("inputIconPosition", value.asInstanceOf[js.Any])
  
  inline def isFocused(value: Boolean): this.type = set("isFocused", value.asInstanceOf[js.Any])
  
  inline def isRTL(value: Boolean): this.type = set("isRTL", value.asInstanceOf[js.Any])
  
  inline def noBorder(value: Boolean): this.type = set("noBorder", value.asInstanceOf[js.Any])
  
  inline def onChange(value: /* dateString */ String => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: /* dateString */ String) => value(t0).runNow()))
  
  inline def onClearDate(value: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element] => Callback): this.type = set("onClearDate", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLButtonElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onFocus(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onKeyDownArrowDown(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownArrowDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onKeyDownQuestionMark(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownQuestionMark", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onKeyDownShiftTab(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownShiftTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def onKeyDownTab(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDownTab", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
  
  inline def openDirection(value: OpenDirectionShape): this.type = set("openDirection", value.asInstanceOf[js.Any])
  
  inline def phrases(value: SingleDatePickerInputPhrases): this.type = set("phrases", value.asInstanceOf[js.Any])
  
  inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
  
  inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
  
  inline def regular(value: Boolean): this.type = set("regular", value.asInstanceOf[js.Any])
  
  inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
  
  inline def screenReaderMessage(value: String): this.type = set("screenReaderMessage", value.asInstanceOf[js.Any])
  
  inline def showCaret(value: Boolean): this.type = set("showCaret", value.asInstanceOf[js.Any])
  
  inline def showClearDate(value: Boolean): this.type = set("showClearDate", value.asInstanceOf[js.Any])
  
  inline def showDefaultInputIcon(value: Boolean): this.type = set("showDefaultInputIcon", value.asInstanceOf[js.Any])
  
  inline def small(value: Boolean): this.type = set("small", value.asInstanceOf[js.Any])
  
  inline def verticalSpacing(value: Double): this.type = set("verticalSpacing", value.asInstanceOf[js.Any])
}
