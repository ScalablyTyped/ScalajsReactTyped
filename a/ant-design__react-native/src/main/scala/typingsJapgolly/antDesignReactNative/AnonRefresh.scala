package typingsJapgolly.antDesignReactNative

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRefresh extends js.Object {
  def refresh(): Unit
}

object AnonRefresh {
  @scala.inline
  def apply(refresh: Callback): AnonRefresh = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("refresh")(refresh.toJsFn)
    __obj.asInstanceOf[AnonRefresh]
  }
}

