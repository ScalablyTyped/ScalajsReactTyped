package typingsJapgolly.writeFileAtomically

import typingsJapgolly.node.Buffer
import typingsJapgolly.writeFileAtomic.mod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("write-file-atomically", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(path: String, data: Data): js.Promise[Unit] = js.native
  def apply(path: String, data: Data, options: Options): js.Promise[Unit] = js.native
  type Data = String | Buffer | scala.scalajs.js.typedarray.Uint8Array
}

