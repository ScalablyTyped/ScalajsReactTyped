package typingsJapgolly.reduxActions.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _ReducerMapValue[State, Payload] extends js.Object

object _ReducerMapValue {
  @scala.inline
  def ReducerNextThrow[State, Payload](
    next: (State, /* action */ Action[Payload]) => CallbackTo[State] = null,
    `throw`: (State, /* action */ Action[Payload]) => CallbackTo[State] = null
  ): _ReducerMapValue[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: State, t1: /* action */ typingsJapgolly.reduxActions.mod.Action[Payload]) => next(t0, t1).runNow()))
    if (`throw` != null) __obj.updateDynamic("throw")(js.Any.fromFunction2((t0: State, t1: /* action */ typingsJapgolly.reduxActions.mod.Action[Payload]) => `throw`(t0, t1).runNow()))
    __obj.asInstanceOf[_ReducerMapValue[State, Payload]]
  }
  @scala.inline
  def ReducerMap[State, Payload](StringDictionary: /* actionType */ StringDictionary[ReducerMapValue[State, Payload]] = null): _ReducerMapValue[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[_ReducerMapValue[State, Payload]]
  }
}

