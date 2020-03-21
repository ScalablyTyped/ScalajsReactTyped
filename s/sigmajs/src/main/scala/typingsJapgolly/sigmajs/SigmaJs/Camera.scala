package typingsJapgolly.sigmajs.SigmaJs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.sigmajs.AnonX
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Camera extends js.Object {
  var angle: Double
  var ratio: Double
  var readPrefix: String
  var x: Double
  var y: Double
  def cameraPosition(x: Double, y: Double): AnonX
  def goTo(settings: StringDictionary[js.Any]): Unit
  def graphPosition(x: Double, y: Double): AnonX
  def settings(setting: String): js.Any
}

object Camera {
  @scala.inline
  def apply(
    angle: Double,
    cameraPosition: (Double, Double) => CallbackTo[AnonX],
    goTo: StringDictionary[js.Any] => Callback,
    graphPosition: (Double, Double) => CallbackTo[AnonX],
    ratio: Double,
    readPrefix: String,
    settings: String => CallbackTo[js.Any],
    x: Double,
    y: Double
  ): Camera = {
    val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], ratio = ratio.asInstanceOf[js.Any], readPrefix = readPrefix.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("cameraPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => cameraPosition(t0, t1).runNow()))
    __obj.updateDynamic("goTo")(js.Any.fromFunction1((t0: org.scalablytyped.runtime.StringDictionary[js.Any]) => goTo(t0).runNow()))
    __obj.updateDynamic("graphPosition")(js.Any.fromFunction2((t0: scala.Double, t1: scala.Double) => graphPosition(t0, t1).runNow()))
    __obj.updateDynamic("settings")(js.Any.fromFunction1((t0: java.lang.String) => settings(t0).runNow()))
    __obj.asInstanceOf[Camera]
  }
}

