package typingsJapgolly.reactTabsRedux.tabsMod

import japgolly.scalajs.react.Callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabsProps extends js.Object {
  var activeLinkStyle: js.UndefOr[js.Object] = js.undefined
  var disableInlineStyles: js.UndefOr[Boolean] = js.undefined
  var handleSelect: js.UndefOr[js.Function2[/* tab */ String, /* name */ String, Unit]] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* selectedTab */ String, /* name */ String, Unit]] = js.undefined
  var renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined
  var selectedTab: js.UndefOr[String] = js.undefined
  var visibleTabStyle: js.UndefOr[js.Object] = js.undefined
}

object TabsProps {
  @scala.inline
  def apply(
    activeLinkStyle: js.Object = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Callback = null,
    name: String = null,
    onChange: (/* selectedTab */ String, /* name */ String) => Callback = null,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTab: String = null,
    visibleTabStyle: js.Object = null
  ): TabsProps = {
    val __obj = js.Dynamic.literal()
    if (activeLinkStyle != null) __obj.updateDynamic("activeLinkStyle")(activeLinkStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2((t0: /* tab */ java.lang.String, t1: /* name */ java.lang.String) => handleSelect(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedTab */ java.lang.String, t1: /* name */ java.lang.String) => onChange(t0, t1).runNow()))
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (visibleTabStyle != null) __obj.updateDynamic("visibleTabStyle")(visibleTabStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[TabsProps]
  }
}

