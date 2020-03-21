package typingsJapgolly.awsLambda.lexMod

import typingsJapgolly.awsLambda.AnonContent
import typingsJapgolly.awsLambda.AnonContentType
import typingsJapgolly.awsLambda.awsLambdaStrings.Close
import typingsJapgolly.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsJapgolly.awsLambda.awsLambdaStrings.ElicitIntent
import typingsJapgolly.awsLambda.awsLambdaStrings.ElicitSlot
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LexDialogActionBase extends js.Object {
  var message: js.UndefOr[AnonContent] = js.undefined
  var responseCard: js.UndefOr[AnonContentType] = js.undefined
  var `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent
}

object LexDialogActionBase {
  @scala.inline
  def apply(
    `type`: Close | ElicitIntent | ElicitSlot | ConfirmIntent,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogActionBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogActionBase]
  }
}

