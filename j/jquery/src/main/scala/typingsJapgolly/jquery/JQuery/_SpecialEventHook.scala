package typingsJapgolly.jquery.JQuery

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.jquery.Anon_HandleObjHandleObject
import typingsJapgolly.jquery.jqueryNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpecialEventHook[TTarget, TData] extends js.Object

object _SpecialEventHook {
  @scala.inline
  def Anon_HandleObj[TTarget, TData](remove: (TTarget, HandleObject[TTarget, TData]) => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.HandleObject[TTarget, TData]) => remove(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEvent[TTarget, TData](trigger: (TTarget, Event, TData) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(js.Any.fromFunction3((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.Event, t2: TData) => trigger(t0, t1, t2).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Add[TTarget, TData](add: (TTarget, HandleObject[TTarget, TData]) => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.HandleObject[TTarget, TData]) => add(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataEventHandle[TTarget, TData](
    handle: (TTarget, (TriggeredEvent[TTarget, TData, js.Any, js.Any]) with (Anon_HandleObjHandleObject[TTarget, TData]), /* repeated */ TData) => Callback
  ): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction3((t0: TTarget, t1: (typingsJapgolly.jquery.JQuery.TriggeredEvent[TTarget, TData, js.Any, js.Any]) with (typingsJapgolly.jquery.Anon_HandleObjHandleObject[TTarget, TData]), t2: /* repeated */ TData) => handle(t0, t1, t2).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DelegateType[TTarget, TData](delegateType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_DataDefault[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, js.Any, js.Any], TData) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_default")(js.Any.fromFunction2((t0: typingsJapgolly.jquery.JQuery.TriggeredEvent[TTarget, TData, js.Any, js.Any], t1: TData) => _default(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_BindType[TTarget, TData](bindType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Data[TTarget, TData](setup: (TTarget, TData, String, EventHandler[TTarget, TData]) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(js.Any.fromFunction4((t0: TTarget, t1: TData, t2: java.lang.String, t3: typingsJapgolly.jquery.JQuery.EventHandler[TTarget, TData]) => setup(t0, t1, t2, t3).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_NoBubble[TTarget, TData](noBubble: Boolean): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_Event[TTarget, TData](preDispatch: (TTarget, Event) => CallbackTo[`false` | Unit]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.Event) => preDispatch(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_False[TTarget, TData](teardown: TTarget => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teardown")(js.Any.fromFunction1((t0: TTarget) => teardown(t0).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def Anon_EventPostDispatch[TTarget, TData](postDispatch: (TTarget, Event) => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postDispatch")(js.Any.fromFunction2((t0: TTarget, t1: typingsJapgolly.jquery.JQuery.Event) => postDispatch(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
}

