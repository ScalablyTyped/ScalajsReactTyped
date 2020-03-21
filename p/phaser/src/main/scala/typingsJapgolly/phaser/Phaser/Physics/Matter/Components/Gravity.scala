package typingsJapgolly.phaser.Phaser.Physics.Matter.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to manipulate world gravity for Matter.js bodies.
  */
trait Gravity extends js.Object {
  /**
    * A togglable function for ignoring world gravity in real-time on the current body.
    * @param value Set to true to ignore the effect of world gravity, or false to not ignore it.
    */
  def setIgnoreGravity(value: Boolean): GameObject
}

object Gravity {
  @scala.inline
  def apply(setIgnoreGravity: Boolean => CallbackTo[GameObject]): Gravity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setIgnoreGravity")(js.Any.fromFunction1((t0: scala.Boolean) => setIgnoreGravity(t0).runNow()))
    __obj.asInstanceOf[Gravity]
  }
}

