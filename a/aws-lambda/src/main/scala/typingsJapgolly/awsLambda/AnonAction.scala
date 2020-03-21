package typingsJapgolly.awsLambda

import typingsJapgolly.awsLambda.awsLambdaStrings.`read-only`
import typingsJapgolly.awsLambda.awsLambdaStrings.base64
import typingsJapgolly.awsLambda.awsLambdaStrings.replace
import typingsJapgolly.awsLambda.awsLambdaStrings.text_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAction extends js.Object {
  var action: `read-only` | replace
  var data: String
  var encoding: base64 | text_
  val inputTruncated: Boolean
}

object AnonAction {
  @scala.inline
  def apply(action: `read-only` | replace, data: String, encoding: base64 | text_, inputTruncated: Boolean): AnonAction = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], inputTruncated = inputTruncated.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAction]
  }
}

