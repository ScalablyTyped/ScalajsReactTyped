package typingsJapgolly.gulpConcat.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFsStats extends js.Object {
  var atime: js.UndefOr[js.Date] = js.undefined
  var blksize: js.UndefOr[Double] = js.undefined
  var blocks: js.UndefOr[Double] = js.undefined
  var ctime: js.UndefOr[js.Date] = js.undefined
  var dev: js.UndefOr[Double] = js.undefined
  var gid: js.UndefOr[Double] = js.undefined
  var ino: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[Double] = js.undefined
  var mtime: js.UndefOr[js.Date] = js.undefined
  var nlink: js.UndefOr[Double] = js.undefined
  var rdev: js.UndefOr[Double] = js.undefined
  var size: js.UndefOr[Double] = js.undefined
  var uid: js.UndefOr[Double] = js.undefined
}

object IFsStats {
  @scala.inline
  def apply(
    atime: js.Date = null,
    blksize: Int | Double = null,
    blocks: Int | Double = null,
    ctime: js.Date = null,
    dev: Int | Double = null,
    gid: Int | Double = null,
    ino: Int | Double = null,
    mode: Int | Double = null,
    mtime: js.Date = null,
    nlink: Int | Double = null,
    rdev: Int | Double = null,
    size: Int | Double = null,
    uid: Int | Double = null
  ): IFsStats = {
    val __obj = js.Dynamic.literal()
    if (atime != null) __obj.updateDynamic("atime")(atime.asInstanceOf[js.Any])
    if (blksize != null) __obj.updateDynamic("blksize")(blksize.asInstanceOf[js.Any])
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (ctime != null) __obj.updateDynamic("ctime")(ctime.asInstanceOf[js.Any])
    if (dev != null) __obj.updateDynamic("dev")(dev.asInstanceOf[js.Any])
    if (gid != null) __obj.updateDynamic("gid")(gid.asInstanceOf[js.Any])
    if (ino != null) __obj.updateDynamic("ino")(ino.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (mtime != null) __obj.updateDynamic("mtime")(mtime.asInstanceOf[js.Any])
    if (nlink != null) __obj.updateDynamic("nlink")(nlink.asInstanceOf[js.Any])
    if (rdev != null) __obj.updateDynamic("rdev")(rdev.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (uid != null) __obj.updateDynamic("uid")(uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFsStats]
  }
}

