package typingsJapgolly.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateLike[TContext] extends js.Object {
  var _event: typingsJapgolly.xstate.typesMod.SCXML.Event[EventObject]
  var context: TContext
  var event: EventObject
  var value: StateValue
}

object StateLike {
  @scala.inline
  def apply[TContext](
    _event: typingsJapgolly.xstate.typesMod.SCXML.Event[EventObject],
    context: TContext,
    event: EventObject,
    value: StateValue
  ): StateLike[TContext] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any], context = context.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StateLike[TContext]]
  }
}

