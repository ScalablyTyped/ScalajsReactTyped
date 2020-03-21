package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogAction[TContext, TEvent /* <: EventObject */] extends ActionObject[TContext, TEvent] {
  var expr: String | (LogExpr[TContext, TEvent])
  var label: js.UndefOr[String] = js.undefined
}

object LogAction {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    expr: String | (LogExpr[TContext, TEvent]),
    `type`: String,
    exec: (TContext, TEvent, /* meta */ ActionMeta[TContext, TEvent]) => CallbackTo[js.Any | Unit] = null,
    label: String = null
  ): LogAction[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(expr = expr.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (exec != null) __obj.updateDynamic("exec")(js.Any.fromFunction3((t0: TContext, t1: TEvent, t2: /* meta */ typingsJapgolly.xstate.typesMod.ActionMeta[TContext, TEvent]) => exec(t0, t1, t2).runNow()))
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogAction[TContext, TEvent]]
  }
}

