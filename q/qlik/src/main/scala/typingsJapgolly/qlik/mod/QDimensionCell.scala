package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QDimensionCell extends StObject {
  
  var qElemNumber: Double
  
  var qNum: js.UndefOr[Double] = js.undefined
  
  var qState: String
  
  var qText: String
  
  def select(): Unit
}
object QDimensionCell {
  
  inline def apply(qElemNumber: Double, qState: String, qText: String, select: Callback): QDimensionCell = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], select = select.toJsFn)
    __obj.asInstanceOf[QDimensionCell]
  }
  
  extension [Self <: QDimensionCell](x: Self) {
    
    inline def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    inline def setQState(value: String): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: Callback): Self = StObject.set(x, "select", value.toJsFn)
  }
}
