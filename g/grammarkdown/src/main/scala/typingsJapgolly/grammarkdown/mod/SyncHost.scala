package typingsJapgolly.grammarkdown.mod

import typingsJapgolly.grammarkdown.hostMod.SyncHostOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("grammarkdown", "SyncHost")
@js.native
class SyncHost ()
  extends typingsJapgolly.grammarkdown.hostMod.SyncHost {
  def this(hasReadFileSyncWriteFileSyncBaseOptions: SyncHostOptions) = this()
}

/* static members */
@JSImport("grammarkdown", "SyncHost")
@js.native
object SyncHost extends js.Object {
  def forFile(content: String): typingsJapgolly.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String): typingsJapgolly.grammarkdown.hostMod.SyncSingleFileHost = js.native
  def forFile(content: String, file: String, hostFallback: typingsJapgolly.grammarkdown.hostMod.SyncHost): typingsJapgolly.grammarkdown.hostMod.SyncSingleFileHost = js.native
}

