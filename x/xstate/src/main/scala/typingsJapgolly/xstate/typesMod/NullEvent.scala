package typingsJapgolly.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NullEvent extends js.Object {
  var `type`: typingsJapgolly.xstate.typesMod.ActionTypes.NullEvent
}

object NullEvent {
  @scala.inline
  def apply(`type`: typingsJapgolly.xstate.typesMod.ActionTypes.NullEvent): NullEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NullEvent]
  }
}

