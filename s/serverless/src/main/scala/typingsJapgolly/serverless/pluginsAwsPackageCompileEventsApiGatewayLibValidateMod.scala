package typingsJapgolly.serverless

import typingsJapgolly.serverless.anon.Authorizer
import typingsJapgolly.serverless.anon.Http
import typingsJapgolly.serverless.anon.Method
import typingsJapgolly.serverless.anon.MethodString
import typingsJapgolly.serverless.anon.Path
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pluginsAwsPackageCompileEventsApiGatewayLibValidateMod {
  
  @JSImport("serverless/plugins/aws/package/compile/events/apiGateway/lib/validate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getHttp[T /* <: js.Object */](event: Http[T], functionName: String): Method | T = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttp")(event.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[Method | T]
  
  inline def getHttpMethod(http: MethodString, functionName: String): HttpMethod = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpMethod")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[HttpMethod]
  
  inline def getHttpPath(http: Path, functionName: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getHttpPath")(http.asInstanceOf[js.Any], functionName.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait ApiGatewayEvent extends StObject {
    
    var http: String | Authorizer
  }
  object ApiGatewayEvent {
    
    inline def apply(http: String | Authorizer): ApiGatewayEvent = {
      val __obj = js.Dynamic.literal(http = http.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApiGatewayEvent]
    }
    
    extension [Self <: ApiGatewayEvent](x: Self) {
      
      inline def setHttp(value: String | Authorizer): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.serverless.serverlessStrings.get
    - typingsJapgolly.serverless.serverlessStrings.post
    - typingsJapgolly.serverless.serverlessStrings.put
    - typingsJapgolly.serverless.serverlessStrings.patch
    - typingsJapgolly.serverless.serverlessStrings.options
    - typingsJapgolly.serverless.serverlessStrings.head
    - typingsJapgolly.serverless.serverlessStrings.delete
    - typingsJapgolly.serverless.serverlessStrings.any
  */
  trait HttpMethod extends StObject
  object HttpMethod {
    
    inline def any: typingsJapgolly.serverless.serverlessStrings.any = "any".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.any]
    
    inline def delete: typingsJapgolly.serverless.serverlessStrings.delete = "delete".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.delete]
    
    inline def get: typingsJapgolly.serverless.serverlessStrings.get = "get".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.get]
    
    inline def head: typingsJapgolly.serverless.serverlessStrings.head = "head".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.head]
    
    inline def options: typingsJapgolly.serverless.serverlessStrings.options = "options".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.options]
    
    inline def patch: typingsJapgolly.serverless.serverlessStrings.patch = "patch".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.patch]
    
    inline def post: typingsJapgolly.serverless.serverlessStrings.post = "post".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.post]
    
    inline def put: typingsJapgolly.serverless.serverlessStrings.put = "put".asInstanceOf[typingsJapgolly.serverless.serverlessStrings.put]
  }
}
