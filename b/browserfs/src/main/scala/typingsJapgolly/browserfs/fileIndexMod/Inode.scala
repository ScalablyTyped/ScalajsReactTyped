package typingsJapgolly.browserfs.fileIndexMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Inode extends js.Object {
  def isDir(): Boolean
  def isFile(): Boolean
}

object Inode {
  @scala.inline
  def apply(isDir: CallbackTo[Boolean], isFile: CallbackTo[Boolean]): Inode = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("isDir")(isDir.toJsFn)
    __obj.updateDynamic("isFile")(isFile.toJsFn)
    __obj.asInstanceOf[Inode]
  }
}

