package typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Collection.Reports

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.File
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.FileList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FilesCollection extends js.Object {
  // Retrieves a report file. This method supports media download.
  def get(profileId: String, reportId: String, fileId: String): File = js.native
  // Lists files for a report.
  def list(profileId: String, reportId: String): FileList = js.native
  // Lists files for a report.
  def list(profileId: String, reportId: String, optionalArgs: js.Object): FileList = js.native
}

