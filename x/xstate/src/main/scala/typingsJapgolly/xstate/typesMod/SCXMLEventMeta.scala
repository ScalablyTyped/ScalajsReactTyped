package typingsJapgolly.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SCXMLEventMeta[TEvent /* <: EventObject */] extends js.Object {
  var _event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]
}

object SCXMLEventMeta {
  @scala.inline
  def apply[TEvent /* <: EventObject */](_event: typingsJapgolly.xstate.typesMod.SCXML.Event[TEvent]): SCXMLEventMeta[TEvent] = {
    val __obj = js.Dynamic.literal(_event = _event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SCXMLEventMeta[TEvent]]
  }
}

