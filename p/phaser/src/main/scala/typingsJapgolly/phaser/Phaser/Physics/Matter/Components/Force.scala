package typingsJapgolly.phaser.Phaser.Physics.Matter.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import typingsJapgolly.phaser.Phaser.Math.Vector2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A component to apply force to Matter.js bodies.
  */
trait Force extends js.Object {
  /**
    * Applies a force to a body.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForce(force: Vector2): GameObject
  /**
    * Applies a force to a body from a given position.
    * @param position The position in which the force comes from.
    * @param force A Vector that specifies the force to apply.
    */
  def applyForceFrom(position: Vector2, force: Vector2): GameObject
  /**
    * Apply thrust to the forward position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrust(speed: Double): GameObject
  /**
    * Apply thrust to the back position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustBack(speed: Double): GameObject
  /**
    * Apply thrust to the left position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustLeft(speed: Double): GameObject
  /**
    * Apply thrust to the right position of the body.
    * 
    * Use very small values, such as 0.1, depending on the mass and required speed.
    * @param speed A speed value to be applied to a directional force.
    */
  def thrustRight(speed: Double): GameObject
}

object Force {
  @scala.inline
  def apply(
    applyForce: Vector2 => CallbackTo[GameObject],
    applyForceFrom: (Vector2, Vector2) => CallbackTo[GameObject],
    thrust: Double => CallbackTo[GameObject],
    thrustBack: Double => CallbackTo[GameObject],
    thrustLeft: Double => CallbackTo[GameObject],
    thrustRight: Double => CallbackTo[GameObject]
  ): Force = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("applyForce")(js.Any.fromFunction1((t0: typingsJapgolly.phaser.Phaser.Math.Vector2) => applyForce(t0).runNow()))
    __obj.updateDynamic("applyForceFrom")(js.Any.fromFunction2((t0: typingsJapgolly.phaser.Phaser.Math.Vector2, t1: typingsJapgolly.phaser.Phaser.Math.Vector2) => applyForceFrom(t0, t1).runNow()))
    __obj.updateDynamic("thrust")(js.Any.fromFunction1((t0: scala.Double) => thrust(t0).runNow()))
    __obj.updateDynamic("thrustBack")(js.Any.fromFunction1((t0: scala.Double) => thrustBack(t0).runNow()))
    __obj.updateDynamic("thrustLeft")(js.Any.fromFunction1((t0: scala.Double) => thrustLeft(t0).runNow()))
    __obj.updateDynamic("thrustRight")(js.Any.fromFunction1((t0: scala.Double) => thrustRight(t0).runNow()))
    __obj.asInstanceOf[Force]
  }
}

