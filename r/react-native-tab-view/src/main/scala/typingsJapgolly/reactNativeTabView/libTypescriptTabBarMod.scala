package typingsJapgolly.reactNativeTabView

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.react.mod.global.JSX.Element
import typingsJapgolly.reactNative.mod.Animated.AnimatedInterpolation
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativeTabView.anon.Color
import typingsJapgolly.reactNativeTabView.anon.Key
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Event
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Layout
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.NavigationState
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Route
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.Scene
import typingsJapgolly.reactNativeTabView.libTypescriptTypesMod.SceneRendererProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptTabBarMod {
  
  @JSImport("react-native-tab-view/lib/typescript/TabBar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T /* <: Route */](
    hasGetLabelTextGetAccessibleGetAccessibilityLabelGetTestIDRenderIndicatorGapScrollEnabledJumpToNavigationStatePositionActiveColorBouncesContentContainerStyleInactiveColorIndicatorContainerStyleIndicatorStyleLabelStyleOnTabLongPressOnTabPressPressColorPressOpacityRenderBadgeRenderIconRenderLabelRenderTabBarItemStyleTabStyle: Props[T]
  ): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(hasGetLabelTextGetAccessibleGetAccessibilityLabelGetTestIDRenderIndicatorGapScrollEnabledJumpToNavigationStatePositionActiveColorBouncesContentContainerStyleInactiveColorIndicatorContainerStyleIndicatorStyleLabelStyleOnTabLongPressOnTabPressPressColorPressOpacityRenderBadgeRenderIconRenderLabelRenderTabBarItemStyleTabStyle.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait Props[T /* <: Route */]
    extends StObject
       with SceneRendererProps {
    
    var activeColor: js.UndefOr[String] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var contentContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var gap: js.UndefOr[Double] = js.undefined
    
    var getAccessibilityLabel: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String]]] = js.undefined
    
    var getAccessible: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[Boolean]]] = js.undefined
    
    var getLabelText: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String]]] = js.undefined
    
    var getTestID: js.UndefOr[js.Function1[/* scene */ Scene[T], js.UndefOr[String]]] = js.undefined
    
    var inactiveColor: js.UndefOr[String] = js.undefined
    
    var indicatorContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var navigationState: NavigationState[T]
    
    var onTabLongPress: js.UndefOr[js.Function1[/* scene */ Scene[T], Unit]] = js.undefined
    
    var onTabPress: js.UndefOr[js.Function1[/* scene */ Scene[T] & Event, Unit]] = js.undefined
    
    var pressColor: js.UndefOr[String] = js.undefined
    
    var pressOpacity: js.UndefOr[Double] = js.undefined
    
    var renderBadge: js.UndefOr[js.Function1[/* scene */ Scene[T], Node]] = js.undefined
    
    var renderIcon: js.UndefOr[js.Function1[/* scene */ Scene[T] & Color, Node]] = js.undefined
    
    var renderIndicator: js.UndefOr[
        js.Function1[
          /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarIndicatorMod.Props[T], 
          Node
        ]
      ] = js.undefined
    
    var renderLabel: js.UndefOr[js.Function1[/* scene */ Scene[T] & Color, Node]] = js.undefined
    
    var renderTabBarItem: js.UndefOr[
        js.Function1[
          /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarItemMod.Props[T] & Key, 
          japgolly.scalajs.react.facade.React.Element
        ]
      ] = js.undefined
    
    var scrollEnabled: js.UndefOr[Boolean] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var tabStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object Props {
    
    inline def apply[T /* <: Route */](
      jumpTo: String => Callback,
      layout: Layout,
      navigationState: NavigationState[T],
      position: AnimatedInterpolation[Double | String]
    ): Props[T] = {
      val __obj = js.Dynamic.literal(jumpTo = js.Any.fromFunction1((t0: String) => jumpTo(t0).runNow()), layout = layout.asInstanceOf[js.Any], navigationState = navigationState.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props[T]]
    }
    
    extension [Self <: Props[?], T /* <: Route */](x: Self & Props[T]) {
      
      inline def setActiveColor(value: String): Self = StObject.set(x, "activeColor", value.asInstanceOf[js.Any])
      
      inline def setActiveColorUndefined: Self = StObject.set(x, "activeColor", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setContentContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "contentContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setContentContainerStyleNull: Self = StObject.set(x, "contentContainerStyle", null)
      
      inline def setContentContainerStyleUndefined: Self = StObject.set(x, "contentContainerStyle", js.undefined)
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setGetAccessibilityLabel(value: /* scene */ Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getAccessibilityLabel", js.Any.fromFunction1(value))
      
      inline def setGetAccessibilityLabelUndefined: Self = StObject.set(x, "getAccessibilityLabel", js.undefined)
      
      inline def setGetAccessible(value: /* scene */ Scene[T] => js.UndefOr[Boolean]): Self = StObject.set(x, "getAccessible", js.Any.fromFunction1(value))
      
      inline def setGetAccessibleUndefined: Self = StObject.set(x, "getAccessible", js.undefined)
      
      inline def setGetLabelText(value: /* scene */ Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getLabelText", js.Any.fromFunction1(value))
      
      inline def setGetLabelTextUndefined: Self = StObject.set(x, "getLabelText", js.undefined)
      
      inline def setGetTestID(value: /* scene */ Scene[T] => js.UndefOr[String]): Self = StObject.set(x, "getTestID", js.Any.fromFunction1(value))
      
      inline def setGetTestIDUndefined: Self = StObject.set(x, "getTestID", js.undefined)
      
      inline def setInactiveColor(value: String): Self = StObject.set(x, "inactiveColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorUndefined: Self = StObject.set(x, "inactiveColor", js.undefined)
      
      inline def setIndicatorContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorContainerStyleNull: Self = StObject.set(x, "indicatorContainerStyle", null)
      
      inline def setIndicatorContainerStyleUndefined: Self = StObject.set(x, "indicatorContainerStyle", js.undefined)
      
      inline def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "indicatorStyle", value.asInstanceOf[js.Any])
      
      inline def setIndicatorStyleNull: Self = StObject.set(x, "indicatorStyle", null)
      
      inline def setIndicatorStyleUndefined: Self = StObject.set(x, "indicatorStyle", js.undefined)
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setNavigationState(value: NavigationState[T]): Self = StObject.set(x, "navigationState", value.asInstanceOf[js.Any])
      
      inline def setOnTabLongPress(value: /* scene */ Scene[T] => Callback): Self = StObject.set(x, "onTabLongPress", js.Any.fromFunction1((t0: /* scene */ Scene[T]) => value(t0).runNow()))
      
      inline def setOnTabLongPressUndefined: Self = StObject.set(x, "onTabLongPress", js.undefined)
      
      inline def setOnTabPress(value: /* scene */ Scene[T] & Event => Callback): Self = StObject.set(x, "onTabPress", js.Any.fromFunction1((t0: /* scene */ Scene[T] & Event) => value(t0).runNow()))
      
      inline def setOnTabPressUndefined: Self = StObject.set(x, "onTabPress", js.undefined)
      
      inline def setPressColor(value: String): Self = StObject.set(x, "pressColor", value.asInstanceOf[js.Any])
      
      inline def setPressColorUndefined: Self = StObject.set(x, "pressColor", js.undefined)
      
      inline def setPressOpacity(value: Double): Self = StObject.set(x, "pressOpacity", value.asInstanceOf[js.Any])
      
      inline def setPressOpacityUndefined: Self = StObject.set(x, "pressOpacity", js.undefined)
      
      inline def setRenderBadge(value: /* scene */ Scene[T] => Node): Self = StObject.set(x, "renderBadge", js.Any.fromFunction1(value))
      
      inline def setRenderBadgeUndefined: Self = StObject.set(x, "renderBadge", js.undefined)
      
      inline def setRenderIcon(value: /* scene */ Scene[T] & Color => Node): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setRenderIconUndefined: Self = StObject.set(x, "renderIcon", js.undefined)
      
      inline def setRenderIndicator(
        value: /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarIndicatorMod.Props[T] => Node
      ): Self = StObject.set(x, "renderIndicator", js.Any.fromFunction1(value))
      
      inline def setRenderIndicatorUndefined: Self = StObject.set(x, "renderIndicator", js.undefined)
      
      inline def setRenderLabel(value: /* scene */ Scene[T] & Color => Node): Self = StObject.set(x, "renderLabel", js.Any.fromFunction1(value))
      
      inline def setRenderLabelUndefined: Self = StObject.set(x, "renderLabel", js.undefined)
      
      inline def setRenderTabBarItem(
        value: /* props */ typingsJapgolly.reactNativeTabView.libTypescriptTabBarItemMod.Props[T] & Key => japgolly.scalajs.react.facade.React.Element
      ): Self = StObject.set(x, "renderTabBarItem", js.Any.fromFunction1(value))
      
      inline def setRenderTabBarItemUndefined: Self = StObject.set(x, "renderTabBarItem", js.undefined)
      
      inline def setScrollEnabled(value: Boolean): Self = StObject.set(x, "scrollEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollEnabledUndefined: Self = StObject.set(x, "scrollEnabled", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTabStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "tabStyle", value.asInstanceOf[js.Any])
      
      inline def setTabStyleNull: Self = StObject.set(x, "tabStyle", null)
      
      inline def setTabStyleUndefined: Self = StObject.set(x, "tabStyle", js.undefined)
    }
  }
}
