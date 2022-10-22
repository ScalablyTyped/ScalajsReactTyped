package typingsJapgolly.maximMazurokGapiClientDocs.gapi.client.docs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnmergeTableCellsRequest extends StObject {
  
  /**
    * The table range specifying which cells of the table to unmerge. All merged cells in this range will be unmerged, and cells that are already unmerged will not be affected. If the
    * range has no merged cells, the request will do nothing. If there is text in any of the merged cells, the text will remain in the "head" cell of the resulting block of unmerged
    * cells. The "head" cell is the upper-left cell when the content direction is from left to right, and the upper-right otherwise.
    */
  var tableRange: js.UndefOr[TableRange] = js.undefined
}
object UnmergeTableCellsRequest {
  
  inline def apply(): UnmergeTableCellsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnmergeTableCellsRequest]
  }
  
  extension [Self <: UnmergeTableCellsRequest](x: Self) {
    
    inline def setTableRange(value: TableRange): Self = StObject.set(x, "tableRange", value.asInstanceOf[js.Any])
    
    inline def setTableRangeUndefined: Self = StObject.set(x, "tableRange", js.undefined)
  }
}
