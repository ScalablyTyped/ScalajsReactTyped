package typingsJapgolly.hapiB64

import typingsJapgolly.hapiB64.hapiB64Strings.buffer
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.node.bufferMod.global.BufferEncoding
import typingsJapgolly.node.streamMod.Transform
import typingsJapgolly.node.streamMod.TransformOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@hapi/b64", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@hapi/b64", "Decoder")
  @js.native
  open class Decoder () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  @JSImport("@hapi/b64", "Encoder")
  @js.native
  open class Encoder () extends Transform {
    def this(opts: TransformOptions) = this()
  }
  
  inline def base64urlDecode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlDecode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64urlDecode(value: String, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64urlDecode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def base64urlDecode_buffer(value: String, encoding: buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("base64urlDecode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  inline def base64urlEncode(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64urlEncode(value: String, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def base64urlEncode(value: Buffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def base64urlEncode(value: Buffer, encoding: BufferEncoding): String = (^.asInstanceOf[js.Dynamic].applyDynamic("base64urlEncode")(value.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def decode(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("decode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def encode(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("encode")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
}
