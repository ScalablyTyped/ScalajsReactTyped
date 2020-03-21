package typingsJapgolly.accurateInterval.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccurateInterval extends js.Object {
  def clear(): Unit
}

object AccurateInterval {
  @scala.inline
  def apply(clear: Callback): AccurateInterval = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[AccurateInterval]
  }
}

