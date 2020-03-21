package typingsJapgolly.mockFs.filesystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SymlinkOptions extends js.Object {
  /** The last symlink access time. Defaults to `new Date()`. */
  var atime: js.UndefOr[js.Date] = js.undefined
  /** The time of symlink creation. Defaults to `new Date()`. */
  var birthtime: js.UndefOr[js.Date] = js.undefined
  /** The last symlink change time. Defaults to `new Date()`. */
  var ctime: js.UndefOr[js.Date] = js.undefined
  /** The group id. Defaults to `process.getgid()`. */
  var gid: js.UndefOr[Double] = js.undefined
  /** Symlink mode (permission and sticky bits). Defaults to `0666`. */
  var mode: js.UndefOr[Double] = js.undefined
  /** The last symlink modification time. Defaults to `new Date()`. */
  var mtime: js.UndefOr[js.Date] = js.undefined
  /** Path to the source (required). */
  var path: String
  /** The user id. Defaults to `process.getuid()`. */
  var uid: js.UndefOr[Double] = js.undefined
}

object SymlinkOptions {
  @scala.inline
  def apply(
    path: String,
    atime: js.Date = null,
    birthtime: js.Date = null,
    ctime: js.Date = null,
    gid: Int | Double = null,
    mode: Int | Double = null,
    mtime: js.Date = null,
    uid: Int | Double = null
  ): SymlinkOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (birthtime != null) __obj.updateDynamic("birthtime")(birthtime.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[SymlinkOptions]
  }
}

