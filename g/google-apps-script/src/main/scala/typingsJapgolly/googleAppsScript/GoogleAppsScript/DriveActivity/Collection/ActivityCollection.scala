package typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Collection

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest
import typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityCollection extends js.Object {
  // Query past activity in Google Drive.
  def query(resource: QueryDriveActivityRequest): QueryDriveActivityResponse
}

object ActivityCollection {
  @scala.inline
  def apply(query: QueryDriveActivityRequest => CallbackTo[QueryDriveActivityResponse]): ActivityCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(js.Any.fromFunction1((t0: typingsJapgolly.googleAppsScript.GoogleAppsScript.DriveActivity.Schema.QueryDriveActivityRequest) => query(t0).runNow()))
    __obj.asInstanceOf[ActivityCollection]
  }
}

