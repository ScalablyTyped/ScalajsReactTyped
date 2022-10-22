package typingsJapgolly.wixUiTestUtils

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.ReactEventFrom
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Event
import org.scalajs.dom.EventTarget
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.ChangeEvent
import typingsJapgolly.react.mod.FunctionComponent
import typingsJapgolly.wixUiTestUtils.anon.Instantiable
import typingsJapgolly.wixUiTestUtils.anon.TypeofSimulate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcReactHelpersHelpersMod {
  
  @JSImport("wix-ui-test-utils/dist/src/react-helpers/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isClassExists(element: HTMLElement, className: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isClassExists")(element.asInstanceOf[js.Any], className.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def makeControlled[T /* <: ControlledComponentProps */](Component: FunctionComponent[T]): Instantiable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeControlled")(Component.asInstanceOf[js.Any]).asInstanceOf[Instantiable[T]]
  
  inline def reactEventTrigger(): TypeofSimulate = ^.asInstanceOf[js.Dynamic].applyDynamic("reactEventTrigger")().asInstanceOf[TypeofSimulate]
  
  inline def sleep(ms: Double): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("sleep")(ms.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  trait ControlledChangeEvent[T]
    extends StObject
       with ChangeEvent[T] {
    
    @JSName("target")
    var target_ControlledChangeEvent: ControlledEventTarget & T
  }
  object ControlledChangeEvent {
    
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
      target: ControlledEventTarget & T,
      timeStamp: Double,
      `type`: String
    ): ControlledChangeEvent[T] = {
      val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], isDefaultPrevented = isDefaultPrevented.toJsFn, isPropagationStopped = isPropagationStopped.toJsFn, isTrusted = isTrusted.asInstanceOf[js.Any], nativeEvent = nativeEvent.asInstanceOf[js.Any], persist = persist.toJsFn, preventDefault = preventDefault.toJsFn, stopPropagation = stopPropagation.toJsFn, target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledChangeEvent[T]]
    }
    
    extension [Self <: ControlledChangeEvent[?], T](x: Self & ControlledChangeEvent[T]) {
      
      inline def setTarget(value: ControlledEventTarget & T): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait ControlledComponentProps
    extends StObject
       with /* otherProps */ StringDictionary[Any] {
    
    var onChange: js.UndefOr[js.Function1[/* e */ ReactEventFrom[HTMLElement], Unit]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
  }
  object ControlledComponentProps {
    
    inline def apply(): ControlledComponentProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ControlledComponentProps]
    }
    
    extension [Self <: ControlledComponentProps](x: Self) {
      
      inline def setOnChange(value: /* e */ ReactEventFrom[HTMLElement] => Callback): Self = StObject.set(x, "onChange", js.Any.fromFunction1((t0: /* e */ ReactEventFrom[HTMLElement]) => value(t0).runNow()))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait ControlledComponentState extends StObject {
    
    var value: String
  }
  object ControlledComponentState {
    
    inline def apply(value: String): ControlledComponentState = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ControlledComponentState]
    }
    
    extension [Self <: ControlledComponentState](x: Self) {
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ControlledEventTarget
    extends StObject
       with typingsJapgolly.std.EventTarget {
    
    var value: String = js.native
  }
}
