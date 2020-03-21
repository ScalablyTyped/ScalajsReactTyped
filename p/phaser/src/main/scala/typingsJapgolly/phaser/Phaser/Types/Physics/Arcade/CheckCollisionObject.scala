package typingsJapgolly.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckCollisionObject extends js.Object {
  /**
    * Will bodies collide with the bottom side of the world bounds?
    */
  var down: Boolean
  /**
    * Will bodies collide with the left side of the world bounds?
    */
  var left: Boolean
  /**
    * Will bodies collide with the right side of the world bounds?
    */
  var right: Boolean
  /**
    * Will bodies collide with the top side of the world bounds?
    */
  var up: Boolean
}

object CheckCollisionObject {
  @scala.inline
  def apply(down: Boolean, left: Boolean, right: Boolean, up: Boolean): CheckCollisionObject = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckCollisionObject]
  }
}

