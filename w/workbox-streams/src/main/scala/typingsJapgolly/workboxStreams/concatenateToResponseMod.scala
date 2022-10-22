package typingsJapgolly.workboxStreams

import org.scalajs.dom.Response
import typingsJapgolly.std.HeadersInit
import typingsJapgolly.workboxStreams.typesStreamSourceMod.StreamSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object concatenateToResponseMod {
  
  @JSImport("workbox-streams/concatenateToResponse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]]): ConcatenateToResponseReturn = ^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any]).asInstanceOf[ConcatenateToResponseReturn]
  inline def concatenateToResponse(sourcePromises: js.Array[js.Promise[StreamSource]], headersInit: HeadersInit): ConcatenateToResponseReturn = (^.asInstanceOf[js.Dynamic].applyDynamic("concatenateToResponse")(sourcePromises.asInstanceOf[js.Any], headersInit.asInstanceOf[js.Any])).asInstanceOf[ConcatenateToResponseReturn]
  
  trait ConcatenateToResponseReturn extends StObject {
    
    var done: js.Promise[Unit]
    
    var response: Response
  }
  object ConcatenateToResponseReturn {
    
    inline def apply(done: js.Promise[Unit], response: Response): ConcatenateToResponseReturn = {
      val __obj = js.Dynamic.literal(done = done.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatenateToResponseReturn]
    }
    
    extension [Self <: ConcatenateToResponseReturn](x: Self) {
      
      inline def setDone(value: js.Promise[Unit]): Self = StObject.set(x, "done", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: Response): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
}
