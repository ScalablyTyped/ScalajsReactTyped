package typingsJapgolly.textEncodingUtf8.mod.TextEncoding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextEncodingStatic extends js.Object {
  @JSName("TextDecoder")
  var TextDecoder_Original: TextDecoderStatic = js.native
  @JSName("TextEncoder")
  var TextEncoder_Original: TextEncoderStatic = js.native
  def TextDecoder(): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextDecoder(label: String, options: TextDecoderOptions): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextDecoder = js.native
  def TextEncoder(): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
  def TextEncoder(utfLabel: String, options: TextEncoderOptions): typingsJapgolly.textEncodingUtf8.mod.TextEncoding.TextEncoder = js.native
}

