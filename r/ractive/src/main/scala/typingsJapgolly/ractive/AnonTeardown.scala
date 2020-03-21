package typingsJapgolly.ractive

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTeardown extends js.Object {
  def teardown(): Unit
}

object AnonTeardown {
  @scala.inline
  def apply(teardown: Callback): AnonTeardown = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("teardown")(teardown.toJsFn)
    __obj.asInstanceOf[AnonTeardown]
  }
}

