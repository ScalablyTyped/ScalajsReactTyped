package typingsJapgolly.reactTabsRedux.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.component.JsForwardRef.UnmountedWithRoot
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactTabsRedux.tabsMod.TabsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object Tabs {
  def apply(
    activeLinkStyle: js.Object = null,
    disableInlineStyles: js.UndefOr[Boolean] = js.undefined,
    handleSelect: (/* tab */ String, /* name */ String) => Callback = null,
    name: String = null,
    onChange: (/* selectedTab */ String, /* name */ String) => Callback = null,
    renderActiveTabContentOnly: js.UndefOr[Boolean] = js.undefined,
    selectedTab: String = null,
    visibleTabStyle: js.Object = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedWithRoot[TabsProps, typingsJapgolly.reactTabsRedux.mod.Tabs, Unit, TabsProps] = {
    val __obj = js.Dynamic.literal()
  
      if (activeLinkStyle != null) __obj.updateDynamic("activeLinkStyle")(activeLinkStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(disableInlineStyles)) __obj.updateDynamic("disableInlineStyles")(disableInlineStyles.asInstanceOf[js.Any])
    if (handleSelect != null) __obj.updateDynamic("handleSelect")(js.Any.fromFunction2((t0: /* tab */ java.lang.String, t1: /* name */ java.lang.String) => handleSelect(t0, t1).runNow()))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2((t0: /* selectedTab */ java.lang.String, t1: /* name */ java.lang.String) => onChange(t0, t1).runNow()))
    if (!js.isUndefined(renderActiveTabContentOnly)) __obj.updateDynamic("renderActiveTabContentOnly")(renderActiveTabContentOnly.asInstanceOf[js.Any])
    if (selectedTab != null) __obj.updateDynamic("selectedTab")(selectedTab.asInstanceOf[js.Any])
    if (visibleTabStyle != null) __obj.updateDynamic("visibleTabStyle")(visibleTabStyle.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsForwardRefComponent.force[
  typingsJapgolly.reactTabsRedux.tabsMod.TabsProps, 
  japgolly.scalajs.react.Children.Varargs, 
  typingsJapgolly.reactTabsRedux.mod.Tabs](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.reactTabsRedux.tabsMod.TabsProps])(children: _*)
  }
  @JSImport("react-tabs-redux", "Tabs")
  @js.native
  object componentImport extends js.Object
  
}

