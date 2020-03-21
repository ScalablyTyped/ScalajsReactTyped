package typingsJapgolly.reduxActions.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReducerNextThrow[State, Payload] extends _ReducerMapValue[State, Payload] {
  var next: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
  var `throw`: js.UndefOr[js.Function2[/* state */ State, /* action */ Action[Payload], State]] = js.undefined
}

object ReducerNextThrow {
  @scala.inline
  def apply[State, Payload](
    next: (/* state */ State, /* action */ Action[Payload]) => CallbackTo[State] = null,
    `throw`: (/* state */ State, /* action */ Action[Payload]) => CallbackTo[State] = null
  ): ReducerNextThrow[State, Payload] = {
    val __obj = js.Dynamic.literal()
    if (next != null) __obj.updateDynamic("next")(js.Any.fromFunction2((t0: /* state */ State, t1: /* action */ typingsJapgolly.reduxActions.mod.Action[Payload]) => next(t0, t1).runNow()))
    if (`throw` != null) __obj.updateDynamic("throw")(js.Any.fromFunction2((t0: /* state */ State, t1: /* action */ typingsJapgolly.reduxActions.mod.Action[Payload]) => `throw`(t0, t1).runNow()))
    __obj.asInstanceOf[ReducerNextThrow[State, Payload]]
  }
}

