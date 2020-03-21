package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ChangeLog
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.ChangeLogsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChangeLogsCollection extends js.Object {
  // Gets one change log by ID.
  def get(profileId: String, id: String): ChangeLog = js.native
  // Retrieves a list of change logs. This method supports paging.
  def list(profileId: String): ChangeLogsListResponse = js.native
  // Retrieves a list of change logs. This method supports paging.
  def list(profileId: String, optionalArgs: js.Object): ChangeLogsListResponse = js.native
}

