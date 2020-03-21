package typingsJapgolly.plugapi.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogObject extends js.Object {
  def log(): Unit
}

object LogObject {
  @scala.inline
  def apply(log: Callback): LogObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("log")(log.toJsFn)
    __obj.asInstanceOf[LogObject]
  }
}

