package typingsJapgolly.reactDashNative.reactDashNativeMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleSheetProperties extends js.Object {
  var hairlineWidth: Double
  def flatten[T /* <: String */](style: T): T
}

object StyleSheetProperties {
  @scala.inline
  def apply(flatten: js.Any => CallbackTo[js.Any], hairlineWidth: Double): StyleSheetProperties = {
    val __obj = js.Dynamic.literal(hairlineWidth = hairlineWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("flatten")(js.Any.fromFunction1((t0: js.Any) => flatten(t0).runNow()))
    __obj.asInstanceOf[StyleSheetProperties]
  }
}

