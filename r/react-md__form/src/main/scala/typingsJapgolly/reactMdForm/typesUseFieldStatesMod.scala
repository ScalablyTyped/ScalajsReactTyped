package typingsJapgolly.reactMdForm

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactFocusEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLInputElement
import org.scalajs.dom.HTMLSelectElement
import org.scalajs.dom.HTMLTextAreaElement
import typingsJapgolly.react.mod.ChangeEventHandler
import typingsJapgolly.react.mod.FocusEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesUseFieldStatesMod {
  
  @JSImport("@react-md/form/types/useFieldStates", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useFieldStates[E /* <: FormElement */](hasOnBlurOnFocusOnChangeValueDefaultValue: FieldStatesOptions[E]): ReturnValue[E] = ^.asInstanceOf[js.Dynamic].applyDynamic("useFieldStates")(hasOnBlurOnFocusOnChangeValueDefaultValue.asInstanceOf[js.Any]).asInstanceOf[ReturnValue[E]]
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  trait EventHandlers[E /* <: FormElement */] extends StObject {
    
    var onBlur: js.UndefOr[FocusEventHandler[E]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[E]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[E]] = js.undefined
  }
  object EventHandlers {
    
    inline def apply[E /* <: FormElement */](): EventHandlers[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EventHandlers[E]]
    }
    
    extension [Self <: EventHandlers[?], E /* <: FormElement */](x: Self & EventHandlers[E]) {
      
      inline def setOnBlur(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ReactEventFrom[E & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  trait FieldStatesOptions[E /* <: FormElement */]
    extends StObject
       with EventHandlers[E] {
    
    var defaultValue: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var value: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object FieldStatesOptions {
    
    inline def apply[E /* <: FormElement */](): FieldStatesOptions[E] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FieldStatesOptions[E]]
    }
    
    extension [Self <: FieldStatesOptions[?], E /* <: FormElement */](x: Self & FieldStatesOptions[E]) {
      
      inline def setDefaultValue(value: String | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value*))
      
      inline def setValue(value: String | js.Array[String]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value*))
    }
  }
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  type FormElement = HTMLInputElement | HTMLTextAreaElement | HTMLSelectElement
  
  /**
    * @internal
    * @remarks \@since 2.5.2
    */
  /* Inlined parent std.Required<@react-md/form.@react-md/form/types/useFieldStates.EventHandlers<E>> */
  trait ReturnValue[E /* <: FormElement */] extends StObject {
    
    /**
      * Boolean if the TextField or TextArea currently has focus.
      */
    var focused: Boolean
    
    var onBlur: FocusEventHandler[E]
    
    var onChange: ChangeEventHandler[E]
    
    var onFocus: FocusEventHandler[E]
    
    /**
      * Boolean if the TextField or TextArea current has a value with a `length > 0`
      * so that any labels will correctly float above the text field. This will
      * also make sure that number inputs will still be considered valued when
      * there is a `badInput` validity error.
      */
    var valued: Boolean
  }
  object ReturnValue {
    
    inline def apply[E /* <: FormElement */](
      focused: Boolean,
      onBlur: ReactFocusEventFrom[E & Element] => Callback,
      onChange: ReactEventFrom[E & Element] => Callback,
      onFocus: ReactFocusEventFrom[E & Element] => Callback,
      valued: Boolean
    ): ReturnValue[E] = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], onBlur = js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => onBlur(t0).runNow()), onChange = js.Any.fromFunction1((t0: ReactEventFrom[E & Element]) => onChange(t0).runNow()), onFocus = js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => onFocus(t0).runNow()), valued = valued.asInstanceOf[js.Any])
      __obj.asInstanceOf[ReturnValue[E]]
    }
    
    extension [Self <: ReturnValue[?], E /* <: FormElement */](x: Self & ReturnValue[E]) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setOnBlur(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onBlur", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnChange(value: ReactEventFrom[E & Element] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ReactEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setOnFocus(value: ReactFocusEventFrom[E & Element] => Callback): Self = StObject.set(x, "onFocus", js.Any.fromFunction1((t0: ReactFocusEventFrom[E & Element]) => value(t0).runNow()))
      
      inline def setValued(value: Boolean): Self = StObject.set(x, "valued", value.asInstanceOf[js.Any])
    }
  }
}
