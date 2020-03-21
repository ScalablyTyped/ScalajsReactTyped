package typingsJapgolly.phaser.Phaser.Physics.Arcade.Components

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the mass properties of an Arcade Physics Body.
  */
trait Mass extends js.Object {
  /**
    * Sets the mass of the physics body
    * @param value New value for the mass of the body.
    */
  def setMass(value: Double): this.type
}

object Mass {
  @scala.inline
  def apply(setMass: Double => CallbackTo[Mass]): Mass = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setMass")(js.Any.fromFunction1((t0: scala.Double) => setMass(t0).runNow()))
    __obj.asInstanceOf[Mass]
  }
}

