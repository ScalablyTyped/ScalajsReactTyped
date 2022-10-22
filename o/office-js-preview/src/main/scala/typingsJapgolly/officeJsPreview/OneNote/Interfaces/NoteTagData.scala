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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `noteTag.toJSON()`. */
trait NoteTagData extends StObject {
  
  /**
    * Gets the Id of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the status of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var status: js.UndefOr[
    NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
  ] = js.undefined
  
  /**
    * Gets the type of the NoteTag object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[
    NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
  ] = js.undefined
}
object NoteTagData {
  
  inline def apply(): NoteTagData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NoteTagData]
  }
  
  extension [Self <: NoteTagData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(
      value: NoteTagStatus | Unknown_ | Normal | Completed | Disabled | OutlookTask | TaskNotSyncedYet | TaskRemoved
    ): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setType(
      value: NoteTagType | Unknown_ | ToDo | Important | Question | Contact | Address | PhoneNumber | Website | Idea | Critical | ToDoPriority1 | ToDoPriority2
    ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
