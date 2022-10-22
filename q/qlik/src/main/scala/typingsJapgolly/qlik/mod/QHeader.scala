package typingsJapgolly.qlik.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.qlik.qlikStrings.A
import typingsJapgolly.qlik.qlikStrings.B
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QHeader extends StObject {
  
  var col: Double
  
  var errorCode: js.UndefOr[Double] = js.undefined
  
  var errorMessage: js.UndefOr[Double] = js.undefined
  
  var isOrderedBy: Boolean
  
  def orderBy(): Unit
  
  var qCardinal: js.UndefOr[Double] = js.undefined
  
  var qFallbackTitle: String
  
  var qMax: js.UndefOr[Double] = js.undefined
  
  // field?: Field
  var qMin: js.UndefOr[Double] = js.undefined
  
  var qReverseSort: Boolean
  
  var qSortIndicator: A | B
  
  var qStateCounts: js.UndefOr[StringDictionary[Double]] = js.undefined
  
  def reverseOrder(): Unit
  
  def selectRange(min: Double, max: Double, inclMin: Boolean, inclMax: Boolean): js.Promise[Any]
}
object QHeader {
  
  inline def apply(
    col: Double,
    isOrderedBy: Boolean,
    orderBy: Callback,
    qFallbackTitle: String,
    qReverseSort: Boolean,
    qSortIndicator: A | B,
    reverseOrder: Callback,
    selectRange: (Double, Double, Boolean, Boolean) => js.Promise[Any]
  ): QHeader = {
    val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], isOrderedBy = isOrderedBy.asInstanceOf[js.Any], orderBy = orderBy.toJsFn, qFallbackTitle = qFallbackTitle.asInstanceOf[js.Any], qReverseSort = qReverseSort.asInstanceOf[js.Any], qSortIndicator = qSortIndicator.asInstanceOf[js.Any], reverseOrder = reverseOrder.toJsFn, selectRange = js.Any.fromFunction4(selectRange))
    __obj.asInstanceOf[QHeader]
  }
  
  extension [Self <: QHeader](x: Self) {
    
    inline def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setErrorMessage(value: Double): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "errorMessage", js.undefined)
    
    inline def setIsOrderedBy(value: Boolean): Self = StObject.set(x, "isOrderedBy", value.asInstanceOf[js.Any])
    
    inline def setOrderBy(value: Callback): Self = StObject.set(x, "orderBy", value.toJsFn)
    
    inline def setQCardinal(value: Double): Self = StObject.set(x, "qCardinal", value.asInstanceOf[js.Any])
    
    inline def setQCardinalUndefined: Self = StObject.set(x, "qCardinal", js.undefined)
    
    inline def setQFallbackTitle(value: String): Self = StObject.set(x, "qFallbackTitle", value.asInstanceOf[js.Any])
    
    inline def setQMax(value: Double): Self = StObject.set(x, "qMax", value.asInstanceOf[js.Any])
    
    inline def setQMaxUndefined: Self = StObject.set(x, "qMax", js.undefined)
    
    inline def setQMin(value: Double): Self = StObject.set(x, "qMin", value.asInstanceOf[js.Any])
    
    inline def setQMinUndefined: Self = StObject.set(x, "qMin", js.undefined)
    
    inline def setQReverseSort(value: Boolean): Self = StObject.set(x, "qReverseSort", value.asInstanceOf[js.Any])
    
    inline def setQSortIndicator(value: A | B): Self = StObject.set(x, "qSortIndicator", value.asInstanceOf[js.Any])
    
    inline def setQStateCounts(value: StringDictionary[Double]): Self = StObject.set(x, "qStateCounts", value.asInstanceOf[js.Any])
    
    inline def setQStateCountsUndefined: Self = StObject.set(x, "qStateCounts", js.undefined)
    
    inline def setReverseOrder(value: Callback): Self = StObject.set(x, "reverseOrder", value.toJsFn)
    
    inline def setSelectRange(value: (Double, Double, Boolean, Boolean) => js.Promise[Any]): Self = StObject.set(x, "selectRange", js.Any.fromFunction4(value))
  }
}
