package typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod

import typingsJapgolly.awsLambda.commonApiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
  - typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
*/
trait APIGatewayAuthorizerEvent extends StObject
object APIGatewayAuthorizerEvent {
  
  inline def APIGatewayRequestAuthorizerEvent(
    httpMethod: String,
    methodArn: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[Unit],
    resource: String
  ): typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent = {
    val __obj = js.Dynamic.literal(httpMethod = httpMethod.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], headers = null, multiValueHeaders = null, multiValueQueryStringParameters = null, pathParameters = null, queryStringParameters = null, stageVariables = null)
    __obj.updateDynamic("type")("REQUEST")
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent]
  }
  
  inline def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String): typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("TOKEN")
    __obj.asInstanceOf[typingsJapgolly.awsLambda.triggerApiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent]
  }
}
