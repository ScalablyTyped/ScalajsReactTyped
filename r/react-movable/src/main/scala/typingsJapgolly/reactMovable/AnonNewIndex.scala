package typingsJapgolly.reactMovable

import org.scalajs.dom.raw.ClientRect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonNewIndex extends js.Object {
  var newIndex: Double
  var oldIndex: Double
  var targetRect: ClientRect
}

object AnonNewIndex {
  @scala.inline
  def apply(newIndex: Double, oldIndex: Double, targetRect: ClientRect): AnonNewIndex = {
    val __obj = js.Dynamic.literal(newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any], targetRect = targetRect.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonNewIndex]
  }
}

