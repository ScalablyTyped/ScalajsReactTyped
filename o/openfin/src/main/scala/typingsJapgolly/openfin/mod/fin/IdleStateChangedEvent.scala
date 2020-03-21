package typingsJapgolly.openfin.mod.fin

import typingsJapgolly.openfin.openfinStrings.`idle-state-changed`
import typingsJapgolly.openfin.openfinStrings.system
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IdleStateChangedEvent extends js.Object {
  /**
    * How long in milliseconds since the user has been idle.
    */
  var elapsedTime: Double
  /**
    * true when the user is idle,false when the user has returned;
    */
  var isIdle: Boolean
  var topic: system
  var `type`: `idle-state-changed`
}

object IdleStateChangedEvent {
  @scala.inline
  def apply(elapsedTime: Double, isIdle: Boolean, topic: system, `type`: `idle-state-changed`): IdleStateChangedEvent = {
    val __obj = js.Dynamic.literal(elapsedTime = elapsedTime.asInstanceOf[js.Any], isIdle = isIdle.asInstanceOf[js.Any], topic = topic.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdleStateChangedEvent]
  }
}

