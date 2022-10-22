package typingsJapgolly.officeJsPreview.OneNote.Interfaces

import typingsJapgolly.officeJsPreview.OneNote.PageContentType
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Image
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Ink
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Other
import typingsJapgolly.officeJsPreview.officeJsPreviewStrings.Outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface describing the data returned by calling `pageContent.toJSON()`. */
trait PageContentData extends StObject {
  
  /**
    * Gets the ID of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[String] = js.undefined
  
  /**
    * Gets the Image in the PageContent object. Throws an exception if PageContentType is not Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageData] = js.undefined
  
  /**
    * Gets the ink in the PageContent object. Throws an exception if PageContentType is not Ink.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var ink: js.UndefOr[FloatingInkData] = js.undefined
  
  /**
    * Gets or sets the left (X-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var left: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the Outline in the PageContent object. Throws an exception if PageContentType is not Outline.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var outline: js.UndefOr[OutlineData] = js.undefined
  
  /**
    * Gets or sets the top (Y-axis) position of the PageContent object.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var top: js.UndefOr[Double] = js.undefined
  
  /**
    * Gets the type of the PageContent object. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var `type`: js.UndefOr[PageContentType | Outline | Image | Ink | Other] = js.undefined
}
object PageContentData {
  
  inline def apply(): PageContentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PageContentData]
  }
  
  extension [Self <: PageContentData](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setImage(value: ImageData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setInk(value: FloatingInkData): Self = StObject.set(x, "ink", value.asInstanceOf[js.Any])
    
    inline def setInkUndefined: Self = StObject.set(x, "ink", js.undefined)
    
    inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setOutline(value: OutlineData): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    inline def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
    
    inline def setType(value: PageContentType | Outline | Image | Ink | Other): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
