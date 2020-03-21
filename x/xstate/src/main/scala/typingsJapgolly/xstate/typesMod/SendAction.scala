package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.xstate.typesMod._Action because Already inherited */ trait SendAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var delay: js.UndefOr[Double | String | (DelayExpr[TContext, TEvent])] = js.undefined
  var event: TEvent | (SendExpr[TContext, TEvent])
  var id: String | Double
  var to: js.UndefOr[
    String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])])
  ] = js.undefined
}

object SendAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    event: TEvent | (SendExpr[TContext, TEvent]),
    id: String | Double,
    `type`: String,
    delay: Double | String | (DelayExpr[TContext, TEvent]) = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null,
    to: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])]) = null
  ): SendAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendAction[TContext, TEvent]]
  }
}

