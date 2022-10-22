package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.D
import typingsJapgolly.qlik.qlikStrings.L
import typingsJapgolly.qlik.qlikStrings.O
import typingsJapgolly.qlik.qlikStrings.S
import typingsJapgolly.qlik.qlikStrings.X
import typingsJapgolly.qlik.qlikStrings.XL
import typingsJapgolly.qlik.qlikStrings.XS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NxCell extends StObject {
  
  var qAttrDims: NxAttributeDimValues
  
  var qAttrExps: NxAttributeExpressionValues
  
  var qElemNumber: Double
  
  var qFrequency: String
  
  var qHighlightRanges: NxHighlightRanges
  
  var qIsEmpty: Boolean
  
  var qIsNull: Boolean
  
  var qIsOtherCell: Boolean
  
  var qIsTotalCell: Boolean
  
  var qNum: Double
  
  var qState: L | S | O | D | A | X | XS | XL
  
  var qText: String
}
object NxCell {
  
  inline def apply(
    qAttrDims: NxAttributeDimValues,
    qAttrExps: NxAttributeExpressionValues,
    qElemNumber: Double,
    qFrequency: String,
    qHighlightRanges: NxHighlightRanges,
    qIsEmpty: Boolean,
    qIsNull: Boolean,
    qIsOtherCell: Boolean,
    qIsTotalCell: Boolean,
    qNum: Double,
    qState: L | S | O | D | A | X | XS | XL,
    qText: String
  ): NxCell = {
    val __obj = js.Dynamic.literal(qAttrDims = qAttrDims.asInstanceOf[js.Any], qAttrExps = qAttrExps.asInstanceOf[js.Any], qElemNumber = qElemNumber.asInstanceOf[js.Any], qFrequency = qFrequency.asInstanceOf[js.Any], qHighlightRanges = qHighlightRanges.asInstanceOf[js.Any], qIsEmpty = qIsEmpty.asInstanceOf[js.Any], qIsNull = qIsNull.asInstanceOf[js.Any], qIsOtherCell = qIsOtherCell.asInstanceOf[js.Any], qIsTotalCell = qIsTotalCell.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qState = qState.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[NxCell]
  }
  
  extension [Self <: NxCell](x: Self) {
    
    inline def setQAttrDims(value: NxAttributeDimValues): Self = StObject.set(x, "qAttrDims", value.asInstanceOf[js.Any])
    
    inline def setQAttrExps(value: NxAttributeExpressionValues): Self = StObject.set(x, "qAttrExps", value.asInstanceOf[js.Any])
    
    inline def setQElemNumber(value: Double): Self = StObject.set(x, "qElemNumber", value.asInstanceOf[js.Any])
    
    inline def setQFrequency(value: String): Self = StObject.set(x, "qFrequency", value.asInstanceOf[js.Any])
    
    inline def setQHighlightRanges(value: NxHighlightRanges): Self = StObject.set(x, "qHighlightRanges", value.asInstanceOf[js.Any])
    
    inline def setQIsEmpty(value: Boolean): Self = StObject.set(x, "qIsEmpty", value.asInstanceOf[js.Any])
    
    inline def setQIsNull(value: Boolean): Self = StObject.set(x, "qIsNull", value.asInstanceOf[js.Any])
    
    inline def setQIsOtherCell(value: Boolean): Self = StObject.set(x, "qIsOtherCell", value.asInstanceOf[js.Any])
    
    inline def setQIsTotalCell(value: Boolean): Self = StObject.set(x, "qIsTotalCell", value.asInstanceOf[js.Any])
    
    inline def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    inline def setQState(value: L | S | O | D | A | X | XS | XL): Self = StObject.set(x, "qState", value.asInstanceOf[js.Any])
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
