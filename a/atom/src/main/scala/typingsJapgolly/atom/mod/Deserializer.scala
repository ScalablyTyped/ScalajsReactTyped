package typingsJapgolly.atom.mod

import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Deserializer extends js.Object {
  var name: String
  def deserialize(state: js.Object): js.Object
}

object Deserializer {
  @scala.inline
  def apply(deserialize: js.Object => CallbackTo[js.Object], name: String): Deserializer = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("deserialize")(js.Any.fromFunction1((t0: js.Object) => deserialize(t0).runNow()))
    __obj.asInstanceOf[Deserializer]
  }
}

