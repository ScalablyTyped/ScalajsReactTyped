package typingsJapgolly.xstate.typesMod

import typingsJapgolly.xstate.stateMod.State
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateMeta[TContext, TEvent /* <: EventObject */] extends js.Object {
  var _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]
  var state: State[TContext, TEvent, _, _]
}

object StateMeta {
  @scala.inline
  def apply[TContext, TEvent /* <: EventObject */](_event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent], state: State[TContext, TEvent, _, _]): StateMeta[TContext, TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateMeta[TContext, TEvent]]
  }
}

