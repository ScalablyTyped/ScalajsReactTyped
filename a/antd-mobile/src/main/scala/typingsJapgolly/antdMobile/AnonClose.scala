package typingsJapgolly.antdMobile

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClose extends js.Object {
  def close(): Unit
}

object AnonClose {
  @scala.inline
  def apply(close: Callback): AnonClose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("close")(close.toJsFn)
    __obj.asInstanceOf[AnonClose]
  }
}

