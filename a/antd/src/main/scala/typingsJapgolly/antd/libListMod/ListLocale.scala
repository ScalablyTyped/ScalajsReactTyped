package typingsJapgolly.antd.libListMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: Node | js.Function0[Node]
}

object ListLocale {
  @scala.inline
  def apply(emptyText: Node | js.Function0[Node]): ListLocale = {
    val __obj = js.Dynamic.literal(emptyText = emptyText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ListLocale]
  }
}

