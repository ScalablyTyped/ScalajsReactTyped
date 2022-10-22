package typingsJapgolly.grpcGrpcJs.anon

import japgolly.scalajs.react.Callback
import typingsJapgolly.grpcGrpcJs.buildSrcCallStreamMod.StatusObject
import typingsJapgolly.grpcGrpcJs.buildSrcMetadataMod.Metadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@grpc/grpc-js.@grpc/grpc-js/build/src/call-stream.InterceptingListener> */
trait PartialInterceptingListen extends StObject {
  
  var onReceiveMessage: js.UndefOr[js.Function1[/* message */ scala.Any, Unit]] = js.undefined
  
  var onReceiveMetadata: js.UndefOr[js.Function1[/* metadata */ Metadata, Unit]] = js.undefined
  
  var onReceiveStatus: js.UndefOr[js.Function1[/* status */ StatusObject, Unit]] = js.undefined
}
object PartialInterceptingListen {
  
  inline def apply(): PartialInterceptingListen = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialInterceptingListen]
  }
  
  extension [Self <: PartialInterceptingListen](x: Self) {
    
    inline def setOnReceiveMessage(value: /* message */ scala.Any => Callback): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction1((t0: /* message */ scala.Any) => value(t0).runNow()))
    
    inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
    
    inline def setOnReceiveMetadata(value: /* metadata */ Metadata => Callback): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction1((t0: /* metadata */ Metadata) => value(t0).runNow()))
    
    inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
    
    inline def setOnReceiveStatus(value: /* status */ StatusObject => Callback): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction1((t0: /* status */ StatusObject) => value(t0).runNow()))
    
    inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
  }
}
