package typingsJapgolly.awsSdkEventstreamCodec

import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.binary
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.boolean
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.byte
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.integer
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.long
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.short
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.string
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.timestamp
import typingsJapgolly.awsSdkEventstreamCodec.awsSdkEventstreamCodecStrings.uuid
import typingsJapgolly.awsSdkEventstreamCodec.distTypesInt64Mod.Int64
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMessageMod {
  
  type BinaryHeaderValue = HeaderValue[binary, js.typedarray.Uint8Array]
  
  type BooleanHeaderValue = HeaderValue[boolean, Boolean]
  
  type ByteHeaderValue = HeaderValue[byte, Double]
  
  trait HeaderValue[K /* <: String */, V] extends StObject {
    
    var `type`: K
    
    var value: V
  }
  object HeaderValue {
    
    inline def apply[K /* <: String */, V](`type`: K, value: V): HeaderValue[K, V] = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderValue[K, V]]
    }
    
    extension [Self <: HeaderValue[?, ?], K /* <: String */, V](x: Self & (HeaderValue[K, V])) {
      
      inline def setType(value: K): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type IntegerHeaderValue = HeaderValue[integer, Double]
  
  type LongHeaderValue = HeaderValue[long, Int64]
  
  trait Message extends StObject {
    
    var body: js.typedarray.Uint8Array
    
    var headers: MessageHeaders
  }
  object Message {
    
    inline def apply(body: js.typedarray.Uint8Array, headers: MessageHeaders): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setBody(value: js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: MessageHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    }
  }
  
  type MessageHeaderValue = BooleanHeaderValue | ByteHeaderValue | ShortHeaderValue | IntegerHeaderValue | LongHeaderValue | BinaryHeaderValue | StringHeaderValue | TimestampHeaderValue | UuidHeaderValue
  
  type MessageHeaders = Record[String, MessageHeaderValue]
  
  type ShortHeaderValue = HeaderValue[short, Double]
  
  type StringHeaderValue = HeaderValue[string, String]
  
  type TimestampHeaderValue = HeaderValue[timestamp, js.Date]
  
  type UuidHeaderValue = HeaderValue[uuid, String]
}
