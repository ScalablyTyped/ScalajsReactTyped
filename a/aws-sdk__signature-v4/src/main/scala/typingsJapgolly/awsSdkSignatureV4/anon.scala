package typingsJapgolly.awsSdkSignatureV4

import typingsJapgolly.awsSdkTypes.distTypesHttpMod.HeaderBag
import typingsJapgolly.awsSdkTypes.distTypesHttpMod.QueryParameterBag
import typingsJapgolly.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @aws-sdk/types.@aws-sdk/types.HttpRequest & {  query :@aws-sdk/types.@aws-sdk/types.QueryParameterBag} */
  trait HttpRequestqueryQueryPara extends StObject {
    
    var body: js.UndefOr[Any] = js.undefined
    
    var headers: HeaderBag
    
    var hostname: String
    
    var method: String
    
    var path: String
    
    var port: js.UndefOr[Double] = js.undefined
    
    var protocol: String
    
    var query: js.UndefOr[QueryParameterBag] & QueryParameterBag
  }
  object HttpRequestqueryQueryPara {
    
    inline def apply(
      headers: HeaderBag,
      hostname: String,
      method: String,
      path: String,
      protocol: String,
      query: js.UndefOr[QueryParameterBag] & QueryParameterBag
    ): HttpRequestqueryQueryPara = {
      val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
      __obj.asInstanceOf[HttpRequestqueryQueryPara]
    }
    
    extension [Self <: HttpRequestqueryQueryPara](x: Self) {
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setHeaders(value: HeaderBag): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: js.UndefOr[QueryParameterBag] & QueryParameterBag): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnhoistableHeaders extends StObject {
    
    var unhoistableHeaders: js.UndefOr[Set[String]] = js.undefined
  }
  object UnhoistableHeaders {
    
    inline def apply(): UnhoistableHeaders = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnhoistableHeaders]
    }
    
    extension [Self <: UnhoistableHeaders](x: Self) {
      
      inline def setUnhoistableHeaders(value: Set[String]): Self = StObject.set(x, "unhoistableHeaders", value.asInstanceOf[js.Any])
      
      inline def setUnhoistableHeadersUndefined: Self = StObject.set(x, "unhoistableHeaders", js.undefined)
    }
  }
}
