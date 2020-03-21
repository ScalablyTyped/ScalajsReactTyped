package typingsJapgolly.tmp.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirResult extends js.Object {
  var name: String
  def removeCallback(): Unit
}

object DirResult {
  @scala.inline
  def apply(name: String, removeCallback: Callback): DirResult = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("removeCallback")(removeCallback.toJsFn)
    __obj.asInstanceOf[DirResult]
  }
}

