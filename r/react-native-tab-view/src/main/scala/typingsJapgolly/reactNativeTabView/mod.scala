package typingsJapgolly.reactNativeTabView

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNativeTabView.libTypescriptSceneMapMod.SceneProps
import typingsJapgolly.reactNativeTabView.libTypescriptTabBarMod.Props
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-tab-view", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def SceneMap[T /* <: Any */](scenes: StringDictionary[ComponentType[T]]): js.Function1[/* hasRouteJumpToPosition */ SceneProps, Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("SceneMap")(scenes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* hasRouteJumpToPosition */ SceneProps, Element]]
  
  inline def TabBar[T /* <: Route */](
    hasGetLabelTextGetAccessibleGetAccessibilityLabelGetTestIDRenderIndicatorGapScrollEnabledJumpToNavigationStatePositionActiveColorBouncesContentContainerStyleInactiveColorIndicatorContainerStyleIndicatorStyleLabelStyleOnTabLongPressOnTabPressPressColorPressOpacityRenderBadgeRenderIconRenderLabelRenderTabBarItemStyleTabStyle: Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabBar")(hasGetLabelTextGetAccessibleGetAccessibilityLabelGetTestIDRenderIndicatorGapScrollEnabledJumpToNavigationStatePositionActiveColorBouncesContentContainerStyleInactiveColorIndicatorContainerStyleIndicatorStyleLabelStyleOnTabLongPressOnTabPressPressColorPressOpacityRenderBadgeRenderIconRenderLabelRenderTabBarItemStyleTabStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TabBarIndicator[T /* <: Route */](
    hasGetTabWidthLayoutNavigationStatePositionWidthGapStyle: typingsJapgolly.reactNativeTabView.libTypescriptTabBarIndicatorMod.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabBarIndicator")(hasGetTabWidthLayoutNavigationStatePositionWidthGapStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TabBarItem[T /* <: Route */](props: typingsJapgolly.reactNativeTabView.libTypescriptTabBarItemMod.Props[T]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabBarItem")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def TabView[T /* <: Route */](
    hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStylePagerStyleStyleSwipeEnabledTabBarPositionAnimationEnabled: typingsJapgolly.reactNativeTabView.libTypescriptTabViewMod.Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("TabView")(hasOnIndexChangeNavigationStateRenderSceneInitialLayoutKeyboardDismissModeLazyLazyPreloadDistanceOnSwipeStartOnSwipeEndRenderLazyPlaceholderRenderTabBarSceneContainerStylePagerStyleStyleSwipeEnabledTabBarPositionAnimationEnabled.asInstanceOf[js.Any]).asInstanceOf[Element]
}
