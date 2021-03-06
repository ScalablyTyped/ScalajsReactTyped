package typingsJapgolly.awsSdk.lexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntentResponse extends js.Object {
  /**
    * Checksum of the intent.
    */
  var checksum: js.UndefOr[String] = js.native
  /**
    * After the Lambda function specified in the fulfillmentActivity element fulfills the intent, Amazon Lex conveys this statement to the user.
    */
  var conclusionStatement: js.UndefOr[Statement] = js.native
  /**
    * If defined in the bot, Amazon Lex uses prompt to confirm the intent before fulfilling the user's request. For more information, see PutIntent. 
    */
  var confirmationPrompt: js.UndefOr[Prompt] = js.native
  /**
    * The date that the intent was created.
    */
  var createdDate: js.UndefOr[js.Date] = js.native
  /**
    * A description of the intent.
    */
  var description: js.UndefOr[Description] = js.native
  /**
    * If defined in the bot, Amazon Amazon Lex invokes this Lambda function for each user input. For more information, see PutIntent. 
    */
  var dialogCodeHook: js.UndefOr[CodeHook] = js.native
  /**
    * If defined in the bot, Amazon Lex uses this prompt to solicit additional user activity after the intent is fulfilled. For more information, see PutIntent.
    */
  var followUpPrompt: js.UndefOr[FollowUpPrompt] = js.native
  /**
    * Describes how the intent is fulfilled. For more information, see PutIntent. 
    */
  var fulfillmentActivity: js.UndefOr[FulfillmentActivity] = js.native
  /**
    * The date that the intent was updated. When you create a resource, the creation date and the last updated date are the same. 
    */
  var lastUpdatedDate: js.UndefOr[js.Date] = js.native
  /**
    * The name of the intent.
    */
  var name: js.UndefOr[IntentName] = js.native
  /**
    * A unique identifier for a built-in intent.
    */
  var parentIntentSignature: js.UndefOr[BuiltinIntentSignature] = js.native
  /**
    * If the user answers "no" to the question defined in confirmationPrompt, Amazon Lex responds with this statement to acknowledge that the intent was canceled. 
    */
  var rejectionStatement: js.UndefOr[Statement] = js.native
  /**
    * An array of sample utterances configured for the intent.
    */
  var sampleUtterances: js.UndefOr[IntentUtteranceList] = js.native
  /**
    * An array of intent slots configured for the intent.
    */
  var slots: js.UndefOr[SlotList] = js.native
  /**
    * The version of the intent.
    */
  var version: js.UndefOr[Version] = js.native
}

object GetIntentResponse {
  @scala.inline
  def apply(
    checksum: String = null,
    conclusionStatement: Statement = null,
    confirmationPrompt: Prompt = null,
    createdDate: js.Date = null,
    description: Description = null,
    dialogCodeHook: CodeHook = null,
    followUpPrompt: FollowUpPrompt = null,
    fulfillmentActivity: FulfillmentActivity = null,
    lastUpdatedDate: js.Date = null,
    name: IntentName = null,
    parentIntentSignature: BuiltinIntentSignature = null,
    rejectionStatement: Statement = null,
    sampleUtterances: IntentUtteranceList = null,
    slots: SlotList = null,
    version: Version = null
  ): GetIntentResponse = {
    val __obj = js.Dynamic.literal()
    if (checksum != null) __obj.updateDynamic("checksum")(checksum.asInstanceOf[js.Any])
    if (conclusionStatement != null) __obj.updateDynamic("conclusionStatement")(conclusionStatement.asInstanceOf[js.Any])
    if (confirmationPrompt != null) __obj.updateDynamic("confirmationPrompt")(confirmationPrompt.asInstanceOf[js.Any])
    if (createdDate != null) __obj.updateDynamic("createdDate")(createdDate.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (dialogCodeHook != null) __obj.updateDynamic("dialogCodeHook")(dialogCodeHook.asInstanceOf[js.Any])
    if (followUpPrompt != null) __obj.updateDynamic("followUpPrompt")(followUpPrompt.asInstanceOf[js.Any])
    if (fulfillmentActivity != null) __obj.updateDynamic("fulfillmentActivity")(fulfillmentActivity.asInstanceOf[js.Any])
    if (lastUpdatedDate != null) __obj.updateDynamic("lastUpdatedDate")(lastUpdatedDate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (parentIntentSignature != null) __obj.updateDynamic("parentIntentSignature")(parentIntentSignature.asInstanceOf[js.Any])
    if (rejectionStatement != null) __obj.updateDynamic("rejectionStatement")(rejectionStatement.asInstanceOf[js.Any])
    if (sampleUtterances != null) __obj.updateDynamic("sampleUtterances")(sampleUtterances.asInstanceOf[js.Any])
    if (slots != null) __obj.updateDynamic("slots")(slots.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentResponse]
  }
}

