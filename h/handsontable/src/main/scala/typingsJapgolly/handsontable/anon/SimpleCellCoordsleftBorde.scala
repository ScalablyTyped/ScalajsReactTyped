package typingsJapgolly.handsontable.anon

import typingsJapgolly.handsontable.pluginsCustomBordersCustomBordersMod.BorderOptions
import typingsJapgolly.handsontable.pluginsCustomBordersCustomBordersMod.DetailedSettings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined handsontable.handsontable/common.SimpleCellCoords & {  left :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   right :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   top :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined,   bottom :handsontable.handsontable/plugins/customBorders/customBorders.BorderOptions | string | undefined} */
trait SimpleCellCoordsleftBorde
  extends StObject
     with DetailedSettings {
  
  var bottom: js.UndefOr[BorderOptions | String] = js.undefined
  
  var col: Double
  
  var left: js.UndefOr[BorderOptions | String] = js.undefined
  
  var right: js.UndefOr[BorderOptions | String] = js.undefined
  
  var row: Double
  
  var top: js.UndefOr[BorderOptions | String] = js.undefined
}
object SimpleCellCoordsleftBorde {
  
  inline def apply(col: Double, row: Double): SimpleCellCoordsleftBorde = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
    __obj.asInstanceOf[SimpleCellCoordsleftBorde]
  }
  
  extension [Self <: SimpleCellCoordsleftBorde](x: Self) {
    
    inline def setBottom(value: BorderOptions | String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: BorderOptions | String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: BorderOptions | String): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
    
    inline def setTop(value: BorderOptions | String): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
