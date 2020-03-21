package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.typesMod.ActionTypes.Pure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PureAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  @JSName("type")
  var type_PureAction: Pure
  def get(context: TContext, event: TEvent): js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
}

object PureAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    get: (TContext, TEvent) => CallbackTo[js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]],
    `type`: Pure,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): PureAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: TContext, t1: TEvent) => get(t0, t1).runNow()))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[PureAction[TContext, TEvent]]
  }
}

