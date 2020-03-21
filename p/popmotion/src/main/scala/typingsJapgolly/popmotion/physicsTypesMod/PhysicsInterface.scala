package typingsJapgolly.popmotion.physicsTypesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhysicsInterface extends js.Object {
  def set(v: Double): PhysicsInterface
  def setAcceleration(v: Double): PhysicsInterface
  def setFriction(v: Double): PhysicsInterface
  def setSpringStrength(v: Double): PhysicsInterface
  def setSpringTarget(v: Double): PhysicsInterface
  def setVelocity(v: Double): PhysicsInterface
  def stop(): Unit
}

object PhysicsInterface {
  @scala.inline
  def apply(
    set: Double => CallbackTo[PhysicsInterface],
    setAcceleration: Double => CallbackTo[PhysicsInterface],
    setFriction: Double => CallbackTo[PhysicsInterface],
    setSpringStrength: Double => CallbackTo[PhysicsInterface],
    setSpringTarget: Double => CallbackTo[PhysicsInterface],
    setVelocity: Double => CallbackTo[PhysicsInterface],
    stop: Callback
  ): PhysicsInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("set")(js.Any.fromFunction1((t0: scala.Double) => set(t0).runNow()))
    __obj.updateDynamic("setAcceleration")(js.Any.fromFunction1((t0: scala.Double) => setAcceleration(t0).runNow()))
    __obj.updateDynamic("setFriction")(js.Any.fromFunction1((t0: scala.Double) => setFriction(t0).runNow()))
    __obj.updateDynamic("setSpringStrength")(js.Any.fromFunction1((t0: scala.Double) => setSpringStrength(t0).runNow()))
    __obj.updateDynamic("setSpringTarget")(js.Any.fromFunction1((t0: scala.Double) => setSpringTarget(t0).runNow()))
    __obj.updateDynamic("setVelocity")(js.Any.fromFunction1((t0: scala.Double) => setVelocity(t0).runNow()))
    __obj.updateDynamic("stop")(stop.toJsFn)
    __obj.asInstanceOf[PhysicsInterface]
  }
}

