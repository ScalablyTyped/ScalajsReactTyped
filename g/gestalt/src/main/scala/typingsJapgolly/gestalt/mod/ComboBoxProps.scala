package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import typingsJapgolly.gestalt.anon.EventFocusEvent
import typingsJapgolly.gestalt.anon.EventKeyboardEvent
import typingsJapgolly.gestalt.anon.EventValue
import typingsJapgolly.gestalt.anon.Item
import typingsJapgolly.gestalt.anon.Value
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComboBoxProps extends StObject {
  
  var accessibilityClearButtonLabel: String
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[String] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var inputValue: js.UndefOr[String] = js.undefined
  
  var label: String
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var noResultText: String
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventValue, Unit]] = js.undefined
  
  var onChange: js.UndefOr[js.Function1[/* args */ Value, Unit]] = js.undefined
  
  var onClear: js.UndefOr[js.Function0[Unit]] = js.undefined
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEvent, Unit]] = js.undefined
  
  var onSelect: js.UndefOr[js.Function1[/* args */ Item, Unit]] = js.undefined
  
  var options: js.Array[ComboBoxItemType]
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var selectedOption: js.UndefOr[ComboBoxItemType] = js.undefined
  
  var size: js.UndefOr[md | lg] = js.undefined
  
  var tags: js.UndefOr[js.Array[Element]] = js.undefined
  
  var zIndex: js.UndefOr[Indexable] = js.undefined
}
object ComboBoxProps {
  
  inline def apply(
    accessibilityClearButtonLabel: String,
    id: String,
    label: String,
    noResultText: String,
    options: js.Array[ComboBoxItemType]
  ): ComboBoxProps = {
    val __obj = js.Dynamic.literal(accessibilityClearButtonLabel = accessibilityClearButtonLabel.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noResultText = noResultText.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComboBoxProps]
  }
  
  extension [Self <: ComboBoxProps](x: Self) {
    
    inline def setAccessibilityClearButtonLabel(value: String): Self = StObject.set(x, "accessibilityClearButtonLabel", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    
    inline def setInputValueUndefined: Self = StObject.set(x, "inputValue", js.undefined)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setNoResultText(value: String): Self = StObject.set(x, "noResultText", value.asInstanceOf[js.Any])
    
    inline def setOnBlur(value: /* args */ EventValue => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* args */ EventValue) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: /* args */ Value => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* args */ Value) => value(t0).runNow()))
    
    inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
    
    inline def setOnClear(value: Callback): Self = StObject.set(x, "onClear", value.toJsFn)
    
    inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
    
    inline def setOnFocus(value: /* args */ EventFocusEvent => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* args */ EventFocusEvent) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* args */ EventKeyboardEvent) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setOnSelect(value: /* args */ Item => Callback): Self = StObject.set(x, "onSelect", js.Any.fromFunction1((t0: /* args */ Item) => value(t0).runNow()))
    
    inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
    
    inline def setOptions(value: js.Array[ComboBoxItemType]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsVarargs(value: ComboBoxItemType*): Self = StObject.set(x, "options", js.Array(value*))
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSelectedOption(value: ComboBoxItemType): Self = StObject.set(x, "selectedOption", value.asInstanceOf[js.Any])
    
    inline def setSelectedOptionUndefined: Self = StObject.set(x, "selectedOption", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTags(value: js.Array[Element]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Element*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setZIndex(value: Indexable): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
