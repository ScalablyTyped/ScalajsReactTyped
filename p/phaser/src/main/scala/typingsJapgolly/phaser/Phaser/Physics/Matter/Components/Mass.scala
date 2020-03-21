package typingsJapgolly.phaser.Phaser.Physics.Matter.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows accessing the mass, density, and center of mass of a Matter-enabled Game Object. Should be used as a mixin and not directly.
  */
trait Mass extends js.Object {
  /**
    * The body's center of mass.
    * 
    * Calling this creates a new `Vector2 each time to avoid mutation.
    * 
    * If you only need to read the value and won't change it, you can get it from `GameObject.body.centerOfMass`.
    */
  val centerOfMass: Vector2
  /**
    * Sets density of the body.
    * @param value The new density of the body.
    */
  def setDensity(value: Double): GameObject
  /**
    * Sets the mass of the Game Object's Matter Body.
    * @param value The new mass of the body.
    */
  def setMass(value: Double): GameObject
}

object Mass {
  @scala.inline
  def apply(
    centerOfMass: Vector2,
    setDensity: Double => CallbackTo[GameObject],
    setMass: Double => CallbackTo[GameObject]
  ): Mass = {
    val __obj = js.Dynamic.literal(centerOfMass = centerOfMass.asInstanceOf[js.Any])
    __obj.updateDynamic("setDensity")(js.Any.fromFunction1((t0: scala.Double) => setDensity(t0).runNow()))
    __obj.updateDynamic("setMass")(js.Any.fromFunction1((t0: scala.Double) => setMass(t0).runNow()))
    __obj.asInstanceOf[Mass]
  }
}

