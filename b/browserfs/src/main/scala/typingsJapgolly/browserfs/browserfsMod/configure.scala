package typingsJapgolly.browserfs.browserfsMod

import typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "configure")
@js.native
object configure extends js.Object {
  def apply(config: FileSystemConfiguration, cb: BFSOneArgCallback): Unit = js.native
}

