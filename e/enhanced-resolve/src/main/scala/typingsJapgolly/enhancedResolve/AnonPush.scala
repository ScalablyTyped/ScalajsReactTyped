package typingsJapgolly.enhancedResolve

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPush extends js.Object {
  def push(item: String): Unit
}

object AnonPush {
  @scala.inline
  def apply(push: String => Callback): AnonPush = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("push")(js.Any.fromFunction1((t0: java.lang.String) => push(t0).runNow()))
    __obj.asInstanceOf[AnonPush]
  }
}

