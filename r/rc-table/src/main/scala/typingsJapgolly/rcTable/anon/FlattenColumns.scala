package typingsJapgolly.rcTable.anon

import typingsJapgolly.rcTable.libInterfaceMod.ColumnType
import typingsJapgolly.rcTable.libInterfaceMod.StickyOffsets
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FlattenColumns extends StObject {
  
  var flattenColumns: js.UndefOr[typingsJapgolly.rcTable.libFooterSummaryContextMod.FlattenColumns[Any]] = js.undefined
  
  var scrollColumnIndex: js.UndefOr[Double] = js.undefined
  
  var stickyOffsets: js.UndefOr[StickyOffsets] = js.undefined
}
object FlattenColumns {
  
  inline def apply(): FlattenColumns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlattenColumns]
  }
  
  extension [Self <: FlattenColumns](x: Self) {
    
    inline def setFlattenColumns(value: typingsJapgolly.rcTable.libFooterSummaryContextMod.FlattenColumns[Any]): Self = StObject.set(x, "flattenColumns", value.asInstanceOf[js.Any])
    
    inline def setFlattenColumnsUndefined: Self = StObject.set(x, "flattenColumns", js.undefined)
    
    inline def setFlattenColumnsVarargs(value: (ColumnType[Any] & Scrollbar)*): Self = StObject.set(x, "flattenColumns", js.Array(value*))
    
    inline def setScrollColumnIndex(value: Double): Self = StObject.set(x, "scrollColumnIndex", value.asInstanceOf[js.Any])
    
    inline def setScrollColumnIndexUndefined: Self = StObject.set(x, "scrollColumnIndex", js.undefined)
    
    inline def setStickyOffsets(value: StickyOffsets): Self = StObject.set(x, "stickyOffsets", value.asInstanceOf[js.Any])
    
    inline def setStickyOffsetsUndefined: Self = StObject.set(x, "stickyOffsets", js.undefined)
  }
}
