package typingsJapgolly.officeUiFabricReact

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDispose extends js.Object {
  var key: String
  def dispose(): Unit
}

object AnonDispose {
  @scala.inline
  def apply(dispose: Callback, key: String): AnonDispose = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.updateDynamic("dispose")(dispose.toJsFn)
    __obj.asInstanceOf[AnonDispose]
  }
}

