package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for a webhook call.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2WebhookResponse extends js.Object {
  /**
    * Optional. Makes the platform immediately invoke another `DetectIntent`
    * call internally with the specified event as input.
    */
  var followupEventInput: js.UndefOr[SchemaGoogleCloudDialogflowV2EventInput] = js.native
  /**
    * Optional. The collection of rich messages to present to the user. This
    * value is passed directly to `QueryResult.fulfillment_messages`.
    */
  var fulfillmentMessages: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2IntentMessage]] = js.native
  /**
    * Optional. The text to be shown on the screen. This value is passed
    * directly to `QueryResult.fulfillment_text`.
    */
  var fulfillmentText: js.UndefOr[String] = js.native
  /**
    * Optional. The collection of output contexts. This value is passed
    * directly to `QueryResult.output_contexts`.
    */
  var outputContexts: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Context]] = js.native
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_payload`.
    * See the related `fulfillment_messages[i].payload field`, which may be
    * used as an alternative to this field.  This field can be used for Actions
    * on Google responses. It should have a structure similar to the JSON
    * message shown here. For more information, see [Actions on Google Webhook
    * Format](https://developers.google.com/actions/dialogflow/webhook)
    * &lt;pre&gt;{   &quot;google&quot;: {     &quot;expectUserResponse&quot;:
    * true,     &quot;richResponse&quot;: {       &quot;items&quot;: [ {
    * &quot;simpleResponse&quot;: {             &quot;textToSpeech&quot;:
    * &quot;this is a simple response&quot;           }         }       ]     }
    * } }&lt;/pre&gt;
    */
  var payload: js.UndefOr[StringDictionary[js.Any]] = js.native
  /**
    * Optional. This value is passed directly to `QueryResult.webhook_source`.
    */
  var source: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2WebhookResponse {
  @scala.inline
  def apply(
    followupEventInput: SchemaGoogleCloudDialogflowV2EventInput = null,
    fulfillmentMessages: js.Array[SchemaGoogleCloudDialogflowV2IntentMessage] = null,
    fulfillmentText: String = null,
    outputContexts: js.Array[SchemaGoogleCloudDialogflowV2Context] = null,
    payload: StringDictionary[js.Any] = null,
    source: String = null
  ): SchemaGoogleCloudDialogflowV2WebhookResponse = {
    val __obj = js.Dynamic.literal()
    if (followupEventInput != null) __obj.updateDynamic("followupEventInput")(followupEventInput.asInstanceOf[js.Any])
    if (fulfillmentMessages != null) __obj.updateDynamic("fulfillmentMessages")(fulfillmentMessages.asInstanceOf[js.Any])
    if (fulfillmentText != null) __obj.updateDynamic("fulfillmentText")(fulfillmentText.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2WebhookResponse]
  }
}

