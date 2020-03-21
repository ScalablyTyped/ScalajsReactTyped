package typingsJapgolly.blueprintjsCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.ReactMouseEventFrom
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.tabMod.TabId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@blueprintjs/core.@blueprintjs/core/lib/esm/components/tabs/tabs.ITabsProps> */
trait PartialITabsProps extends js.Object {
  var animate: js.UndefOr[Boolean] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var defaultSelectedTabId: js.UndefOr[TabId] = js.undefined
  var id: js.UndefOr[TabId] = js.undefined
  var large: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[
    js.Function3[
      /* newTabId */ TabId, 
      /* prevTabId */ TabId, 
      /* event */ ReactMouseEventFrom[HTMLElement], 
      Unit
    ]
  ] = js.undefined
  var renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined
  var selectedTabId: js.UndefOr[TabId] = js.undefined
  var vertical: js.UndefOr[Boolean] = js.undefined
}

object PartialITabsProps {
  @scala.inline
  def apply(
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultSelectedTabId: TabId = null,
    id: TabId = null,
    large: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTabId: TabId = null,
    vertical: js.UndefOr[Boolean] = js.undefined
  ): PartialITabsProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedTabId != null) __obj.updateDynamic("defaultSelectedTabId")(defaultSelectedTabId.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* newTabId */ typingsJapgolly.blueprintjsCore.tabMod.TabId, t1: /* prevTabId */ typingsJapgolly.blueprintjsCore.tabMod.TabId, t2: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChange(t0, t1, t2).runNow()))
    if (!js.isUndefined(renderActiveTabPanelOnly)) __obj.updateDynamic("renderActiveTabPanelOnly")(renderActiveTabPanelOnly.asInstanceOf[js.Any])
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialITabsProps]
  }
}

