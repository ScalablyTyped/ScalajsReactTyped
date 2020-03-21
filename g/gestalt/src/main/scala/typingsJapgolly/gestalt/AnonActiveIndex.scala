package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveIndex extends js.Object {
  var activeIndex: Double
  var event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]
}

object AnonActiveIndex {
  @scala.inline
  def apply(activeIndex: Double, event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]): AnonActiveIndex = {
    val __obj = js.Dynamic.literal(activeIndex = activeIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveIndex]
  }
}

