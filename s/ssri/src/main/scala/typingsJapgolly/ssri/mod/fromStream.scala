package typingsJapgolly.ssri.mod

import typingsJapgolly.node.streamMod.Readable
import typingsJapgolly.ssri.AnonAlgorithms
import typingsJapgolly.ssri.AnonPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ssri", "fromStream")
@js.native
object fromStream extends js.Object {
  def apply(stream: Readable): js.Thenable[IntegrityMap] = js.native
  def apply(stream: Readable, opts: AnonAlgorithms): js.Promise[IntegrityMap] = js.native
  def apply(stream: Readable, opts: AnonPromise): js.Thenable[IntegrityMap] = js.native
}

