package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StandardLine extends js.Object {
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
  @scala.inline
  def apply(
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getEntityId")(getEntityId.toJsFn)
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("getSubsidiaryId")(getSubsidiaryId.toJsFn)
    __obj.updateDynamic("getTaxAmount")(getTaxAmount.toJsFn)
    __obj.updateDynamic("getTaxItemId")(getTaxItemId.toJsFn)
    __obj.updateDynamic("getTaxType")(getTaxType.toJsFn)
    __obj.updateDynamic("getTaxableAmount")(getTaxableAmount.toJsFn)
    __obj.updateDynamic("isPosting")(isPosting.toJsFn)
    __obj.updateDynamic("isTaxable")(isTaxable.toJsFn)
    __obj.asInstanceOf[StandardLine]
  }
}

