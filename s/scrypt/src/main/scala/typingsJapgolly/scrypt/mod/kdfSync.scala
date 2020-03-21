package typingsJapgolly.scrypt.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("scrypt", "kdfSync")
@js.native
object kdfSync extends js.Object {
  def apply(key: String, paramsObject: Params_): Buffer = js.native
  def apply(key: Buffer, paramsObject: Params_): Buffer = js.native
}

