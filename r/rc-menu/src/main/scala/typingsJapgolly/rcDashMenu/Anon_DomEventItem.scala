package typingsJapgolly.rcDashMenu

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DomEventItem extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement]
  var item: ReactInstance
  var key: String | Double
  var keyPath: js.Array[String | Double]
}

object Anon_DomEventItem {
  @scala.inline
  def apply(
    domEvent: ReactMouseEventFrom[HTMLElement],
    item: ReactInstance,
    key: String | Double,
    keyPath: js.Array[String | Double]
  ): Anon_DomEventItem = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DomEventItem]
  }
}

