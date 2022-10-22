package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the contents of a page, as a collection of PageContent objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait PageContentCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets the left (X-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the page that contains the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentPage: js.UndefOr[PageLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the type of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[Boolean] = js.undefined
}
object PageContentCollectionLoadOptions {
  
  inline def apply(): PageContentCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentCollectionLoadOptions]
  }
  
  extension [Self <: PageContentCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: ImageLoadOptions): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInk(value: FloatingInkLoadOptions): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    inline def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    inline def setLeft(value: Boolean): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOutline(value: OutlineLoadOptions): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setParentPage(value: PageLoadOptions): Self = StObject.set(x, "parentPage", value.asInstanceOf[js.Any])
    
    inline def setParentPageUndefined: Self = StObject.set(x, "parentPage", js.undefined)
    
    inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: Boolean): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
