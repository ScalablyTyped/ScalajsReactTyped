package typingsJapgolly.rcSelect

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactClipboardEventFrom
import japgolly.scalajs.react.ReactCompositionEventFrom
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactKeyboardEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.ClipboardEventHandler
import typingsJapgolly.react.mod.CompositionEventHandler
import typingsJapgolly.react.mod.ForwardRefExoticComponent
import typingsJapgolly.react.mod.KeyboardEventHandler
import typingsJapgolly.react.mod.MouseEventHandler
import typingsJapgolly.react.mod.RefAttributes
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSelectorInputMod extends Shortcut {
  
  @JSImport("rc-select/lib/Selector/Input", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = js.native
  
  trait InputProps extends StObject {
    
    var activeDescendantId: js.UndefOr[String] = js.undefined
    
    /** Pass accessibility props to input */
    var attrs: Record[String, Any]
    
    var autoComplete: String
    
    var autoFocus: Boolean
    
    var disabled: Boolean
    
    var editable: Boolean
    
    var id: String
    
    var inputElement: Element
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var onChange: ChangeEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onCompositionEnd: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onCompositionStart: CompositionEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onKeyDown: KeyboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onMouseDown: MouseEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var onPaste: ClipboardEventHandler[HTMLInputElement | HTMLTextAreaElement | HTMLElement]
    
    var open: Boolean
    
    var prefixCls: String
    
    var tabIndex: Double
    
    var value: String
  }
  object InputProps {
    
    inline def apply(
      attrs: Record[String, Any],
      autoComplete: String,
      autoFocus: Boolean,
      disabled: Boolean,
      editable: Boolean,
      id: String,
      inputElement: VdomElement,
      onChange: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      onCompositionEnd: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      onCompositionStart: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      onKeyDown: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      onMouseDown: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      onPaste: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback,
      open: Boolean,
      prefixCls: String,
      tabIndex: Double,
      value: String
    ): InputProps = {
      val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], autoComplete = autoComplete.asInstanceOf[js.Any], autoFocus = autoFocus.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], editable = editable.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputElement = inputElement.rawElement.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onChange(t0).runNow()), onCompositionEnd = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onCompositionEnd(t0).runNow()), onCompositionStart = js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onCompositionStart(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onKeyDown(t0).runNow()), onMouseDown = js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onMouseDown(t0).runNow()), onPaste = js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => onPaste(t0).runNow()), open = open.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], tabIndex = tabIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputProps]
    }
    
    extension [Self <: InputProps](x: Self) {
      
      inline def setActiveDescendantId(value: String): Self = StObject.set(x, "activeDescendantId", value.asInstanceOf[js.Any])
      
      inline def setActiveDescendantIdUndefined: Self = StObject.set(x, "activeDescendantId", js.undefined)
      
      inline def setAttrs(value: Record[String, Any]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
      
      inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setInputElement(value: VdomElement): Self = StObject.set(x, "inputElement", value.rawElement.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnChange(
        value: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionEnd(
        value: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnCompositionStart(
        value: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1((t0: ReactCompositionEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnKeyDown(
        value: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactKeyboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnMouseDown(
        value: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1((t0: ReactMouseEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnPaste(
        value: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element] => Callback
      ): Self = StObject.set(x, "onPaste", js.Any.fromFunction1((t0: ReactClipboardEventFrom[(HTMLInputElement | HTMLTextAreaElement | HTMLElement) & org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type InputRef = HTMLInputElement | HTMLTextAreaElement
  
  type _To = ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libSelectorInputMod.foo` */
  override def _to: ForwardRefExoticComponent[InputProps & RefAttributes[InputRef]] = default
}
