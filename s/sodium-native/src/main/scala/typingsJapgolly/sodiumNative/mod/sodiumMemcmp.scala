package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_memcmp")
@js.native
object sodiumMemcmp extends js.Object {
  def apply(b1: Buffer, b2: Buffer): Boolean = js.native
}

