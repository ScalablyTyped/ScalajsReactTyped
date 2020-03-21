package typingsJapgolly.googleapis.dialogflowV2Mod.dialogflowV2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The response message for SessionEntityTypes.ListSessionEntityTypes.
  */
@js.native
trait SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse extends js.Object {
  /**
    * Token to retrieve the next page of results, or empty if there are no more
    * results in the list.
    */
  var nextPageToken: js.UndefOr[String] = js.native
  /**
    * The list of session entity types. There will be a maximum number of items
    * returned based on the page_size field in the request.
    */
  var sessionEntityTypes: js.UndefOr[js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType]] = js.native
}

object SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse {
  @scala.inline
  def apply(
    nextPageToken: String = null,
    sessionEntityTypes: js.Array[SchemaGoogleCloudDialogflowV2SessionEntityType] = null
  ): SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    if (sessionEntityTypes != null) __obj.updateDynamic("sessionEntityTypes")(sessionEntityTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudDialogflowV2ListSessionEntityTypesResponse]
  }
}

