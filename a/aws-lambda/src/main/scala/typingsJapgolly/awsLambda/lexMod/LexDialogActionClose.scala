package typingsJapgolly.awsLambda.lexMod

import typingsJapgolly.awsLambda.AnonContent
import typingsJapgolly.awsLambda.AnonContentType
import typingsJapgolly.awsLambda.awsLambdaStrings.Close
import typingsJapgolly.awsLambda.awsLambdaStrings.Failed_
import typingsJapgolly.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionClose
  extends LexDialogActionBase
     with LexDialogAction {
  var fulfillmentState: Fulfilled | Failed_
  @JSName("type")
  var type_LexDialogActionClose: Close
}

object LexDialogActionClose {
  @scala.inline
  def apply(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogActionClose = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionClose]
  }
}

