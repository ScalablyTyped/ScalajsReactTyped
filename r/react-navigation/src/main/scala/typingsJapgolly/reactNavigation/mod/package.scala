package typingsJapgolly.reactNavigation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AnimatedValue = js.Any
  type CreateNavigatorConfig[NavigatorConfig, RouterConfig, Options, NavigationScreenPropType] = NavigatorConfig with RouterConfig with (typingsJapgolly.reactNavigation.AnonDefaultNavigationOptions[Options, NavigationScreenPropType])
  type InferProps[T /* <: typingsJapgolly.react.mod.ComponentType[_] */] = js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigation.mod.NavigationInitAction
    - typingsJapgolly.reactNavigation.mod.NavigationStackAction
    - typingsJapgolly.reactNavigation.mod.NavigationTabAction
    - typingsJapgolly.reactNavigation.mod.NavigationDrawerAction
    - typingsJapgolly.reactNavigation.mod.NavigationSwitchAction
    - typingsJapgolly.reactNavigation.AnonType
  */
  type NavigationAction = typingsJapgolly.reactNavigation.mod._NavigationAction | typingsJapgolly.reactNavigation.mod.NavigationSwitchAction
  type NavigationComponent[Options, NavigationPropType] = (typingsJapgolly.reactNavigation.mod.NavigationScreenComponent[Options, NavigationPropType]) | (typingsJapgolly.reactNavigation.mod.NavigationNavigator[Options, NavigationPropType])
  type NavigationDispatch = js.Function1[/* action */ typingsJapgolly.reactNavigation.mod.NavigationAction, scala.Boolean]
  type NavigationEventCallback = js.Function1[
    /* payload */ typingsJapgolly.reactNavigation.mod.NavigationEventPayload, 
    scala.Unit
  ]
  type NavigationNavigator[Options, NavigationPropType] = (typingsJapgolly.react.mod.ComponentType[
    typingsJapgolly.reactNavigation.mod.NavigationNavigatorProps[Options, js.Object, _]
  ]) with (typingsJapgolly.reactNavigation.AnonRouter[Options, NavigationPropType])
  type NavigationParams = org.scalablytyped.runtime.StringDictionary[js.Any]
  type NavigationPathsConfig = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type NavigationRoute[Params] = typingsJapgolly.reactNavigation.mod.NavigationLeafRoute[Params] | typingsJapgolly.reactNavigation.mod.NavigationStateRoute[Params]
  type NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps] = (typingsJapgolly.reactNavigation.mod.NavigationComponent[Options, NavigationScreenPropType]) | (((typingsJapgolly.reactNavigation.AnonScreen[Options, NavigationScreenPropType]) | (typingsJapgolly.reactNavigation.AnonGetScreen[Options, NavigationScreenPropType])) with (typingsJapgolly.reactNavigation.AnonPath[Options, NavigationScreenPropType, ScreenProps]))
  type NavigationRouteConfigMap[Options, NavigationScreenPropType, ScreenProps] = org.scalablytyped.runtime.StringDictionary[
    typingsJapgolly.reactNavigation.mod.NavigationRouteConfig[Options, NavigationScreenPropType, ScreenProps]
  ]
  type NavigationScreenComponent[Options, NavigationScreenPropType] = typingsJapgolly.react.mod.ComponentType[_] with (typingsJapgolly.reactNavigation.AnonNavigationOptions[Options, NavigationScreenPropType])
  type NavigationScreenConfig[Options, NavigationScreenPropType, ScreenProps] = Options | (js.Function1[
    /* navigationOptionsContainer */ (typingsJapgolly.reactNavigation.mod.NavigationScreenConfigProps[NavigationScreenPropType, ScreenProps]) with typingsJapgolly.reactNavigation.AnonNavigationOptionsOptions[Options], 
    Options
  ])
  type NavigationScreenOptionsGetter[Options] = js.Function3[
    /* navigation */ typingsJapgolly.reactNavigation.mod.NavigationScreenProp[
      typingsJapgolly.reactNavigation.mod.NavigationRoute[js.Any], 
      typingsJapgolly.reactNavigation.mod.NavigationParams
    ], 
    /* screenProps */ js.Any | scala.Null, 
    /* theme */ typingsJapgolly.reactNavigation.mod.SupportedThemes, 
    Options
  ]
  type NavigationStateRoute[NavigationLeafRouteParams] = typingsJapgolly.reactNavigation.mod.NavigationLeafRoute[NavigationLeafRouteParams] with typingsJapgolly.reactNavigation.mod.NavigationState
  type NavigationSwitchAction = typingsJapgolly.reactNavigation.mod.NavigationJumpToAction
  type NavigationSwitchScreenComponent[Params, ScreenProps] = (typingsJapgolly.react.mod.ComponentType[
    typingsJapgolly.reactNavigation.mod.NavigationSwitchScreenProps[Params, ScreenProps]
  ]) with (typingsJapgolly.reactNavigation.AnonNavigationOptionsNavigationScreenConfig[Params, ScreenProps])
  type NavigationView[Options, State, ScreenProps] = typingsJapgolly.react.mod.ComponentType[
    (typingsJapgolly.reactNavigation.AnonDescriptors[Options, ScreenProps]) with typingsJapgolly.reactNavigation.mod.NavigationInjectedProps[typingsJapgolly.reactNavigation.mod.NavigationParams]
  ]
  type Omit[T, K /* <: java.lang.String */] = typingsJapgolly.std.Pick[T, typingsJapgolly.std.Exclude[java.lang.String, K]]
  // Themed components
  type ThemedStatusBarProps = typingsJapgolly.react.mod.ComponentProps[typingsJapgolly.reactNavigation.TypeofStatusBar]
  type ThemedTextInputProps = typingsJapgolly.react.mod.ComponentProps[typingsJapgolly.reactNavigation.TypeofTextInput]
  type ThemedTextProps = typingsJapgolly.react.mod.ComponentProps[org.scalablytyped.runtime.Instantiable0[typingsJapgolly.reactNative.mod.Text]]
}
