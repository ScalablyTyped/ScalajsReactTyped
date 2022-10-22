package typingsJapgolly.vueRouter.mod

import typingsJapgolly.std.Exclude
import typingsJapgolly.std.Record
import typingsJapgolly.std.Set
import typingsJapgolly.vueRouter.vueRouterBooleans.`false`
import typingsJapgolly.vueRuntimeCore.mod.ComponentOptionsBase
import typingsJapgolly.vueRuntimeCore.mod.ComponentPublicInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocationMatched
  extends StObject
     with RouteRecordNormalized {
  
  @JSName("components")
  var components_RouteLocationMatched: js.UndefOr[(Record[String, RouteComponent]) | Null] = js.undefined
}
object RouteLocationMatched {
  
  inline def apply(
    children: js.Array[RouteRecordRaw],
    enterCallbacks: Record[String, js.Array[NavigationGuardNextCallback]],
    instances: Record[
      String, 
      js.UndefOr[
        (ComponentPublicInstance[
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          js.Object, 
          `false`, 
          ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
        ]) | Null
      ]
    ],
    leaveGuards: Set[NavigationGuard],
    meta: Exclude[js.UndefOr[RouteMeta], Unit],
    path: String,
    props: Record[String, RouteRecordProps],
    updateGuards: Set[NavigationGuard]
  ): RouteLocationMatched = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], enterCallbacks = enterCallbacks.asInstanceOf[js.Any], instances = instances.asInstanceOf[js.Any], leaveGuards = leaveGuards.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], updateGuards = updateGuards.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationMatched]
  }
  
  extension [Self <: RouteLocationMatched](x: Self) {
    
    inline def setComponents(value: Record[String, RouteComponent]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsNull: Self = StObject.set(x, "components", null)
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
  }
}
