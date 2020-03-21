package typingsJapgolly.phaser.Phaser.Physics.Arcade.Components

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides methods used for setting the angular acceleration properties of an Arcade Physics Body.
  */
trait Angular extends js.Object {
  /**
    * Sets the angular acceleration of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular acceleration.
    */
  def setAngularAcceleration(value: Double): this.type
  /**
    * Sets the angular drag of the body. Drag is applied to the current velocity, providing a form of deceleration.
    * @param value The amount of drag.
    */
  def setAngularDrag(value: Double): this.type
  /**
    * Sets the angular velocity of the body.
    * 
    * In Arcade Physics, bodies cannot rotate. They are always axis-aligned.
    * However, they can have angular motion, which is passed on to the Game Object bound to the body,
    * causing them to visually rotate, even though the body remains axis-aligned.
    * @param value The amount of angular velocity.
    */
  def setAngularVelocity(value: Double): this.type
}

object Angular {
  @scala.inline
  def apply(
    setAngularAcceleration: Double => CallbackTo[Angular],
    setAngularDrag: Double => CallbackTo[Angular],
    setAngularVelocity: Double => CallbackTo[Angular]
  ): Angular = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAngularAcceleration")(js.Any.fromFunction1((t0: scala.Double) => setAngularAcceleration(t0).runNow()))
    __obj.updateDynamic("setAngularDrag")(js.Any.fromFunction1((t0: scala.Double) => setAngularDrag(t0).runNow()))
    __obj.updateDynamic("setAngularVelocity")(js.Any.fromFunction1((t0: scala.Double) => setAngularVelocity(t0).runNow()))
    __obj.asInstanceOf[Angular]
  }
}

