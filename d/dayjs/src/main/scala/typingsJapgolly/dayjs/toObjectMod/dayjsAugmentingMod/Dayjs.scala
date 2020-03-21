package typingsJapgolly.dayjs.toObjectMod.dayjsAugmentingMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.dayjs.toObjectMod.DayjsObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Dayjs extends js.Object {
  def toObject(): DayjsObject
}

object Dayjs {
  @scala.inline
  def apply(toObject: CallbackTo[DayjsObject]): Dayjs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("toObject")(toObject.toJsFn)
    __obj.asInstanceOf[Dayjs]
  }
}

