package typingsJapgolly.awsLambda.apiGatewayAuthorizerMod

import typingsJapgolly.awsLambda.apiGatewayMod.APIGatewayAuthorizerResultContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait APIGatewayAuthorizerResult extends js.Object {
  var context: js.UndefOr[APIGatewayAuthorizerResultContext | Null] = js.undefined
  var policyDocument: PolicyDocument
  var principalId: String
  var usageIdentifierKey: js.UndefOr[String | Null] = js.undefined
}

object APIGatewayAuthorizerResult {
  @scala.inline
  def apply(
    policyDocument: PolicyDocument,
    principalId: String,
    context: APIGatewayAuthorizerResultContext = null,
    usageIdentifierKey: String = null
  ): APIGatewayAuthorizerResult = {
    val __obj = js.Dynamic.literal(policyDocument = policyDocument.asInstanceOf[js.Any], principalId = principalId.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (usageIdentifierKey != null) __obj.updateDynamic("usageIdentifierKey")(usageIdentifierKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[APIGatewayAuthorizerResult]
  }
}

