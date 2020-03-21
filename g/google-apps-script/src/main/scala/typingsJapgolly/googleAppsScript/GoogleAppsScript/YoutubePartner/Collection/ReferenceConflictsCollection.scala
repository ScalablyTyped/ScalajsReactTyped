package typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Collection

import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ReferenceConflict
import typingsJapgolly.googleAppsScript.GoogleAppsScript.YoutubePartner.Schema.ReferenceConflictListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReferenceConflictsCollection extends js.Object {
  // Retrieves information about the specified reference conflict.
  def get(referenceConflictId: String): ReferenceConflict = js.native
  // Retrieves information about the specified reference conflict.
  def get(referenceConflictId: String, optionalArgs: js.Object): ReferenceConflict = js.native
  // Retrieves a list of unresolved reference conflicts.
  def list(): ReferenceConflictListResponse = js.native
  // Retrieves a list of unresolved reference conflicts.
  def list(optionalArgs: js.Object): ReferenceConflictListResponse = js.native
}

