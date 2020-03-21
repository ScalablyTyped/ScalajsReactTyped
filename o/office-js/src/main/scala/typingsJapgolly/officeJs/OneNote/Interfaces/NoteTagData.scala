package typingsJapgolly.officeJs.OneNote.Interfaces

import typingsJapgolly.officeJs.OneNote.NoteTagStatus
import typingsJapgolly.officeJs.OneNote.NoteTagType
import typingsJapgolly.officeJs.officeJsStrings.Address
import typingsJapgolly.officeJs.officeJsStrings.Completed
import typingsJapgolly.officeJs.officeJsStrings.Contact
import typingsJapgolly.officeJs.officeJsStrings.Critical
import typingsJapgolly.officeJs.officeJsStrings.Disabled
import typingsJapgolly.officeJs.officeJsStrings.Idea
import typingsJapgolly.officeJs.officeJsStrings.Important
import typingsJapgolly.officeJs.officeJsStrings.Normal
import typingsJapgolly.officeJs.officeJsStrings.OutlookTask
import typingsJapgolly.officeJs.officeJsStrings.PhoneNumber
import typingsJapgolly.officeJs.officeJsStrings.Question
import typingsJapgolly.officeJs.officeJsStrings.TaskNotSyncedYet
import typingsJapgolly.officeJs.officeJsStrings.TaskRemoved
import typingsJapgolly.officeJs.officeJsStrings.ToDo
import typingsJapgolly.officeJs.officeJsStrings.ToDoPriority1
import typingsJapgolly.officeJs.officeJsStrings.ToDoPriority2
import typingsJapgolly.officeJs.officeJsStrings.Unknown_
import typingsJapgolly.officeJs.officeJsStrings.Website
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

