package typingsJapgolly.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a OneNote section. Sections can contain pages.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait SectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The client url of the section. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var clientUrl: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the ID of the section. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if this section is encrypted with a password. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.2]
    */
  var isEncrypted: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if this section is locked. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.2]
    */
  var isLocked: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the name of the section. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var name: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Gets the notebook that contains the section.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var notebook: js.UndefOr[NotebookLoadOptions] = js.undefined
  
  /**
    * The collection of pages in the section. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var pages: js.UndefOr[PageCollectionLoadOptions] = js.undefined
  
  /**
    * Gets the section group that contains the section. Throws ItemNotFound if the section is a direct child of the notebook.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroup: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    * Gets the section group that contains the section. Returns null if the section is a direct child of the notebook.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentSectionGroupOrNull: js.UndefOr[SectionGroupLoadOptions] = js.undefined
  
  /**
    * The web url of the page. Read only
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var webUrl: js.UndefOr[Boolean] = js.undefined
}
object SectionLoadOptions {
  
  inline def apply(): SectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SectionLoadOptions]
  }
  
  extension [Self <: SectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setClientUrl(value: Boolean): Self = StObject.set(x, "clientUrl", value.asInstanceOf[js.Any])
    
    inline def setClientUrlUndefined: Self = StObject.set(x, "clientUrl", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setIsEncrypted(value: Boolean): Self = StObject.set(x, "isEncrypted", value.asInstanceOf[js.Any])
    
    inline def setIsEncryptedUndefined: Self = StObject.set(x, "isEncrypted", js.undefined)
    
    inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
    
    inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
    
    inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNotebook(value: NotebookLoadOptions): Self = StObject.set(x, "notebook", value.asInstanceOf[js.Any])
    
    inline def setNotebookUndefined: Self = StObject.set(x, "notebook", js.undefined)
    
    inline def setPages(value: PageCollectionLoadOptions): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
    
    inline def setPagesUndefined: Self = StObject.set(x, "pages", js.undefined)
    
    inline def setParentSectionGroup(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroup", value.asInstanceOf[js.Any])
    
    inline def setParentSectionGroupOrNull(value: SectionGroupLoadOptions): Self = StObject.set(x, "parentSectionGroupOrNull", value.asInstanceOf[js.Any])
    
    inline def setParentSectionGroupOrNullUndefined: Self = StObject.set(x, "parentSectionGroupOrNull", js.undefined)
    
    inline def setParentSectionGroupUndefined: Self = StObject.set(x, "parentSectionGroup", js.undefined)
    
    inline def setWebUrl(value: Boolean): Self = StObject.set(x, "webUrl", value.asInstanceOf[js.Any])
    
    inline def setWebUrlUndefined: Self = StObject.set(x, "webUrl", js.undefined)
  }
}
