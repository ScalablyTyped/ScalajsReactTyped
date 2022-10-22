package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.libBaseSelectMod.DisplayValueType
import typingsJapgolly.rcSelect.libBaseSelectMod.Mode
import typingsJapgolly.rcSelect.libSelectorSingleSelectorMod.SelectorProps
import typingsJapgolly.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SingleSelector {
  
  inline def apply(
    activeValue: String,
    id: String,
    inputElement: VdomElement,
    mode: Mode,
    onInputChange: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    onInputCompositionEnd: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    onInputCompositionStart: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    onInputKeyDown: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    onInputMouseDown: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    onInputPaste: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element] => Callback,
    open: Boolean,
    prefixCls: String,
    searchValue: String,
    values: js.Array[DisplayValueType]
  ): Builder = {
    val __props = js.Dynamic.literal(activeValue = activeValue.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onInputChange = js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputChange(t0).runNow()), onInputCompositionEnd = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputCompositionEnd(t0).runNow()), onInputCompositionStart = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputCompositionStart(t0).runNow()), onInputKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputKeyDown(t0).runNow()), onInputMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputMouseDown(t0).runNow()), onInputPaste = js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement) & Element]) => onInputPaste(t0).runNow()), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], searchValue = searchValue.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[SelectorProps]))
  }
  
  @JSImport("rc-select/lib/Selector/SingleSelector", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[js.Object] {
    
    inline def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    inline def autoComplete(value: String): this.type = set("autoComplete", value.asInstanceOf[js.Any])
    
    inline def autoFocus(value: Boolean): this.type = set("autoFocus", value.asInstanceOf[js.Any])
    
    inline def disabled(value: Boolean): this.type = set("disabled", value.asInstanceOf[js.Any])
    
    inline def inputRef(value: Ref[HTMLInputElement | HTMLTextAreaElement]): this.type = set("inputRef", value.asInstanceOf[js.Any])
    
    inline def inputRefFunction1(value: (HTMLInputElement | HTMLTextAreaElement) | Null => Callback): this.type = set("inputRef", js.Any.fromFunction1((t0: (HTMLInputElement | HTMLTextAreaElement) | Null) => value(t0).runNow()))
    
    inline def inputRefNull: this.type = set("inputRef", null)
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
    
    inline def placeholder(value: VdomNode): this.type = set("placeholder", value.rawNode.asInstanceOf[js.Any])
    
    inline def placeholderNull: this.type = set("placeholder", null)
    
    inline def placeholderVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): this.type = set("placeholder", js.Array(value*))
    
    inline def placeholderVdomElement(value: VdomElement): this.type = set("placeholder", value.rawElement.asInstanceOf[js.Any])
    
    inline def showSearch(value: Boolean): this.type = set("showSearch", value.asInstanceOf[js.Any])
    
    inline def tabIndex(value: Double): this.type = set("tabIndex", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: SelectorProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
