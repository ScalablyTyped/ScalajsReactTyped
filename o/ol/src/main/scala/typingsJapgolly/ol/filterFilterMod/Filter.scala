package typingsJapgolly.ol.filterFilterMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Filter extends js.Object {
  def getTagName(): String
}

object Filter {
  @scala.inline
  def apply(getTagName: CallbackTo[String]): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getTagName")(getTagName.toJsFn)
    __obj.asInstanceOf[Filter]
  }
}

