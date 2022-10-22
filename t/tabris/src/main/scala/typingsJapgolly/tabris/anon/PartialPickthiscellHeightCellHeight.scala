package typingsJapgolly.tabris.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Pick<this, 'cellHeight' | 'cellType' | 'createCell' | 'updateCell'>> */
trait PartialPickthiscellHeightCellHeight extends StObject {
  
  var cellHeight: js.UndefOr[Any] = js.undefined
  
  var cellType: js.UndefOr[Any] = js.undefined
  
  var createCell: js.UndefOr[Any] = js.undefined
  
  var updateCell: js.UndefOr[Any] = js.undefined
}
object PartialPickthiscellHeightCellHeight {
  
  inline def apply(): PartialPickthiscellHeightCellHeight = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthiscellHeightCellHeight]
  }
  
  extension [Self <: PartialPickthiscellHeightCellHeight](x: Self) {
    
    inline def setCellHeight(value: Any): Self = StObject.set(x, "cellHeight", value.asInstanceOf[js.Any])
    
    inline def setCellHeightUndefined: Self = StObject.set(x, "cellHeight", js.undefined)
    
    inline def setCellType(value: Any): Self = StObject.set(x, "cellType", value.asInstanceOf[js.Any])
    
    inline def setCellTypeUndefined: Self = StObject.set(x, "cellType", js.undefined)
    
    inline def setCreateCell(value: Any): Self = StObject.set(x, "createCell", value.asInstanceOf[js.Any])
    
    inline def setCreateCellUndefined: Self = StObject.set(x, "createCell", js.undefined)
    
    inline def setUpdateCell(value: Any): Self = StObject.set(x, "updateCell", value.asInstanceOf[js.Any])
    
    inline def setUpdateCellUndefined: Self = StObject.set(x, "updateCell", js.undefined)
  }
}
