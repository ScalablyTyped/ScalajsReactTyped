package typingsJapgolly.wixStyleReact

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import typingsJapgolly.react.mod.PureComponent
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typingsJapgolly.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typingsJapgolly.wixStyleReact.distTypesInputMod.InputStatus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAutoCompleteWithLabelMod {
  
  @JSImport("wix-style-react/dist/types/AutoCompleteWithLabel", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AutoCompleteWithLabelProps, js.Object, Any]
  
  type AutoCompleteWithLabel = PureComponent[AutoCompleteWithLabelProps, js.Object, Any]
  
  trait AutoCompleteWithLabelProps extends StObject {
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var maxHeightPixels: js.UndefOr[String | Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var options: js.Array[DropdownLayoutOption]
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[Node] = js.undefined
    
    var suffix: js.UndefOr[js.Array[Node]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
  }
  object AutoCompleteWithLabelProps {
    
    inline def apply(label: String, options: js.Array[DropdownLayoutOption]): AutoCompleteWithLabelProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoCompleteWithLabelProps]
    }
    
    extension [Self <: AutoCompleteWithLabelProps](x: Self) {
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightPixels(value: String | Double): Self = StObject.set(x, "maxHeightPixels", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightPixelsUndefined: Self = StObject.set(x, "maxHeightPixels", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setOnBlur(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[HTMLInputElement & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[HTMLInputElement & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnSelect(value: /* option */ DropdownLayoutValueOption => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* option */ DropdownLayoutValueOption) => value(t0).runNow()))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: VdomNode): Self = StObject.set(x, "statusMessage", value.rawNode.asInstanceOf[js.Any])
      
      inline def setStatusMessageNull: Self = StObject.set(x, "statusMessage", null)
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusMessageVarargs(value: (Empty | String | JsNumber | japgolly.scalajs.react.facade.React.Element)*): Self = StObject.set(x, "statusMessage", js.Array(value*))
      
      inline def setStatusMessageVdomElement(value: VdomElement): Self = StObject.set(x, "statusMessage", value.rawElement.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setSuffix(value: js.Array[Node]): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setSuffixVarargs(value: Node*): Self = StObject.set(x, "suffix", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
