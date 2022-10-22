package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * HTTPGetAction describes an action based on HTTP Get requests.
  */
trait HTTPGetActionPatch extends StObject {
  
  /**
    * Host name to connect to, defaults to the pod IP. You probably want to set "Host" in httpHeaders instead.
    */
  var host: String
  
  /**
    * Custom headers to set in the request. HTTP allows repeated headers.
    */
  var httpHeaders: js.Array[HTTPHeaderPatch]
  
  /**
    * Path to access on the HTTP server.
    */
  var path: String
  
  /**
    * Name or number of the port to access on the container. Number must be in the range 1 to 65535. Name must be an IANA_SVC_NAME.
    */
  var port: Double | String
  
  /**
    * Scheme to use for connecting to the host. Defaults to HTTP.
    */
  var scheme: String
}
object HTTPGetActionPatch {
  
  inline def apply(
    host: String,
    httpHeaders: js.Array[HTTPHeaderPatch],
    path: String,
    port: Double | String,
    scheme: String
  ): HTTPGetActionPatch = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], httpHeaders = httpHeaders.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTTPGetActionPatch]
  }
  
  extension [Self <: HTTPGetActionPatch](x: Self) {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHttpHeaders(value: js.Array[HTTPHeaderPatch]): Self = StObject.set(x, "httpHeaders", value.asInstanceOf[js.Any])
    
    inline def setHttpHeadersVarargs(value: HTTPHeaderPatch*): Self = StObject.set(x, "httpHeaders", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double | String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
  }
}
