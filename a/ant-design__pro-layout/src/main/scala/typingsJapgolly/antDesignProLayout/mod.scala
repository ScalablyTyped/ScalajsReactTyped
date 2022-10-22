package typingsJapgolly.antDesignProLayout

import typingsJapgolly.antDesignProLayout.anon.Breadcrumb
import typingsJapgolly.antDesignProLayout.anon.Locale
import typingsJapgolly.antDesignProLayout.anon.PageContainerPropsprefixe
import typingsJapgolly.antDesignProLayout.anon.ReadonlyArrayRoute
import typingsJapgolly.antDesignProLayout.esComponentsFooterMod.FooterProps
import typingsJapgolly.antDesignProLayout.esComponentsFooterToolbarMod.FooterToolbarProps
import typingsJapgolly.antDesignProLayout.esComponentsGridContentMod.GridContentProps
import typingsJapgolly.antDesignProLayout.esComponentsHeaderMod.HeaderViewProps
import typingsJapgolly.antDesignProLayout.esComponentsPageContainerMod.PageContainerProps
import typingsJapgolly.antDesignProLayout.esComponentsPageHeaderMod.PageHeaderProps
import typingsJapgolly.antDesignProLayout.esComponentsSettingDrawerMod.SettingDrawerProps
import typingsJapgolly.antDesignProLayout.esComponentsSiderMenuSiderMenuMod.PrivateSiderMenuProps
import typingsJapgolly.antDesignProLayout.esComponentsTopNavHeaderMod.TopNavHeaderProps
import typingsJapgolly.antDesignProLayout.esComponentsWaterMarkMod.WaterMarkProps
import typingsJapgolly.antDesignProLayout.esContextRouteContextMod.RouteContextType
import typingsJapgolly.antDesignProLayout.esGetPageTitleMod.GetPageTitleProps
import typingsJapgolly.antDesignProLayout.esProLayoutMod.ProLayoutProps
import typingsJapgolly.antDesignProLayout.esTypingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.esTypingsMod.MessageDescriptor
import typingsJapgolly.antd.libBreadcrumbBreadcrumbMod.BreadcrumbProps
import typingsJapgolly.antd.libSpinMod.SpinProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/pro-layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/pro-layout", JSImport.Default)
  @js.native
  val default: FC[ProLayoutProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultFooter")
  @js.native
  val DefaultFooter: FC[FooterProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "DefaultHeader")
  @js.native
  val DefaultHeader: FC[HeaderViewProps & PrivateSiderMenuProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "FooterToolbar")
  @js.native
  val FooterToolbar: FC[FooterToolbarProps] = js.native
  
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    *
    * @param props
    */
  @JSImport("@ant-design/pro-layout", "GridContent")
  @js.native
  val GridContent: FC[GridContentProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageContainer")
  @js.native
  val PageContainer: FC[PageContainerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageHeader")
  @js.native
  val PageHeader: FC[PageHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "PageLoading")
  @js.native
  val PageLoading: FC[SpinProps & Any] = js.native
  
  /**
    * 配置与面包屑相同，只是增加了自动根据路由计算面包屑的功能。此功能必须要在 ProLayout 中使用。
    *
    * @param props
    * @returns
    */
  @JSImport("@ant-design/pro-layout", "ProBreadcrumb")
  @js.native
  val ProBreadcrumb: FC[BreadcrumbProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "ProLayout")
  @js.native
  val ProLayout: FC[ProLayoutProps] = js.native
  
  inline def ProPageHeader(props: PageContainerPropsprefixe): Element | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("ProPageHeader")(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
  
  @JSImport("@ant-design/pro-layout", "RouteContext")
  @js.native
  val RouteContext: Context[RouteContextType] = js.native
  
  @JSImport("@ant-design/pro-layout", "SettingDrawer")
  @js.native
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "TopNavHeader")
  @js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  
  @JSImport("@ant-design/pro-layout", "WaterMark")
  @js.native
  val WaterMark: FC[WaterMarkProps] = js.native
  
  inline def getMenuData(routes: ReadonlyArrayRoute): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Unit,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(routes: ReadonlyArrayRoute, menu: Locale): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def getMenuData(
    routes: ReadonlyArrayRoute,
    menu: Locale,
    formatMessage: Unit,
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("getMenuData")(routes.asInstanceOf[js.Any], menu.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], menuDataRender.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  
  inline def getPageTitle(props: GetPageTitleProps): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getPageTitle(props: GetPageTitleProps, ignoreTitle: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getPageTitle")(props.asInstanceOf[js.Any], ignoreTitle.asInstanceOf[js.Any])).asInstanceOf[String]
}
