package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "crypto_pwhash_str_verify")
@js.native
object cryptoPwhashStrVerify extends js.Object {
  def apply(str: Buffer, password: Buffer): Boolean = js.native
}

