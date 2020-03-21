package typingsJapgolly.reactDnd

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  var dispose: js.Function0[Unit]
}

object AnonDispose {
  @scala.inline
  def apply(dispose: Callback): AnonDispose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[AnonDispose]
  }
}

