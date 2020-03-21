package typingsJapgolly.phaser.Phaser.Types.Physics.Arcade

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArcadeBodyCollision extends js.Object {
  /**
    * True if the Body is colliding on its lower edge.
    */
  var down: Boolean
  /**
    * True if the Body is colliding on its left edge.
    */
  var left: Boolean
  /**
    * True if the Body is not colliding.
    */
  var none: Boolean
  /**
    * True if the Body is colliding on its right edge.
    */
  var right: Boolean
  /**
    * True if the Body is colliding on its upper edge.
    */
  var up: Boolean
}

object ArcadeBodyCollision {
  @scala.inline
  def apply(down: Boolean, left: Boolean, none: Boolean, right: Boolean, up: Boolean): ArcadeBodyCollision = {
    val __obj = js.Dynamic.literal(down = down.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], up = up.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ArcadeBodyCollision]
  }
}

