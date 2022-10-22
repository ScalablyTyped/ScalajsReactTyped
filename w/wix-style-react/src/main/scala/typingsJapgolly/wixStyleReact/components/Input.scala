package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputProps
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputSize
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputValue
import typingsJapgolly.wixStyleReact.distTypesInputMod.MaxValue
import typingsJapgolly.wixStyleReact.distTypesInputMod.MinValue
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.bottomLine
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.clip
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.ellipsis
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.none_
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.round
import typingsJapgolly.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  @JSImport("wix-style-react", "Input")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.Input] {
    
    inline def ariaControls(value: String): this.type = set("ariaControls", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedby(value: String): this.type = set("ariaDescribedby", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def ariaRoledescription(value: String): this.type = set("ariaRoledescription", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoSelect(value: Boolean): this.type = set("autoSelect", value.asInstanceOf[js.Any])
    
    inline def autocomplete(value: String): this.type = set("autocomplete", value.asInstanceOf[js.Any])
    
    inline def border(value: standard | round | bottomLine | none_): this.type = set("border", value.asInstanceOf[js.Any])
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def clearButton(value: Boolean): this.type = set("clearButton", value.asInstanceOf[js.Any])
    
    inline def customInput(value: Node | js.Function): this.type = set("customInput", value.asInstanceOf[js.Any])
    
    inline def customInputNull: this.type = set("customInput", null)
    
    inline def customInputVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("customInput", js.Array(value*))
    
    inline def customInputVdomElement(value: VdomElement): this.type = set("customInput", value.rawElement.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: InputValue): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disableEditing(value: Boolean): this.type = set("disableEditing", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def focusOnClearClick(value: Boolean): this.type = set("focusOnClearClick", value.asInstanceOf[js.Any])
    
    inline def forceFocus(value: Boolean): this.type = set("forceFocus", value.asInstanceOf[js.Any])
    
    inline def forceHover(value: Boolean): this.type = set("forceHover", value.asInstanceOf[js.Any])
    
    inline def hideStatusSuffix(value: Boolean): this.type = set("hideStatusSuffix", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: /* input */ HTMLInputElement => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: /* input */ HTMLInputElement) => value(t0).runNow()))
    
    inline def inputmode(value: String): this.type = set("inputmode", value.asInstanceOf[js.Any])
    
    inline def max(value: MaxValue): this.type = set("max", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def menuArrow(value: Boolean): this.type = set("menuArrow", value.asInstanceOf[js.Any])
    
    inline def min(value: MinValue): this.type = set("min", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def noLeftBorderRadius(value: Boolean): this.type = set("noLeftBorderRadius", value.asInstanceOf[js.Any])
    
    inline def noRightBorderRadius(value: Boolean): this.type = set("noRightBorderRadius", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onClear(value: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onClear", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onCompositionChange(value: /* isComposing */ Boolean => Callback): this.type = set("onCompositionChange", js.Any.fromFunction1((t0: /* isComposing */ Boolean) => value(t0).runNow()))
    
    inline def onEnterPressed(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onEnterPressed", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onEscapePressed(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onEscapePressed", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLInputElement]]) => value(t0).runNow()))
    
    inline def onInputClicked(value: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onInputClicked", js.Any.fromFunction1((t0: ReactMouseEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def onPaste(value: ReactClipboardEventFrom[HTMLInputElement & org.scalajs.dom.Element] => Callback): this.type = set("onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[HTMLInputElement & org.scalajs.dom.Element]) => value(t0).runNow()))
    
    inline def pattern(value: String): this.type = set("pattern", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def prefix(value: VdomNode): this.type = set("prefix", value.rawNode.asInstanceOf[js.Any])
    
    inline def prefixNull: this.type = set("prefix", null)
    
    inline def prefixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("prefix", js.Array(value*))
    
    inline def prefixVdomElement(value: VdomElement): this.type = set("prefix", value.rawElement.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def rtl(value: Boolean): this.type = set("rtl", value.asInstanceOf[js.Any])
    
    inline def size(value: InputSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: InputStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def step(value: Double): this.type = set("step", value.asInstanceOf[js.Any])
    
    inline def suffix(value: VdomNode): this.type = set("suffix", value.rawNode.asInstanceOf[js.Any])
    
    inline def suffixNull: this.type = set("suffix", null)
    
    inline def suffixVarargs(value: (Empty | String | JsNumber | Element)*): this.type = set("suffix", js.Array(value*))
    
    inline def suffixVdomElement(value: VdomElement): this.type = set("suffix", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def textOverflow(value: clip | ellipsis): this.type = set("textOverflow", value.asInstanceOf[js.Any])
    
    inline def tooltipPlacement(value: Placement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
    
    inline def `type`(value: String): this.type = set("type", value.asInstanceOf[js.Any])
    
    inline def value(value: String | Double): this.type = set("value", value.asInstanceOf[js.Any])
    
    inline def withSelection(value: Boolean): this.type = set("withSelection", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: Input.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
