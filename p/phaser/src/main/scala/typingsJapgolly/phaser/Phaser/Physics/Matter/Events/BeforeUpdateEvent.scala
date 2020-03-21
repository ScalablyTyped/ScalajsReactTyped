package typingsJapgolly.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BeforeUpdateEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String
  /**
    * The source object of the event.
    */
  var source: js.Any
  /**
    * The Matter Engine `timing.timestamp` value for the event.
    */
  var timestamp: Double
}

object BeforeUpdateEvent {
  @scala.inline
  def apply(name: String, source: js.Any, timestamp: Double): BeforeUpdateEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BeforeUpdateEvent]
  }
}

