package typingsJapgolly.gestalt

import japgolly.scalajs.react.ReactEventFrom
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonActiveTabIndex extends js.Object {
  var activeTabIndex: Double
  var event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]
}

object AnonActiveTabIndex {
  @scala.inline
  def apply(activeTabIndex: Double, event: ReactEventFrom[ReactMouseEventFrom[Element] with Element]): AnonActiveTabIndex = {
    val __obj = js.Dynamic.literal(activeTabIndex = activeTabIndex.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonActiveTabIndex]
  }
}

