package typingsJapgolly.uuid1345.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.uuid1345.Anon0
import typingsJapgolly.uuid1345.Anon1
import typingsJapgolly.uuid1345.Anon2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("uuid-1345", "v4fast")
@js.native
object v4fast extends js.Object {
  def apply(): String = js.native
  def apply(callback: ASCIICallback): Unit = js.native
  def apply(options: Anon0): String = js.native
  def apply(options: Anon0, callback: ASCIICallback): Unit = js.native
  def apply(options: Anon1): Buffer = js.native
  def apply(options: Anon1, callback: BinaryCallback): Unit = js.native
  def apply(options: Anon2): UUID = js.native
  def apply(options: Anon2, callback: ObjectCallback): Unit = js.native
}

