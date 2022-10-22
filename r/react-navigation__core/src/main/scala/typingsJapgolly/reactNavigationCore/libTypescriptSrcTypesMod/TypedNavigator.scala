package typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod

import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.children
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.defaultScreenOptions
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.id
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.initialRouteName
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.screenListeners
import typingsJapgolly.reactNavigationCore.reactNavigationCoreStrings.screenOptions
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typingsJapgolly.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import typingsJapgolly.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypedNavigator[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */] extends StObject {
  
  /**
    * Component used for grouping multiple route configuration.
    */
  var Group: ComponentType[RouteGroupConfig[ParamList, ScreenOptions]]
  
  /**
    * Navigator component which manages the child screens.
    */
  var Navigator: ComponentType[
    (Omit[
      ComponentProps[Navigator], 
      /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.DefaultNavigatorOptions<any, any, any, any> */ id | children | screenListeners | screenOptions | defaultScreenOptions | initialRouteName
    ]) & (DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap])
  ]
  
  /**
    * Component used for specifying route configuration.
    */
  def Screen[RouteName /* <: /* keyof ParamList */ String */](_underscore: RouteConfig[ParamList, RouteName, State, ScreenOptions, EventMap]): Null
}
object TypedNavigator {
  
  inline def apply[ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */](
    Group: ComponentType[RouteGroupConfig[ParamList, ScreenOptions]],
    Navigator: ComponentType[
      (Omit[
        ComponentProps[Navigator], 
        /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.DefaultNavigatorOptions<any, any, any, any> */ id | children | screenListeners | screenOptions | defaultScreenOptions | initialRouteName
      ]) & (DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap])
    ],
    Screen: RouteConfig[ParamList, Any, State, ScreenOptions, EventMap] => Null
  ): TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator] = {
    val __obj = js.Dynamic.literal(Group = Group.asInstanceOf[js.Any], Navigator = Navigator.asInstanceOf[js.Any], Screen = js.Any.fromFunction1(Screen))
    __obj.asInstanceOf[TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator]]
  }
  
  extension [Self <: TypedNavigator[?, ?, ?, ?, ?], ParamList /* <: ParamListBase */, State /* <: NavigationState[ParamListBase] */, ScreenOptions /* <: js.Object */, EventMap /* <: EventMapBase */, Navigator /* <: ComponentType[Any] */](x: Self & (TypedNavigator[ParamList, State, ScreenOptions, EventMap, Navigator])) {
    
    inline def setGroup(value: ComponentType[RouteGroupConfig[ParamList, ScreenOptions]]): Self = StObject.set(x, "Group", value.asInstanceOf[js.Any])
    
    inline def setNavigator(
      value: ComponentType[
          (Omit[
            ComponentProps[Navigator], 
            /* keyof @react-navigation/core.@react-navigation/core/lib/typescript/src/types.DefaultNavigatorOptions<any, any, any, any> */ id | children | screenListeners | screenOptions | defaultScreenOptions | initialRouteName
          ]) & (DefaultNavigatorOptions[ParamList, State, ScreenOptions, EventMap])
        ]
    ): Self = StObject.set(x, "Navigator", value.asInstanceOf[js.Any])
    
    inline def setScreen(value: RouteConfig[ParamList, Any, State, ScreenOptions, EventMap] => Null): Self = StObject.set(x, "Screen", js.Any.fromFunction1(value))
  }
}
