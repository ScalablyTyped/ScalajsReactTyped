package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityDefinition[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var id: String
}

object ActivityDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    id: String,
    `type`: String,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): ActivityDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ActivityDefinition[TContext, TEvent]]
  }
}

