package typingsJapgolly.amazonConnectStreams.connect

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactState extends js.Object {
  /**
    * A relative local state duration. To get the actual duration of the state
    * relative to the current time, use contact.getStateDuration().
    */
  var duration: Double
  /**
    * The contact state type, as per the ContactStateType enumeration.
    */
  var `type`: String
}

object ContactState {
  @scala.inline
  def apply(duration: Double, `type`: String): ContactState = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactState]
  }
}

