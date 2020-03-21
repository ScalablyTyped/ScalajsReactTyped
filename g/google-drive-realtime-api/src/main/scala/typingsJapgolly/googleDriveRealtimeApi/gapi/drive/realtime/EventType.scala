package typingsJapgolly.googleDriveRealtimeApi.gapi.drive.realtime

import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed
import typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.object_changed
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_set
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_added
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.values_removed
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.value_changed
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_inserted
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.text_deleted
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_joined
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.collaborator_left
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.reference_shifted
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.document_save_state_changed
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.undo_redo_state_changed
  - typingsJapgolly.googleDriveRealtimeApi.googleDriveRealtimeApiStrings.attribute_changed
*/
trait EventType extends js.Object

@JSGlobal("gapi.drive.realtime.EventType")
@js.native
object EventType extends js.Object {
  // A metadata attribute of the document changed. This is fired on changes to:
  // gapi.drive.realtime.Attribute.IS_READ_ONLY
  // Listen on the gapi.drive.realtime.Document for these changes.
  // attribute_changed
  var ATTRIBUTE_CHANGED: attribute_changed = js.native
  // A new collaborator joined the document. Listen on the gapi.drive.realtime.Document for these changes.
  // collaborator_joined
  var COLLABORATOR_JOINED: collaborator_joined = js.native
  // A collaborator left the document. Listen on the gapi.drive.realtime.Document for these changes.
  // collaborator_left
  var COLLABORATOR_LEFT: collaborator_left = js.native
  // The document save state changed. Listen on the gapi.drive.realtime.Document for these changes.
  // document_save_state_changed
  var DOCUMENT_SAVE_STATE_CHANGED: document_save_state_changed = js.native
  // A collaborative object has changed. This event wraps a specific event, and bubbles to ancestors.
  // Defaults to object_changed.
  var OBJECT_CHANGED: object_changed = js.native
  // An index reference changed.
  // reference_shifted
  var REFERENCE_SHIFTED: reference_shifted = js.native
  // Text has been removed from a string.
  // text_deleted
  var TEXT_DELETED: text_deleted = js.native
  // Text has been inserted into a string.
  // text_inserted
  var TEXT_INSERTED: text_inserted = js.native
  // The model canUndo/canRedo state changed. Listen on the gapi.drive.realtime.Model for these changes.
  // undo_redo_state_changed
  var UNDO_REDO_STATE_CHANGED: undo_redo_state_changed = js.native
  // New values have been added to the list.
  // values_added
  var VALUES_ADDED: values_added = js.native
  // Values have been removed from the list.
  // values_removed
  var VALUES_REMOVED: values_removed = js.native
  // Values in a list are changed in place.
  // Defaults to values_set.
  var VALUES_SET: values_set = js.native
  // A map or custom object value has changed. Note this could be a new value or deleted value.
  // value_changed
  var VALUE_CHANGED: value_changed = js.native
}

