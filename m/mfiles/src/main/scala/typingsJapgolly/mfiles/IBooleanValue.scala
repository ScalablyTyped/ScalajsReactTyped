package typingsJapgolly.mfiles

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IBooleanValue extends js.Object {
  var Value: Boolean
  def Clone(): IBooleanValue
}

object IBooleanValue {
  @scala.inline
  def apply(Clone: CallbackTo[IBooleanValue], Value: Boolean): IBooleanValue = {
    val __obj = js.Dynamic.literal(Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("Clone")(Clone.toJsFn)
    __obj.asInstanceOf[IBooleanValue]
  }
}

