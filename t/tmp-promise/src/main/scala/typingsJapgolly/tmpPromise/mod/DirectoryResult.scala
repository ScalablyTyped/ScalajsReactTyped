package typingsJapgolly.tmpPromise.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryResult extends js.Object {
  var path: String
  def cleanup(): Unit
}

object DirectoryResult {
  @scala.inline
  def apply(cleanup: Callback, path: String): DirectoryResult = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("cleanup")(cleanup.toJsFn)
    __obj.asInstanceOf[DirectoryResult]
  }
}

