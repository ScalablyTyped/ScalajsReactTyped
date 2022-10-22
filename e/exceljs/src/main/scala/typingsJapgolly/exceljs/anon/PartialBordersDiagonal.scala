package typingsJapgolly.exceljs.anon

import typingsJapgolly.exceljs.mod.Border
import typingsJapgolly.exceljs.mod.BorderDiagonal
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<exceljs.exceljs.Borders> */
trait PartialBordersDiagonal extends StObject {
  
  var bottom: js.UndefOr[Partial[Border]] = js.undefined
  
  var diagonal: js.UndefOr[Partial[BorderDiagonal]] = js.undefined
  
  var left: js.UndefOr[Partial[Border]] = js.undefined
  
  var right: js.UndefOr[Partial[Border]] = js.undefined
  
  var top: js.UndefOr[Partial[Border]] = js.undefined
}
object PartialBordersDiagonal {
  
  inline def apply(): PartialBordersDiagonal = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialBordersDiagonal]
  }
  
  extension [Self <: PartialBordersDiagonal](x: Self) {
    
    inline def setBottom(value: Partial[Border]): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setBottomUndefined: Self = StObject.set(x, "bottom", js.undefined)
    
    inline def setDiagonal(value: Partial[BorderDiagonal]): Self = StObject.set(x, "diagonal", value.asInstanceOf[js.Any])
    
    inline def setDiagonalUndefined: Self = StObject.set(x, "diagonal", js.undefined)
    
    inline def setLeft(value: Partial[Border]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
    
    inline def setRight(value: Partial[Border]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
    
    inline def setTop(value: Partial[Border]): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
  }
}
