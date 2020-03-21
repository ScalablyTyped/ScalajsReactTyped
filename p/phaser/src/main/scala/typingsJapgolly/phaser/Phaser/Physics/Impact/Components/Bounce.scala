package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Bounce component.
  * Should be applied as a mixin.
  */
trait Bounce extends js.Object {
  /**
    * The bounce, or restitution, value of this body.
    * A value between 0 (no rebound) and 1 (full rebound)
    */
  var bounce: Double
  /**
    * Sets the impact physics bounce, or restitution, value.
    * @param value A value between 0 (no rebound) and 1 (full rebound)
    */
  def setBounce(value: Double): GameObject
  /**
    * Sets the minimum velocity the body is allowed to be moving to be considered for rebound.
    * @param value The minimum allowed velocity.
    */
  def setMinBounceVelocity(value: Double): GameObject
}

object Bounce {
  @scala.inline
  def apply(
    bounce: Double,
    setBounce: Double => CallbackTo[GameObject],
    setMinBounceVelocity: Double => CallbackTo[GameObject]
  ): Bounce = {
    val __obj = js.Dynamic.literal(bounce = bounce.asInstanceOf[js.Any])
    __obj.updateDynamic("setBounce")(js.Any.fromFunction1((t0: scala.Double) => setBounce(t0).runNow()))
    __obj.updateDynamic("setMinBounceVelocity")(js.Any.fromFunction1((t0: scala.Double) => setMinBounceVelocity(t0).runNow()))
    __obj.asInstanceOf[Bounce]
  }
}

