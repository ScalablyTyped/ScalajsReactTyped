package typingsJapgolly.nodelibFsWalk.syncMod

import typingsJapgolly.nodelibFsWalk.typesMod.Entry
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers/sync", JSImport.Default)
@js.native
class default protected () extends SyncProvider {
  def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.settingsMod.default) = this()
  /* CompleteClass */
  override val _reader: typingsJapgolly.nodelibFsWalk.readersSyncMod.default = js.native
  /* CompleteClass */
  override val _root: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override def read(): js.Array[Entry] = js.native
}

