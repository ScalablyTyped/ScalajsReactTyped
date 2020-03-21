package typingsJapgolly.mockFs.filesystemMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileSystem extends js.Object {
  /**
    * Get a file system item.
    *
    * @param filepath Path to item.
    * @return The item (or null if not found).
    */
  def getItem(filepath: String): typingsJapgolly.mockFs.itemMod.^
  /** Get the root directory. */
  def getRoot(): typingsJapgolly.mockFs.directoryMod.^
}

object FileSystem {
  @scala.inline
  def apply(
    getItem: String => CallbackTo[typingsJapgolly.mockFs.itemMod.^],
    getRoot: CallbackTo[typingsJapgolly.mockFs.directoryMod.^]
  ): FileSystem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getItem")(js.Any.fromFunction1((t0: java.lang.String) => getItem(t0).runNow()))
    __obj.updateDynamic("getRoot")(getRoot.toJsFn)
    __obj.asInstanceOf[FileSystem]
  }
}

