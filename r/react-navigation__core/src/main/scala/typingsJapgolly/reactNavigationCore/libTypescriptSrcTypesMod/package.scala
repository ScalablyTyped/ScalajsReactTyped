package typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigationCore.anon.CanPreventDefault
import typingsJapgolly.reactNavigationCore.anon.GetId
import typingsJapgolly.reactNavigationCore.anon.Initial
import typingsJapgolly.reactNavigationCore.anon.NavigationRoute
import typingsJapgolly.reactNavigationCore.anon.Target
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings._empty
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.addListener
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.canGoBack
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.dispatch
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getId
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getParent
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.getState
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.goBack
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.isFocused
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.navigate_
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.removeListener
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.reset
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.setOptions
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.setParams
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.Route
import typingsJapgolly.std.Extract
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type CompositeNavigationProp[A /* <: NavigationProp[ParamListBase, String, Any, Any, Any, js.Object] */, B /* <: NavigationHelpersCommon[ParamListBase, Any] */] = (Omit[
A & B, 
/* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, @react-navigation/core.@react-navigation/core/lib/typescript/src/types.Keyof<any>, undefined, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> */ isFocused | reset | getState | navigate_ | canGoBack | getId | dispatch | goBack | _empty | getParent | setParams | setOptions | addListener | removeListener]) & (NavigationProp[
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationHelpersCommon<infer T, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase>> ? T : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * The route name should refer to the route name specified in the first type
  * Ideally it should work for any of them, but it's not possible to infer that way
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, infer R, undefined, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> ? R : string */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, infer I, @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<any>, {}, {}> ? I : never */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * The type of state should refer to the state specified in the first type
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, infer S, {}, {}> ? S : @react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.NavigationState<@react-navigation/routers.@react-navigation/routers/lib/typescript/src/types.ParamListBase> */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, any, infer O, {}> ? O : {} */ js.Any, 
/* import warning: importer.ImportType#apply Failed type conversion: / **
  * Event consumer config should refer to the config specified in the first type
  * This allows typechecking `addListener`/`removeListener`
  * /
A extends @react-navigation/core.@react-navigation/core/lib/typescript/src/types.NavigationProp<any, any, any, any, any, infer E> ? E : {} */ js.Any])

type EventArg[EventName /* <: String */, CanPreventDefault /* <: js.UndefOr[Boolean] */, Data] = Target[EventName] & (/* import warning: importer.ImportType#apply Failed type conversion: CanPreventDefault extends true ? { readonly defaultPrevented :boolean, preventDefault (): void} : {} */ js.Any)

type EventListenerCallback[EventMap /* <: EventMapBase */, EventName /* <: /* keyof EventMap */ String */] = js.Function1[
/* e */ EventArg[
  Extract[EventName, String], 
  /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['canPreventDefault'] */ js.Any, 
  /* import warning: importer.ImportType#apply Failed type conversion: EventMap[EventName]['data'] */ js.Any
], 
Unit]

type EventMapBase = Record[String, CanPreventDefault]

type Keyof[T /* <: js.Object */] = Extract[/* keyof T */ String, String]

type NavigatorScreenParams[ParamList, State /* <: NavigationState[ParamListBase] */] = Initial[State] | (/* import warning: importer.ImportType#apply Failed type conversion: {[ RouteName in keyof ParamList ]: undefined extends ParamList[RouteName]? {  screen :RouteName,   params :ParamList[RouteName] | undefined,   initial :boolean | undefined,   path :string | undefined,   state :never | undefined} : {  screen :RouteName,   params :ParamList[RouteName],   initial :boolean | undefined,   path :string | undefined,   state :never | undefined}}[keyof ParamList] */ js.Any)

type RouteConfig[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */] = (GetId[RouteName, ScreenOptions, ParamList, State, EventMap]) & (RouteConfigComponent[ParamList, RouteName])

type RouteProp[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = Route[
Extract[RouteName, String], 
/* import warning: importer.ImportType#apply Failed type conversion: ParamList[RouteName] */ js.Any]

type ScreenComponentType[ParamList /* <: ParamListBase */, RouteName /* <: /* keyof ParamList */ String */] = ComponentType[(NavigationRoute[ParamList, RouteName]) | js.Object]

type ScreenListeners[State /* <: NavigationState[ParamListBase] */, EventMap /* <: EventMapBase */] = Partial[
/* import warning: importer.ImportType#apply Failed type conversion: {[ EventName in keyof EventMap & @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventMapCore<State> ]: @react-navigation/core.@react-navigation/core/lib/typescript/src/types.EventListenerCallback<EventMap, EventName>} */ js.Any]
