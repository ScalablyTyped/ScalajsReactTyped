package typingsJapgolly.antd.esTableColumnGroupMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnGroupProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var title: js.UndefOr[Node] = js.undefined
}

object ColumnGroupProps {
  @scala.inline
  def apply(className: String = null, title: VdomNode = null): ColumnGroupProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.rawNode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnGroupProps]
  }
}

