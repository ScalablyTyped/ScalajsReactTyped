package typingsJapgolly.rcDashMenu

import typingsJapgolly.react.reactMod.Key
import typingsJapgolly.react.reactMod.ReactInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Item extends js.Object {
  var item: ReactInstance
  var key: Key
  var open: Boolean
  var trigger: String
}

object Anon_Item {
  @scala.inline
  def apply(item: ReactInstance, key: Key, open: Boolean, trigger: String): Anon_Item = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Item]
  }
}

