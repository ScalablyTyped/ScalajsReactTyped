package typingsJapgolly.rsocketCore

import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Encodable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketencodingMod {
  
  @JSImport("rsocket-core/RSocketEncoding", "BufferEncoder")
  @js.native
  val BufferEncoder: Encoder[Buffer] = js.native
  
  @JSImport("rsocket-core/RSocketEncoding", "BufferEncoders")
  @js.native
  val BufferEncoders: Encoders[Buffer] = js.native
  
  @JSImport("rsocket-core/RSocketEncoding", "UTF8Encoder")
  @js.native
  val UTF8Encoder: Encoder[String] = js.native
  
  @JSImport("rsocket-core/RSocketEncoding", "Utf8Encoders")
  @js.native
  val Utf8Encoders: Encoders[String] = js.native
  
  trait Encoder[T /* <: Encodable */] extends StObject {
    
    def byteLength(value: Encodable): Double
    
    def decode(buffer: Buffer, start: Double, end: Double): T
    
    def encode(value: Encodable, buffer: Buffer, start: Double, end: Double): Double
  }
  object Encoder {
    
    inline def apply[T /* <: Encodable */](
      byteLength: Encodable => Double,
      decode: (Buffer, Double, Double) => T,
      encode: (Encodable, Buffer, Double, Double) => Double
    ): Encoder[T] = {
      val __obj = js.Dynamic.literal(byteLength = js.Any.fromFunction1(byteLength), decode = js.Any.fromFunction3(decode), encode = js.Any.fromFunction4(encode))
      __obj.asInstanceOf[Encoder[T]]
    }
    
    extension [Self <: Encoder[?], T /* <: Encodable */](x: Self & Encoder[T]) {
      
      inline def setByteLength(value: Encodable => Double): Self = StObject.set(x, "byteLength", js.Any.fromFunction1(value))
      
      inline def setDecode(value: (Buffer, Double, Double) => T): Self = StObject.set(x, "decode", js.Any.fromFunction3(value))
      
      inline def setEncode(value: (Encodable, Buffer, Double, Double) => Double): Self = StObject.set(x, "encode", js.Any.fromFunction4(value))
    }
  }
  
  trait Encoders[T /* <: Encodable */] extends StObject {
    
    var data: Encoder[T]
    
    var dataMimeType: Encoder[String]
    
    var message: Encoder[String]
    
    var metadata: Encoder[T]
    
    var metadataMimeType: Encoder[String]
    
    var resumeToken: Encoder[T]
  }
  object Encoders {
    
    inline def apply[T /* <: Encodable */](
      data: Encoder[T],
      dataMimeType: Encoder[String],
      message: Encoder[String],
      metadata: Encoder[T],
      metadataMimeType: Encoder[String],
      resumeToken: Encoder[T]
    ): Encoders[T] = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], dataMimeType = dataMimeType.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any], resumeToken = resumeToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoders[T]]
    }
    
    extension [Self <: Encoders[?], T /* <: Encodable */](x: Self & Encoders[T]) {
      
      inline def setData(value: Encoder[T]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataMimeType(value: Encoder[String]): Self = StObject.set(x, "dataMimeType", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: Encoder[String]): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMetadata(value: Encoder[T]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      inline def setMetadataMimeType(value: Encoder[String]): Self = StObject.set(x, "metadataMimeType", value.asInstanceOf[js.Any])
      
      inline def setResumeToken(value: Encoder[T]): Self = StObject.set(x, "resumeToken", value.asInstanceOf[js.Any])
    }
  }
}
