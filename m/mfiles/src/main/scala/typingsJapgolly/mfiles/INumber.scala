package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INumber extends js.Object {
  var Value: Double
  def Clone(): INumber
}

object INumber {
  @scala.inline
  def apply(Clone: CallbackTo[INumber], Value: Double): INumber = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[INumber]
  }
}

