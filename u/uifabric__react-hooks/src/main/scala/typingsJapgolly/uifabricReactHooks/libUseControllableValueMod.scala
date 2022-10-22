package typingsJapgolly.uifabricReactHooks

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.Element
import org.scalajs.dom.HTMLElement
import typingsJapgolly.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libUseControllableValueMod {
  
  @JSImport("@uifabric/react-hooks/lib/useControllableValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
  
  type ChangeCallback[TElement /* <: HTMLElement */, TValue, TEvent /* <: js.UndefOr[ReactEventFrom[TElement & Element]] */] = js.Function2[/* ev */ TEvent, /* newValue */ js.UndefOr[TValue], Unit]
}
