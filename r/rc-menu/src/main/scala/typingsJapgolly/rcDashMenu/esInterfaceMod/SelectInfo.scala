package typingsJapgolly.rcDashMenu.esInterfaceMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectInfo extends MenuInfo {
  var selectedKeys: js.UndefOr[js.Array[Key]] = js.undefined
}

object SelectInfo {
  @scala.inline
  def apply(
    domEvent: ReactMouseEventFrom[HTMLElement],
    item: ReactInstance,
    key: Key,
    keyPath: js.Array[Key],
    selectedKeys: js.Array[Key] = null
  ): SelectInfo = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
    if (selectedKeys != null) __obj.updateDynamic("selectedKeys")(selectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectInfo]
  }
}

