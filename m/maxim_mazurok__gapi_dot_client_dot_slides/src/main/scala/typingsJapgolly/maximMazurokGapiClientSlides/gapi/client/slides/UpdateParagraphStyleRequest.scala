package typingsJapgolly.maximMazurokGapiClientSlides.gapi.client.slides

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateParagraphStyleRequest extends StObject {
  
  /** The location of the cell in the table containing the paragraph(s) to style. If `object_id` refers to a table, `cell_location` must have a value. Otherwise, it must not. */
  var cellLocation: js.UndefOr[TableCellLocation] = js.undefined
  
  /**
    * The fields that should be updated. At least one field must be specified. The root `style` is implied and should not be specified. A single `"*"` can be used as short-hand for
    * listing every field. For example, to update the paragraph alignment, set `fields` to `"alignment"`. To reset a property to its default value, include its field name in the field
    * mask but leave the field itself unset.
    */
  var fields: js.UndefOr[String] = js.undefined
  
  /** The object ID of the shape or table with the text to be styled. */
  var objectId: js.UndefOr[String] = js.undefined
  
  /** The paragraph's style. */
  var style: js.UndefOr[ParagraphStyle] = js.undefined
  
  /** The range of text containing the paragraph(s) to style. */
  var textRange: js.UndefOr[Range] = js.undefined
}
object UpdateParagraphStyleRequest {
  
  inline def apply(): UpdateParagraphStyleRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateParagraphStyleRequest]
  }
  
  extension [Self <: UpdateParagraphStyleRequest](x: Self) {
    
    inline def setCellLocation(value: TableCellLocation): Self = StObject.set(x, "cellLocation", value.asInstanceOf[js.Any])
    
    inline def setCellLocationUndefined: Self = StObject.set(x, "cellLocation", js.undefined)
    
    inline def setFields(value: String): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    inline def setObjectId(value: String): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    inline def setStyle(value: ParagraphStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setTextRange(value: Range): Self = StObject.set(x, "textRange", value.asInstanceOf[js.Any])
    
    inline def setTextRangeUndefined: Self = StObject.set(x, "textRange", js.undefined)
  }
}
