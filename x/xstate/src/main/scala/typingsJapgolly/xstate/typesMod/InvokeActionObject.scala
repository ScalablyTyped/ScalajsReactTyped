package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.typesMod.ActionTypes.Start
import typingsJapgolly.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvokeActionObject[TContext, TEvent /* <: EventObject */] extends ActivityActionObject[TContext, TEvent] {
  @JSName("activity")
  var activity_InvokeActionObject: InvokeDefinition[TContext, TEvent]
}

object InvokeActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    activity: InvokeDefinition[TContext, TEvent],
    `type`: Start | Stop,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): InvokeActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[InvokeActionObject[TContext, TEvent]]
  }
}

