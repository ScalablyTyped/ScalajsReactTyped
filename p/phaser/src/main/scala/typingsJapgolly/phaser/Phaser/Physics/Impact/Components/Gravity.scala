package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Gravity component.
  * Should be applied as a mixin.
  */
trait Gravity extends js.Object {
  /**
    * [description]
    */
  var gravity: Double
  /**
    * [description]
    * @param value [description]
    */
  def setGravity(value: Double): GameObject
}

object Gravity {
  @scala.inline
  def apply(gravity: Double, setGravity: Double => CallbackTo[GameObject]): Gravity = {
    val __obj = js.Dynamic.literal(gravity = gravity.asInstanceOf[js.Any])
    __obj.updateDynamic("setGravity")(js.Any.fromFunction1((t0: scala.Double) => setGravity(t0).runNow()))
    __obj.asInstanceOf[Gravity]
  }
}

