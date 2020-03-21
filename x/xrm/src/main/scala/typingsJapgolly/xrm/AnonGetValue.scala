package typingsJapgolly.xrm

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.xrm.XrmEnum.StageCategory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonGetValue extends js.Object {
  def getValue(): StageCategory
}

object AnonGetValue {
  @scala.inline
  def apply(getValue: CallbackTo[StageCategory]): AnonGetValue = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getValue")(getValue.toJsFn)
    __obj.asInstanceOf[AnonGetValue]
  }
}

