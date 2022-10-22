package typingsJapgolly.igniteUi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellSelectionChangedEventUIParam extends StObject {
  
  /**
    * Gets reference to the cell object.
    */
  var cell: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to GridSelection.
    */
  var owner: js.UndefOr[Any] = js.undefined
  
  /**
    * Gets reference to selected cells object array.
    */
  var selectedCells: js.UndefOr[js.Array[Any]] = js.undefined
}
object CellSelectionChangedEventUIParam {
  
  inline def apply(): CellSelectionChangedEventUIParam = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CellSelectionChangedEventUIParam]
  }
  
  extension [Self <: CellSelectionChangedEventUIParam](x: Self) {
    
    inline def setCell(value: Any): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    
    inline def setCellUndefined: Self = StObject.set(x, "cell", js.undefined)
    
    inline def setOwner(value: Any): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "owner", js.undefined)
    
    inline def setSelectedCells(value: js.Array[Any]): Self = StObject.set(x, "selectedCells", value.asInstanceOf[js.Any])
    
    inline def setSelectedCellsUndefined: Self = StObject.set(x, "selectedCells", js.undefined)
    
    inline def setSelectedCellsVarargs(value: Any*): Self = StObject.set(x, "selectedCells", js.Array(value*))
  }
}
