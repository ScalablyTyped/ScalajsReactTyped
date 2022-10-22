package typingsJapgolly.ionicReact.components

import japgolly.scalajs.react.Callback
import typingsJapgolly.StBuildingComponent.Default
import typingsJapgolly.ionicReact.distTypesModelsRouteActionMod.RouteAction
import typingsJapgolly.ionicReact.distTypesModelsRouteInfoMod.RouteInfo
import typingsJapgolly.ionicReact.distTypesModelsRouterDirectionMod.RouterDirection
import typingsJapgolly.ionicReact.distTypesRoutingLocationHistoryMod.LocationHistory
import typingsJapgolly.ionicReact.distTypesRoutingNavManagerMod.NavManagerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object NavManager {
  
  inline def apply(
    ionRedirect: Any,
    ionRoute: Any,
    locationHistory: LocationHistory,
    onChangeTab: (String, String, js.UndefOr[Any]) => Callback,
    onNativeBack: Callback,
    onNavigate: (String, RouteAction, js.UndefOr[RouterDirection | Unit], js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any) | Unit
    ], js.UndefOr[Any | Unit], js.UndefOr[String]) => Callback,
    onNavigateBack: (js.UndefOr[RouteInfo[Any] | String | Unit], js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ]) => Callback,
    onResetTab: (String, String, js.UndefOr[Any]) => Callback,
    onSetCurrentTab: (String, RouteInfo[Any]) => Callback,
    routeInfo: RouteInfo[Any],
    stackManager: Any
  ): Default[typingsJapgolly.ionicReact.mod.NavManager] = {
    val __props = js.Dynamic.literal(ionRedirect = ionRedirect.asInstanceOf[js.Any], ionRoute = ionRoute.asInstanceOf[js.Any], locationHistory = locationHistory.asInstanceOf[js.Any], onChangeTab = js.Any.fromFunction3((t0: String, t1: String, t2: js.UndefOr[Any]) => (onChangeTab(t0, t1, t2)).runNow()), onNativeBack = onNativeBack.toJsFn, onNavigate = js.Any.fromFunction6((t0: String, t1: RouteAction, t2: js.UndefOr[RouterDirection | Unit], t3: js.UndefOr[
      (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any) | Unit
    ], t4: js.UndefOr[Any | Unit], t5: js.UndefOr[String]) => (onNavigate(t0, t1, t2, t3, t4, t5)).runNow()), onNavigateBack = js.Any.fromFunction2((t0: js.UndefOr[RouteInfo[Any] | String | Unit], t1: js.UndefOr[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AnimationBuilder */ Any
    ]) => (onNavigateBack(t0, t1)).runNow()), onResetTab = js.Any.fromFunction3((t0: String, t1: String, t2: js.UndefOr[Any]) => (onResetTab(t0, t1, t2)).runNow()), onSetCurrentTab = js.Any.fromFunction2((t0: String, t1: RouteInfo[Any]) => (onSetCurrentTab(t0, t1)).runNow()), routeInfo = routeInfo.asInstanceOf[js.Any], stackManager = stackManager.asInstanceOf[js.Any])
    new Default[typingsJapgolly.ionicReact.mod.NavManager](js.Array(this.component, __props.asInstanceOf[NavManagerProps]))
  }
  
  @JSImport("@ionic/react", "NavManager")
  @js.native
  val component: js.Object = js.native
  
  def withProps(p: NavManagerProps): Default[typingsJapgolly.ionicReact.mod.NavManager] = new Default[typingsJapgolly.ionicReact.mod.NavManager](js.Array(this.component, p.asInstanceOf[js.Any]))
}
