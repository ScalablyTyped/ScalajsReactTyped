package typingsJapgolly.baseui

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewIndex extends js.Object {
  var newIndex: Double
  var newState: js.Array[Node]
  var oldIndex: Double
}

object AnonNewIndex {
  @scala.inline
  def apply(newIndex: Double, newState: js.Array[Node], oldIndex: Double): AnonNewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], newState = newState.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewIndex]
  }
}

