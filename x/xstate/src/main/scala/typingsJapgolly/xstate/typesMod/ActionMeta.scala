package typingsJapgolly.xstate.typesMod

import typingsJapgolly.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionMeta[TContext, TEvent /* <: EventObject */] extends StateMeta[TContext, TEvent] {
  var action: ActionObject[TContext, TEvent]
}

object ActionMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent],
    action: ActionObject[TContext, TEvent],
    state: State[TContext, TEvent, _, _]
  ): ActionMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], action = action.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ActionMeta[TContext, TEvent]]
  }
}

