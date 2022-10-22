package typingsJapgolly.swaggerTools

import typingsJapgolly.swaggerTools.mod.OperationParameter
import typingsJapgolly.swaggerTools.mod.Swagger20Operation
import typingsJapgolly.swaggerTools.mod.SwaggerRequestParameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Api extends StObject {
    
    var api: Any
    
    var apiDeclaration: Any
    
    var apiIndex: Double
    
    var authorizations: js.UndefOr[Any] = js.undefined
    
    var operation: js.UndefOr[Any] = js.undefined
    
    var operationPath: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: SwaggerRequestParameters
    
    var resourceIndex: Double
    
    var resourceListing: Any
    
    var swaggerVersion: String
    
    var useStubs: js.UndefOr[Boolean] = js.undefined
  }
  object Api {
    
    inline def apply(
      api: Any,
      apiDeclaration: Any,
      apiIndex: Double,
      params: SwaggerRequestParameters,
      resourceIndex: Double,
      resourceListing: Any,
      swaggerVersion: String
    ): Api = {
      val __obj = js.Dynamic.literal(api = api.asInstanceOf[js.Any], apiDeclaration = apiDeclaration.asInstanceOf[js.Any], apiIndex = apiIndex.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], resourceIndex = resourceIndex.asInstanceOf[js.Any], resourceListing = resourceListing.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Api]
    }
    
    extension [Self <: Api](x: Self) {
      
      inline def setApi(value: Any): Self = StObject.set(x, "api", value.asInstanceOf[js.Any])
      
      inline def setApiDeclaration(value: Any): Self = StObject.set(x, "apiDeclaration", value.asInstanceOf[js.Any])
      
      inline def setApiIndex(value: Double): Self = StObject.set(x, "apiIndex", value.asInstanceOf[js.Any])
      
      inline def setAuthorizations(value: Any): Self = StObject.set(x, "authorizations", value.asInstanceOf[js.Any])
      
      inline def setAuthorizationsUndefined: Self = StObject.set(x, "authorizations", js.undefined)
      
      inline def setOperation(value: Any): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationPath(value: js.Array[String]): Self = StObject.set(x, "operationPath", value.asInstanceOf[js.Any])
      
      inline def setOperationPathUndefined: Self = StObject.set(x, "operationPath", js.undefined)
      
      inline def setOperationPathVarargs(value: String*): Self = StObject.set(x, "operationPath", js.Array(value*))
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setParams(value: SwaggerRequestParameters): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setResourceIndex(value: Double): Self = StObject.set(x, "resourceIndex", value.asInstanceOf[js.Any])
      
      inline def setResourceListing(value: Any): Self = StObject.set(x, "resourceListing", value.asInstanceOf[js.Any])
      
      inline def setSwaggerVersion(value: String): Self = StObject.set(x, "swaggerVersion", value.asInstanceOf[js.Any])
      
      inline def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      inline def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
  
  trait ApiPath[P /* <: SwaggerRequestParameters */] extends StObject {
    
    var apiPath: String
    
    var operation: js.UndefOr[Swagger20Operation] = js.undefined
    
    var operationParameters: js.UndefOr[js.Array[OperationParameter]] = js.undefined
    
    var operationPath: js.UndefOr[js.Array[String]] = js.undefined
    
    var params: P
    
    var path: Any
    
    var security: js.Array[Any]
    
    var swaggerObject: Any
    
    var swaggerVersion: String
    
    var useStubs: js.UndefOr[Boolean] = js.undefined
  }
  object ApiPath {
    
    inline def apply[P /* <: SwaggerRequestParameters */](
      apiPath: String,
      params: P,
      path: Any,
      security: js.Array[Any],
      swaggerObject: Any,
      swaggerVersion: String
    ): ApiPath[P] = {
      val __obj = js.Dynamic.literal(apiPath = apiPath.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], security = security.asInstanceOf[js.Any], swaggerObject = swaggerObject.asInstanceOf[js.Any], swaggerVersion = swaggerVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiPath[P]]
    }
    
    extension [Self <: ApiPath[?], P /* <: SwaggerRequestParameters */](x: Self & ApiPath[P]) {
      
      inline def setApiPath(value: String): Self = StObject.set(x, "apiPath", value.asInstanceOf[js.Any])
      
      inline def setOperation(value: Swagger20Operation): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
      
      inline def setOperationParameters(value: js.Array[OperationParameter]): Self = StObject.set(x, "operationParameters", value.asInstanceOf[js.Any])
      
      inline def setOperationParametersUndefined: Self = StObject.set(x, "operationParameters", js.undefined)
      
      inline def setOperationParametersVarargs(value: OperationParameter*): Self = StObject.set(x, "operationParameters", js.Array(value*))
      
      inline def setOperationPath(value: js.Array[String]): Self = StObject.set(x, "operationPath", value.asInstanceOf[js.Any])
      
      inline def setOperationPathUndefined: Self = StObject.set(x, "operationPath", js.undefined)
      
      inline def setOperationPathVarargs(value: String*): Self = StObject.set(x, "operationPath", js.Array(value*))
      
      inline def setOperationUndefined: Self = StObject.set(x, "operation", js.undefined)
      
      inline def setParams(value: P): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Any): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSecurity(value: js.Array[Any]): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      inline def setSecurityVarargs(value: Any*): Self = StObject.set(x, "security", js.Array(value*))
      
      inline def setSwaggerObject(value: Any): Self = StObject.set(x, "swaggerObject", value.asInstanceOf[js.Any])
      
      inline def setSwaggerVersion(value: String): Self = StObject.set(x, "swaggerVersion", value.asInstanceOf[js.Any])
      
      inline def setUseStubs(value: Boolean): Self = StObject.set(x, "useStubs", value.asInstanceOf[js.Any])
      
      inline def setUseStubsUndefined: Self = StObject.set(x, "useStubs", js.undefined)
    }
  }
}
