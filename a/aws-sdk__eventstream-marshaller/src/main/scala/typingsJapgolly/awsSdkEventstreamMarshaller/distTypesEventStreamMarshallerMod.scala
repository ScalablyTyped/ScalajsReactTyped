package typingsJapgolly.awsSdkEventstreamMarshaller

import typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.Message
import typingsJapgolly.awsSdkTypes.distTypesEventStreamMod.MessageHeaders
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Decoder
import typingsJapgolly.awsSdkTypes.distTypesUtilMod.Encoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEventStreamMarshallerMod {
  
  @JSImport("@aws-sdk/eventstream-marshaller/dist-types/EventStreamMarshaller", "EventStreamMarshaller")
  @js.native
  open class EventStreamMarshaller protected () extends StObject {
    def this(toUtf8: Encoder, fromUtf8: Decoder) = this()
    
    /* private */ val codec: Any = js.native
    
    def formatHeaders(rawHeaders: MessageHeaders): js.typedarray.Uint8Array = js.native
    
    def marshall(message: Message): js.typedarray.Uint8Array = js.native
    
    def unmarshall(message: js.typedarray.ArrayBufferView): Message = js.native
  }
}
