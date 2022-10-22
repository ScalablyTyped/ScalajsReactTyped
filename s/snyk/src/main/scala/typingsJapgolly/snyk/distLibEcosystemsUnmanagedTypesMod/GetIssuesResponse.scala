package typingsJapgolly.snyk.distLibEcosystemsUnmanagedTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIssuesResponse extends StObject {
  
  var data: IssuesResponseData
  
  var jsonapi: JsonApi
  
  var links: Links
}
object GetIssuesResponse {
  
  inline def apply(data: IssuesResponseData, jsonapi: JsonApi, links: Links): GetIssuesResponse = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], jsonapi = jsonapi.asInstanceOf[js.Any], links = links.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIssuesResponse]
  }
  
  extension [Self <: GetIssuesResponse](x: Self) {
    
    inline def setData(value: IssuesResponseData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setJsonapi(value: JsonApi): Self = StObject.set(x, "jsonapi", value.asInstanceOf[js.Any])
    
    inline def setLinks(value: Links): Self = StObject.set(x, "links", value.asInstanceOf[js.Any])
  }
}
