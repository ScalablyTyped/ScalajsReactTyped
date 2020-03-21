package typingsJapgolly.iltorb.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("iltorb", "decompress")
@js.native
object decompress extends js.Object {
  def apply(buffer: Buffer): js.Promise[Buffer] = js.native
  def apply(buffer: Buffer, callback: IltorbCallback): Unit = js.native
}

