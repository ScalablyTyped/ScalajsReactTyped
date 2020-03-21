package typingsJapgolly.leafletPm.mod.PM

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Draw extends js.Object {
  def getShapes(): js.Array[String]
}

object Draw {
  @scala.inline
  def apply(getShapes: CallbackTo[js.Array[String]]): Draw = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getShapes")(getShapes.toJsFn)
    __obj.asInstanceOf[Draw]
  }
}

