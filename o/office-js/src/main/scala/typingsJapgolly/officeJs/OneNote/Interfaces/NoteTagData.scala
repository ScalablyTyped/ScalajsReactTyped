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
