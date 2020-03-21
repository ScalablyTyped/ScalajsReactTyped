package typingsJapgolly.famous.mod

import typingsJapgolly.famous.mathMod.Vec2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGesturePointer extends js.Object {
  var delta: Vec2
  var position: Vec2
  var velocity: Vec2
}

object IGesturePointer {
  @scala.inline
  def apply(delta: Vec2, position: Vec2, velocity: Vec2): IGesturePointer = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IGesturePointer]
  }
}

