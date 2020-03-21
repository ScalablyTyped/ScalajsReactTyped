package typingsJapgolly.fsTreeDiff.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entry extends js.Object {
  var mode: Double
  var mtime: js.Date
  var relativePath: String
  var size: Double
  def isDirectory(): Boolean
}

object Entry {
  @scala.inline
  def apply(isDirectory: CallbackTo[Boolean], mode: Double, mtime: js.Date, relativePath: String, size: Double): Entry = {
    val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], relativePath = relativePath.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.asInstanceOf[Entry]
  }
}

