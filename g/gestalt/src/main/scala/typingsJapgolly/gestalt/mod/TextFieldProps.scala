package typingsJapgolly.gestalt.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.gestalt.anon.EventFocusEvent
import typingsJapgolly.gestalt.anon.EventKeyboardEvent
import typingsJapgolly.gestalt.anon.Value
import typingsJapgolly.gestalt.gestaltStrings.`current-password`
import typingsJapgolly.gestalt.gestaltStrings.`new-password`
import typingsJapgolly.gestalt.gestaltStrings.bday
import typingsJapgolly.gestalt.gestaltStrings.date
import typingsJapgolly.gestalt.gestaltStrings.done
import typingsJapgolly.gestalt.gestaltStrings.email
import typingsJapgolly.gestalt.gestaltStrings.enter
import typingsJapgolly.gestalt.gestaltStrings.go
import typingsJapgolly.gestalt.gestaltStrings.hidden
import typingsJapgolly.gestalt.gestaltStrings.lg
import typingsJapgolly.gestalt.gestaltStrings.md
import typingsJapgolly.gestalt.gestaltStrings.next
import typingsJapgolly.gestalt.gestaltStrings.off
import typingsJapgolly.gestalt.gestaltStrings.on
import typingsJapgolly.gestalt.gestaltStrings.password
import typingsJapgolly.gestalt.gestaltStrings.previous
import typingsJapgolly.gestalt.gestaltStrings.search
import typingsJapgolly.gestalt.gestaltStrings.send
import typingsJapgolly.gestalt.gestaltStrings.tel
import typingsJapgolly.gestalt.gestaltStrings.text
import typingsJapgolly.gestalt.gestaltStrings.url
import typingsJapgolly.gestalt.gestaltStrings.username
import typingsJapgolly.gestalt.gestaltStrings.visible
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextFieldProps extends StObject {
  
  var autoComplete: js.UndefOr[bday | `current-password` | email | `new-password` | on | off | username] = js.undefined
  
  /**
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    *  Optionally specify the action label to present for the enter key on virtual keyboards.
    */
  var enterKeyHint: js.UndefOr[enter | done | go | next | previous | search | send] = js.undefined
  
  var errorMessage: js.UndefOr[Node] = js.undefined
  
  /**
    * More information about how to complete the form field
    */
  var helperText: js.UndefOr[String] = js.undefined
  
  var id: String
  
  var label: js.UndefOr[String] = js.undefined
  
  var labelDisplay: js.UndefOr[visible | hidden] = js.undefined
  
  var name: js.UndefOr[String] = js.undefined
  
  var onBlur: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.undefined
  
  def onChange(args: Value): Unit
  
  var onFocus: js.UndefOr[js.Function1[/* args */ EventFocusEvent, Unit]] = js.undefined
  
  var onKeyDown: js.UndefOr[js.Function1[/* args */ EventKeyboardEvent, Unit]] = js.undefined
  
  var placeholder: js.UndefOr[String] = js.undefined
  
  /**
    * md: 40px, lg: 48px
    *
    * @default "md"
    */
  var size: js.UndefOr[md | lg] = js.undefined
  
  /**
    * List of tags to display in the component
    */
  var tags: js.UndefOr[js.Array[Element]] = js.undefined
  
  /**
    * @default "text"
    */
  var `type`: js.UndefOr[date | email | password | text | url | tel] = js.undefined
  
  var value: js.UndefOr[String] = js.undefined
}
object TextFieldProps {
  
  inline def apply(id: String, onChange: Value => Callback): TextFieldProps = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], onChange = js.Any.fromFunction1((t0: Value) => onChange(t0).runNow()))
    __obj.asInstanceOf[TextFieldProps]
  }
  
  extension [Self <: TextFieldProps](x: Self) {
    
    inline def setAutoComplete(value: bday | `current-password` | email | `new-password` | on | off | username): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setEnterKeyHint(value: enter | done | go | next | previous | search | send): Self = StObject.set(x, "enterKeyHint", value.asInstanceOf[js.Any])
    
    inline def setEnterKeyHintUndefined: Self = StObject.set(x, "enterKeyHint", js.undefined)
    
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
    
    inline def setOnBlur(value: /* args */ EventFocusEvent => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: /* args */ EventFocusEvent) => value(t0).runNow()))
    
    inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
    
    inline def setOnChange(value: Value => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: Value) => value(t0).runNow()))
    
    inline def setOnFocus(value: /* args */ EventFocusEvent => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: /* args */ EventFocusEvent) => value(t0).runNow()))
    
    inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    
    inline def setOnKeyDown(value: /* args */ EventKeyboardEvent => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: /* args */ EventKeyboardEvent) => value(t0).runNow()))
    
    inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    
    inline def setSize(value: md | lg): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setTags(value: js.Array[Element]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Element*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setType(value: date | email | password | text | url | tel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
