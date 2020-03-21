package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a single followup intent in the chain.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo extends js.Object {
  /**
    * The unique identifier of the followup intent. Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var followupIntentName: js.UndefOr[String] = js.native
  /**
    * The unique identifier of the followup intent&#39;s parent. Format:
    * `projects/&lt;Project ID&gt;/agent/intents/&lt;Intent ID&gt;`.
    */
  var parentFollowupIntentName: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo {
  @scala.inline
  def apply(followupIntentName: String = null, parentFollowupIntentName: String = null): SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo = {
    val __obj = js.Dynamic.literal()
    if (followupIntentName != null) __obj.updateDynamic("followupIntentName")(followupIntentName.asInstanceOf[js.Any])
    if (parentFollowupIntentName != null) __obj.updateDynamic("parentFollowupIntentName")(parentFollowupIntentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2IntentFollowupIntentInfo]
  }
}

