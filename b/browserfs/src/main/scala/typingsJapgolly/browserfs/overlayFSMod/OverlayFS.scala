package typingsJapgolly.browserfs.overlayFSMod

import typingsJapgolly.browserfs.AnonReadable
import typingsJapgolly.browserfs.fileSystemMod.BFSOneArgCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OverlayFS
  extends typingsJapgolly.browserfs.lockedFsMod.default[UnlockedOverlayFS] {
  def getOverlayedFileSystems(): AnonReadable = js.native
  def initialize(cb: BFSOneArgCallback, deprecateMsg: Boolean): Unit = js.native
  def unwrap(): UnlockedOverlayFS = js.native
}

