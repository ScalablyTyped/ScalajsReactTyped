package typingsJapgolly.grpc.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Listener extends StObject {
  
  var onReceiveMessage: js.UndefOr[MessageListener] = js.undefined
  
  var onReceiveMetadata: js.UndefOr[MetadataListener] = js.undefined
  
  var onReceiveStatus: js.UndefOr[StatusListener] = js.undefined
}
object Listener {
  
  inline def apply(): Listener = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listener]
  }
  
  extension [Self <: Listener](x: Self) {
    
    inline def setOnReceiveMessage(value: (/* message */ Any, /* next */ js.Function) => Callback): Self = StObject.set(x, "onReceiveMessage", js.Any.fromFunction2((t0: /* message */ Any, t1: /* next */ js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnReceiveMessageUndefined: Self = StObject.set(x, "onReceiveMessage", js.undefined)
    
    inline def setOnReceiveMetadata(value: (/* metadata */ Metadata, /* next */ js.Function) => Callback): Self = StObject.set(x, "onReceiveMetadata", js.Any.fromFunction2((t0: /* metadata */ Metadata, t1: /* next */ js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnReceiveMetadataUndefined: Self = StObject.set(x, "onReceiveMetadata", js.undefined)
    
    inline def setOnReceiveStatus(value: (/* status */ StatusObject, /* next */ js.Function) => Callback): Self = StObject.set(x, "onReceiveStatus", js.Any.fromFunction2((t0: /* status */ StatusObject, t1: /* next */ js.Function) => (value(t0, t1)).runNow()))
    
    inline def setOnReceiveStatusUndefined: Self = StObject.set(x, "onReceiveStatus", js.undefined)
  }
}
