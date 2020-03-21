package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BudgetOrder extends js.Object {
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
  @scala.inline
  def apply(
    getBillingAccount: CallbackTo[BillingAccount],
    getEndDatetime: CallbackTo[AdWordsDate],
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getPoNumber: CallbackTo[Double],
    getSpendingLimit: CallbackTo[Double],
    getStartDateTime: CallbackTo[AdWordsDate],
    getTotalAdjustments: CallbackTo[Double]
  ): BudgetOrder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getBillingAccount")(getBillingAccount.toJsFn)
    __obj.updateDynamic("getEndDatetime")(getEndDatetime.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPoNumber")(getPoNumber.toJsFn)
    __obj.updateDynamic("getSpendingLimit")(getSpendingLimit.toJsFn)
    __obj.updateDynamic("getStartDateTime")(getStartDateTime.toJsFn)
    __obj.updateDynamic("getTotalAdjustments")(getTotalAdjustments.toJsFn)
    __obj.asInstanceOf[BudgetOrder]
  }
}

