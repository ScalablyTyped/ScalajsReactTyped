package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for Intents.ListIntents.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ListIntentsResponse extends js.Object {
  /**
    * The list of agent intents. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var intents: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2Intent]] = js.native
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
}

object SchemaGoogleCloudDialogflowV2ListIntentsResponse {
  @scala.inline
  def apply(intents: js.Array[SchemaGoogleCloudDialogflowV2Intent] = null, nextPageToken: String = null): SchemaGoogleCloudDialogflowV2ListIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListIntentsResponse]
  }
}

