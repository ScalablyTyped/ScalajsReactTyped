package typingsJapgolly.elasticApmNode.mod.AwsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CognitoIdentity extends js.Object {
  var cognitoIdentityId: String
  var cognitoIdentityPoolId: String
}

object CognitoIdentity {
  @scala.inline
  def apply(cognitoIdentityId: String, cognitoIdentityPoolId: String): CognitoIdentity = {
    val __obj = js.Dynamic.literal(cognitoIdentityId = cognitoIdentityId.asInstanceOf[js.Any], cognitoIdentityPoolId = cognitoIdentityPoolId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CognitoIdentity]
  }
}

