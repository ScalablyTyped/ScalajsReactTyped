package typingsJapgolly.tmp.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends js.Object {
  var fd: Double
  var name: String
  def removeCallback(): Unit
}

object FileResult {
  @scala.inline
  def apply(fd: Double, name: String, removeCallback: Callback): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("removeCallback")(removeCallback.toJsFn)
    __obj.asInstanceOf[FileResult]
  }
}

