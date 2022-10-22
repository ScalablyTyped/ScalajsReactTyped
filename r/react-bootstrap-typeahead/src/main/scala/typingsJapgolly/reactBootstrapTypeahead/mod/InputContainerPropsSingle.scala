package typingsJapgolly.reactBootstrapTypeahead.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.react.mod.LegacyRef
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.both
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.combobox
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.list
import typingsJapgolly.reactBootstrapTypeahead.reactBootstrapTypeaheadStrings.listbox
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputContainerPropsSingle[T /* <: TypeaheadModel */]
  extends StObject
     with InputProps {
  
  @JSName("aria-activedescendant")
  var `aria-activedescendant_InputContainerPropsSingle`: String
  
  @JSName("aria-autocomplete")
  var `aria-autocomplete_InputContainerPropsSingle`: list | both
  
  @JSName("aria-expanded")
  var `aria-expanded_InputContainerPropsSingle`: Boolean
  
  @JSName("aria-haspopup")
  var `aria-haspopup_InputContainerPropsSingle`: listbox
  
  @JSName("aria-owns")
  var `aria-owns_InputContainerPropsSingle`: String
  
  @JSName("autoComplete")
  var autoComplete_InputContainerPropsSingle: String
  
  @JSName("disabled")
  var disabled_InputContainerPropsSingle: Boolean
  
  var inputClassName: String
  
  var inputRef: LegacyRef[HTMLInputElement]
  
  def onBlur(e: ReactEventFrom[Element]): Unit
  
  def onChange(selected: js.Array[T]): Unit
  
  @JSName("onClick")
  def onClick_MInputContainerPropsSingle(e: ReactEventFrom[HTMLInputElement]): Unit
  
  def onFocus(e: ReactEventFrom[Element]): Unit
  
  def onKeyDown(e: ReactEventFrom[Element]): Unit
  
  @JSName("role")
  var role_InputContainerPropsSingle: combobox
  
  @JSName("value")
  var value_InputContainerPropsSingle: String
}
object InputContainerPropsSingle {
  
  inline def apply[T /* <: TypeaheadModel */](
    `aria-activedescendant`: String,
    `aria-autocomplete`: list | both,
    `aria-expanded`: Boolean,
    `aria-owns`: String,
    autoComplete: String,
    disabled: Boolean,
    inputClassName: String,
    onBlur: ReactEventFrom[Element] => Callback,
    onChange: js.Array[T] => Callback,
    onClick: ReactEventFrom[HTMLInputElement] => Callback,
    onFocus: ReactEventFrom[Element] => Callback,
    onKeyDown: ReactEventFrom[Element] => Callback,
    value: String
  ): InputContainerPropsSingle[T] = {
    val __obj = js.Dynamic.literal(autoComplete = autoComplete.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], inputClassName = inputClassName.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => onBlur(t0).runNow()), onChange = js.Any.fromFunction1((t0: js.Array[T]) => onChange(t0).runNow()), onClick = js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => onClick(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => onFocus(t0).runNow()), onKeyDown = js.Any.fromFunction1((t0: ReactEventFrom[Element]) => onKeyDown(t0).runNow()), role = "combobox", value = value.asInstanceOf[js.Any], inputRef = null)
    __obj.updateDynamic("aria-activedescendant")(`aria-activedescendant`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-autocomplete")(`aria-autocomplete`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-expanded")(`aria-expanded`.asInstanceOf[js.Any])
    __obj.updateDynamic("aria-haspopup")("listbox")
    __obj.updateDynamic("aria-owns")(`aria-owns`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputContainerPropsSingle[T]]
  }
  
  extension [Self <: InputContainerPropsSingle[?], T /* <: TypeaheadModel */](x: Self & InputContainerPropsSingle[T]) {
    
    inline def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
    
    inline def `setAria-autocomplete`(value: list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
    
    inline def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
    
    inline def `setAria-haspopup`(value: listbox): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
    
    inline def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
    
    inline def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setInputClassName(value: String): Self = StObject.set(x, "inputClassName", value.asInstanceOf[js.Any])
    
    inline def setInputRef(value: LegacyRef[HTMLInputElement]): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setInputRefFunction1(value: HTMLInputElement | Null => Callback): Self = StObject.set(x, "inputRef", js.Any.fromFunction1((t0: HTMLInputElement | Null) => value(t0).runNow()))
    
    inline def setInputRefNull: Self = StObject.set(x, "inputRef", null)
    
    inline def setOnBlur(value: ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnChange(value: js.Array[T] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: js.Array[T]) => value(t0).runNow()))
    
    inline def setOnClick(value: ReactEventFrom[HTMLInputElement] => Callback): Self = StObject.set(x, "onClick", js.Any.fromFunction1((t0: ReactEventFrom[HTMLInputElement]) => value(t0).runNow()))
    
    inline def setOnFocus(value: ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setOnKeyDown(value: ReactEventFrom[Element] => Callback): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1((t0: ReactEventFrom[Element]) => value(t0).runNow()))
    
    inline def setRole(value: combobox): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
