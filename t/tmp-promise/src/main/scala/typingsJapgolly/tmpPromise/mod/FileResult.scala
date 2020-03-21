package typingsJapgolly.tmpPromise.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileResult extends DirectoryResult {
  var fd: Double
}

object FileResult {
  @scala.inline
  def apply(cleanup: Callback, fd: Double, path: String): FileResult = {
    val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.updateDynamic("cleanup")(cleanup.toJsFn)
    __obj.asInstanceOf[FileResult]
  }
}

