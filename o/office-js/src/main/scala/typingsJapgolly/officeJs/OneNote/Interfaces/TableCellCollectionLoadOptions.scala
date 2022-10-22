package typingsJapgolly.officeJs.OneNote.Interfaces

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains a collection of TableCell objects.
  *
  * @remarks
  * [Api set: OneNoteApi 1.1]
  */
trait TableCellCollectionLoadOptions extends StObject {
  
  /**
    Specifying `$all` for the LoadOptions loads all the scalar properties (e.g.: `Range.address`) but not the navigational properties (e.g.: `Range.format.fill.color`).
    */
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the index of the cell in its row. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var cellIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the ID of the cell. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var id: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the collection of Paragraph objects in the TableCell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var paragraphs: js.UndefOr[ParagraphCollectionLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the parent row of the cell.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var parentRow: js.UndefOr[TableRowLoadOptions] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets the index of the cell's row in the table. Read-only.
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var rowIndex: js.UndefOr[Boolean] = js.undefined
  
  /**
    * For EACH ITEM in the collection: Gets and sets the shading color of the cell
    *
    * @remarks
    * [Api set: OneNoteApi 1.1]
    */
  var shadingColor: js.UndefOr[Boolean] = js.undefined
}
object TableCellCollectionLoadOptions {
  
  inline def apply(): TableCellCollectionLoadOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableCellCollectionLoadOptions]
  }
  
  extension [Self <: TableCellCollectionLoadOptions](x: Self) {
    
    inline def set$all(value: Boolean): Self = StObject.set(x, "$all", value.asInstanceOf[js.Any])
    
    inline def set$allUndefined: Self = StObject.set(x, "$all", js.undefined)
    
    inline def setCellIndex(value: Boolean): Self = StObject.set(x, "cellIndex", value.asInstanceOf[js.Any])
    
    inline def setCellIndexUndefined: Self = StObject.set(x, "cellIndex", js.undefined)
    
    inline def setId(value: Boolean): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setParagraphs(value: ParagraphCollectionLoadOptions): Self = StObject.set(x, "paragraphs", value.asInstanceOf[js.Any])
    
    inline def setParagraphsUndefined: Self = StObject.set(x, "paragraphs", js.undefined)
    
    inline def setParentRow(value: TableRowLoadOptions): Self = StObject.set(x, "parentRow", value.asInstanceOf[js.Any])
    
    inline def setParentRowUndefined: Self = StObject.set(x, "parentRow", js.undefined)
    
    inline def setRowIndex(value: Boolean): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    inline def setRowIndexUndefined: Self = StObject.set(x, "rowIndex", js.undefined)
    
    inline def setShadingColor(value: Boolean): Self = StObject.set(x, "shadingColor", value.asInstanceOf[js.Any])
    
    inline def setShadingColorUndefined: Self = StObject.set(x, "shadingColor", js.undefined)
  }
}
