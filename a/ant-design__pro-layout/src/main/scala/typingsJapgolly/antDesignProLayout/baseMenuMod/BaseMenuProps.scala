package typingsJapgolly.antDesignProLayout.baseMenuMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import typingsJapgolly.antDesignProLayout.MenuDataItemisUrlboolean
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route> ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/typings.RouterTypes<@ant-design/pro-layout.@ant-design/pro-layout/lib/typings.Route>[P]}
- Dropped {[ P in std.Exclude<keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps * / any, 'openKeys' | 'onOpenChange'> ]: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps * / any[P]}
- Dropped {[ P in keyof @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings ]:? @ant-design/pro-layout.@ant-design/pro-layout/lib/defaultSettings.Settings[P]} */ trait BaseMenuProps extends js.Object {
  var className: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var formatMessage: js.UndefOr[js.Function1[/* message */ MessageDescriptor, String]] = js.undefined
  var handleOpenChange: js.UndefOr[js.Function1[/* openKeys */ js.Array[String], Unit]] = js.undefined
  var isMobile: js.UndefOr[Boolean] = js.undefined
  var menuData: js.UndefOr[js.Array[MenuDataItem]] = js.undefined
  var menuItemRender: js.UndefOr[
    WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]]
  ] = js.undefined
  /**
    * 要给菜单的props, 参考antd-menu的属性。https://ant.design/components/menu-cn/
    */
  var menuProps: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any
  ] = js.undefined
  var mode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any
  ] = js.undefined
  var onCollapse: js.UndefOr[js.Function1[/* collapsed */ Boolean, Unit]] = js.undefined
  var openKeys: js.UndefOr[WithFalse[js.Array[String]]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var subMenuItemRender: js.UndefOr[
    WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]]
  ] = js.undefined
  var theme: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any
  ] = js.undefined
}

object BaseMenuProps {
  @scala.inline
  def apply(
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    formatMessage: /* message */ MessageDescriptor => CallbackTo[String] = null,
    handleOpenChange: /* openKeys */ js.Array[String] => Callback = null,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    menuData: js.Array[MenuDataItem] = null,
    menuItemRender: WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]] = null,
    menuProps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuProps */ js.Any = null,
    mode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuMode */ js.Any = null,
    onCollapse: /* collapsed */ Boolean => Callback = null,
    openKeys: WithFalse[js.Array[String]] = null,
    style: CSSProperties = null,
    subMenuItemRender: WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]] = null,
    theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any = null
  ): BaseMenuProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor) => formatMessage(t0).runNow()))
    if (handleOpenChange != null) __obj.updateDynamic("handleOpenChange")(js.Any.fromFunction1((t0: /* openKeys */ js.Array[java.lang.String]) => handleOpenChange(t0).runNow()))
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (menuData != null) __obj.updateDynamic("menuData")(menuData.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuProps != null) __obj.updateDynamic("menuProps")(menuProps.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* collapsed */ scala.Boolean) => onCollapse(t0).runNow()))
    if (openKeys != null) __obj.updateDynamic("openKeys")(openKeys.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (subMenuItemRender != null) __obj.updateDynamic("subMenuItemRender")(subMenuItemRender.asInstanceOf[js.Any])
    if (theme != null) __obj.updateDynamic("theme")(theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseMenuProps]
  }
}

