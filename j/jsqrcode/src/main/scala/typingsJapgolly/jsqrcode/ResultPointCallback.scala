package typingsJapgolly.jsqrcode

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResultPointCallback extends js.Object {
  def foundPossibleResultPoint(point: FinderPattern): Unit
}

object ResultPointCallback {
  @scala.inline
  def apply(foundPossibleResultPoint: FinderPattern => Callback): ResultPointCallback = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("foundPossibleResultPoint")(js.Any.fromFunction1((t0: typingsJapgolly.jsqrcode.FinderPattern) => foundPossibleResultPoint(t0).runNow()))
    __obj.asInstanceOf[ResultPointCallback]
  }
}

