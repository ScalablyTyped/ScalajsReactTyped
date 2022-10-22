package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.anon.EventFocusEventValueString
import typingsJapgolly.gestalt.anon.EventKeyboardEventValueString
import typingsJapgolly.gestalt.anon.EventSyntheticEventValueString
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaProps extends StObject {
  
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  var errorMessage: js.UndefOr[Node] = js.undefined
  
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventFocusEventValueString, Unit]] = js.undefined
  
  def onChange(args: EventSyntheticEventValueString): Unit
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEventValueString, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEventValueString, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  var readonly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Number of text rows to display.
    * Note that tags take up more space, and will show fewer rows than specified.
    */
  var rows: js.UndefOr[Double] = js.undefined
  
  /**
    * List of tags to display in the component
    */
  var tags: js.UndefOr[js.Array[Element]] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TextAreaProps {
  
  inline def apply(id: String, onChange: EventSyntheticEventValueString => Callback): TextAreaProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: EventSyntheticEventValueString) => onChange(t0).runNow()))
    __obj.asInstanceOf[TextAreaProps]
  }
  
  extension [Self <: TextAreaProps](x: Self) {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setErrorMessage(value: VdomNode): Self = StObject.set(x, "errorMessage", value.rawNode.asInstanceOf[js.Any])
    
    inline def setErrorMessageNull: Self = StObject.set(x, "errorMessage", null)
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setErrorMessageVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "errorMessage", js.Array(value*))
    
    inline def setErrorMessageVdomElement(value: VdomElement): Self = StObject.set(x, "errorMessage", value.rawElement.asInstanceOf[js.Any])
    
    inline def setHelperText(value: String): Self = StObject.set(x, "helperText", value.asInstanceOf[js.Any])
    
    inline def setHelperTextUndefined: Self = StObject.set(x, "helperText", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplay(value: visible | hidden): Self = StObject.set(x, "labelDisplay", value.asInstanceOf[js.Any])
    
    inline def setLabelDisplayUndefined: Self = StObject.set(x, "labelDisplay", js.undefined)
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setOnBlur(value: /* args */ EventFocusEventValueString => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* args */ EventFocusEventValueString) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: EventSyntheticEventValueString => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: EventSyntheticEventValueString) => value(t0).runNow()))
    
    inline def setOnFocus(value: /* args */ EventFocusEventValueString => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* args */ EventFocusEventValueString) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEventValueString => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* args */ EventKeyboardEventValueString) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
    
    inline def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
    
    inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setTags(value: js.Array[Element]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Element*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
