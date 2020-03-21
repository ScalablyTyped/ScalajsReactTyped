package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCurrent extends js.Object {
  var current: Double
  var indicatorStyle: Null
  var mode: String
  var simple: Boolean
  var total: Double
  def onChange(): Unit
}

object AnonCurrent {
  @scala.inline
  def apply(
    current: Double,
    indicatorStyle: Null,
    mode: String,
    onChange: Callback,
    simple: Boolean,
    total: Double
  ): AnonCurrent = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], indicatorStyle = indicatorStyle.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], simple = simple.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.updateDynamic("onChange")(onChange.toJsFn)
    __obj.asInstanceOf[AnonCurrent]
  }
}

