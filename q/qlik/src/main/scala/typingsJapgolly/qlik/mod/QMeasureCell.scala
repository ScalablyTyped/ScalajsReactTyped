package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QMeasureCell extends StObject {
  
  def getPercent(): Double
  
  def getPercentOfMax(): Double
  
  var qNum: js.UndefOr[Double] = js.undefined
  
  var qText: String
}
object QMeasureCell {
  
  inline def apply(getPercent: CallbackTo[Double], getPercentOfMax: CallbackTo[Double], qText: String): QMeasureCell = {
    val __obj = js.Dynamic.literal(getPercent = getPercent.toJsFn, getPercentOfMax = getPercentOfMax.toJsFn, qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[QMeasureCell]
  }
  
  extension [Self <: QMeasureCell](x: Self) {
    
    inline def setGetPercent(value: CallbackTo[Double]): Self = StObject.set(x, "getPercent", value.toJsFn)
    
    inline def setGetPercentOfMax(value: CallbackTo[Double]): Self = StObject.set(x, "getPercentOfMax", value.toJsFn)
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQNumUndefined: Self = StObject.set(x, "qNum", js.undefined)
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
