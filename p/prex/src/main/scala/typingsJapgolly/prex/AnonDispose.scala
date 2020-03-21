package typingsJapgolly.prex

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  def dispose(): js.Any
}

object AnonDispose {
  @scala.inline
  def apply(dispose: CallbackTo[js.Any]): AnonDispose = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[AnonDispose]
  }
}

