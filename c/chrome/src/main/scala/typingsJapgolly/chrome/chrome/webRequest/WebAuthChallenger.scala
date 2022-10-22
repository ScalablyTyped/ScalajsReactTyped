package typingsJapgolly.chrome.chrome.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebAuthChallenger extends StObject {
  
  var host: String
  
  var port: Double
}
object WebAuthChallenger {
  
  inline def apply(host: String, port: Double): WebAuthChallenger = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAuthChallenger]
  }
  
  extension [Self <: WebAuthChallenger](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
  }
}
