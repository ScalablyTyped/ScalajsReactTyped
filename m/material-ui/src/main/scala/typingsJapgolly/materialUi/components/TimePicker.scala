package typingsJapgolly.materialUi.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.materialUi.MaterialUI.TimePickerProps
import typingsJapgolly.materialUi.materialUiStrings.`24hr`
import typingsJapgolly.materialUi.materialUiStrings.ampm
import typingsJapgolly.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object TimePicker {
  
  @JSImport("material-ui", "TimePicker")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.materialUi.mod.TimePicker] {
    
    inline def autoOk(value: Boolean): this.type = set("autoOk", value.asInstanceOf[js.Any])
    
    inline def cancelLabel(value: VdomNode): this.type = set("cancelLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def cancelLabelNull: this.type = set("cancelLabel", null)
    
    inline def cancelLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("cancelLabel", js.Array(value*))
    
    inline def cancelLabelVdomElement(value: VdomElement): this.type = set("cancelLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def defaultTime(value: js.Date): this.type = set("defaultTime", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String | Double): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def dialogBodyStyle(value: CSSProperties): this.type = set("dialogBodyStyle", value.asInstanceOf[js.Any])
    
    inline def dialogStyle(value: CSSProperties): this.type = set("dialogStyle", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def errorStyle(value: CSSProperties): this.type = set("errorStyle", value.asInstanceOf[js.Any])
    
    inline def errorText(value: VdomNode): this.type = set("errorText", value.rawNode.asInstanceOf[js.Any])
    
    inline def errorTextNull: this.type = set("errorText", null)
    
    inline def errorTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("errorText", js.Array(value*))
    
    inline def errorTextVdomElement(value: VdomElement): this.type = set("errorText", value.rawElement.asInstanceOf[js.Any])
    
    inline def floatingLabelFixed(value: Boolean): this.type = set("floatingLabelFixed", value.asInstanceOf[js.Any])
    
    inline def floatingLabelFocusStyle(value: CSSProperties): this.type = set("floatingLabelFocusStyle", value.asInstanceOf[js.Any])
    
    inline def floatingLabelStyle(value: CSSProperties): this.type = set("floatingLabelStyle", value.asInstanceOf[js.Any])
    
    inline def floatingLabelText(value: VdomNode): this.type = set("floatingLabelText", value.rawNode.asInstanceOf[js.Any])
    
    inline def floatingLabelTextNull: this.type = set("floatingLabelText", null)
    
    inline def floatingLabelTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("floatingLabelText", js.Array(value*))
    
    inline def floatingLabelTextVdomElement(value: VdomElement): this.type = set("floatingLabelText", value.rawElement.asInstanceOf[js.Any])
    
    inline def format(value: ampm | `24hr`): this.type = set("format", value.asInstanceOf[js.Any])
    
    inline def fullWidth(value: Boolean): this.type = set("fullWidth", value.asInstanceOf[js.Any])
    
    inline def hintStyle(value: CSSProperties): this.type = set("hintStyle", value.asInstanceOf[js.Any])
    
    inline def hintText(value: VdomNode): this.type = set("hintText", value.rawNode.asInstanceOf[js.Any])
    
    inline def hintTextNull: this.type = set("hintText", null)
    
    inline def hintTextVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("hintText", js.Array(value*))
    
    inline def hintTextVdomElement(value: VdomElement): this.type = set("hintText", value.rawElement.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputStyle(value: CSSProperties): this.type = set("inputStyle", value.asInstanceOf[js.Any])
    
    inline def minutesStep(value: Double): this.type = set("minutesStep", value.asInstanceOf[js.Any])
    
    inline def multiLine(value: Boolean): this.type = set("multiLine", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def okLabel(value: VdomNode): this.type = set("okLabel", value.rawNode.asInstanceOf[js.Any])
    
    inline def okLabelNull: this.type = set("okLabel", null)
    
    inline def okLabelVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("okLabel", js.Array(value*))
    
    inline def okLabelVdomElement(value: VdomElement): this.type = set("okLabel", value.rawElement.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(value: (/* e */ Any, /* time */ js.Date) => Callback): this.type = set("onChange", js.Any.fromFunction2((t0: /* e */ Any, t1: /* time */ js.Date) => (value(t0, t1)).runNow()))
    
    inline def onClick(value: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onClick", js.Any.fromFunction1((t0: ReactMouseEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onDismiss(value: Callback): this.type = set("onDismiss", value.toJsFn)
    
    inline def onFocus(value: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[js.Object & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onShow(value: Callback): this.type = set("onShow", value.toJsFn)
    
    inline def pedantic(value: Boolean): this.type = set("pedantic", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def rowsMax(value: Double): this.type = set("rowsMax", value.asInstanceOf[js.Any])
    
    inline def style(value: CSSProperties): this.type = set("style", value.asInstanceOf[js.Any])
    
    inline def textFieldStyle(value: CSSProperties): this.type = set("textFieldStyle", value.asInstanceOf[js.Any])
    
    inline def textareaStyle(value: CSSProperties): this.type = set("textareaStyle", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def underlineDisabledStyle(value: CSSProperties): this.type = set("underlineDisabledStyle", value.asInstanceOf[js.Any])
    
    inline def underlineFocusStyle(value: CSSProperties): this.type = set("underlineFocusStyle", value.asInstanceOf[js.Any])
    
    inline def underlineShow(value: Boolean): this.type = set("underlineShow", value.asInstanceOf[js.Any])
    
    inline def underlineStyle(value: CSSProperties): this.type = set("underlineStyle", value.asInstanceOf[js.Any])
    
    inline def value(value: js.Date): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: TimePicker.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: TimePickerProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
