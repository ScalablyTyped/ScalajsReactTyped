package typingsJapgolly.jssip.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionHoldEvent extends js.Object {
  var originator: String
}

object SessionHoldEvent {
  @scala.inline
  def apply(originator: String): SessionHoldEvent = {
    val __obj = js.Dynamic.literal(originator = originator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SessionHoldEvent]
  }
}

