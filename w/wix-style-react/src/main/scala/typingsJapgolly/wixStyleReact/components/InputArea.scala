package typingsJapgolly.wixStyleReact.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.wixStyleReact.anon.OnBlur
import typingsJapgolly.wixStyleReact.distTypesInputAreaMod.InputAreaProps
import typingsJapgolly.wixStyleReact.distTypesInputAreaMod.InputAreaSize
import typingsJapgolly.wixStyleReact.distTypesInputAreaMod.InputAreaStatus
import typingsJapgolly.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InputArea {
  
  @JSImport("wix-style-react", "InputArea")
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[typingsJapgolly.wixStyleReact.mod.InputArea] {
    
    inline def ariaControls(value: String): this.type = set("ariaControls", value.asInstanceOf[js.Any])
    
    inline def ariaDescribedby(value: String): this.type = set("ariaDescribedby", value.asInstanceOf[js.Any])
    
    inline def ariaLabel(value: String): this.type = set("ariaLabel", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def autoGrow(value: Boolean): this.type = set("autoGrow", value.asInstanceOf[js.Any])
    
    inline def autoSelect(value: Boolean): this.type = set("autoSelect", value.asInstanceOf[js.Any])
    
    inline def children(value: /* data */ OnBlur => Node): this.type = set("children", js.Any.fromFunction1(value))
    
    inline def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    
    inline def dataHook(value: String): this.type = set("dataHook", value.asInstanceOf[js.Any])
    
    inline def defaultValue(value: String): this.type = set("defaultValue", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def forceFocus(value: Boolean): this.type = set("forceFocus", value.asInstanceOf[js.Any])
    
    inline def forceHover(value: Boolean): this.type = set("forceHover", value.asInstanceOf[js.Any])
    
    inline def hasCounter(value: Boolean): this.type = set("hasCounter", value.asInstanceOf[js.Any])
    
    inline def id(value: String): this.type = set("id", value.asInstanceOf[js.Any])
    
    inline def maxHeight(value: String): this.type = set("maxHeight", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def menuArrow(value: Boolean): this.type = set("menuArrow", value.asInstanceOf[js.Any])
    
    inline def minHeight(value: String): this.type = set("minHeight", value.asInstanceOf[js.Any])
    
    inline def minRowsAutoGrow(value: Double): this.type = set("minRowsAutoGrow", value.asInstanceOf[js.Any])
    
    inline def name(value: String): this.type = set("name", value.asInstanceOf[js.Any])
    
    inline def onBlur(value: ReactFocusEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
    
    inline def onChange(value: ReactEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
    
    inline def onEnterPressed(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onEnterPressed", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
    
    inline def onEscapePressed(value: Callback): this.type = set("onEscapePressed", value.toJsFn)
    
    inline def onFocus(value: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLTextAreaElement]] => Callback): this.type = set("onFocus", js.Any.fromFunction1((t0: /* e */ js.UndefOr[ReactFocusEventFrom[HTMLTextAreaElement]]) => value(t0).runNow()))
    
    inline def onKeyDown(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
    
    inline def onKeyUp(value: ReactKeyboardEventFrom[HTMLTextAreaElement & Element] => Callback): this.type = set("onKeyUp", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[HTMLTextAreaElement & Element]) => value(t0).runNow()))
    
    inline def placeholder(value: String): this.type = set("placeholder", value.asInstanceOf[js.Any])
    
    inline def readOnly(value: Boolean): this.type = set("readOnly", value.asInstanceOf[js.Any])
    
    inline def required(value: Boolean): this.type = set("required", value.asInstanceOf[js.Any])
    
    inline def resizable(value: Boolean): this.type = set("resizable", value.asInstanceOf[js.Any])
    
    inline def rows(value: Double): this.type = set("rows", value.asInstanceOf[js.Any])
    
    inline def size(value: InputAreaSize): this.type = set("size", value.asInstanceOf[js.Any])
    
    inline def status(value: InputAreaStatus): this.type = set("status", value.asInstanceOf[js.Any])
    
    inline def statusMessage(value: VdomNode): this.type = set("statusMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def statusMessageNull: this.type = set("statusMessage", null)
    
    inline def statusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("statusMessage", js.Array(value*))
    
    inline def statusMessageVdomElement(value: VdomElement): this.type = set("statusMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
    
    inline def tooltipPlacement(value: Placement): this.type = set("tooltipPlacement", value.asInstanceOf[js.Any])
    
    inline def value(value: String): this.type = set("value", value.asInstanceOf[js.Any])
  }
  
  implicit def make(companion: InputArea.type): Builder = new Builder(js.Array(this.component, js.Dictionary.empty))()
  
  def withProps(p: InputAreaProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
