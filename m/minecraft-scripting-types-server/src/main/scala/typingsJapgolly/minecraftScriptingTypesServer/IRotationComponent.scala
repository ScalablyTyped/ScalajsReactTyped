package typingsJapgolly.minecraftScriptingTypesServer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This component allows you to control an entity's current rotation in the world as well as the entity's head rotation. Once applied, the entity will be rotated as specified.
  */
trait IRotationComponent extends js.Object {
  /**
    * Controls the head rotation looking up and down
    * @default 0.0
    */
  var x: Double
  /**
    * Controls the body rotation parallel to the floor
    * @default 0.0
    */
  var y: Double
}

object IRotationComponent {
  @scala.inline
  def apply(x: Double, y: Double): IRotationComponent = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IRotationComponent]
  }
}

