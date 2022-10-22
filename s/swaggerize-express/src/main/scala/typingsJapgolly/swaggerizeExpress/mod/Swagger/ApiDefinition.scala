package typingsJapgolly.swaggerizeExpress.mod.Swagger

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiDefinition extends StObject {
  
  var basePath: js.UndefOr[String] = js.undefined
  
  var consumes: js.UndefOr[MimeTypes] = js.undefined
  
  var definitions: js.UndefOr[DefinitionsObject] = js.undefined
  
  var externalDocs: js.UndefOr[ExternalDocumentationObject] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var info: InfoObject
  
  var parameters: js.UndefOr[ParametersDefinitionsObject] = js.undefined
  
  var paths: PathsObject
  
  var produces: js.UndefOr[MimeTypes] = js.undefined
  
  var responses: js.UndefOr[ResponsesDefinitionsObject] = js.undefined
  
  var schemes: js.UndefOr[js.Array[String]] = js.undefined
  
  var security: js.UndefOr[js.Array[SecurityRequirementObject]] = js.undefined
  
  var securityDefinitions: js.UndefOr[SecurityDefinitionsObject] = js.undefined
  
  var swagger: String
  
  var tags: js.UndefOr[js.Array[TagObject]] = js.undefined
}
object ApiDefinition {
  
  inline def apply(info: InfoObject, paths: PathsObject, swagger: String): ApiDefinition = {
    val __obj = js.Dynamic.literal(info = info.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], swagger = swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiDefinition]
  }
  
  extension [Self <: ApiDefinition](x: Self) {
    
    inline def setBasePath(value: String): Self = StObject.set(x, "basePath", value.asInstanceOf[js.Any])
    
    inline def setBasePathUndefined: Self = StObject.set(x, "basePath", js.undefined)
    
    inline def setConsumes(value: MimeTypes): Self = StObject.set(x, "consumes", value.asInstanceOf[js.Any])
    
    inline def setConsumesUndefined: Self = StObject.set(x, "consumes", js.undefined)
    
    inline def setConsumesVarargs(value: String*): Self = StObject.set(x, "consumes", js.Array(value*))
    
    inline def setDefinitions(value: DefinitionsObject): Self = StObject.set(x, "definitions", value.asInstanceOf[js.Any])
    
    inline def setDefinitionsUndefined: Self = StObject.set(x, "definitions", js.undefined)
    
    inline def setExternalDocs(value: ExternalDocumentationObject): Self = StObject.set(x, "externalDocs", value.asInstanceOf[js.Any])
    
    inline def setExternalDocsUndefined: Self = StObject.set(x, "externalDocs", js.undefined)
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    inline def setInfo(value: InfoObject): Self = StObject.set(x, "info", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: ParametersDefinitionsObject): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
    
    inline def setPaths(value: PathsObject): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setProduces(value: MimeTypes): Self = StObject.set(x, "produces", value.asInstanceOf[js.Any])
    
    inline def setProducesUndefined: Self = StObject.set(x, "produces", js.undefined)
    
    inline def setProducesVarargs(value: String*): Self = StObject.set(x, "produces", js.Array(value*))
    
    inline def setResponses(value: ResponsesDefinitionsObject): Self = StObject.set(x, "responses", value.asInstanceOf[js.Any])
    
    inline def setResponsesUndefined: Self = StObject.set(x, "responses", js.undefined)
    
    inline def setSchemes(value: js.Array[String]): Self = StObject.set(x, "schemes", value.asInstanceOf[js.Any])
    
    inline def setSchemesUndefined: Self = StObject.set(x, "schemes", js.undefined)
    
    inline def setSchemesVarargs(value: String*): Self = StObject.set(x, "schemes", js.Array(value*))
    
    inline def setSecurity(value: js.Array[SecurityRequirementObject]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
    
    inline def setSecurityDefinitions(value: SecurityDefinitionsObject): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
    
    inline def setSecurityDefinitionsUndefined: Self = StObject.set(x, "securityDefinitions", js.undefined)
    
    inline def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
    
    inline def setSecurityVarargs(value: SecurityRequirementObject*): Self = StObject.set(x, "security", js.Array(value*))
    
    inline def setSwagger(value: String): Self = StObject.set(x, "swagger", value.asInstanceOf[js.Any])
    
    inline def setTags(value: js.Array[TagObject]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: TagObject*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
