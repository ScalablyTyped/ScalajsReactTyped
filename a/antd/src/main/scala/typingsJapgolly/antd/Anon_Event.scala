package typingsJapgolly.antd

import japgolly.scalajs.react.raw.React.Component
import typingsJapgolly.antd.antdStrings.load
import typingsJapgolly.antd.libTreeTreeMod.AntTreeNodeProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Event extends js.Object {
  var event: load
  var node: Component[AntTreeNodeProps with js.Object, js.Object]
}

object Anon_Event {
  @scala.inline
  def apply(event: load, node: Component[AntTreeNodeProps with js.Object, js.Object]): Anon_Event = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Event]
  }
}

