package typingsJapgolly.awsLambda.lexMod

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.awsLambda.AnonContent
import typingsJapgolly.awsLambda.AnonContentType
import typingsJapgolly.awsLambda.awsLambdaStrings.Close
import typingsJapgolly.awsLambda.awsLambdaStrings.ConfirmIntent
import typingsJapgolly.awsLambda.awsLambdaStrings.Delegate
import typingsJapgolly.awsLambda.awsLambdaStrings.ElicitIntent
import typingsJapgolly.awsLambda.awsLambdaStrings.ElicitSlot
import typingsJapgolly.awsLambda.awsLambdaStrings.Failed_
import typingsJapgolly.awsLambda.awsLambdaStrings.Fulfilled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.awsLambda.lexMod.LexDialogActionClose
  - typingsJapgolly.awsLambda.lexMod.LexDialogActionElicitIntent
  - typingsJapgolly.awsLambda.lexMod.LexDialogActionElicitSlot
  - typingsJapgolly.awsLambda.lexMod.LexDialogActionConfirmIntent
  - typingsJapgolly.awsLambda.lexMod.LexDialogActionDelegate
*/
trait LexDialogAction extends js.Object

object LexDialogAction {
  @scala.inline
  def LexDialogActionElicitIntent(`type`: ElicitIntent, message: AnonContent = null, responseCard: AnonContentType = null): LexDialogAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionClose(
    fulfillmentState: Fulfilled | Failed_,
    `type`: Close,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(fulfillmentState = fulfillmentState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionConfirmIntent(
    intentName: String,
    slots: StringDictionary[String | Null],
    `type`: ConfirmIntent,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionDelegate(slots: StringDictionary[String | Null], `type`: Delegate): LexDialogAction = {
    val __obj = js.Dynamic.literal(slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
  @scala.inline
  def LexDialogActionElicitSlot(
    intentName: String,
    slotToElicit: String,
    slots: StringDictionary[String | Null],
    `type`: ElicitSlot,
    message: AnonContent = null,
    responseCard: AnonContentType = null
  ): LexDialogAction = {
    val __obj = js.Dynamic.literal(intentName = intentName.asInstanceOf[js.Any], slotToElicit = slotToElicit.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (message != null) __obj.updateDynamic("message")(message.asInstanceOf[js.Any])
    if (responseCard != null) __obj.updateDynamic("responseCard")(responseCard.asInstanceOf[js.Any])
    __obj.asInstanceOf[LexDialogAction]
  }
}

