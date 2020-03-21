package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_malloc")
@js.native
object sodiumMalloc extends js.Object {
  def apply(size: Double): Buffer = js.native
}

