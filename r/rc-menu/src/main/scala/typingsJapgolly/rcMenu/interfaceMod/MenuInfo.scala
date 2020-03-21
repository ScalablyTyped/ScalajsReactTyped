package typingsJapgolly.rcMenu.interfaceMod

import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.react.mod.Key
import typingsJapgolly.react.mod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MenuInfo extends js.Object {
  var domEvent: ReactMouseEventFrom[HTMLElement]
  var item: ReactInstance
  var key: Key
  var keyPath: js.Array[Key]
}

object MenuInfo {
  @scala.inline
  def apply(domEvent: ReactMouseEventFrom[HTMLElement], item: ReactInstance, key: Key, keyPath: js.Array[Key]): MenuInfo = {
    val __obj = js.Dynamic.literal(domEvent = domEvent.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], keyPath = keyPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[MenuInfo]
  }
}

