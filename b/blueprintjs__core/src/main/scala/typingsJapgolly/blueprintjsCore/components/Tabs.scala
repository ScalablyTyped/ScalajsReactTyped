package typingsJapgolly.blueprintjsCore.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLElement
import typingsJapgolly.blueprintjsCore.tabMod.TabId
import typingsJapgolly.blueprintjsCore.tabsMod.ITabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    id: TabId,
    animate: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultSelectedTabId: TabId = null,
    large: js.UndefOr[Boolean] = js.undefined,
    onChange: (/* newTabId */ TabId, /* prevTabId */ TabId, /* event */ ReactMouseEventFrom[HTMLElement]) => Callback = null,
    renderActiveTabPanelOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTabId: TabId = null,
    vertical: js.UndefOr[Boolean] = js.undefined,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[ITabsProps, typingsJapgolly.blueprintjsCore.mod.Tabs, Unit, ITabsProps] = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
  
      if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (defaultSelectedTabId != null) __obj.updateDynamic("defaultSelectedTabId")(defaultSelectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(large)) __obj.updateDynamic("large")(large.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction3((t0: /* newTabId */ typingsJapgolly.blueprintjsCore.tabMod.TabId, t1: /* prevTabId */ typingsJapgolly.blueprintjsCore.tabMod.TabId, t2: /* event */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLElement]) => onChange(t0, t1, t2).runNow()))
    if (!js.isUndefined(renderActiveTabPanelOnly)) __obj.updateDynamic("renderActiveTabPanelOnly")(renderActiveTabPanelOnly.asInstanceOf[js.Any])
    if (selectedTabId != null) __obj.updateDynamic("selectedTabId")(selectedTabId.asInstanceOf[js.Any])
    if (!js.isUndefined(vertical)) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.blueprintjsCore.tabsMod.ITabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.blueprintjsCore.mod.Tabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.blueprintjsCore.tabsMod.ITabsProps])(children: _*)
  }
  @JSImport("@blueprintjs/core", "Tabs")
  @js.native
  object componentImport extends js.Object
  
}

