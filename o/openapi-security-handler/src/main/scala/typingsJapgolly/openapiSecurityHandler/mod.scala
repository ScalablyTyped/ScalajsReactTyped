package typingsJapgolly.openapiSecurityHandler

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.openapiTypes.mod.OpenAPI.Request
import typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecurityDefinitionsObject
import typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecurityRequirementObject
import typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecuritySchemeObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("openapi-security-handler", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with OpenAPISecurityHandler {
    def this(args: OpenAPISecurityHandlerArgs) = this()
    
    /* CompleteClass */
    override def handle(request: Any): js.Promise[Unit] = js.native
    /* CompleteClass */
    override def handle(request: Request): js.Promise[Unit] = js.native
    
    /* private */ /* CompleteClass */
    var operationSecurity: Any = js.native
    
    /* private */ /* CompleteClass */
    var securitySets: Any = js.native
  }
  
  trait IOpenAPISecurityHandler extends StObject {
    
    def handle(request: Request): js.Promise[Unit]
  }
  object IOpenAPISecurityHandler {
    
    inline def apply(handle: Request => js.Promise[Unit]): IOpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
      __obj.asInstanceOf[IOpenAPISecurityHandler]
    }
    
    extension [Self <: IOpenAPISecurityHandler](x: Self) {
      
      inline def setHandle(value: Request => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
    }
  }
  
  trait OpenAPISecurityHandler
    extends StObject
       with IOpenAPISecurityHandler {
    
    def handle(request: Any): js.Promise[Unit]
    
    /* private */ var operationSecurity: Any
    
    /* private */ var securitySets: Any
  }
  object OpenAPISecurityHandler {
    
    inline def apply(handle: Any => js.Promise[Unit], operationSecurity: Any, securitySets: Any): OpenAPISecurityHandler = {
      val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle), operationSecurity = operationSecurity.asInstanceOf[js.Any], securitySets = securitySets.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISecurityHandler]
    }
    
    extension [Self <: OpenAPISecurityHandler](x: Self) {
      
      inline def setHandle(value: Any => js.Promise[Unit]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
      
      inline def setOperationSecurity(value: Any): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      inline def setSecuritySets(value: Any): Self = StObject.set(x, "securitySets", value.asInstanceOf[js.Any])
    }
  }
  
  trait OpenAPISecurityHandlerArgs extends StObject {
    
    var loggingKey: String
    
    var operationSecurity: js.Array[
        SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
      ]
    
    var securityDefinitions: SecurityDefinitionsObject | StringDictionary[SecuritySchemeObject]
    
    var securityHandlers: SecurityHandlers
  }
  object OpenAPISecurityHandlerArgs {
    
    inline def apply(
      loggingKey: String,
      operationSecurity: js.Array[
          SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
        ],
      securityDefinitions: SecurityDefinitionsObject | StringDictionary[SecuritySchemeObject],
      securityHandlers: SecurityHandlers
    ): OpenAPISecurityHandlerArgs = {
      val __obj = js.Dynamic.literal(loggingKey = loggingKey.asInstanceOf[js.Any], operationSecurity = operationSecurity.asInstanceOf[js.Any], securityDefinitions = securityDefinitions.asInstanceOf[js.Any], securityHandlers = securityHandlers.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenAPISecurityHandlerArgs]
    }
    
    extension [Self <: OpenAPISecurityHandlerArgs](x: Self) {
      
      inline def setLoggingKey(value: String): Self = StObject.set(x, "loggingKey", value.asInstanceOf[js.Any])
      
      inline def setOperationSecurity(
        value: js.Array[
              SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject
            ]
      ): Self = StObject.set(x, "operationSecurity", value.asInstanceOf[js.Any])
      
      inline def setOperationSecurityVarargs(
        value: (SecurityRequirementObject | typingsJapgolly.openapiTypes.mod.OpenAPIV3.SecurityRequirementObject)*
      ): Self = StObject.set(x, "operationSecurity", js.Array(value*))
      
      inline def setSecurityDefinitions(value: SecurityDefinitionsObject | StringDictionary[SecuritySchemeObject]): Self = StObject.set(x, "securityDefinitions", value.asInstanceOf[js.Any])
      
      inline def setSecurityHandlers(value: SecurityHandlers): Self = StObject.set(x, "securityHandlers", value.asInstanceOf[js.Any])
    }
  }
  
  type SecurityHandler = js.Function3[
    /* req */ Request, 
    /* scopes */ js.Array[SecurityScope], 
    /* definition */ typingsJapgolly.openapiTypes.mod.OpenAPIV2.SecuritySchemeObject | SecuritySchemeObject, 
    js.Promise[Boolean] | Boolean
  ]
  
  type SecurityHandlers = StringDictionary[SecurityHandler]
  
  type SecurityScope = String
}
