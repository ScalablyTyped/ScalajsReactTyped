package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatResult extends js.Object {
  // UNIX file mode
  var ctime: Double
  // Size in bytes
  var mode: Double
  // Created date
  var mtime: Double
  var name: js.UndefOr[String] = js.undefined
  // Last modified date
  var originalFilepath: String
  // The name of the item TODO: why is this not documented?
  var path: String
  // The absolute path to the item
  var size: String
  // Is the file just a file?
  def isDirectory(): Boolean
  // In case of content uri this is the pointed file path, otherwise is the same as path
  def isFile(): Boolean
}

object StatResult {
  @scala.inline
  def apply(
    ctime: Double,
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    mode: Double,
    mtime: Double,
    originalFilepath: String,
    path: String,
    size: String,
    name: String = null
  ): StatResult = {
    val __obj = js.Dynamic.literal(ctime = ctime.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], originalFilepath = originalFilepath.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatResult]
  }
}

