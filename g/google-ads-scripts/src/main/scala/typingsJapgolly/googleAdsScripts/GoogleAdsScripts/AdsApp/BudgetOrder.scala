package typingsJapgolly.googleAdsScripts.GoogleAdsScripts.AdsApp

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a Google Ads budget order. Budget orders are used for managing client budgets at the account level.
  * Each budget order is associated with a billing account which can take invoices for consolidated billing.
  * For details about budget orders and billing accounts, see Budget Order Service.
  */
trait BudgetOrder extends StObject {
  
  /** Returns the associated billing account. */
  def getBillingAccount(): BillingAccount
  
  /** Returns the budget order's end date or null if there is no end date. */
  def getEndDateTime(): GoogleAdsDate
  
  /** Returns the ID of the budget order. */
  def getId(): Double
  
  /** Returns the name of the budget order. */
  def getName(): String
  
  /** Returns the purchase order number. */
  def getPoNumber(): Double
  
  /** Returns the effective spending limit in the account's currency, including all adjustments that have been applied to the budget order. */
  def getSpendingLimit(): Double
  
  /** Returns the budget order's start date. */
  def getStartDateTime(): GoogleAdsDate
  
  /** Returns the total adjustments that have been applied to the spending limit, in the account's currency. */
  def getTotalAdjustments(): Double
}
object BudgetOrder {
  
  inline def apply(
    getBillingAccount: CallbackTo[BillingAccount],
    getEndDateTime: CallbackTo[GoogleAdsDate],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getPoNumber: CallbackTo[Double],
    getSpendingLimit: CallbackTo[Double],
    getStartDateTime: CallbackTo[GoogleAdsDate],
    getTotalAdjustments: CallbackTo[Double]
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal(getBillingAccount = getBillingAccount.toJsFn, getEndDateTime = getEndDateTime.toJsFn, getId = getId.toJsFn, getName = getName.toJsFn, getPoNumber = getPoNumber.toJsFn, getSpendingLimit = getSpendingLimit.toJsFn, getStartDateTime = getStartDateTime.toJsFn, getTotalAdjustments = getTotalAdjustments.toJsFn)
    __obj.asInstanceOf[BudgetOrder]
  }
  
  extension [Self <: BudgetOrder](x: Self) {
    
    inline def setGetBillingAccount(value: CallbackTo[BillingAccount]): Self = StObject.set(x, "getBillingAccount", value.toJsFn)
    
    inline def setGetEndDateTime(value: CallbackTo[GoogleAdsDate]): Self = StObject.set(x, "getEndDateTime", value.toJsFn)
    
    inline def setGetId(value: CallbackTo[Double]): Self = StObject.set(x, "getId", value.toJsFn)
    
    inline def setGetName(value: CallbackTo[String]): Self = StObject.set(x, "getName", value.toJsFn)
    
    inline def setGetPoNumber(value: CallbackTo[Double]): Self = StObject.set(x, "getPoNumber", value.toJsFn)
    
    inline def setGetSpendingLimit(value: CallbackTo[Double]): Self = StObject.set(x, "getSpendingLimit", value.toJsFn)
    
    inline def setGetStartDateTime(value: CallbackTo[GoogleAdsDate]): Self = StObject.set(x, "getStartDateTime", value.toJsFn)
    
    inline def setGetTotalAdjustments(value: CallbackTo[Double]): Self = StObject.set(x, "getTotalAdjustments", value.toJsFn)
  }
}
