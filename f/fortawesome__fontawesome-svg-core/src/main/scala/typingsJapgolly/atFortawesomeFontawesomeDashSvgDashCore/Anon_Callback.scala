package typingsJapgolly.atFortawesomeFontawesomeDashSvgDashCore

import japgolly.scalajs.react.Callback
import org.scalajs.dom.raw.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Callback extends js.Object {
  var node: Node
  def callback(): Unit
}

object Anon_Callback {
  @scala.inline
  def apply(callback: Callback, node: Node): Anon_Callback = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any])
    __obj.updateDynamic("callback")(callback.toJsFn)
    __obj.asInstanceOf[Anon_Callback]
  }
}

