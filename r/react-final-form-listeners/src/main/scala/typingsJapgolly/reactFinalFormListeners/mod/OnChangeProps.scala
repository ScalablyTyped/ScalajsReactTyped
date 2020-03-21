package typingsJapgolly.reactFinalFormListeners.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnChangeProps extends js.Object {
  var name: String
  def children(value: js.Any, previous: js.Any): Unit
}

object OnChangeProps {
  @scala.inline
  def apply(children: (js.Any, js.Any) => Callback, name: String): OnChangeProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(js.Any.fromFunction2((t0: js.Any, t1: js.Any) => children(t0, t1).runNow()))
    __obj.asInstanceOf[OnChangeProps]
  }
}

