package typingsJapgolly.dojo

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnwatch extends js.Object {
  def unwatch(): Unit
}

object AnonUnwatch {
  @scala.inline
  def apply(unwatch: Callback): AnonUnwatch = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unwatch")(unwatch.toJsFn)
    __obj.asInstanceOf[AnonUnwatch]
  }
}

