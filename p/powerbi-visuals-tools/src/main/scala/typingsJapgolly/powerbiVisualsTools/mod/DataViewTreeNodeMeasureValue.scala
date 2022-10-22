package typingsJapgolly.powerbiVisualsTools.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataViewTreeNodeMeasureValue
  extends StObject
     with DataViewTreeNodeValue
     with DataViewColumnAggregates {
  
  var highlight: js.UndefOr[PrimitiveValue] = js.undefined
}
object DataViewTreeNodeMeasureValue {
  
  inline def apply(): DataViewTreeNodeMeasureValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataViewTreeNodeMeasureValue]
  }
  
  extension [Self <: DataViewTreeNodeMeasureValue](x: Self) {
    
    inline def setHighlight(value: PrimitiveValue): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
  }
}
