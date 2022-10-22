package typingsJapgolly.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Cells that are not table header, column header, or row header cells. */
trait BodyCells extends StObject {
  
  var attributes: js.UndefOr[js.Array[Attribute]] = js.undefined
  
  /** The unique ID of the cell in the current table. */
  var cell_id: js.UndefOr[String] = js.undefined
  
  var column_header_ids: js.UndefOr[js.Array[ColumnHeaderIds]] = js.undefined
  
  var column_header_texts: js.UndefOr[js.Array[ColumnHeaderTexts]] = js.undefined
  
  var column_header_texts_normalized: js.UndefOr[js.Array[ColumnHeaderTextsNormalized]] = js.undefined
  
  /** The `begin` index of this cell's `column` location in the current table. */
  var column_index_begin: js.UndefOr[Double] = js.undefined
  
  /** The `end` index of this cell's `column` location in the current table. */
  var column_index_end: js.UndefOr[Double] = js.undefined
  
  /** The numeric location of the identified element in the document, represented with two integers labeled `begin` and `end`. */
  var location: js.UndefOr[Location] = js.undefined
  
  var row_header_ids: js.UndefOr[js.Array[RowHeaderIds]] = js.undefined
  
  var row_header_texts: js.UndefOr[js.Array[RowHeaderTexts]] = js.undefined
  
  var row_header_texts_normalized: js.UndefOr[js.Array[RowHeaderTextsNormalized]] = js.undefined
  
  /** The `begin` index of this cell's `row` location in the current table. */
  var row_index_begin: js.UndefOr[Double] = js.undefined
  
  /** The `end` index of this cell's `row` location in the current table. */
  var row_index_end: js.UndefOr[Double] = js.undefined
  
  /** The textual contents of this cell from the input document without associated markup content. */
  var text: js.UndefOr[String] = js.undefined
}
object BodyCells {
  
  inline def apply(): BodyCells = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BodyCells]
  }
  
  extension [Self <: BodyCells](x: Self) {
    
    inline def setAttributes(value: js.Array[Attribute]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setAttributesVarargs(value: Attribute*): Self = StObject.set(x, "attributes", js.Array(value*))
    
    inline def setCell_id(value: String): Self = StObject.set(x, "cell_id", value.asInstanceOf[js.Any])
    
    inline def setCell_idUndefined: Self = StObject.set(x, "cell_id", js.undefined)
    
    inline def setColumn_header_ids(value: js.Array[ColumnHeaderIds]): Self = StObject.set(x, "column_header_ids", value.asInstanceOf[js.Any])
    
    inline def setColumn_header_idsUndefined: Self = StObject.set(x, "column_header_ids", js.undefined)
    
    inline def setColumn_header_idsVarargs(value: ColumnHeaderIds*): Self = StObject.set(x, "column_header_ids", js.Array(value*))
    
    inline def setColumn_header_texts(value: js.Array[ColumnHeaderTexts]): Self = StObject.set(x, "column_header_texts", value.asInstanceOf[js.Any])
    
    inline def setColumn_header_textsUndefined: Self = StObject.set(x, "column_header_texts", js.undefined)
    
    inline def setColumn_header_textsVarargs(value: ColumnHeaderTexts*): Self = StObject.set(x, "column_header_texts", js.Array(value*))
    
    inline def setColumn_header_texts_normalized(value: js.Array[ColumnHeaderTextsNormalized]): Self = StObject.set(x, "column_header_texts_normalized", value.asInstanceOf[js.Any])
    
    inline def setColumn_header_texts_normalizedUndefined: Self = StObject.set(x, "column_header_texts_normalized", js.undefined)
    
    inline def setColumn_header_texts_normalizedVarargs(value: ColumnHeaderTextsNormalized*): Self = StObject.set(x, "column_header_texts_normalized", js.Array(value*))
    
    inline def setColumn_index_begin(value: Double): Self = StObject.set(x, "column_index_begin", value.asInstanceOf[js.Any])
    
    inline def setColumn_index_beginUndefined: Self = StObject.set(x, "column_index_begin", js.undefined)
    
    inline def setColumn_index_end(value: Double): Self = StObject.set(x, "column_index_end", value.asInstanceOf[js.Any])
    
    inline def setColumn_index_endUndefined: Self = StObject.set(x, "column_index_end", js.undefined)
    
    inline def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRow_header_ids(value: js.Array[RowHeaderIds]): Self = StObject.set(x, "row_header_ids", value.asInstanceOf[js.Any])
    
    inline def setRow_header_idsUndefined: Self = StObject.set(x, "row_header_ids", js.undefined)
    
    inline def setRow_header_idsVarargs(value: RowHeaderIds*): Self = StObject.set(x, "row_header_ids", js.Array(value*))
    
    inline def setRow_header_texts(value: js.Array[RowHeaderTexts]): Self = StObject.set(x, "row_header_texts", value.asInstanceOf[js.Any])
    
    inline def setRow_header_textsUndefined: Self = StObject.set(x, "row_header_texts", js.undefined)
    
    inline def setRow_header_textsVarargs(value: RowHeaderTexts*): Self = StObject.set(x, "row_header_texts", js.Array(value*))
    
    inline def setRow_header_texts_normalized(value: js.Array[RowHeaderTextsNormalized]): Self = StObject.set(x, "row_header_texts_normalized", value.asInstanceOf[js.Any])
    
    inline def setRow_header_texts_normalizedUndefined: Self = StObject.set(x, "row_header_texts_normalized", js.undefined)
    
    inline def setRow_header_texts_normalizedVarargs(value: RowHeaderTextsNormalized*): Self = StObject.set(x, "row_header_texts_normalized", js.Array(value*))
    
    inline def setRow_index_begin(value: Double): Self = StObject.set(x, "row_index_begin", value.asInstanceOf[js.Any])
    
    inline def setRow_index_beginUndefined: Self = StObject.set(x, "row_index_begin", js.undefined)
    
    inline def setRow_index_end(value: Double): Self = StObject.set(x, "row_index_end", value.asInstanceOf[js.Any])
    
    inline def setRow_index_endUndefined: Self = StObject.set(x, "row_index_end", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
