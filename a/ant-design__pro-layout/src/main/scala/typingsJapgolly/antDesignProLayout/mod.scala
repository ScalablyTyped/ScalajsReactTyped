package typingsJapgolly.antDesignProLayout

import typingsJapgolly.antDesignProLayout.basicLayoutMod.BasicLayoutProps
import typingsJapgolly.antDesignProLayout.footerMod.FooterProps
import typingsJapgolly.antDesignProLayout.getPageTitleMod.GetPageTitleProps
import typingsJapgolly.antDesignProLayout.gridContentMod.GridContentProps
import typingsJapgolly.antDesignProLayout.headerMod.HeaderView
import typingsJapgolly.antDesignProLayout.libSettingDrawerMod.SettingDrawerProps
import typingsJapgolly.antDesignProLayout.pageHeaderWrapperMod.PageHeaderWrapperProps
import typingsJapgolly.antDesignProLayout.routeContextMod.RouteContextType
import typingsJapgolly.antDesignProLayout.topNavHeaderMod.TopNavHeaderProps
import typingsJapgolly.antDesignProLayout.typingsMod.MenuDataItem
import typingsJapgolly.antDesignProLayout.typingsMod.MessageDescriptor
import typingsJapgolly.antDesignProLayout.typingsMod.Route
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.FC
import typingsJapgolly.react.mod.SFC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/pro-layout", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class DefaultHeader () extends HeaderView
  
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val BasicLayout: FC[BasicLayoutProps] = js.native
  val DefaultFooter: FC[FooterProps] = js.native
  /**
    * This component can support contentWidth so you don't need to calculate the width
    * contentWidth=Fixed, width will is 1200
    * @param props
    */
  val GridContent: SFC[GridContentProps] = js.native
  val PageHeaderWrapper: SFC[PageHeaderWrapperProps] = js.native
  val PageLoading: FC[AnonTip] = js.native
  val RouteContext: Context[RouteContextType] = js.native
  /**
    * 可视化配置组件
    * @param props
    */
  val SettingDrawer: FC[SettingDrawerProps] = js.native
  val TopNavHeader: FC[TopNavHeaderProps] = js.native
  /**
    * 🌃 Powerful and easy to use beautiful layout
    * 🏄‍ Support multiple topics and layout types
    * @param props
    */
  val default: FC[BasicLayoutProps] = js.native
  def getMenuData(routes: js.Array[Route]): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: js.UndefOr[scala.Nothing],
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def getMenuData(routes: js.Array[Route], menu: AnonLocale): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.UndefOr[scala.Nothing],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): AnonBreadcrumb = js.native
  def getMenuData(
    routes: js.Array[Route],
    menu: AnonLocale,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    menuDataRender: js.Function1[/* menuData */ js.Array[MenuDataItem], js.Array[MenuDataItem]]
  ): AnonBreadcrumb = js.native
  def getPageTitle(props: GetPageTitleProps): String = js.native
  def getPageTitle(props: GetPageTitleProps, ignoreTile: Boolean): String = js.native
}

