package typingsJapgolly.backboneLocalstorage.mod.backboneAugmentingMod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Serializer extends js.Object {
  def deserialize(data: js.Any): js.Any
  def serialize(item: js.Any): js.Any
}

object Serializer {
  @scala.inline
  def apply(deserialize: js.Any => CallbackTo[js.Any], serialize: js.Any => CallbackTo[js.Any]): Serializer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: js.Any) => deserialize(t0).runNow()))
    __obj.updateDynamic("serialize")(js.Any.fromFunction1((t0: js.Any) => serialize(t0).runNow()))
    __obj.asInstanceOf[Serializer]
  }
}

