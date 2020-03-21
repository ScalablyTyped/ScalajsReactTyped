package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Acceleration component.
  * Should be applied as a mixin.
  */
trait Acceleration extends js.Object {
  /**
    * Sets the horizontal and vertical acceleration of this body.
    * @param x The amount of horizontal acceleration to apply.
    * @param y The amount of vertical acceleration to apply.
    */
  def setAcceleration(x: Double, y: Double): this.type
  /**
    * Sets the horizontal acceleration of this body.
    * @param x The amount of acceleration to apply.
    */
  def setAccelerationX(x: Double): this.type
  /**
    * Sets the vertical acceleration of this body.
    * @param y The amount of acceleration to apply.
    */
  def setAccelerationY(y: Double): this.type
}

object Acceleration {
  @scala.inline
  def apply(
    setAcceleration: (Double, Double) => CallbackTo[Acceleration],
    setAccelerationX: Double => CallbackTo[Acceleration],
    setAccelerationY: Double => CallbackTo[Acceleration]
  ): Acceleration = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setAcceleration")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setAcceleration(t0, t1).runNow()))
    __obj.updateDynamic("setAccelerationX")(js.Any.fromFunction1((t0: scala.Double) => setAccelerationX(t0).runNow()))
    __obj.updateDynamic("setAccelerationY")(js.Any.fromFunction1((t0: scala.Double) => setAccelerationY(t0).runNow()))
    __obj.asInstanceOf[Acceleration]
  }
}

