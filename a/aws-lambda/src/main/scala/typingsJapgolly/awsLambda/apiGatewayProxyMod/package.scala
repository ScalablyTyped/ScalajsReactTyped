package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayProxyMod {
  type APIGatewayEvent = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent
  type APIGatewayProxyCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult]
  type APIGatewayProxyEvent = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayEventDefaultAuthorizerContext]
  type APIGatewayProxyHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEvent, 
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type APIGatewayProxyWithCognitoAuthorizerEvent = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyCognitoAuthorizer]
  type APIGatewayProxyWithCognitoAuthorizerHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithCognitoAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext] = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyEventBase[
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  type APIGatewayProxyWithLambdaAuthorizerEventRequestContext[TAuthorizerContext] = typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayEventRequestContextWithAuthorizer[
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayEventLambdaAuthorizerContext[TAuthorizerContext]
  ]
  type APIGatewayProxyWithLambdaAuthorizerHandler[TAuthorizerContext] = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyWithLambdaAuthorizerEvent[TAuthorizerContext], 
    typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
  ]
  type ProxyCallback = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyCallback
  type ProxyHandler = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyHandler
  type ProxyResult = typingsJapgolly.awsLambda.apiGatewayProxyMod.APIGatewayProxyResult
}
