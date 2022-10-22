package typingsJapgolly.xhrMock

import typingsJapgolly.xhrMock.libMockHeadersMod.MockHeaders
import typingsJapgolly.xhrMock.libMockRequestMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesMod {
  
  trait ErrorCallbackEvent extends StObject {
    
    var err: js.Error
    
    var req: default
  }
  object ErrorCallbackEvent {
    
    inline def apply(err: js.Error, req: default): ErrorCallbackEvent = {
      val __obj = js.Dynamic.literal(err = err.asInstanceOf[js.Any], req = req.asInstanceOf[js.Any])
      __obj.asInstanceOf[ErrorCallbackEvent]
    }
    
    extension [Self <: ErrorCallbackEvent](x: Self) {
      
      inline def setErr(value: js.Error): Self = StObject.set(x, "err", value.asInstanceOf[js.Any])
      
      inline def setReq(value: default): Self = StObject.set(x, "req", value.asInstanceOf[js.Any])
    }
  }
  
  type Mock = MockObject | MockFunction
  
  type MockFunction = js.Function2[
    /* request */ default, 
    /* response */ typingsJapgolly.xhrMock.libMockResponseMod.default, 
    js.UndefOr[
      typingsJapgolly.xhrMock.libMockResponseMod.default | js.Promise[js.UndefOr[typingsJapgolly.xhrMock.libMockResponseMod.default]]
    ]
  ]
  
  trait MockObject extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: js.UndefOr[MockHeaders] = js.undefined
    
    var reason: js.UndefOr[String] = js.undefined
    
    var status: js.UndefOr[Double] = js.undefined
  }
  object MockObject {
    
    inline def apply(): MockObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockObject]
    }
    
    extension [Self <: MockObject](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: MockHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
      
      inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
