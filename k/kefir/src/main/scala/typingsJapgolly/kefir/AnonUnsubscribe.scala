package typingsJapgolly.kefir

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonUnsubscribe extends js.Object {
  def unsubscribe(): Unit
}

object AnonUnsubscribe {
  @scala.inline
  def apply(unsubscribe: Callback): AnonUnsubscribe = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[AnonUnsubscribe]
  }
}

