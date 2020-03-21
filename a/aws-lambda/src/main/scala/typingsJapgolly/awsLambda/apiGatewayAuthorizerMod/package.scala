package typingsJapgolly.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object apiGatewayAuthorizerMod {
  type APIGatewayAuthorizerCallback = typingsJapgolly.awsLambda.handlerMod.Callback[typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult]
  type APIGatewayAuthorizerHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayAuthorizerWithContextCallback[TAuthorizerContext /* <: typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsJapgolly.awsLambda.handlerMod.Callback[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayRequestAuthorizerHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayRequestAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayRequestAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type APIGatewayTokenAuthorizerHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type APIGatewayTokenAuthorizerWithContextHandler[TAuthorizerContext /* <: typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext */] = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayTokenAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerWithContextResult[TAuthorizerContext]
  ]
  type AuthResponse = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type AuthResponseContext = typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.Condition | js.Array[typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.Condition]
  ]
  type CustomAuthorizerCallback = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerCallback
  type CustomAuthorizerHandler = typingsJapgolly.awsLambda.handlerMod.Handler[
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.CustomAuthorizerEvent, 
    typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  ]
  type CustomAuthorizerResult = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.APIGatewayAuthorizerResult
  type PrincipalValue = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type Statement = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.BaseStatement with typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.StatementAction with (typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.StatementResource | typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.StatementPrincipal)
  type StatementPrincipal = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.MaybeStatementResource with (typingsJapgolly.awsLambda.AnonPrincipal | typingsJapgolly.awsLambda.AnonNotPrincipal)
  type StatementResource = typingsJapgolly.awsLambda.apiGatewayAuthorizerMod.MaybeStatementPrincipal with (typingsJapgolly.awsLambda.AnonResource | typingsJapgolly.awsLambda.AnonNotResource)
}
