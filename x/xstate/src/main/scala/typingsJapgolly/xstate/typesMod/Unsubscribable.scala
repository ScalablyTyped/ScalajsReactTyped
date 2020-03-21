package typingsJapgolly.xstate.typesMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribable extends js.Object {
  def unsubscribe(): js.Any | Unit
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: CallbackTo[js.Any | Unit]): Unsubscribable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Unsubscribable]
  }
}

