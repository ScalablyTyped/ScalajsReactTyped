package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.E
import typingsJapgolly.qlik.qlikStrings.N
import typingsJapgolly.qlik.qlikStrings.P
import typingsJapgolly.qlik.qlikStrings.R
import typingsJapgolly.qlik.qlikStrings.T
import typingsJapgolly.qlik.qlikStrings.U
import typingsJapgolly.qlik.qlikStrings.V
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxPivotValuePoint extends StObject {
  
  var qAttrExps: NxAttributeExpressionValues
  
  var qLabel: js.UndefOr[String] = js.undefined
  
  var qNum: Double
  
  var qText: String
  
  var qType: V | E | N | T | P | R | U
}
object NxPivotValuePoint {
  
  inline def apply(
    qAttrExps: NxAttributeExpressionValues,
    qNum: Double,
    qText: String,
    qType: V | E | N | T | P | R | U
  ): NxPivotValuePoint = {
    val __obj = js.Dynamic.literal(qAttrExps = qAttrExps.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxPivotValuePoint]
  }
  
  extension [Self <: NxPivotValuePoint](x: Self) {
    
    inline def setQAttrExps(value: NxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQLabel(value: String): Self = StObject.set(x, "qLabel", value.asInstanceOf[js.Any])
    
    inline def setQLabelUndefined: Self = StObject.set(x, "qLabel", js.undefined)
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
    
    inline def setQType(value: V | E | N | T | P | R | U): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
