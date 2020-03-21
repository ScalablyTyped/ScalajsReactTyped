package typingsJapgolly.chrome

import japgolly.scalajs.react.Callback
import typingsJapgolly.chrome.chrome.idle.IdleStateChangedEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Typeofidle extends js.Object {
  var onStateChanged: IdleStateChangedEvent
  def queryState(detectionIntervalInSeconds: Double, callback: js.Function1[/* newState */ String, Unit]): Unit
  def setDetectionInterval(intervalInSeconds: Double): Unit
}

object Typeofidle {
  @scala.inline
  def apply(
    onStateChanged: IdleStateChangedEvent,
    queryState: (Double, js.Function1[/* newState */ String, Unit]) => Callback,
    setDetectionInterval: Double => Callback
  ): Typeofidle = {
    val __obj = js.Dynamic.literal(onStateChanged = onStateChanged.asInstanceOf[js.Any])
    __obj.updateDynamic("queryState")(js.Any.fromFunction2((t0: scala.Double, t1: js.Function1[/* newState */ java.lang.String, scala.Unit]) => queryState(t0, t1).runNow()))
    __obj.updateDynamic("setDetectionInterval")(js.Any.fromFunction1((t0: scala.Double) => setDetectionInterval(t0).runNow()))
    __obj.asInstanceOf[Typeofidle]
  }
}

