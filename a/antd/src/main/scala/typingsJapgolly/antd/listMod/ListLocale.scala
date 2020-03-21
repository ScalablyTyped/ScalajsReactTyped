package typingsJapgolly.antd.listMod

import japgolly.scalajs.react.raw.React.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListLocale extends js.Object {
  var emptyText: Node | js.Function0[Node]
}

object ListLocale {
  @scala.inline
  def apply(emptyText: Node | js.Function0[Node] = null): ListLocale = {
    val __obj = js.Dynamic.literal()
    if (emptyText != null) __obj.updateDynamic("emptyText")(emptyText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListLocale]
  }
}

