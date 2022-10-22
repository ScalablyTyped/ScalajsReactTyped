package typingsJapgolly.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** An interface for updating data on the Paragraph object, for use in `paragraph.set({ ... })`. */
trait ParagraphUpdateData extends StObject {
  
  /**
    * Gets the Image object in the Paragraph. Throws an exception if ParagraphType is not Image.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var image: js.UndefOr[ImageUpdateData] = js.undefined
  
  /**
    * Gets the Table object in the Paragraph. Throws an exception if ParagraphType is not Table.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var table: js.UndefOr[TableUpdateData] = js.undefined
}
object ParagraphUpdateData {
  
  inline def apply(): ParagraphUpdateData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParagraphUpdateData]
  }
  
  extension [Self <: ParagraphUpdateData](x: Self) {
    
    inline def setImage(value: ImageUpdateData): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setTable(value: TableUpdateData): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
  }
}
