package typingsJapgolly.rotJs.speedMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpeedActor extends js.Object {
  def getSpeed(): Double
}

object SpeedActor {
  @scala.inline
  def apply(getSpeed: CallbackTo[Double]): SpeedActor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getSpeed")(getSpeed.toJsFn)
    __obj.asInstanceOf[SpeedActor]
  }
}

