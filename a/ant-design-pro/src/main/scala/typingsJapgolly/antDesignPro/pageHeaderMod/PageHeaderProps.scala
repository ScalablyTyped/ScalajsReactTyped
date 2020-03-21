package typingsJapgolly.antDesignPro.pageHeaderMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.raw.React.Node
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.antDesignPro.AnonKey
import typingsJapgolly.antDesignPro.AnonTitle
import typingsJapgolly.history.mod.Location
import typingsJapgolly.history.mod.LocationState
import typingsJapgolly.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageHeaderProps extends js.Object {
  var action: js.UndefOr[Node | String] = js.undefined
  var breadcrumbList: js.UndefOr[js.Array[AnonTitle]] = js.undefined
  var breadcrumbNameMap: js.UndefOr[js.Any] = js.undefined
  var breadcrumbSeparator: js.UndefOr[Node] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var content: js.UndefOr[Node] = js.undefined
  var extraContent: js.UndefOr[Node] = js.undefined
  var hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined
  var home: js.UndefOr[Node] = js.undefined
  var linkElement: js.UndefOr[Node | String] = js.undefined
  var loading: js.UndefOr[Boolean] = js.undefined
  var location: js.UndefOr[Location[LocationState]] = js.undefined
  var logo: js.UndefOr[Node | String] = js.undefined
  var onTabChange: js.UndefOr[js.Function1[/* key */ String, Unit]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var routes: js.UndefOr[js.Array[_]] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  var tabActiveKey: js.UndefOr[String] = js.undefined
  var tabBarExtraContent: js.UndefOr[Node] = js.undefined
  var tabDefaultActiveKey: js.UndefOr[String] = js.undefined
  var tabList: js.UndefOr[js.Array[AnonKey]] = js.undefined
  var title: js.UndefOr[Node | String | Double] = js.undefined
  var wide: js.UndefOr[Boolean] = js.undefined
  def itemRender(menuItem: js.Any): Node
}

object PageHeaderProps {
  @scala.inline
  def apply(
    itemRender: js.Any => CallbackTo[Node],
    action: Node | String = null,
    breadcrumbList: js.Array[AnonTitle] = null,
    breadcrumbNameMap: js.Any = null,
    breadcrumbSeparator: VdomNode = null,
    className: String = null,
    content: VdomNode = null,
    extraContent: VdomNode = null,
    hiddenBreadcrumb: js.UndefOr[Boolean] = js.undefined,
    home: VdomNode = null,
    linkElement: Node | String = null,
    loading: js.UndefOr[Boolean] = js.undefined,
    location: Location[LocationState] = null,
    logo: Node | String = null,
    onTabChange: /* key */ String => Callback = null,
    params: js.Any = null,
    routes: js.Array[_] = null,
    style: CSSProperties = null,
    tabActiveKey: String = null,
    tabBarExtraContent: VdomNode = null,
    tabDefaultActiveKey: String = null,
    tabList: js.Array[AnonKey] = null,
    title: Node | String | Double = null,
    wide: js.UndefOr[Boolean] = js.undefined
  ): PageHeaderProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("itemRender")(js.Any.fromFunction1((t0: js.Any) => itemRender(t0).runNow()))
    if (action != null) __obj.updateDynamic("action")(action.asInstanceOf[js.Any])
    if (breadcrumbList != null) __obj.updateDynamic("breadcrumbList")(breadcrumbList.asInstanceOf[js.Any])
    if (breadcrumbNameMap != null) __obj.updateDynamic("breadcrumbNameMap")(breadcrumbNameMap.asInstanceOf[js.Any])
    if (breadcrumbSeparator != null) __obj.updateDynamic("breadcrumbSeparator")(breadcrumbSeparator.rawNode.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.rawNode.asInstanceOf[js.Any])
    if (extraContent != null) __obj.updateDynamic("extraContent")(extraContent.rawNode.asInstanceOf[js.Any])
    if (!js.isUndefined(hiddenBreadcrumb)) __obj.updateDynamic("hiddenBreadcrumb")(hiddenBreadcrumb.asInstanceOf[js.Any])
    if (home != null) __obj.updateDynamic("home")(home.rawNode.asInstanceOf[js.Any])
    if (linkElement != null) __obj.updateDynamic("linkElement")(linkElement.asInstanceOf[js.Any])
    if (!js.isUndefined(loading)) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (onTabChange != null) __obj.updateDynamic("onTabChange")(js.Any.fromFunction1((t0: /* key */ java.lang.String) => onTabChange(t0).runNow()))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tabActiveKey != null) __obj.updateDynamic("tabActiveKey")(tabActiveKey.asInstanceOf[js.Any])
    if (tabBarExtraContent != null) __obj.updateDynamic("tabBarExtraContent")(tabBarExtraContent.rawNode.asInstanceOf[js.Any])
    if (tabDefaultActiveKey != null) __obj.updateDynamic("tabDefaultActiveKey")(tabDefaultActiveKey.asInstanceOf[js.Any])
    if (tabList != null) __obj.updateDynamic("tabList")(tabList.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(wide)) __obj.updateDynamic("wide")(wide.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageHeaderProps]
  }
}

