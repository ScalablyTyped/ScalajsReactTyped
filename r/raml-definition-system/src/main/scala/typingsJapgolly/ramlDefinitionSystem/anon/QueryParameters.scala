package typingsJapgolly.ramlDefinitionSystem.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameters extends StObject {
  
  var annotations: NameString
  
  var body: NameString
  
  var description: NameString
  
  var displayName: NameString
  
  var headers: NameString
  
  var is: NameString
  
  var name: NameString
  
  var parametrizedProperties: Domain
  
  var protocols: NameString
  
  var queryParameters: NameString
  
  var queryString: NameString
  
  var responses: NameString
  
  var securedBy: NameString
  
  var usage: NameString
}
object QueryParameters {
  
  inline def apply(
    annotations: NameString,
    body: NameString,
    description: NameString,
    displayName: NameString,
    headers: NameString,
    is: NameString,
    name: NameString,
    parametrizedProperties: Domain,
    protocols: NameString,
    queryParameters: NameString,
    queryString: NameString,
    responses: NameString,
    securedBy: NameString,
    usage: NameString
  ): QueryParameters = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], displayName = displayName.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parametrizedProperties = parametrizedProperties.asInstanceOf[js.Any], protocols = protocols.asInstanceOf[js.Any], queryParameters = queryParameters.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], responses = responses.asInstanceOf[js.Any], securedBy = securedBy.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameters]
  }
  
  extension [Self <: QueryParameters](x: Self) {
    
    inline def setAnnotations(value: NameString): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setBody(value: NameString): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NameString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDisplayName(value: NameString): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: NameString): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setIs(value: NameString): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
    
    inline def setName(value: NameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParametrizedProperties(value: Domain): Self = StObject.set(x, "parametrizedProperties", value.asInstanceOf[js.Any])
    
    inline def setProtocols(value: NameString): Self = StObject.set(x, "protocols", value.asInstanceOf[js.Any])
    
    inline def setQueryParameters(value: NameString): Self = StObject.set(x, "queryParameters", value.asInstanceOf[js.Any])
    
    inline def setQueryString(value: NameString): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
    
    inline def setResponses(value: NameString): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSecuredBy(value: NameString): Self = StObject.set(x, "securedBy", value.asInstanceOf[js.Any])
    
    inline def setUsage(value: NameString): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
