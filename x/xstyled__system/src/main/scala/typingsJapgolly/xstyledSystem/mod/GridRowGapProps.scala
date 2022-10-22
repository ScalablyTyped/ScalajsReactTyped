package typingsJapgolly.xstyledSystem.mod

import typingsJapgolly.csstype.mod.Property.GridRowGap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridRowGapProps[TLength] extends StObject {
  
  val gridRowGap: js.UndefOr[ResponsiveValue[GridRowGap[TLength]]] = js.undefined
}
object GridRowGapProps {
  
  inline def apply[TLength](): GridRowGapProps[TLength] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridRowGapProps[TLength]]
  }
  
  extension [Self <: GridRowGapProps[?], TLength](x: Self & GridRowGapProps[TLength]) {
    
    inline def setGridRowGap(value: ResponsiveValue[GridRowGap[TLength]]): Self = StObject.set(x, "gridRowGap", value.asInstanceOf[js.Any])
    
    inline def setGridRowGapUndefined: Self = StObject.set(x, "gridRowGap", js.undefined)
    
    inline def setGridRowGapVarargs(value: GridRowGap[TLength]*): Self = StObject.set(x, "gridRowGap", js.Array(value*))
  }
}
