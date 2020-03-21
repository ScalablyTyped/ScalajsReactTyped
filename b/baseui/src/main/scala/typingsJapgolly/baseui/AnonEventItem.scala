package typingsJapgolly.baseui

import japgolly.scalajs.react.ReactEventFrom
import org.scalajs.dom.raw.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventItem extends js.Object {
  var event: ReactEventFrom[Element]
  var item: js.Any
}

object AnonEventItem {
  @scala.inline
  def apply(event: ReactEventFrom[Element], item: js.Any): AnonEventItem = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonEventItem]
  }
}

