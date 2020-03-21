package typingsJapgolly.nodelibFsWalk.streamMod

import typingsJapgolly.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.walk/out/providers/stream", JSImport.Default)
@js.native
class default protected () extends StreamProvider {
  def this(_root: String, _settings: typingsJapgolly.nodelibFsWalk.settingsMod.default) = this()
  /* CompleteClass */
  override val _reader: typingsJapgolly.nodelibFsWalk.readersAsyncMod.default = js.native
  /* CompleteClass */
  override val _root: js.Any = js.native
  /* CompleteClass */
  override val _settings: js.Any = js.native
  /* CompleteClass */
  override val _stream: Readable = js.native
  /* CompleteClass */
  override def read(): Readable = js.native
}

