package typingsJapgolly.xstate.typesMod

import typingsJapgolly.xstate.typesMod.ActionTypes.Raise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RaiseActionObject[TEvent /* <: EventObject */] extends js.Object {
  var _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]
  var `type`: Raise
}

object RaiseActionObject {
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent], `type`: Raise): RaiseActionObject[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RaiseActionObject[TEvent]]
  }
}

