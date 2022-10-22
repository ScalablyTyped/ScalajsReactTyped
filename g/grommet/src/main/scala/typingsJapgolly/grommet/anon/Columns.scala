package typingsJapgolly.grommet.anon

import typingsJapgolly.grommet.es6ComponentsGridMod.AreasType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridColumnsType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridGapType
import typingsJapgolly.grommet.es6ComponentsGridMod.GridSizeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Columns extends StObject {
  
  var areas: js.UndefOr[AreasType] = js.undefined
  
  var columns: js.UndefOr[GridColumnsType] = js.undefined
  
  var gap: js.UndefOr[GridGapType] = js.undefined
  
  var rows: js.UndefOr[GridSizeType] = js.undefined
}
object Columns {
  
  inline def apply(): Columns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Columns]
  }
  
  extension [Self <: Columns](x: Self) {
    
    inline def setAreas(value: AreasType): Self = StObject.set(x, "areas", value.asInstanceOf[js.Any])
    
    inline def setAreasUndefined: Self = StObject.set(x, "areas", js.undefined)
    
    inline def setAreasVarargs(value: (js.Array[String] | End)*): Self = StObject.set(x, "areas", js.Array(value*))
    
    inline def setColumns(value: GridColumnsType): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setColumnsVarargs(value: String*): Self = StObject.set(x, "columns", js.Array(value*))
    
    inline def setGap(value: GridGapType): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
    
    inline def setRows(value: GridSizeType): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
    
    inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
    
    inline def setRowsVarargs(value: String*): Self = StObject.set(x, "rows", js.Array(value*))
  }
}
