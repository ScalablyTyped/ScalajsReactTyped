package typingsJapgolly.rcMenu

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonItem extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement]
  var item: ReactInstance
  var key: String | Double
  var keyPath: js.Array[String | Double]
}

object AnonItem {
  @scala.inline
  def apply(
    domEvent: ReactMouseEventFrom[HTMLElement],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): AnonItem = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonItem]
  }
}

