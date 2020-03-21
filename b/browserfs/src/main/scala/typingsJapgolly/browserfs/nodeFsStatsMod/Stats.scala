package typingsJapgolly.browserfs.nodeFsStatsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.fsMod.StatsBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends StatsBase[Double] {
  var fileData: Buffer | Null
  /**
    * Change the mode of the file. We use this helper function to prevent messing
    * up the type of the file, which is encoded in mode.
    */
  def chmod(mode: Double): Unit
  def toBuffer(): Buffer
}

object Stats {
  @scala.inline
  def apply(
    atime: js.Date,
    atimeMs: Double,
    birthtime: js.Date,
    birthtimeMs: Double,
    blksize: Double,
    blocks: Double,
    chmod: Double => Callback,
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
    toBuffer: CallbackTo[Buffer],
    uid: Double,
    fileData: Buffer = null
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], atimeMs = atimeMs.asInstanceOf[js.Any], birthtime = birthtime.asInstanceOf[js.Any], birthtimeMs = birthtimeMs.asInstanceOf[js.Any], blksize = blksize.asInstanceOf[js.Any], blocks = blocks.asInstanceOf[js.Any], ctime = ctime.asInstanceOf[js.Any], ctimeMs = ctimeMs.asInstanceOf[js.Any], dev = dev.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], ino = ino.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], mtimeMs = mtimeMs.asInstanceOf[js.Any], nlink = nlink.asInstanceOf[js.Any], rdev = rdev.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("chmod")(js.Any.fromFunction1((t0: scala.Double) => chmod(t0).runNow()))
    __obj.updateDynamic("isBlockDevice")(isBlockDevice.toJsFn)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice.toJsFn)
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFIFO")(isFIFO.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.updateDynamic("isSocket")(isSocket.toJsFn)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink.toJsFn)
    __obj.updateDynamic("toBuffer")(toBuffer.toJsFn)
    if (fileData != null) __obj.updateDynamic("fileData")(fileData.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stats]
  }
}

