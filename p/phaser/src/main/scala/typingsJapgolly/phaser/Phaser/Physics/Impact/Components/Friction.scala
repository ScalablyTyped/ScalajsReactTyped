package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Friction component.
  * Should be applied as a mixin.
  */
trait Friction extends js.Object {
  /**
    * [description]
    * @param x [description]
    * @param y [description]
    */
  def setFriction(x: Double, y: Double): GameObject
  /**
    * [description]
    * @param x [description]
    */
  def setFrictionX(x: Double): GameObject
  /**
    * [description]
    * @param y [description]
    */
  def setFrictionY(y: Double): GameObject
}

object Friction {
  @scala.inline
  def apply(
    setFriction: (Double, Double) => CallbackTo[GameObject],
    setFrictionX: Double => CallbackTo[GameObject],
    setFrictionY: Double => CallbackTo[GameObject]
  ): Friction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("setFriction")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => setFriction(t0, t1).runNow()))
    __obj.updateDynamic("setFrictionX")(js.Any.fromFunction1((t0: scala.Double) => setFrictionX(t0).runNow()))
    __obj.updateDynamic("setFrictionY")(js.Any.fromFunction1((t0: scala.Double) => setFrictionY(t0).runNow()))
    __obj.asInstanceOf[Friction]
  }
}

