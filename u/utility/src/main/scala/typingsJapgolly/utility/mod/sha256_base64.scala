package typingsJapgolly.utility.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.utility.utilityStrings.base64
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("utility", "sha256")
@js.native
object sha256_base64 extends js.Object {
  def apply(s: String, format: base64): String = js.native
  def apply(s: Buffer, format: base64): String = js.native
}

