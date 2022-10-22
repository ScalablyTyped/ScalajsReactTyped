package typingsJapgolly.umijsRouteUtils

import typingsJapgolly.umijsRouteUtils.anon.Breadcrumb
import typingsJapgolly.umijsRouteUtils.distTypesMod.MenuDataItem
import typingsJapgolly.umijsRouteUtils.distTypesMod.MessageDescriptor
import typingsJapgolly.umijsRouteUtils.distTypesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTransformRouteTransformRouteMod {
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * @param routeList 路由配置
    * @param locale 是否使用国际化
    * @param formatMessage 国际化的程序
    * @param ignoreFilter 是否筛选掉不展示的 menuItem 项，plugin-layout需要所有项目来计算布局样式
    * @returns { breadcrumb, menuData}
    */
  inline def default(routeList: js.Array[Route]): Breadcrumb = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any]).asInstanceOf[Breadcrumb]
  inline def default(routeList: js.Array[Route], locale: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routeList: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routeList: js.Array[Route],
    locale: Boolean,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(routeList: js.Array[Route], locale: Boolean, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routeList: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String]
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(
    routeList: js.Array[Route],
    locale: Unit,
    formatMessage: js.Function1[/* message */ MessageDescriptor, String],
    ignoreFilter: Boolean
  ): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  inline def default(routeList: js.Array[Route], locale: Unit, formatMessage: Unit, ignoreFilter: Boolean): Breadcrumb = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routeList.asInstanceOf[js.Any], locale.asInstanceOf[js.Any], formatMessage.asInstanceOf[js.Any], ignoreFilter.asInstanceOf[js.Any])).asInstanceOf[Breadcrumb]
  
  @JSImport("@umijs/route-utils/dist/transformRoute/transformRoute", "childrenPropsName")
  @js.native
  val childrenPropsName: /* "routes" */ String = js.native
  
  inline def getKeyByPath(item: MenuDataItem): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getKeyByPath")(item.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
  
  inline def isUrl(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUrl")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def stripQueryStringAndHashFromPath(url: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stripQueryStringAndHashFromPath")(url.asInstanceOf[js.Any]).asInstanceOf[String]
}
