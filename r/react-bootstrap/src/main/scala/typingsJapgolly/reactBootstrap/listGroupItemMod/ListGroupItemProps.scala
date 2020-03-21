package typingsJapgolly.reactBootstrap.listGroupItemMod

import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.react.mod.AllHTMLAttributes
import typingsJapgolly.react.mod.ClassAttributes
import typingsJapgolly.reactBootstrap.mod.Sizes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupItemProps
  extends AllHTMLAttributes[ListGroupItem]
     with ClassAttributes[ListGroupItem] {
  var active: js.UndefOr[js.Any] = js.undefined
  var bsSize: js.UndefOr[Sizes] = js.undefined
  var bsStyle: js.UndefOr[String] = js.undefined
  var eventKey: js.UndefOr[js.Any] = js.undefined
  var header: js.UndefOr[Node] = js.undefined
  var listItem: js.UndefOr[Boolean] = js.undefined
}

object ListGroupItemProps {
  @scala.inline
  def apply(
    AllHTMLAttributes: AllHTMLAttributes[ListGroupItem] = null,
    ClassAttributes: ClassAttributes[ListGroupItem] = null,
    active: js.Any = null,
    bsSize: Sizes = null,
    bsStyle: String = null,
    eventKey: js.Any = null,
    header: VdomNode = null,
    listItem: js.UndefOr[Boolean] = js.undefined
  ): ListGroupItemProps = {
    val __obj = js.Dynamic.literal()
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (active != null) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (bsSize != null) __obj.updateDynamic("bsSize")(bsSize.asInstanceOf[js.Any])
    if (bsStyle != null) __obj.updateDynamic("bsStyle")(bsStyle.asInstanceOf[js.Any])
    if (eventKey != null) __obj.updateDynamic("eventKey")(eventKey.asInstanceOf[js.Any])
    if (header != null) __obj.updateDynamic("header")(header.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(listItem)) __obj.updateDynamic("listItem")(listItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupItemProps]
  }
}

