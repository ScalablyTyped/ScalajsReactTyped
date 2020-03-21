package typingsJapgolly.antDesignProLayout.components

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.CtorType.ChildArg
import japgolly.scalajs.react.Key
import japgolly.scalajs.react.ReactMouseEventFrom
import japgolly.scalajs.react.component.Js.MountedWithRawType
import japgolly.scalajs.react.component.Js.RawMounted
import japgolly.scalajs.react.component.Js.UnmountedSimple
import japgolly.scalajs.react.raw.React.Node
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import typingsJapgolly.antDesignProLayout.AnonDefaultOpenAll
import typingsJapgolly.antDesignProLayout.AnonId
import typingsJapgolly.antDesignProLayout.MenuDataItemisUrlboolean
import typingsJapgolly.antDesignProLayout.antDesignProLayoutBooleans.`false`
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.realDark
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.sidemenu
import typingsJapgolly.antDesignProLayout.antDesignProLayoutStrings.topmenu
import typingsJapgolly.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typingsJapgolly.antDesignProLayout.defaultSettingsMod.ContentWidth
import typingsJapgolly.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsJapgolly.antDesignProLayout.headerMod.HeaderViewProps
import typingsJapgolly.antDesignProLayout.localesMod.localeType
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor
import typingsJapgolly.antDesignProLayout.typingsMod.WithFalse
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

