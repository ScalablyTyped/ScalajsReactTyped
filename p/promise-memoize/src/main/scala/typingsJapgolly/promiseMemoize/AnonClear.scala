package typingsJapgolly.promiseMemoize

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonClear extends js.Object {
  def clear(): Unit
}

object AnonClear {
  @scala.inline
  def apply(clear: Callback): AnonClear = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("clear")(clear.toJsFn)
    __obj.asInstanceOf[AnonClear]
  }
}

