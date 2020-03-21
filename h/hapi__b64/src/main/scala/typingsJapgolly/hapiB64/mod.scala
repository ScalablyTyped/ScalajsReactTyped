package typingsJapgolly.hapiB64

import typingsJapgolly.hapiB64.hapiB64Strings.buffer
import typingsJapgolly.node.Buffer
import typingsJapgolly.node.BufferEncoding
import typingsJapgolly.node.streamMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@hapi/b64", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class Decoder () extends Transform
  
  @js.native
  class Encoder () extends Transform
  
  def base64urlDecode(value: String): String = js.native
  def base64urlDecode(value: String, encoding: BufferEncoding): String = js.native
  @JSName("base64urlDecode")
  def base64urlDecode_buffer(value: String, encoding: buffer): Buffer = js.native
  def base64urlEncode(value: String): String = js.native
  def base64urlEncode(value: String, encoding: BufferEncoding): String = js.native
  def base64urlEncode(value: Buffer): String = js.native
  def base64urlEncode(value: Buffer, encoding: BufferEncoding): String = js.native
  def decode(buffer: Buffer): Buffer = js.native
  def encode(buffer: Buffer): Buffer = js.native
}

