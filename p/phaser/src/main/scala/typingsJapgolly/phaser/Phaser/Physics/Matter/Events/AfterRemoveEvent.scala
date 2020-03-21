package typingsJapgolly.phaser.Phaser.Physics.Matter.Events

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AfterRemoveEvent extends js.Object {
  /**
    * The name of the event.
    */
  var name: String
  /**
    * An array of the object(s) that were removed. May be a single body, constraint, composite or a mixture of these.
    */
  var `object`: js.Array[_]
  /**
    * The source object of the event.
    */
  var source: js.Any
}

object AfterRemoveEvent {
  @scala.inline
  def apply(name: String, `object`: js.Array[_], source: js.Any): AfterRemoveEvent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AfterRemoveEvent]
  }
}

