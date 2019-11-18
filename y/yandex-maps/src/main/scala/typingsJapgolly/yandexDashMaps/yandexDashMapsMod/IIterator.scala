package typingsJapgolly.yandexDashMaps.yandexDashMapsMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IIterator extends js.Object {
  def getNext(): js.Object | Null
}

object IIterator {
  @scala.inline
  def apply(getNext: CallbackTo[js.Object | Null]): IIterator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getNext")(getNext.toJsFn)
    __obj.asInstanceOf[IIterator]
  }
}

