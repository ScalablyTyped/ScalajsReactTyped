package typingsJapgolly.sodiumNative.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.sodiumNative.sodiumNativeNumbers.`-1`
import typingsJapgolly.sodiumNative.sodiumNativeNumbers.`0`
import typingsJapgolly.sodiumNative.sodiumNativeNumbers.`1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sodium-native", "sodium_compare")
@js.native
object sodiumCompare extends js.Object {
  def apply(b1: Buffer, b2: Buffer): `1` | `0` | `-1` = js.native
}

