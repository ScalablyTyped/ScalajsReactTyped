package typingsJapgolly.concatStream.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("concat-stream", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(cb: js.Function1[/* buf */ Buffer, Unit]): Writable = js.native
  def apply(opts: ConcatOpts, cb: js.Function1[/* buf */ Buffer, Unit]): Writable = js.native
}

