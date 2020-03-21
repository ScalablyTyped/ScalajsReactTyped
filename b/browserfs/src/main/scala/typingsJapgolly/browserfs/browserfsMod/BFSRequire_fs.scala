package typingsJapgolly.browserfs.browserfsMod

import typingsJapgolly.browserfs.browserfsStrings.fs
import typingsJapgolly.browserfs.fSMod.FSModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browserfs/dist/node/core/browserfs", "BFSRequire")
@js.native
object BFSRequire_fs extends js.Object {
  def apply(module: fs): FSModule = js.native
}

