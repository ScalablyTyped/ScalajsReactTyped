package typingsJapgolly.qlik.mod

import typingsJapgolly.qlik.qlikStrings.OTHER_ABS_ACC_TARGET
import typingsJapgolly.qlik.qlikStrings.OTHER_ABS_LIMITED
import typingsJapgolly.qlik.qlikStrings.OTHER_COUNTED
import typingsJapgolly.qlik.qlikStrings.OTHER_GE_LIMIT
import typingsJapgolly.qlik.qlikStrings.OTHER_GT_LIMIT
import typingsJapgolly.qlik.qlikStrings.OTHER_LE_LIMIT
import typingsJapgolly.qlik.qlikStrings.OTHER_LT_LIMIT
import typingsJapgolly.qlik.qlikStrings.OTHER_OFF
import typingsJapgolly.qlik.qlikStrings.OTHER_REL_ACC_TARGET
import typingsJapgolly.qlik.qlikStrings.OTHER_REL_LIMITED
import typingsJapgolly.qlik.qlikStrings.OTHER_SORT_ASCENDING
import typingsJapgolly.qlik.qlikStrings.OTHER_SORT_DEFAULT
import typingsJapgolly.qlik.qlikStrings.OTHER_SORT_DESCENDING
import typingsJapgolly.qlik.qlikStrings.TOTAL_EXPR
import typingsJapgolly.qlik.qlikStrings.TOTAL_OFF
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OtherTotalSpecProp extends StObject {
  
  var qApplyEvenWhenPossiblyWrongResult: Boolean
  
  var qForceBadValueKeeping: Boolean
  
  var qGlobalOtherGrouping: Boolean
  
  var qOtherCollapseInnerDimensions: Boolean
  
  var qOtherCounted: ValueExpr
  
  var qOtherLimit: ValueExpr
  
  var qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT
  
  var qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET
  
  var qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING
  
  var qReferencedExpression: String
  
  var qSupressOther: Boolean
  
  var qTotalMode: TOTAL_OFF | TOTAL_EXPR
}
object OtherTotalSpecProp {
  
  inline def apply(
    qApplyEvenWhenPossiblyWrongResult: Boolean,
    qForceBadValueKeeping: Boolean,
    qGlobalOtherGrouping: Boolean,
    qOtherCollapseInnerDimensions: Boolean,
    qOtherCounted: ValueExpr,
    qOtherLimit: ValueExpr,
    qOtherLimitMode: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT,
    qOtherMode: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET,
    qOtherSortMode: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING,
    qReferencedExpression: String,
    qSupressOther: Boolean,
    qTotalMode: TOTAL_OFF | TOTAL_EXPR
  ): OtherTotalSpecProp = {
    val __obj = js.Dynamic.literal(qApplyEvenWhenPossiblyWrongResult = qApplyEvenWhenPossiblyWrongResult.asInstanceOf[js.Any], qForceBadValueKeeping = qForceBadValueKeeping.asInstanceOf[js.Any], qGlobalOtherGrouping = qGlobalOtherGrouping.asInstanceOf[js.Any], qOtherCollapseInnerDimensions = qOtherCollapseInnerDimensions.asInstanceOf[js.Any], qOtherCounted = qOtherCounted.asInstanceOf[js.Any], qOtherLimit = qOtherLimit.asInstanceOf[js.Any], qOtherLimitMode = qOtherLimitMode.asInstanceOf[js.Any], qOtherMode = qOtherMode.asInstanceOf[js.Any], qOtherSortMode = qOtherSortMode.asInstanceOf[js.Any], qReferencedExpression = qReferencedExpression.asInstanceOf[js.Any], qSupressOther = qSupressOther.asInstanceOf[js.Any], qTotalMode = qTotalMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[OtherTotalSpecProp]
  }
  
  extension [Self <: OtherTotalSpecProp](x: Self) {
    
    inline def setQApplyEvenWhenPossiblyWrongResult(value: Boolean): Self = StObject.set(x, "qApplyEvenWhenPossiblyWrongResult", value.asInstanceOf[js.Any])
    
    inline def setQForceBadValueKeeping(value: Boolean): Self = StObject.set(x, "qForceBadValueKeeping", value.asInstanceOf[js.Any])
    
    inline def setQGlobalOtherGrouping(value: Boolean): Self = StObject.set(x, "qGlobalOtherGrouping", value.asInstanceOf[js.Any])
    
    inline def setQOtherCollapseInnerDimensions(value: Boolean): Self = StObject.set(x, "qOtherCollapseInnerDimensions", value.asInstanceOf[js.Any])
    
    inline def setQOtherCounted(value: ValueExpr): Self = StObject.set(x, "qOtherCounted", value.asInstanceOf[js.Any])
    
    inline def setQOtherLimit(value: ValueExpr): Self = StObject.set(x, "qOtherLimit", value.asInstanceOf[js.Any])
    
    inline def setQOtherLimitMode(value: OTHER_GE_LIMIT | OTHER_LE_LIMIT | OTHER_GT_LIMIT | OTHER_LT_LIMIT): Self = StObject.set(x, "qOtherLimitMode", value.asInstanceOf[js.Any])
    
    inline def setQOtherMode(
      value: OTHER_OFF | OTHER_COUNTED | OTHER_ABS_LIMITED | OTHER_ABS_ACC_TARGET | OTHER_REL_LIMITED | OTHER_REL_ACC_TARGET
    ): Self = StObject.set(x, "qOtherMode", value.asInstanceOf[js.Any])
    
    inline def setQOtherSortMode(value: OTHER_SORT_DEFAULT | OTHER_SORT_DESCENDING | OTHER_SORT_ASCENDING): Self = StObject.set(x, "qOtherSortMode", value.asInstanceOf[js.Any])
    
    inline def setQReferencedExpression(value: String): Self = StObject.set(x, "qReferencedExpression", value.asInstanceOf[js.Any])
    
    inline def setQSupressOther(value: Boolean): Self = StObject.set(x, "qSupressOther", value.asInstanceOf[js.Any])
    
    inline def setQTotalMode(value: TOTAL_OFF | TOTAL_EXPR): Self = StObject.set(x, "qTotalMode", value.asInstanceOf[js.Any])
  }
}
