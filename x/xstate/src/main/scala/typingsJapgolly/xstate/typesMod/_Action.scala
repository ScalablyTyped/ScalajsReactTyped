package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.xstate.actorMod.Actor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _Action[TContext, TEvent /* <: EventObject */] extends js.Object

object _Action {
  @scala.inline
  def ActionObject[TContext, TEvent /* <: EventObject */](
    `type`: String,
    StringDictionary: /* other */ StringDictionary[js.Any] = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null
  ): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
  @scala.inline
  def SendAction[TContext, TEvent /* <: EventObject */](
    event: TEvent | (SendExpr[TContext, TEvent]),
    id: String | Double,
    `type`: String,
    delay: Double | String | (DelayExpr[TContext, TEvent]) = null,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null,
    to: String | Double | (Actor[_, AnyEventObject]) | (ExprWithMeta[TContext, TEvent, String | Double | (Actor[_, AnyEventObject])]) = null
  ): _Action[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    __obj.asInstanceOf[_Action[TContext, TEvent]]
  }
}

