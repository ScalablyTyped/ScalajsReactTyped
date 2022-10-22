package typingsJapgolly.qIo

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.q.mod.Promise
import typingsJapgolly.qIo.Qio.Reader
import typingsJapgolly.qIo.Qio.Stream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object QioHTTP {
  
  type Application = js.Function1[/* req */ Request, Promise[Any]]
  
  type Body = Stream
  
  type Headers = StringDictionary[Any]
  
  trait Request extends StObject {
    
    var agent: Any
    
    var body: Any
    
    var headers: Headers
    
    var host: String
    
    var method: String
    
    var node: Any
    
    var path: String
    
    var pathInfo: String
    
    var port: Double
    
    var remoteHost: String
    
    var remotePort: Double
    
    var scheme: String
    
    var scriptName: String
    
    var url: String
    
    var version: js.Array[String]
  }
  object Request {
    
    inline def apply(
      agent: Any,
      body: Any,
      headers: Headers,
      host: String,
      method: String,
      node: Any,
      path: String,
      pathInfo: String,
      port: Double,
      remoteHost: String,
      remotePort: Double,
      scheme: String,
      scriptName: String,
      url: String,
      version: js.Array[String]
    ): Request = {
      val __obj = js.Dynamic.literal(agent = agent.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathInfo = pathInfo.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], remoteHost = remoteHost.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], scheme = scheme.asInstanceOf[js.Any], scriptName = scriptName.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[Request]
    }
    
    extension [Self <: Request](x: Self) {
      
      inline def setAgent(value: Any): Self = StObject.set(x, "agent", value.asInstanceOf[js.Any])
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathInfo(value: String): Self = StObject.set(x, "pathInfo", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setRemoteHost(value: String): Self = StObject.set(x, "remoteHost", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setScriptName(value: String): Self = StObject.set(x, "scriptName", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: js.Array[String]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionVarargs(value: String*): Self = StObject.set(x, "version", js.Array(value*))
    }
  }
  
  trait Response extends StObject {
    
    var body: Reader
    
    var headers: Headers
    
    var node: Any
    
    def onclose(): Unit
    
    var status: Double
  }
  object Response {
    
    inline def apply(body: Reader, headers: Headers, node: Any, onclose: Callback, status: Double): Response = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], onclose = onclose.toJsFn, status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Response]
    }
    
    extension [Self <: Response](x: Self) {
      
      inline def setBody(value: Reader): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setNode(value: Any): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
      
      inline def setOnclose(value: Callback): Self = StObject.set(x, "onclose", value.toJsFn)
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
}
