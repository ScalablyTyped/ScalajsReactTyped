package typingsJapgolly.ssh2Streams.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Stats extends Attributes {
  def isBlockDevice(): Boolean
  def isCharacterDevice(): Boolean
  def isDirectory(): Boolean
  def isFIFO(): Boolean
  def isFile(): Boolean
  def isSocket(): Boolean
  def isSymbolicLink(): Boolean
}

object Stats {
  @scala.inline
  def apply(
    atime: Double,
    gid: Double,
    isBlockDevice: CallbackTo[Boolean],
    isCharacterDevice: CallbackTo[Boolean],
    isDirectory: CallbackTo[Boolean],
    isFIFO: CallbackTo[Boolean],
    isFile: CallbackTo[Boolean],
    isSocket: CallbackTo[Boolean],
    isSymbolicLink: CallbackTo[Boolean],
    mode: Double,
    mtime: Double,
    size: Double,
    uid: Double
  ): Stats = {
    val __obj = js.Dynamic.literal(atime = atime.asInstanceOf[js.Any], gid = gid.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], mtime = mtime.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.updateDynamic("isBlockDevice")(isBlockDevice.toJsFn)
    __obj.updateDynamic("isCharacterDevice")(isCharacterDevice.toJsFn)
    __obj.updateDynamic("isDirectory")(isDirectory.toJsFn)
    __obj.updateDynamic("isFIFO")(isFIFO.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.updateDynamic("isSocket")(isSocket.toJsFn)
    __obj.updateDynamic("isSymbolicLink")(isSymbolicLink.toJsFn)
    __obj.asInstanceOf[Stats]
  }
}

