package typingsJapgolly.antd.menuMod

import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectParam extends js.Object {
  var domEvent: Event_
  var item: js.Any
  var key: String
  var keyPath: js.Array[String]
  var selectedKeys: js.Array[String]
}

object SelectParam {
  @scala.inline
  def apply(
    domEvent: Event_,
    item: js.Any,
    key: String,
    keyPath: js.Array[String],
    selectedKeys: js.Array[String]
  ): SelectParam = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any], selectedKeys = selectedKeys.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SelectParam]
  }
}

