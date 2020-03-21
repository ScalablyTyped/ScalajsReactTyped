package typingsJapgolly.checkSum.mod

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("check-sum", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(
    path: String,
    hashes: Hashes,
    callback: js.Function1[/* error */ js.UndefOr[ChecksumError | Error], Unit]
  ): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
  def apply(stream: Readable, hashes: Hashes, callback: js.Function1[/* error */ ChecksumError | js.Any, Unit]): js.Function1[/* fn */ js.Function0[Unit], Unit] = js.native
}

