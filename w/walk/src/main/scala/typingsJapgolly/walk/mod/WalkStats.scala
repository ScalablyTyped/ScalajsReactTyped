package typingsJapgolly.walk.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.NodeJS.ErrnoException
import typingsJapgolly.node.fsMod.StatsBase
import typingsJapgolly.walk.walkStrings.FIFO
import typingsJapgolly.walk.walkStrings.blockDevice
import typingsJapgolly.walk.walkStrings.characterDevice
import typingsJapgolly.walk.walkStrings.directory
import typingsJapgolly.walk.walkStrings.file
import typingsJapgolly.walk.walkStrings.socket
import typingsJapgolly.walk.walkStrings.symbolicLink
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WalkStats extends StatsBase[Double] {
  var error: js.UndefOr[ErrnoException] = js.undefined
  var name: String
  var `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket
}

object WalkStats {
  @scala.inline
  def apply(
    atime: js.Date,
    atimeMs: Double,
    birthtime: js.Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    ctime: js.Date,
    ctimeMs: Double,
    dev: Double,
    gid: Double,
    ino: Double,
    isBlockDevice: CallbackTo[Boolean],
    isCharacterDevice: CallbackTo[Boolean],
    isDirectory: CallbackTo[Boolean],
    isFIFO: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    isSocket: CallbackTo[Boolean],
    isSymbolicLink: CallbackTo[Boolean],
    mode: Double,
    mtime: js.Date,
    mtimeMs: Double,
    name: String,
    nlink: Double,
    rdev: Double,
    size: Double,
    `type`: file | directory | symbolicLink | blockDevice | characterDevice | FIFO | socket,
    uid: Double,
    error: ErrnoException = null
  ): WalkStats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("isBlockDevice")(isBlockDevice.toJsFn)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice.toJsFn)
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFIFO")(isFIFO.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.updateDynamic("isSocket")(isSocket.toJsFn)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink.toJsFn)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    __obj.asInstanceOf[WalkStats]
  }
}

