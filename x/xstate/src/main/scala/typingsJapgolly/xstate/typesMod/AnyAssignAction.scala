package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.typesMod.ActionTypes.Assign
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnyAssignAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var assignment: js.Any
  @JSName("type")
  var type_AnyAssignAction: Assign
}

object AnyAssignAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    assignment: js.Any,
    `type`: Assign,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): AnyAssignAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(assignment = assignment.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[AnyAssignAction[TContext, TEvent]]
  }
}

