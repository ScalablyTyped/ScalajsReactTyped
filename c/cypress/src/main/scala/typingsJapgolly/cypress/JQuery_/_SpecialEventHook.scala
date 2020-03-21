package typingsJapgolly.cypress.JQuery_

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cypress.AnonHandleObj
import typingsJapgolly.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _SpecialEventHook[TTarget, TData] extends js.Object

object _SpecialEventHook {
  @scala.inline
  def AnonDefault[TTarget, TData](_default: (TriggeredEvent[TTarget, TData, js.Any, js.Any], TData) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("_default")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.JQuery_.TriggeredEvent[TTarget, TData, js.Any, js.Any], t1: TData) => _default(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonPreDispatch[TTarget, TData](preDispatch: Event => CallbackTo[`false` | Unit]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("preDispatch")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Event) => preDispatch(t0).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonSetup[TTarget, TData](setup: (TData, String, EventHandler[TTarget, TData]) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setup")(js.Any.fromFunction3((t0: TData, t1: java.lang.String, t2: typingsJapgolly.cypress.JQuery_.EventHandler[TTarget, TData]) => setup(t0, t1, t2).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonPostDispatch[TTarget, TData](postDispatch: Event => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("postDispatch")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.Event) => postDispatch(t0).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonRemove[TTarget, TData](remove: HandleObject[TTarget, TData] => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("remove")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.HandleObject[TTarget, TData]) => remove(t0).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonAdd[TTarget, TData](add: HandleObject[TTarget, TData] => Callback): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("add")(js.Any.fromFunction1((t0: typingsJapgolly.cypress.JQuery_.HandleObject[TTarget, TData]) => add(t0).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonHandle[TTarget, TData](
    handle: ((TriggeredEvent[TTarget, TData, js.Any, js.Any]) with (AnonHandleObj[TTarget, TData]), /* repeated */ TData) => Callback
  ): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("handle")(js.Any.fromFunction2((t0: (typingsJapgolly.cypress.JQuery_.TriggeredEvent[TTarget, TData, js.Any, js.Any]) with (typingsJapgolly.cypress.AnonHandleObj[TTarget, TData]), t1: /* repeated */ TData) => handle(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonTrigger[TTarget, TData](trigger: (Event, TData) => CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("trigger")(js.Any.fromFunction2((t0: typingsJapgolly.cypress.JQuery_.Event, t1: TData) => trigger(t0, t1).runNow()))
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonBindType[TTarget, TData](bindType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(bindType = bindType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonNoBubble[TTarget, TData](noBubble: Boolean): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(noBubble = noBubble.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonDelegateType[TTarget, TData](delegateType: String): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal(delegateType = delegateType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
  @scala.inline
  def AnonTeardown[TTarget, TData](teardown: CallbackTo[Unit | `false`]): _SpecialEventHook[TTarget, TData] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teardown")(teardown.toJsFn)
    __obj.asInstanceOf[_SpecialEventHook[TTarget, TData]]
  }
}

