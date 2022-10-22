package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLine extends StObject {
  
  def getEntityId(): Double
  
  def getId(): Double
  
  def getSubsidiaryId(): Double
  
  def getTaxAmount(): String
  
  def getTaxItemId(): Double
  
  def getTaxType(): String
  
  def getTaxableAmount(): String
  
  def isPosting(): Boolean
  
  def isTaxable(): Boolean
}
object StandardLine {
  
  inline def apply(
    getEntityId: CallbackTo[Double],
    getId: CallbackTo[Double],
    getSubsidiaryId: CallbackTo[Double],
    getTaxAmount: CallbackTo[String],
    getTaxItemId: CallbackTo[Double],
    getTaxType: CallbackTo[String],
    getTaxableAmount: CallbackTo[String],
    isPosting: CallbackTo[Boolean],
    isTaxable: CallbackTo[Boolean]
  ): StandardLine = {
    val __obj = js.Dynamic.literal(getEntityId = getEntityId.toJsFn, getId = getId.toJsFn, getSubsidiaryId = getSubsidiaryId.toJsFn, getTaxAmount = getTaxAmount.toJsFn, getTaxItemId = getTaxItemId.toJsFn, getTaxType = getTaxType.toJsFn, getTaxableAmount = getTaxableAmount.toJsFn, isPosting = isPosting.toJsFn, isTaxable = isTaxable.toJsFn)
    __obj.asInstanceOf[StandardLine]
  }
  
  extension [Self <: StandardLine](x: Self) {
    
    inline def setGetEntityId(value: CallbackTo[Double]): Self = StObject.set(x, "getEntityId", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetSubsidiaryId(value: CallbackTo[Double]): Self = StObject.set(x, "getSubsidiaryId", value.toJsFn)
    
    inline def setGetTaxAmount(value: CallbackTo[String]): Self = StObject.set(x, "getTaxAmount", value.toJsFn)
    
    inline def setGetTaxItemId(value: CallbackTo[Double]): Self = StObject.set(x, "getTaxItemId", value.toJsFn)
    
    inline def setGetTaxType(value: CallbackTo[String]): Self = StObject.set(x, "getTaxType", value.toJsFn)
    
    inline def setGetTaxableAmount(value: CallbackTo[String]): Self = StObject.set(x, "getTaxableAmount", value.toJsFn)
    
    inline def setIsPosting(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPosting", value.toJsFn)
    
    inline def setIsTaxable(value: CallbackTo[Boolean]): Self = StObject.set(x, "isTaxable", value.toJsFn)
  }
}
