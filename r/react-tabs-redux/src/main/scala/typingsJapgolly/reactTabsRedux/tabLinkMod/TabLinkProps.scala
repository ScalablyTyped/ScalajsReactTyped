package typingsJapgolly.reactTabsRedux.tabLinkMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabLinkProps extends js.Object {
  var activeClassName: js.UndefOr[String] = js.undefined
  var activeStyle: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var component: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[Boolean] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
  var isActive: js.UndefOr[Boolean] = js.undefined
  var namespace: js.UndefOr[String] = js.undefined
  var onClick: js.UndefOr[js.Function1[/* event */ Event_, Unit]] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var to: Double | String
}

object TabLinkProps {
  @scala.inline
  def apply(
    to: Double | String,
    activeClassName: String = null,
    activeStyle: js.Object = null,
    children: VdomNode = null,
    className: String = null,
    component: String = null,
    default: js.UndefOr[Boolean] = js.undefined,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Callback = null,
    isActive: js.UndefOr[Boolean] = js.undefined,
    namespace: String = null,
    onClick: /* event */ Event_ => Callback = null,
    style: js.Object = null
  ): TabLinkProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2((t0: /* tab */ java.lang.String, t1: /* name */ java.lang.String) => handleSelect(t0, t1).runNow()))
    if (!js.isUndefined(isActive)) __obj.updateDynamic("isActive")(isActive.asInstanceOf[js.Any])
    if (namespace != null) __obj.updateDynamic("namespace")(namespace.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1((t0: /* event */ typingsJapgolly.std.Event_) => onClick(t0).runNow()))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabLinkProps]
  }
}

