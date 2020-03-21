package typingsJapgolly.browserfs.browserfsMod

import typingsJapgolly.browserfs.fileSystemMod.BFSCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "getFileSystem")
@js.native
object getFileSystem extends js.Object {
  def apply(
    config: FileSystemConfiguration,
    cb: BFSCallback[typingsJapgolly.browserfs.fileSystemMod.FileSystem]
  ): Unit = js.native
}

