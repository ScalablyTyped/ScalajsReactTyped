package typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Collection.Spreadsheets

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.DeveloperMetadata
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeveloperMetadataCollection extends js.Object {
  // Returns the developer metadata with the specified ID.
  // The caller must specify the spreadsheet ID and the developer metadata's
  // unique metadataId.
  def get(spreadsheetId: String, metadataId: Double): DeveloperMetadata
  // Returns all developer metadata matching the specified DataFilter.
  // If the provided DataFilter represents a DeveloperMetadataLookup object,
  // this will return all DeveloperMetadata entries selected by it. If the
  // DataFilter represents a location in a spreadsheet, this will return all
  // developer metadata associated with locations intersecting that region.
  def search(resource: SearchDeveloperMetadataRequest, spreadsheetId: String): SearchDeveloperMetadataResponse
}

object DeveloperMetadataCollection {
  @scala.inline
  def apply(
    get: (String, Double) => CallbackTo[DeveloperMetadata],
    search: (SearchDeveloperMetadataRequest, String) => CallbackTo[SearchDeveloperMetadataResponse]
  ): DeveloperMetadataCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("get")(js.Any.fromFunction2((t0: java.lang.String, t1: scala.Double) => get(t0, t1).runNow()))
    __obj.updateDynamic("search")(js.Any.fromFunction2((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.Sheets.Schema.SearchDeveloperMetadataRequest, t1: java.lang.String) => search(t0, t1).runNow()))
    __obj.asInstanceOf[DeveloperMetadataCollection]
  }
}

