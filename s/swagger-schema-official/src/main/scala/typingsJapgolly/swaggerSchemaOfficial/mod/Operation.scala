package typingsJapgolly.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Operation extends StObject {
  
  var consumes: js.UndefOr[js.Array[String]] = js.undefined
  
  var deprecated: js.UndefOr[Boolean] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocs] = js.undefined
  
  var operationId: js.UndefOr[String] = js.undefined
  
  var parameters: js.UndefOr[js.Array[Parameter | Reference]] = js.undefined
  
  var produces: js.UndefOr[js.Array[String]] = js.undefined
  
  var responses: StringDictionary[Response | Reference]
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var security: js.UndefOr[js.Array[StringDictionary[js.Array[String]]]] = js.undefined
  
  var summary: js.UndefOr[String] = js.undefined
  
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object Operation {
  
  inline def apply(responses: StringDictionary[Response | Reference]): Operation = {
    val __obj = js.Dynamic.literal(responses = responses.asInstanceOf[js.Any])
    __obj.asInstanceOf[Operation]
  }
  
  extension [Self <: Operation](x: Self) {
    
    inline def setConsumes(value: js.Array[String]): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    inline def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
    
    inline def setDeprecated(value: Boolean): Self = StObject.set(x, "deprecated", value.asInstanceOf[js.Any])
    
    inline def setDeprecatedUndefined: Self = StObject.set(x, "deprecated", js.undefined)
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocs): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setOperationId(value: String): Self = StObject.set(x, "operationId", value.asInstanceOf[js.Any])
    
    inline def setOperationIdUndefined: Self = StObject.set(x, "operationId", js.undefined)
    
    inline def setParameters(value: js.Array[Parameter | Reference]): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setParametersVarargs(value: (Parameter | Reference)*): Self = StObject.set(x, "parameters", js.Array(value*))
    
    inline def setProduces(value: js.Array[String]): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    inline def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    inline def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value*))
    
    inline def setResponses(value: StringDictionary[Response | Reference]): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    
    inline def setSecurity(value: js.Array[StringDictionary[js.Array[String]]]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: StringDictionary[js.Array[String]]*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
