package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BudgetOrder extends StObject {
  
  def getBillingAccount(): BillingAccount
  
  def getEndDatetime(): AdWordsDate
  
  def getId(): Double
  
  def getName(): String
  
  def getPoNumber(): Double
  
  def getSpendingLimit(): Double
  
  def getStartDateTime(): AdWordsDate
  
  def getTotalAdjustments(): Double
}
object BudgetOrder {
  
  inline def apply(
    getBillingAccount: CallbackTo[BillingAccount],
    getEndDatetime: CallbackTo[AdWordsDate],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getPoNumber: CallbackTo[Double],
    getSpendingLimit: CallbackTo[Double],
    getStartDateTime: CallbackTo[AdWordsDate],
    getTotalAdjustments: CallbackTo[Double]
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = getBillingAccount.toJsFn, getEndDatetime = getEndDatetime.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getPoNumber = getPoNumber.toJsFn, getSpendingLimit = getSpendingLimit.toJsFn, getStartDateTime = getStartDateTime.toJsFn, getTotalAdjustments = getTotalAdjustments.toJsFn)
    __obj.asInstanceOf[BudgetOrder]
  }
  
  extension [Self <: BudgetOrder](x: Self) {
    
    inline def setGetBillingAccount(value: CallbackTo[BillingAccount]): Self = StObject.set(x, "getBillingAccount", value.toJsFn)
    
    inline def setGetEndDatetime(value: CallbackTo[AdWordsDate]): Self = StObject.set(x, "getEndDatetime", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPoNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getPoNumber", value.toJsFn)
    
    inline def setGetSpendingLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getSpendingLimit", value.toJsFn)
    
    inline def setGetStartDateTime(value: CallbackTo[AdWordsDate]): Self = StObject.set(x, "getStartDateTime", value.toJsFn)
    
    inline def setGetTotalAdjustments(value: CallbackTo[Double]): Self = StObject.set(x, "getTotalAdjustments", value.toJsFn)
  }
}
