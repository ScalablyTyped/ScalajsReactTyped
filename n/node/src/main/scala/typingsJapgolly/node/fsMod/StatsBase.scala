package typingsJapgolly.node.fsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatsBase[T] extends js.Object {
  var atime: js.Date
  var atimeMs: Double
  var birthtime: js.Date
  var birthtimeMs: Double
  var blksize: Double
  var blocks: Double
  var ctime: js.Date
  var ctimeMs: Double
  var dev: Double
  var gid: Double
  var ino: Double
  var mode: Double
  var mtime: js.Date
  var mtimeMs: Double
  var nlink: Double
  var rdev: Double
  var size: Double
  var uid: Double
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
}

object StatsBase {
  @scala.inline
  def apply[T](
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
    nlink: Double,
    rdev: Double,
    size: Double,
    uid: Double
  ): StatsBase[T] = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("isBlockDevice")(isBlockDevice.toJsFn)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice.toJsFn)
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFIFO")(isFIFO.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.updateDynamic("isSocket")(isSocket.toJsFn)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink.toJsFn)
    __obj.asInstanceOf[StatsBase[T]]
  }
}

