package typingsJapgolly.rsocketCore

import japgolly.scalajs.react.Callback
import typingsJapgolly.rsocketCore.rsocketframeMod.ErrorSource
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Frame
import typingsJapgolly.rsocketTypes.reactiveSocketTypesMod.Payload
import typingsJapgolly.rsocketTypes.reactiveStreamTypesMod.ISubscription
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait DataMimeType[D, M] extends StObject {
    
    var dataMimeType: String
    
    var keepAlive: Double
    
    var lifetime: Double
    
    var metadataMimeType: String
    
    var payload: js.UndefOr[Payload[D, M]] = js.undefined
  }
  object DataMimeType {
    
    inline def apply[D, M](dataMimeType: String, keepAlive: Double, lifetime: Double, metadataMimeType: String): DataMimeType[D, M] = {
      val __obj = js.Dynamic.literal(dataMimeType = dataMimeType.asInstanceOf[js.Any], keepAlive = keepAlive.asInstanceOf[js.Any], lifetime = lifetime.asInstanceOf[js.Any], metadataMimeType = metadataMimeType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataMimeType[D, M]]
    }
    
    extension [Self <: DataMimeType[?, ?], D, M](x: Self & (DataMimeType[D, M])) {
      
      inline def setDataMimeType(value: String): Self = StObject.set(x, "dataMimeType", value.asInstanceOf[js.Any])
      
      inline def setKeepAlive(value: Double): Self = StObject.set(x, "keepAlive", value.asInstanceOf[js.Any])
      
      inline def setLifetime(value: Double): Self = StObject.set(x, "lifetime", value.asInstanceOf[js.Any])
      
      inline def setMetadataMimeType(value: String): Self = StObject.set(x, "metadataMimeType", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Payload[D, M]): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
      
      inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    }
  }
  
  /* Inlined std.Error & {  source :rsocket-core.rsocket-core/RSocketFrame.ErrorSource} */
  trait ErrorsourceErrorSource extends StObject {
    
    /* standard es2022.error */
    var cause: js.UndefOr[Any] = js.undefined
    
    /* standard es5 */
    var message: String
    
    /* standard es5 */
    var name: String
    
    var source: ErrorSource
    
    /* standard es5 */
    var stack: js.UndefOr[String] = js.undefined
  }
  object ErrorsourceErrorSource {
    
    inline def apply(message: String, name: String, source: ErrorSource): ErrorsourceErrorSource = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorsourceErrorSource]
    }
    
    extension [Self <: ErrorsourceErrorSource](x: Self) {
      
      inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSource(value: ErrorSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    }
  }
  
  /* Inlined std.Partial<rsocket-types.rsocket-types.ISubscriber<rsocket-types.rsocket-types.Frame>> */
  trait PartialISubscriberFrame extends StObject {
    
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onError: js.UndefOr[js.Function1[/* error */ js.Error, Unit]] = js.undefined
    
    var onNext: js.UndefOr[js.Function1[/* value */ Frame, Unit]] = js.undefined
    
    var onSubscribe: js.UndefOr[js.Function1[/* subscription */ ISubscription, Unit]] = js.undefined
  }
  object PartialISubscriberFrame {
    
    inline def apply(): PartialISubscriberFrame = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialISubscriberFrame]
    }
    
    extension [Self <: PartialISubscriberFrame](x: Self) {
      
      inline def setOnComplete(value: Callback): Self = StObject.set(x, "onComplete", value.toJsFn)
      
      inline def setOnCompleteUndefined: Self = StObject.set(x, "onComplete", js.undefined)
      
      inline def setOnError(value: /* error */ js.Error => Callback): Self = StObject.set(x, "onError", js.Any.fromFunction1((t0: /* error */ js.Error) => value(t0).runNow()))
      
      inline def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      inline def setOnNext(value: /* value */ Frame => Callback): Self = StObject.set(x, "onNext", js.Any.fromFunction1((t0: /* value */ Frame) => value(t0).runNow()))
      
      inline def setOnNextUndefined: Self = StObject.set(x, "onNext", js.undefined)
      
      inline def setOnSubscribe(value: /* subscription */ ISubscription => Callback): Self = StObject.set(x, "onSubscribe", js.Any.fromFunction1((t0: /* subscription */ ISubscription) => value(t0).runNow()))
      
      inline def setOnSubscribeUndefined: Self = StObject.set(x, "onSubscribe", js.undefined)
    }
  }
}
