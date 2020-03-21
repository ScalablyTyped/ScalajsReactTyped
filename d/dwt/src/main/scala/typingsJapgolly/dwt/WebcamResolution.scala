package typingsJapgolly.dwt

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebcamResolution extends js.Object {
  def Get(index: Double): String
  def GetCount(): Double
  def GetCurrent(): String
}

object WebcamResolution {
  @scala.inline
  def apply(Get: Double => CallbackTo[String], GetCount: CallbackTo[Double], GetCurrent: CallbackTo[String]): WebcamResolution = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Get")(js.Any.fromFunction1((t0: scala.Double) => Get(t0).runNow()))
    __obj.updateDynamic("GetCount")(GetCount.toJsFn)
    __obj.updateDynamic("GetCurrent")(GetCurrent.toJsFn)
    __obj.asInstanceOf[WebcamResolution]
  }
}

