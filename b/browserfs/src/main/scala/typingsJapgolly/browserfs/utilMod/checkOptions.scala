package typingsJapgolly.browserfs.utilMod

import typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback
import typingsJapgolly.browserfs.fileSystemMod.FileSystemConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/util", "checkOptions")
@js.native
object checkOptions extends js.Object {
  def apply(fsType: FileSystemConstructor, opts: js.Any, cb: BFSOneArgCallback): Unit = js.native
}

