package typingsJapgolly.sarif.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebRequest extends StObject {
  
  /**
    * The body of the request.
    */
  var body: js.UndefOr[ArtifactContent] = js.undefined
  
  /**
    * The request headers.
    */
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * The index within the run.webRequests array of the request object associated with this result.
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The HTTP method. Well-known values are 'GET', 'PUT', 'POST', 'DELETE', 'PATCH', 'HEAD', 'OPTIONS', 'TRACE',
    * 'CONNECT'.
    */
  var method: js.UndefOr[String] = js.undefined
  
  /**
    * The request parameters.
    */
  var parameters: js.UndefOr[StringDictionary[String]] = js.undefined
  
  /**
    * Key/value pairs that provide additional information about the request.
    */
  var properties: js.UndefOr[PropertyBag] = js.undefined
  
  /**
    * The request protocol. Example: 'http'.
    */
  var protocol: js.UndefOr[String] = js.undefined
  
  /**
    * The target of the request.
    */
  var target: js.UndefOr[String] = js.undefined
  
  /**
    * The request version. Example: '1.1'.
    */
  var version: js.UndefOr[String] = js.undefined
}
object WebRequest {
  
  inline def apply(): WebRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WebRequest]
  }
  
  extension [Self <: WebRequest](x: Self) {
    
    inline def setBody(value: ArtifactContent): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setParameters(value: StringDictionary[String]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setProperties(value: PropertyBag): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
