package typingsJapgolly.cleaveJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLInputElement
import typingsJapgolly.cleaveJs.anon.Omitdestroy
import typingsJapgolly.cleaveJs.optionsMod.CleaveOptions
import typingsJapgolly.react.mod.EventHandler
import typingsJapgolly.react.mod.InputHTMLAttributes
import typingsJapgolly.react.mod.ReactInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reactPropsMod {
  
  trait ChangeEvent[T]
    extends StObject
       with typingsJapgolly.react.mod.ChangeEvent[T]
  object ChangeEvent {
    
    inline def apply[T](
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
      target: EventTarget & T,
      timeStamp: Double,
      `type`: String
    ): ChangeEvent[T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChangeEvent[T]]
    }
  }
  
  type ChangeEventHandler[T] = EventHandler[ChangeEvent[T]]
  
  type InitHandler = js.Function1[/* owner */ ReactInstanceWithCleave, Unit]
  
  trait Props
    extends StObject
       with InputHTMLAttributes[HTMLInputElement] {
    
    var htmlRef: js.UndefOr[js.Function1[/* i */ Any, Unit]] = js.undefined
    
    @JSName("onChange")
    var onChange_Props: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onInit: js.UndefOr[InitHandler] = js.undefined
    
    var options: CleaveOptions
  }
  object Props {
    
    inline def apply(options: CleaveOptions): Props = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    extension [Self <: Props](x: Self) {
      
      inline def setHtmlRef(value: /* i */ Any => Callback): Self = StObject.set(x, "htmlRef", js.Any.fromFunction1((t0: /* i */ Any) => value(t0).runNow()))
      
      inline def setHtmlRefUndefined: Self = StObject.set(x, "htmlRef", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: ChangeEvent[HTMLInputElement]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnInit(value: /* owner */ ReactInstanceWithCleave => Callback): Self = StObject.set(x, "onInit", js.Any.fromFunction1((t0: /* owner */ ReactInstanceWithCleave) => value(t0).runNow()))
      
      inline def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      inline def setOptions(value: CleaveOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    }
  }
  
  type ReactInstanceWithCleave = ReactInstance & Omitdestroy
}
