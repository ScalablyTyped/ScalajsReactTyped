package typingsJapgolly.cryptoHash.mod

import typingsJapgolly.std.ArrayBuffer
import typingsJapgolly.std.ArrayBufferView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto-hash", "sha384")
@js.native
object sha384 extends js.Object {
  def apply(input: String): js.Promise[String] = js.native
  def apply(input: String, options: OptionBufferOutput): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(input: String, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: ArrayBuffer): js.Promise[String] = js.native
  def apply(input: ArrayBufferView): js.Promise[String] = js.native
  def apply(input: ArrayBufferView, options: OptionBufferOutput): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(input: ArrayBufferView, options: OptionsHexOutput): js.Promise[String] = js.native
  def apply(input: ArrayBuffer, options: OptionBufferOutput): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  def apply(input: ArrayBuffer, options: OptionsHexOutput): js.Promise[String] = js.native
}

