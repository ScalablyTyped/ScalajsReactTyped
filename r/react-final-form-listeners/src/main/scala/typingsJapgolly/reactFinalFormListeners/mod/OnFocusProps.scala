package typingsJapgolly.reactFinalFormListeners.mod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnFocusProps extends js.Object {
  var name: String
  def children(): Unit
}

object OnFocusProps {
  @scala.inline
  def apply(children: Callback, name: String): OnFocusProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("children")(children.toJsFn)
    __obj.asInstanceOf[OnFocusProps]
  }
}