abstract class SharedApply_BasicLayoutProps_842192636 () {
  val componentImport: js.Any
  def apply(
    breadcrumbRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any => CallbackTo[
      /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ js.Any
    ] = null,
    breakpoint: (/* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SiderProps * / any['breakpoint'] */ js.Any) | `false` = null,
    className: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    collapsedButtonRender: WithFalse[js.Function1[/* collapsed */ js.UndefOr[Boolean], Node]] = null,
    colorWeak: js.UndefOr[Boolean] = js.undefined,
    contentStyle: CSSProperties = null,
    contentWidth: ContentWidth = null,
    disableContentMargin: js.UndefOr[Boolean] = js.undefined,
    disableMobile: js.UndefOr[Boolean] = js.undefined,
    fixSiderbar: js.UndefOr[Boolean] = js.undefined,
    fixedHeader: js.UndefOr[Boolean] = js.undefined,
    footerRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ Node, Node]] = null,
    formatMessage: /* message */ MessageDescriptor => CallbackTo[String] = null,
    hasSiderMenu: js.UndefOr[Boolean] = js.undefined,
    headerRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ Node, Node]] = null,
    hide: js.UndefOr[Boolean] = js.undefined,
    iconfontUrl: String = null,
    isChildrenLayout: js.UndefOr[Boolean] = js.undefined,
    isMobile: js.UndefOr[Boolean] = js.undefined,
    itemRender: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['itemRender'] */ js.Any = null,
    layout: sidemenu | topmenu = null,
    links: js.Array[Node] = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    locale: localeType = null,
    logo: Node | WithFalse[js.Function0[Node]] = null,
    menu: AnonDefaultOpenAll = null,
    menuDataRender: /* menuData */ js.Array[MenuDataItem] => CallbackTo[js.Array[MenuDataItem]] = null,
    menuHeaderRender: WithFalse[
      js.Function3[/* logo */ Node, /* title */ Node, /* props */ js.UndefOr[BasicLayoutProps], Node]
    ] = null,
    menuItemRender: WithFalse[js.Function2[/* item */ MenuDataItemisUrlboolean, /* defaultDom */ Node, Node]] = null,
    menuRender: WithFalse[js.Function2[/* props */ HeaderViewProps, /* defaultDom */ Node, Node]] = null,
    navTheme: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MenuTheme */ js.Any) | realDark = null,
    onCollapse: /* collapsed */ Boolean => Callback = null,
    onMenuHeaderClick: /* e */ ReactMouseEventFrom[HTMLDivElement] => Callback = null,
    onOpenChange: /* openKeys */ WithFalse[js.Array[String]] => Callback = null,
    pageTitleRender: WithFalse[
      js.Function3[
        /* props */ GetPageTitleProps, 
        /* defaultPageTitle */ js.UndefOr[String], 
        /* info */ js.UndefOr[AnonId], 
        String
      ]
    ] = null,
    primaryColor: String = null,
    rightContentRender: WithFalse[js.Function1[BasicLayoutProps, Node]] = null,
    siderWidth: Int | Double = null,
    style: CSSProperties = null,
    title: String = null,
    key: js.UndefOr[Key] = js.undefined,
    _overrides: StringDictionary[js.Any] = null
  )(
    children: ChildArg*
  ): UnmountedSimple[
    BasicLayoutProps, 
    MountedWithRawType[BasicLayoutProps, js.Object, RawMounted[BasicLayoutProps, js.Object]]
  ] = {
    val __obj = js.Dynamic.literal()
  
      if (breadcrumbRender != null) __obj.updateDynamic("breadcrumbRender")(js.Any.fromFunction1((t0: /* import warning: importer.ImportType#apply Failed type conversion: / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AntdBreadcrumbProps * / any['routes'] */ /* routers */ js.Any) => breadcrumbRender(t0).runNow()))
    if (breakpoint != null) __obj.updateDynamic("breakpoint")(breakpoint.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed.asInstanceOf[js.Any])
    if (collapsedButtonRender != null) __obj.updateDynamic("collapsedButtonRender")(collapsedButtonRender.asInstanceOf[js.Any])
    if (!js.isUndefined(colorWeak)) __obj.updateDynamic("colorWeak")(colorWeak.asInstanceOf[js.Any])
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle.asInstanceOf[js.Any])
    if (contentWidth != null) __obj.updateDynamic("contentWidth")(contentWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(disableContentMargin)) __obj.updateDynamic("disableContentMargin")(disableContentMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(disableMobile)) __obj.updateDynamic("disableMobile")(disableMobile.asInstanceOf[js.Any])
    if (!js.isUndefined(fixSiderbar)) __obj.updateDynamic("fixSiderbar")(fixSiderbar.asInstanceOf[js.Any])
    if (!js.isUndefined(fixedHeader)) __obj.updateDynamic("fixedHeader")(fixedHeader.asInstanceOf[js.Any])
    if (footerRender != null) __obj.updateDynamic("footerRender")(footerRender.asInstanceOf[js.Any])
    if (formatMessage != null) __obj.updateDynamic("formatMessage")(js.Any.fromFunction1((t0: /* message */ typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor) => formatMessage(t0).runNow()))
    if (!js.isUndefined(hasSiderMenu)) __obj.updateDynamic("hasSiderMenu")(hasSiderMenu.asInstanceOf[js.Any])
    if (headerRender != null) __obj.updateDynamic("headerRender")(headerRender.asInstanceOf[js.Any])
    if (!js.isUndefined(hide)) __obj.updateDynamic("hide")(hide.asInstanceOf[js.Any])
    if (iconfontUrl != null) __obj.updateDynamic("iconfontUrl")(iconfontUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(isChildrenLayout)) __obj.updateDynamic("isChildrenLayout")(isChildrenLayout.asInstanceOf[js.Any])
    if (!js.isUndefined(isMobile)) __obj.updateDynamic("isMobile")(isMobile.asInstanceOf[js.Any])
    if (itemRender != null) __obj.updateDynamic("itemRender")(itemRender.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (links != null) __obj.updateDynamic("links")(links.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (menu != null) __obj.updateDynamic("menu")(menu.asInstanceOf[js.Any])
    if (menuDataRender != null) __obj.updateDynamic("menuDataRender")(js.Any.fromFunction1((t0: /* menuData */ js.Array[typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem]) => menuDataRender(t0).runNow()))
    if (menuHeaderRender != null) __obj.updateDynamic("menuHeaderRender")(menuHeaderRender.asInstanceOf[js.Any])
    if (menuItemRender != null) __obj.updateDynamic("menuItemRender")(menuItemRender.asInstanceOf[js.Any])
    if (menuRender != null) __obj.updateDynamic("menuRender")(menuRender.asInstanceOf[js.Any])
    if (navTheme != null) __obj.updateDynamic("navTheme")(navTheme.asInstanceOf[js.Any])
    if (onCollapse != null) __obj.updateDynamic("onCollapse")(js.Any.fromFunction1((t0: /* collapsed */ scala.Boolean) => onCollapse(t0).runNow()))
    if (onMenuHeaderClick != null) __obj.updateDynamic("onMenuHeaderClick")(js.Any.fromFunction1((t0: /* e */ japgolly.scalajs.react.ReactMouseEventFrom[org.scalajs.dom.raw.HTMLDivElement]) => onMenuHeaderClick(t0).runNow()))
    if (onOpenChange != null) __obj.updateDynamic("onOpenChange")(js.Any.fromFunction1((t0: /* openKeys */ typingsJapgolly.antDesignProLayout.typingsMod.WithFalse[js.Array[java.lang.String]]) => onOpenChange(t0).runNow()))
    if (pageTitleRender != null) __obj.updateDynamic("pageTitleRender")(pageTitleRender.asInstanceOf[js.Any])
    if (primaryColor != null) __obj.updateDynamic("primaryColor")(primaryColor.asInstanceOf[js.Any])
    if (rightContentRender != null) __obj.updateDynamic("rightContentRender")(rightContentRender.asInstanceOf[js.Any])
    if (siderWidth != null) __obj.updateDynamic("siderWidth")(siderWidth.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    key.foreach(k => __obj.updateDynamic("key")(k.asInstanceOf[js.Any]))
    if (_overrides != null) js.Dynamic.global.Object.assign(__obj, _overrides)
  
    val f = japgolly.scalajs.react.JsComponent[
  typingsJapgolly.antDesignProLayout.basicLayoutMod.BasicLayoutProps, 
  japgolly.scalajs.react.Children.Varargs, 
  js.Object](this.componentImport)
    f(__obj.asInstanceOf[typingsJapgolly.antDesignProLayout.basicLayoutMod.BasicLayoutProps])(children: _*)
  }
}

