package typingsJapgolly.phaser.Phaser.Physics.Matter.Events

import typingsJapgolly.phaser.Phaser.Types.Physics.Matter.MatterCollisionData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollisionEndEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String
  /**
    * A list of all affected pairs in the collision.
    */
  var pairs: js.Array[MatterCollisionData]
  /**
    * The source object of the event.
    */
  var source: js.Any
  /**
    * The Matter Engine `timing.timestamp` value for the event.
    */
  var timestamp: Double
}

object CollisionEndEvent {
  @scala.inline
  def apply(name: String, pairs: js.Array[MatterCollisionData], source: js.Any, timestamp: Double): CollisionEndEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], pairs = pairs.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CollisionEndEvent]
  }
}

