package typingsJapgolly.baseui.dndListMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait State extends js.Object {
  var items: js.Array[Node]
}

object State {
  @scala.inline
  def apply(items: js.Array[Node]): State = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[State]
  }
}

