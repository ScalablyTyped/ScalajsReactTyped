package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.typesMod.ActionTypes.Start
import typingsJapgolly.xstate.typesMod.ActionTypes.Stop
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityActionObject[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var activity: ActivityDefinition[TContext, TEvent]
  @JSName("exec")
  var exec_ActivityActionObject: js.UndefOr[ActionFunction[TContext, TEvent]] = js.undefined
  @JSName("type")
  var type_ActivityActionObject: Start | Stop
}

object ActivityActionObject {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    activity: ActivityDefinition[TContext, TEvent],
    `type`: Start | Stop,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): ActivityActionObject[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(activity = activity.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[ActivityActionObject[TContext, TEvent]]
  }
}

