package typingsJapgolly.phaser.Phaser.Physics.Impact.Components

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.phaser.Phaser.GameObjects.GameObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Impact Debug component.
  * Should be applied as a mixin.
  */
trait Debug extends js.Object {
  /**
    * [description]
    */
  var debugBodyColor: Double
  /**
    * [description]
    */
  var debugShowBody: Boolean
  /**
    * [description]
    */
  var debugShowVelocity: Boolean
  /**
    * [description]
    * @param showBody [description]
    * @param showVelocity [description]
    * @param bodyColor [description]
    */
  def setDebug(showBody: Boolean, showVelocity: Boolean, bodyColor: Double): GameObject
  /**
    * [description]
    * @param value [description]
    */
  def setDebugBodyColor(value: Double): GameObject
}

object Debug {
  @scala.inline
  def apply(
    debugBodyColor: Double,
    debugShowBody: Boolean,
    debugShowVelocity: Boolean,
    setDebug: (Boolean, Boolean, Double) => CallbackTo[GameObject],
    setDebugBodyColor: Double => CallbackTo[GameObject]
  ): Debug = {
    val __obj = js.Dynamic.literal(debugBodyColor = debugBodyColor.asInstanceOf[js.Any], debugShowBody = debugShowBody.asInstanceOf[js.Any], debugShowVelocity = debugShowVelocity.asInstanceOf[js.Any])
    __obj.updateDynamic("setDebug")(js.Any.fromFunction3((t0: scala.Boolean, t1: scala.Boolean, t2: scala.Double) => setDebug(t0, t1, t2).runNow()))
    __obj.updateDynamic("setDebugBodyColor")(js.Any.fromFunction1((t0: scala.Double) => setDebugBodyColor(t0).runNow()))
    __obj.asInstanceOf[Debug]
  }
}

