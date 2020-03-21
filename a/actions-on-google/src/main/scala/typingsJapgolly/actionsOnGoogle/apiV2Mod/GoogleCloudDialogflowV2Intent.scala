package typingsJapgolly.actionsOnGoogle.apiV2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GoogleCloudDialogflowV2Intent extends js.Object {
  var action: js.UndefOr[String] = js.undefined
  var defaultResponsePlatforms: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var events: js.UndefOr[js.Array[String]] = js.undefined
  var followupIntentInfo: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo]] = js.undefined
  var inputContextNames: js.UndefOr[js.Array[String]] = js.undefined
  var isFallback: js.UndefOr[Boolean] = js.undefined
  var messages: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentMessage]] = js.undefined
  var mlDisabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var outputContexts: js.UndefOr[js.Array[GoogleCloudDialogflowV2Context]] = js.undefined
  var parameters: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentParameter]] = js.undefined
  var parentFollowupIntentName: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var resetContexts: js.UndefOr[Boolean] = js.undefined
  var rootFollowupIntentName: js.UndefOr[String] = js.undefined
  var trainingPhrases: js.UndefOr[js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase]] = js.undefined
  var webhookState: js.UndefOr[GoogleCloudDialogflowV2IntentWebhookState] = js.undefined
}

object GoogleCloudDialogflowV2Intent {
  @scala.inline
  def apply(
    action: String = null,
    defaultResponsePlatforms: js.Array[GoogleCloudDialogflowV2IntentDefaultResponsePlatforms] = null,
    displayName: String = null,
    events: js.Array[String] = null,
    followupIntentInfo: js.Array[GoogleCloudDialogflowV2IntentFollowupIntentInfo] = null,
    inputContextNames: js.Array[String] = null,
    isFallback: js.UndefOr[Boolean] = js.undefined,
    messages: js.Array[GoogleCloudDialogflowV2IntentMessage] = null,
    mlDisabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    outputContexts: js.Array[GoogleCloudDialogflowV2Context] = null,
    parameters: js.Array[GoogleCloudDialogflowV2IntentParameter] = null,
    parentFollowupIntentName: String = null,
    priority: Int | Double = null,
    resetContexts: js.UndefOr[Boolean] = js.undefined,
    rootFollowupIntentName: String = null,
    trainingPhrases: js.Array[GoogleCloudDialogflowV2IntentTrainingPhrase] = null,
    webhookState: GoogleCloudDialogflowV2IntentWebhookState = null
  ): GoogleCloudDialogflowV2Intent = {
    val __obj = js.Dynamic.literal()
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (defaultResponsePlatforms != null) __obj.updateDynamic("defaultResponsePlatforms")(defaultResponsePlatforms.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (followupIntentInfo != null) __obj.updateDynamic("followupIntentInfo")(followupIntentInfo.asInstanceOf[js.Any])
    if (inputContextNames != null) __obj.updateDynamic("inputContextNames")(inputContextNames.asInstanceOf[js.Any])
    if (!js.isUndefined(isFallback)) __obj.updateDynamic("isFallback")(isFallback.asInstanceOf[js.Any])
    if (messages != null) __obj.updateDynamic("messages")(messages.asInstanceOf[js.Any])
    if (!js.isUndefined(mlDisabled)) __obj.updateDynamic("mlDisabled")(mlDisabled.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (outputContexts != null) __obj.updateDynamic("outputContexts")(outputContexts.asInstanceOf[js.Any])
    if (parameters != null) __obj.updateDynamic("parameters")(parameters.asInstanceOf[js.Any])
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (!js.isUndefined(resetContexts)) __obj.updateDynamic("resetContexts")(resetContexts.asInstanceOf[js.Any])
    if (rootFollowupIntentName != null) __obj.updateDynamic("rootFollowupIntentName")(rootFollowupIntentName.asInstanceOf[js.Any])
    if (trainingPhrases != null) __obj.updateDynamic("trainingPhrases")(trainingPhrases.asInstanceOf[js.Any])
    if (webhookState != null) __obj.updateDynamic("webhookState")(webhookState.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleCloudDialogflowV2Intent]
  }
}

