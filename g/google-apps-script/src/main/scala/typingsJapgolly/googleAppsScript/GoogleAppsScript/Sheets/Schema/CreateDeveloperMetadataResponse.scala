package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeveloperMetadataResponse extends js.Object {
  var developerMetadata: js.UndefOr[DeveloperMetadata] = js.undefined
}

object CreateDeveloperMetadataResponse {
  @scala.inline
  def apply(developerMetadata: DeveloperMetadata = null): CreateDeveloperMetadataResponse = {
    val __obj = js.Dynamic.literal()
    if (developerMetadata != null) __obj.updateDynamic("developerMetadata")(developerMetadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeveloperMetadataResponse]
  }
}

