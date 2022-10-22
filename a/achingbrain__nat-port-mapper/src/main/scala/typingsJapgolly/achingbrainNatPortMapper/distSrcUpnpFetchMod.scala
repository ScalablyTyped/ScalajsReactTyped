package typingsJapgolly.achingbrainNatPortMapper

import org.scalajs.dom.AbortSignal
import org.scalajs.dom.URL
import typingsJapgolly.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.GET
import typingsJapgolly.achingbrainNatPortMapper.achingbrainNatPortMapperStrings.POST
import typingsJapgolly.node.bufferMod.global.Buffer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcUpnpFetchMod {
  
  @JSImport("@achingbrain/nat-port-mapper/dist/src/upnp/fetch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchXML(url: URL, init: RequestInit): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchXML")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait RequestInit extends StObject {
    
    var body: Buffer | String
    
    var headers: Record[String, String]
    
    var method: POST | GET
    
    var signal: AbortSignal
  }
  object RequestInit {
    
    inline def apply(body: Buffer | String, headers: Record[String, String], method: POST | GET, signal: AbortSignal): RequestInit = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], signal = signal.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestInit]
    }
    
    extension [Self <: RequestInit](x: Self) {
      
      inline def setBody(value: Buffer | String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: POST | GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    }
  }
}
