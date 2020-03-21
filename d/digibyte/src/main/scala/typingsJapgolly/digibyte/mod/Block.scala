package typingsJapgolly.digibyte.mod

import typingsJapgolly.digibyte.AnonPrevHash
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("digibyte", "Block")
@js.native
class Block protected () extends js.Object {
  def this(data: js.Object) = this()
  def this(data: Buffer) = this()
  var hash: String = js.native
  var header: AnonPrevHash = js.native
  var height: Double = js.native
  var transactions: js.Array[Transaction] = js.native
}

