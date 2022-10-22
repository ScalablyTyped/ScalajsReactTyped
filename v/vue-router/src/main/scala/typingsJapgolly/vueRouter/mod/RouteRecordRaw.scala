package typingsJapgolly.vueRouter.mod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.vueRouter.mod.RouteRecordSingleView
  - typingsJapgolly.vueRouter.mod.RouteRecordSingleViewWithChildren
  - typingsJapgolly.vueRouter.mod.RouteRecordMultipleViews
  - typingsJapgolly.vueRouter.mod.RouteRecordMultipleViewsWithChildren
  - typingsJapgolly.vueRouter.mod.RouteRecordRedirect
*/
trait RouteRecordRaw extends StObject
object RouteRecordRaw {
  
  inline def RouteRecordMultipleViews(components: Record[String, RawRouteComponent], path: String): typingsJapgolly.vueRouter.mod.RouteRecordMultipleViews = {
    val __obj = js.Dynamic.literal(components = components.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.RouteRecordMultipleViews]
  }
  
  inline def RouteRecordMultipleViewsWithChildren(children: js.Array[RouteRecordRaw], path: String): typingsJapgolly.vueRouter.mod.RouteRecordMultipleViewsWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.RouteRecordMultipleViewsWithChildren]
  }
  
  inline def RouteRecordRedirect(path: String, redirect: RouteRecordRedirectOption): typingsJapgolly.vueRouter.mod.RouteRecordRedirect = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], redirect = redirect.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.RouteRecordRedirect]
  }
  
  inline def RouteRecordSingleView(component: RawRouteComponent, path: String): typingsJapgolly.vueRouter.mod.RouteRecordSingleView = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.RouteRecordSingleView]
  }
  
  inline def RouteRecordSingleViewWithChildren(children: js.Array[RouteRecordRaw], path: String): typingsJapgolly.vueRouter.mod.RouteRecordSingleViewWithChildren = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.vueRouter.mod.RouteRecordSingleViewWithChildren]
  }
}
