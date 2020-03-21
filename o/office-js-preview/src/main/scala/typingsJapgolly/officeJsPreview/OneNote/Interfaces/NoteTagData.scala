package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import typingsJapgolly.officeJsPreview.OneNote.NoteTagStatus
import typingsJapgolly.officeJsPreview.OneNote.NoteTagType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Address
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Completed
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Contact
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Critical
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Disabled
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Idea
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Important
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Normal
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.OutlookTask
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.PhoneNumber
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Question
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TaskNotSyncedYet
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.TaskRemoved
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ToDo
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ToDoPriority1
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.ToDoPriority2
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Unknown_
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Website
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling "noteTag.toJSON()". */
trait NoteTagData extends js.Object {
  /**
    *
    * Gets the Id of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    *
    * Gets the status of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  /**
    *
    * Gets the type of the NoteTag object. Read-only.
    *
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}

object NoteTagData {
  @scala.inline
  def apply(
    id: String = null,
    status: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved = null,
    `type`: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2 = null
  ): NoteTagData = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoteTagData]
  }
}

