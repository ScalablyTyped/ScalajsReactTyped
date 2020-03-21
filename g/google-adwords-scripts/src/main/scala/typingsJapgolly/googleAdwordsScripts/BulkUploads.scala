package typingsJapgolly.googleAdwordsScripts

import typingsJapgolly.googleAppsScript.GoogleAppsScript.Base.Blob
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Drive.File
import typingsJapgolly.googleAppsScript.GoogleAppsScript.Spreadsheet.Sheet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Bulk Uploads
@js.native
trait BulkUploads extends js.Object {
  def newCsvUpload(columnNames: js.Array[String], optArgs: FileUploadArguments): CsvUpload = js.native
  def newFileUpload(file: Blob, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: File, optArgs: FileUploadArguments): FileUpload = js.native
  def newFileUpload(file: Sheet, optArgs: FileUploadArguments): FileUpload = js.native
}

