package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_unpad")
@js.native
object sodiumUnpad extends js.Object {
  def apply(buf: Buffer, paddedLength: Double, blocksize: Double): Double = js.native
}

