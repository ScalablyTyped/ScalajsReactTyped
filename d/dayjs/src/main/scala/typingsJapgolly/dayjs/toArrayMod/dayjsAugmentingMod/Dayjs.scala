package typingsJapgolly.dayjs.toArrayMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def toArray(): js.Array[Double]
}

object Dayjs {
  @scala.inline
  def apply(toArray: CallbackTo[js.Array[Double]]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toArray")(toArray.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

