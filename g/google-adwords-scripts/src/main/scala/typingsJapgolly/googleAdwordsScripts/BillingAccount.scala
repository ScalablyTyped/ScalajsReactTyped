package typingsJapgolly.googleAdwordsScripts

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Budget Orders
trait BillingAccount extends js.Object {
  def getId(): Double
  def getName(): String
  def getPrimaryBillingId(): String
  def getSecondaryBillingId(): String
}

object BillingAccount {
  @scala.inline
  def apply(
    getId: CallbackTo[Double],
    getName: CallbackTo[String],
    getPrimaryBillingId: CallbackTo[String],
    getSecondaryBillingId: CallbackTo[String]
  ): BillingAccount = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getName")(getName.toJsFn)
    __obj.updateDynamic("getPrimaryBillingId")(getPrimaryBillingId.toJsFn)
    __obj.updateDynamic("getSecondaryBillingId")(getSecondaryBillingId.toJsFn)
    __obj.asInstanceOf[BillingAccount]
  }
}

