package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.facade.React.RefHandle
import org.scalajs.dom.Document
import org.scalajs.dom.Element
import org.scalajs.dom.Event
import org.scalajs.dom.HTMLElement
import org.scalajs.dom.MouseEvent
import org.scalajs.dom.Window
import typingsJapgolly.react.mod.Ref
import typingsJapgolly.react.mod.SetStateAction
import typingsJapgolly.uifabricReactHooks.libUseBooleanMod.IUseBooleanCallbacks
import typingsJapgolly.uifabricReactHooks.libUseControllableValueMod.ChangeCallback
import typingsJapgolly.uifabricReactHooks.libUseMergedRefsMod.RefObjectFunction
import typingsJapgolly.uifabricReactHooks.libUseRefEffectMod.RefCallback
import typingsJapgolly.uifabricReactHooks.libUseSetIntervalMod.UseSetIntervalReturnType
import typingsJapgolly.uifabricReactHooks.libUseSetTimeoutMod.UseSetTimeoutReturnType
import typingsJapgolly.uifabricReactHooks.libUseTargetMod.Target
import typingsJapgolly.uifabricReactHooks.libUseWarningsMod.IWarningOptions
import typingsJapgolly.uifabricUtilities.libPointMod.Point
import typingsJapgolly.uifabricUtilities.mod.Async
import typingsJapgolly.uifabricUtilities.mod.Rectangle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@uifabric/react-hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useAsync(): Async = ^.asInstanceOf[js.Dynamic].applyDynamic("useAsync")().asInstanceOf[Async]
  
  inline def useBoolean(initialState: Boolean): js.Tuple2[Boolean, IUseBooleanCallbacks] = ^.asInstanceOf[js.Dynamic].applyDynamic("useBoolean")(initialState.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, IUseBooleanCallbacks]]
  
  inline def useConst[T](initialValue: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def useConst[T](initialValue: js.Function0[T]): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConst")(initialValue.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useConstCallback[T /* <: js.Function1[/* repeated */ Any, Any] */](callback: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("useConstCallback")(callback.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function1[/* update */ SetStateAction[js.UndefOr[TValue]], Unit]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](
    controlledValue: TValue,
    defaultUncontrolledValue: Unit,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](
    controlledValue: Unit,
    defaultUncontrolledValue: TValue,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](
    controlledValue: Unit,
    defaultUncontrolledValue: Unit,
    onChange: ChangeCallback[TElement, TValue, TEvent]
  ): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")().asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](controlledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](controlledValue: TValue, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  inline def useControllableValue_TValueTElementTEvent[TValue, TElement /* <: HTMLElement */, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */](controlledValue: Unit, defaultUncontrolledValue: TValue): js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("useControllableValue")(controlledValue.asInstanceOf[js.Any], defaultUncontrolledValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[
    js.UndefOr[TValue], 
    js.Function2[
      /* update */ SetStateAction[js.UndefOr[TValue]], 
      /* ev */ js.UndefOr[ReactEventFrom[TElement & Element]], 
      Unit
    ]
  ]]
  
  inline def useEventCallback[Args /* <: js.Array[Any] */, Return](fn: js.Function1[/* args */ Args, Return]): js.Function1[/* args */ Args, Return] = ^.asInstanceOf[js.Dynamic].applyDynamic("useEventCallback")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ Args, Return]]
  
  inline def useForceUpdate(): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("useForceUpdate")().asInstanceOf[js.Function0[Unit]]
  
  inline def useId(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")().asInstanceOf[String]
  inline def useId(prefix: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def useId(prefix: String, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def useId(prefix: Unit, providedId: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("useId")(prefix.asInstanceOf[js.Any], providedId.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def useMergedRefs[T](refs: js.UndefOr[Ref[T]]*): RefObjectFunction[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useMergedRefs")(refs.asInstanceOf[Seq[js.Any]]*).asInstanceOf[RefObjectFunction[T]]
  
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: TElement, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: TElement,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefHandle[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: RefHandle[js.UndefOr[TElement | Null]],
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Document, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Document,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Window, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Window,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Null, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Null,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](element: Unit, eventName: String, callback: js.Function1[/* ev */ TEvent, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def useOnEvent[TElement /* <: Element */, TEvent /* <: Event */](
    element: Unit,
    eventName: String,
    callback: js.Function1[/* ev */ TEvent, Unit],
    useCapture: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("useOnEvent")(element.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], useCapture.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def usePrevious[T](value: T): js.UndefOr[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("usePrevious")(value.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[T]]
  
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit]): RefCallback[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any]).asInstanceOf[RefCallback[T]]
  inline def useRefEffect[T](callback: js.Function1[/* value */ T, js.Function0[Unit] | Unit], initial: T): RefCallback[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("useRefEffect")(callback.asInstanceOf[js.Any], initial.asInstanceOf[js.Any])).asInstanceOf[RefCallback[T]]
  
  inline def useSetInterval(): UseSetIntervalReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetInterval")().asInstanceOf[UseSetIntervalReturnType]
  
  inline def useSetTimeout(): UseSetTimeoutReturnType = ^.asInstanceOf[js.Dynamic].applyDynamic("useSetTimeout")().asInstanceOf[UseSetTimeoutReturnType]
  
  inline def useTarget[TElement /* <: HTMLElement */](): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")().asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Unit, hostElement: RefHandle[TElement | Null]): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = ^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  inline def useTarget[TElement /* <: HTMLElement */](target: Target, hostElement: RefHandle[TElement | Null]): js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]] = (^.asInstanceOf[js.Dynamic].applyDynamic("useTarget")(target.asInstanceOf[js.Any], hostElement.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[RefHandle[Element | MouseEvent | Point | Rectangle | Null], js.UndefOr[Window]]]
  
  inline def useWarnings[P](options: IWarningOptions[P]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("useWarnings")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
