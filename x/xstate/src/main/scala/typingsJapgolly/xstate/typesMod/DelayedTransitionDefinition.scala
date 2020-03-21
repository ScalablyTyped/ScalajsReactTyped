package typingsJapgolly.xstate.typesMod

import typingsJapgolly.std.Record
import typingsJapgolly.xstate.stateNodeMod.StateNode
import typingsJapgolly.xstate.xstateStrings.Asterisk
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DelayedTransitionDefinition[TContext, TEvent /* <: EventObject */] extends TransitionDefinition[TContext, TEvent] {
  var delay: Double | String | (DelayExpr[TContext, TEvent])
}

object DelayedTransitionDefinition {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    actions: js.Array[ActionObject[TContext, TEvent]],
    delay: Double | String | (DelayExpr[TContext, TEvent]),
    eventType: (/* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any) | typingsJapgolly.xstate.typesMod.ActionTypes.NullEvent | Asterisk,
    source: StateNode[TContext, _, TEvent, _],
    cond: Guard[TContext, TEvent] = null,
    in: StateValue = null,
    internal: js.UndefOr[Boolean] = js.undefined,
    meta: Record[String, _] = null,
    target: js.Array[StateNode[TContext, _, TEvent, _]] = null
  ): DelayedTransitionDefinition[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], eventType = eventType.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    if (cond != null) __obj.updateDynamic("cond")(cond.asInstanceOf[js.Any])
    if (in != null) __obj.updateDynamic("in")(in.asInstanceOf[js.Any])
    if (!js.isUndefined(internal)) __obj.updateDynamic("internal")(internal.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[DelayedTransitionDefinition[TContext, TEvent]]
  }
}

