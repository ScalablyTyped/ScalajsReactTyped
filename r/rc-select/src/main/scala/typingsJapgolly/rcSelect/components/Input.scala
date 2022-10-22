package typingsJapgolly.rcSelect.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.vdom.VdomElement
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.StBuildingComponent
import typingsJapgolly.rcSelect.libSelectorInputMod.InputProps
import typingsJapgolly.rcSelect.libSelectorInputMod.InputRef
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Input {
  
  inline def apply(
    attrs: Record[String, Any],
    autoComplete: String,
    autoFocus: Boolean,
    disabled: Boolean,
    editable: Boolean,
    id: String,
    inputElement: VdomElement,
    onChange: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    onCompositionEnd: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    onCompositionStart: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    onKeyDown: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    onMouseDown: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    onPaste: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element] => Callback,
    open: Boolean,
    prefixCls: String,
    tabIndex: Double,
    value: String
  ): Builder = {
    val __props = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onChange(t0).runNow()), onCompositionEnd = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onCompositionEnd(t0).runNow()), onCompositionStart = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onCompositionStart(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onKeyDown(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onMouseDown(t0).runNow()), onPaste = js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & Element]) => onPaste(t0).runNow()), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[InputProps & RefAttributes[InputRef]]))
  }
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val component: js.Object = js.native
  
  @scala.inline
  open class Builder (val args: js.Array[Any])
    extends AnyVal
       with StBuildingComponent[InputRef & js.Object] {
    
    inline def activeDescendantId(value: String): this.type = set("activeDescendantId", value.asInstanceOf[js.Any])
    
    inline def maxLength(value: Double): this.type = set("maxLength", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: InputProps & RefAttributes[InputRef]): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
}
