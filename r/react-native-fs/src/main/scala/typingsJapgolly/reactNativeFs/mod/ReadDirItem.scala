package typingsJapgolly.reactNativeFs.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadDirItem extends js.Object {
  var ctime: js.UndefOr[js.Date] = js.undefined
  // The creation date of the file (iOS only)
  var mtime: js.UndefOr[js.Date] = js.undefined
  // The last modified date of the file
  var name: String
  // The name of the item
  var path: String
  // The absolute path to the item
  var size: String
  // Is the file just a file?
  def isDirectory(): Boolean
  // Size in bytes
  def isFile(): Boolean
}

object ReadDirItem {
  @scala.inline
  def apply(
    isDirectory: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    name: String,
    path: String,
    size: String,
    ctime: js.Date = null,
    mtime: js.Date = null
  ): ReadDirItem = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadDirItem]
  }
}

