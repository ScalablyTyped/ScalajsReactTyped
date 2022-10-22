package typingsJapgolly.reactNavigationCore

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNavigationCore.anon.Name
import typingsJapgolly.reactNavigationCore.anon.PartialStateNavigationSta
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.NavigationProp
import typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod.RouteConfigComponent
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcSceneViewMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/SceneView", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */](hasScreenRouteNavigationRouteStateGetStateSetStateOptionsClearOptions: Props[State, ScreenOptions]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasScreenRouteNavigationRouteStateGetStateSetStateOptionsClearOptions.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */] extends StObject {
    
    def clearOptions(): Unit
    
    def getState(): State
    
    var navigation: NavigationProp[ParamListBase, String, js.UndefOr[String], State, ScreenOptions, js.Object]
    
    var options: js.Object
    
    var route: Route[String, js.UndefOr[js.Object]]
    
    var routeState: js.UndefOr[NavigationState[ParamListBase] | PartialStateNavigationSta] = js.undefined
    
    var screen: (RouteConfigComponent[ParamListBase, String]) & Name
    
    def setState(state: State): Unit
  }
  object Props {
    
    inline def apply[State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */](
      clearOptions: Callback,
      getState: CallbackTo[State],
      navigation: NavigationProp[ParamListBase, String, js.UndefOr[String], State, ScreenOptions, js.Object],
      options: js.Object,
      route: Route[String, js.UndefOr[js.Object]],
      screen: (RouteConfigComponent[ParamListBase, String]) & Name,
      setState: State => Callback
    ): Props[State, ScreenOptions] = {
      val __obj = js.Dynamic.literal(clearOptions = clearOptions.toJsFn, getState = getState.toJsFn, navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], screen = screen.asInstanceOf[js.Any], setState = js.Any.fromFunction1((t0: State) => setState(t0).runNow()))
      __obj.asInstanceOf[Props[State, ScreenOptions]]
    }
    
    extension [Self <: Props[?, ?], State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */](x: Self & (Props[State, ScreenOptions])) {
      
      inline def setClearOptions(value: Callback): Self = StObject.set(x, "clearOptions", value.toJsFn)
      
      inline def setGetState(value: CallbackTo[State]): Self = StObject.set(x, "getState", value.toJsFn)
      
      inline def setNavigation(value: NavigationProp[ParamListBase, String, js.UndefOr[String], State, ScreenOptions, js.Object]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Route[String, js.UndefOr[js.Object]]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setRouteState(value: NavigationState[ParamListBase] | PartialStateNavigationSta): Self = StObject.set(x, "routeState", value.asInstanceOf[js.Any])
      
      inline def setRouteStateUndefined: Self = StObject.set(x, "routeState", js.undefined)
      
      inline def setScreen(value: (RouteConfigComponent[ParamListBase, String]) & Name): Self = StObject.set(x, "screen", value.asInstanceOf[js.Any])
      
      inline def setSetState(value: State => Callback): Self = StObject.set(x, "setState", js.Any.fromFunction1((t0: State) => value(t0).runNow()))
    }
  }
}
