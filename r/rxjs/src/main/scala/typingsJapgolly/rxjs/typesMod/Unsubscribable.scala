package typingsJapgolly.rxjs.typesMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Unsubscribable extends js.Object {
  def unsubscribe(): Unit
}

object Unsubscribable {
  @scala.inline
  def apply(unsubscribe: Callback): Unsubscribable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("unsubscribe")(unsubscribe.toJsFn)
    __obj.asInstanceOf[Unsubscribable]
  }
}

