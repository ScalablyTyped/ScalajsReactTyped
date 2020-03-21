package typingsJapgolly.awsLambda.apiGatewayAuthorizerMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer
import typingsJapgolly.awsLambda.awsLambdaStrings.REQUEST
import typingsJapgolly.awsLambda.awsLambdaStrings.TOKEN
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent
  - typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent
*/
trait APIGatewayAuthorizerEvent extends js.Object

object APIGatewayAuthorizerEvent {
  @scala.inline
  def APIGatewayTokenAuthorizerEvent(authorizationToken: String, methodArn: String, `type`: TOKEN): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(authorizationToken = authorizationToken.asInstanceOf[js.Any], methodArn = methodArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
  @scala.inline
  def APIGatewayRequestAuthorizerEvent(
    apiId: String,
    domainName: String,
    httpMethod: String,
    path: String,
    requestContext: APIGatewayEventRequestContextWithAuthorizer[js.UndefOr[scala.Nothing]],
    resource: String,
    `type`: REQUEST,
    headers: StringDictionary[String] = null,
    multiValueHeaders: StringDictionary[js.Array[String]] = null,
    multiValueQueryStringParameters: StringDictionary[js.Array[String]] = null,
    pathParameters: StringDictionary[String] = null,
    queryStringParameters: StringDictionary[String] = null,
    stageVariables: StringDictionary[String] = null
  ): APIGatewayAuthorizerEvent = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], requestContext = requestContext.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (multiValueHeaders != null) __obj.updateDynamic("multiValueHeaders")(multiValueHeaders.asInstanceOf[js.Any])
    if (multiValueQueryStringParameters != null) __obj.updateDynamic("multiValueQueryStringParameters")(multiValueQueryStringParameters.asInstanceOf[js.Any])
    if (pathParameters != null) __obj.updateDynamic("pathParameters")(pathParameters.asInstanceOf[js.Any])
    if (queryStringParameters != null) __obj.updateDynamic("queryStringParameters")(queryStringParameters.asInstanceOf[js.Any])
    if (stageVariables != null) __obj.updateDynamic("stageVariables")(stageVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerEvent]
  }
}

