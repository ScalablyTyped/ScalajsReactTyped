package typingsJapgolly.suitescript

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountingBook extends js.Object {
  def getId(): Double
  def isPrimary(): Boolean
}

object AccountingBook {
  @scala.inline
  def apply(getId: CallbackTo[Double], isPrimary: CallbackTo[Boolean]): AccountingBook = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getId")(getId.toJsFn)
    __obj.updateDynamic("isPrimary")(isPrimary.toJsFn)
    __obj.asInstanceOf[AccountingBook]
  }
}

