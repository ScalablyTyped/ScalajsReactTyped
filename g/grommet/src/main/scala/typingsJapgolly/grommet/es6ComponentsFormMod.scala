package typingsJapgolly.grommet

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.Element
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLFormElement
import typingsJapgolly.grommet.anon.Errors
import typingsJapgolly.grommet.anon.Invalid
import typingsJapgolly.grommet.anon.Touched
import typingsJapgolly.grommet.grommetStrings.blur
import typingsJapgolly.grommet.grommetStrings.change
import typingsJapgolly.grommet.grommetStrings.onChange
import typingsJapgolly.grommet.grommetStrings.onSubmit
import typingsJapgolly.grommet.grommetStrings.submit
import typingsJapgolly.react.mod.BaseSyntheticEvent
import typingsJapgolly.react.mod.DetailedHTMLProps
import typingsJapgolly.react.mod.FormHTMLAttributes
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object es6ComponentsFormMod {
  
  @JSImport("grommet/es6/components/Form", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Form[T](p: TypedFormProps[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Form")(p.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FormExtendedEvent[R, T]
    extends StObject
       with BaseSyntheticEvent[Event, EventTarget & T, EventTarget] {
    
    var touched: Record[String, Boolean]
    
    var value: R
  }
  object FormExtendedEvent {
    
    inline def apply[R, T](
      bubbles: Boolean,
      cancelable: Boolean,
      currentTarget: EventTarget & T,
      defaultPrevented: Boolean,
      eventPhase: Double,
      isDefaultPrevented: CallbackTo[Boolean],
      isPropagationStopped: CallbackTo[Boolean],
      isTrusted: Boolean,
      nativeEvent: Event,
      persist: Callback,
      preventDefault: Callback,
      stopPropagation: Callback,
      target: EventTarget,
      timeStamp: Double,
      touched: Record[String, Boolean],
      `type`: String,
      value: R
    ): FormExtendedEvent[R, T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], touched = touched.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[FormExtendedEvent[R, T]]
    }
    
    extension [Self <: FormExtendedEvent[?, ?], R, T](x: Self & (FormExtendedEvent[R, T])) {
      
      inline def setTouched(value: Record[String, Boolean]): Self = StObject.set(x, "touched", value.asInstanceOf[js.Any])
      
      inline def setValue(value: R): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait FormProps[T] extends StObject {
    
    var errors: js.UndefOr[js.Object] = js.undefined
    
    var infos: js.UndefOr[js.Object] = js.undefined
    
    var messages: js.UndefOr[Invalid] = js.undefined
    
    var onChange: js.UndefOr[js.Function2[/* value */ T, /* options */ Touched, Unit]] = js.undefined
    
    var onReset: js.UndefOr[js.Function1[/* event */ ReactEventFrom[org.scalajs.dom.Element], Any]] = js.undefined
    
    var onSubmit: js.UndefOr[js.Function1[/* event */ FormExtendedEvent[T, org.scalajs.dom.Element], Unit]] = js.undefined
    
    var onValidate: js.UndefOr[js.Function1[/* validationResults */ Errors, Unit]] = js.undefined
    
    var validate: js.UndefOr[blur | submit | change] = js.undefined
    
    var value: js.UndefOr[T] = js.undefined
  }
  object FormProps {
    
    inline def apply[T](): FormProps[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormProps[T]]
    }
    
    extension [Self <: FormProps[?], T](x: Self & FormProps[T]) {
      
      inline def setErrors(value: js.Object): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
      
      inline def setInfos(value: js.Object): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
      
      inline def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
      
      inline def setMessages(value: Invalid): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setOnChange(value: (/* value */ T, /* options */ Touched) => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction2((t0: /* value */ T, t1: /* options */ Touched) => (value(t0, t1)).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnReset(value: /* event */ ReactEventFrom[org.scalajs.dom.Element] => Any): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      inline def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      inline def setOnSubmit(value: /* event */ FormExtendedEvent[T, org.scalajs.dom.Element] => Callback): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1((t0: /* event */ FormExtendedEvent[T, org.scalajs.dom.Element]) => value(t0).runNow()))
      
      inline def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      inline def setOnValidate(value: /* validationResults */ Errors => Callback): Self = StObject.set(x, "onValidate", js.Any.fromFunction1((t0: /* validationResults */ Errors) => value(t0).runNow()))
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setValidate(value: blur | submit | change): Self = StObject.set(x, "validate", value.asInstanceOf[js.Any])
      
      inline def setValidateUndefined: Self = StObject.set(x, "validate", js.undefined)
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  type TypedFormProps[T] = FormProps[T] & (Omit[
    DetailedHTMLProps[FormHTMLAttributes[HTMLFormElement], HTMLFormElement], 
    onChange | onSubmit
  ])
}
