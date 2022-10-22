package typingsJapgolly.sentryTypes

import japgolly.scalajs.react.Callback
import typingsJapgolly.sentryTypes.anon.Dictkey
import typingsJapgolly.sentryTypes.typesClientreportMod.EventDropReason
import typingsJapgolly.sentryTypes.typesDatacategoryMod.DataCategory
import typingsJapgolly.sentryTypes.typesEnvelopeMod.Envelope
import typingsJapgolly.sentryTypes.typesTextencoderMod.TextEncoderInternal
import typingsJapgolly.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTransportMod {
  
  trait BaseTransportOptions
    extends StObject
       with InternalBaseTransportOptions {
    
    var url: String
  }
  object BaseTransportOptions {
    
    inline def apply(recordDroppedEvent: (EventDropReason, DataCategory) => Callback, url: String): BaseTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction2((t0: EventDropReason, t1: DataCategory) => (recordDroppedEvent(t0, t1)).runNow()), url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseTransportOptions]
    }
    
    extension [Self <: BaseTransportOptions](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait InternalBaseTransportOptions extends StObject {
    
    var bufferSize: js.UndefOr[Double] = js.undefined
    
    def recordDroppedEvent(reason: EventDropReason, dataCategory: DataCategory): Unit
    
    var textEncoder: js.UndefOr[TextEncoderInternal] = js.undefined
  }
  object InternalBaseTransportOptions {
    
    inline def apply(recordDroppedEvent: (EventDropReason, DataCategory) => Callback): InternalBaseTransportOptions = {
      val __obj = js.Dynamic.literal(recordDroppedEvent = js.Any.fromFunction2((t0: EventDropReason, t1: DataCategory) => (recordDroppedEvent(t0, t1)).runNow()))
      __obj.asInstanceOf[InternalBaseTransportOptions]
    }
    
    extension [Self <: InternalBaseTransportOptions](x: Self) {
      
      inline def setBufferSize(value: Double): Self = StObject.set(x, "bufferSize", value.asInstanceOf[js.Any])
      
      inline def setBufferSizeUndefined: Self = StObject.set(x, "bufferSize", js.undefined)
      
      inline def setRecordDroppedEvent(value: (EventDropReason, DataCategory) => Callback): Self = StObject.set(x, "recordDroppedEvent", js.Any.fromFunction2((t0: EventDropReason, t1: DataCategory) => (value(t0, t1)).runNow()))
      
      inline def setTextEncoder(value: TextEncoderInternal): Self = StObject.set(x, "textEncoder", value.asInstanceOf[js.Any])
      
      inline def setTextEncoderUndefined: Self = StObject.set(x, "textEncoder", js.undefined)
    }
  }
  
  @js.native
  trait Transport extends StObject {
    
    def flush(): PromiseLike[Boolean] = js.native
    def flush(timeout: Double): PromiseLike[Boolean] = js.native
    
    def send(request: Envelope): PromiseLike[Unit] = js.native
  }
  
  trait TransportMakeRequestResponse extends StObject {
    
    var headers: js.UndefOr[Dictkey] = js.undefined
    
    var statusCode: js.UndefOr[Double] = js.undefined
  }
  object TransportMakeRequestResponse {
    
    inline def apply(): TransportMakeRequestResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransportMakeRequestResponse]
    }
    
    extension [Self <: TransportMakeRequestResponse](x: Self) {
      
      inline def setHeaders(value: Dictkey): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
      
      inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    }
  }
  
  trait TransportRequest extends StObject {
    
    var body: String | js.typedarray.Uint8Array
  }
  object TransportRequest {
    
    inline def apply(body: String | js.typedarray.Uint8Array): TransportRequest = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[TransportRequest]
    }
    
    extension [Self <: TransportRequest](x: Self) {
      
      inline def setBody(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    }
  }
  
  type TransportRequestExecutor = js.Function1[/* request */ TransportRequest, PromiseLike[TransportMakeRequestResponse]]
}
