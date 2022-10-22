package typingsJapgolly.reactNavigationMaterialBottomTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.Node
import japgolly.scalajs.react.vdom.VdomElement
import japgolly.scalajs.react.vdom.VdomNode
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNativePaper.anon.PickPropsstylenavigationS
import typingsJapgolly.reactNativePaper.anon.SceneMap
import typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Props
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.ActiveColorDark
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.DefaultHandler
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.Focused
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.NavigationOptions
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getAccessibilityLabel
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getBadge
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getColor
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getLabelText
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.getTestID
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.navigationState
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onIndexChange
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.onTabPress
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderIcon
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderLabel
import typingsJapgolly.reactNavigationMaterialBottomTabs.reactNavigationMaterialBottomTabsStrings.renderScene
import typingsJapgolly.std.Omit
import typingsJapgolly.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTypesMod {
  
  type NavigationMaterialBottomTabConfig = (Partial[
    Omit[
      ComponentProps[
        ComponentType[PickPropsstylenavigationS] & (NonReactStatics[ComponentType[Props] & SceneMap, js.Object])
      ], 
      navigationState | onIndexChange | onTabPress | renderScene | renderLabel | renderIcon | getAccessibilityLabel | getBadge | getColor | getLabelText | getTestID
    ]
  ]) & ActiveColorDark
  
  trait NavigationMaterialBottomTabOptions extends StObject {
    
    var tabBarAccessibilityLabel: js.UndefOr[String] = js.undefined
    
    var tabBarBadge: js.UndefOr[Boolean | Double | String] = js.undefined
    
    var tabBarColor: js.UndefOr[String] = js.undefined
    
    var tabBarIcon: js.UndefOr[Node | (js.Function1[/* props */ Focused, Node])] = js.undefined
    
    var tabBarLabel: js.UndefOr[Node] = js.undefined
    
    var tabBarOnPress: js.UndefOr[js.Function1[/* props */ DefaultHandler, Unit]] = js.undefined
    
    var tabBarTestID: js.UndefOr[String] = js.undefined
    
    var tabBarVisible: js.UndefOr[Boolean] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NavigationMaterialBottomTabOptions {
    
    inline def apply(): NavigationMaterialBottomTabOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationMaterialBottomTabOptions]
    }
    
    extension [Self <: NavigationMaterialBottomTabOptions](x: Self) {
      
      inline def setTabBarAccessibilityLabel(value: String): Self = StObject.set(x, "tabBarAccessibilityLabel", value.asInstanceOf[js.Any])
      
      inline def setTabBarAccessibilityLabelUndefined: Self = StObject.set(x, "tabBarAccessibilityLabel", js.undefined)
      
      inline def setTabBarBadge(value: Boolean | Double | String): Self = StObject.set(x, "tabBarBadge", value.asInstanceOf[js.Any])
      
      inline def setTabBarBadgeUndefined: Self = StObject.set(x, "tabBarBadge", js.undefined)
      
      inline def setTabBarColor(value: String): Self = StObject.set(x, "tabBarColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorUndefined: Self = StObject.set(x, "tabBarColor", js.undefined)
      
      inline def setTabBarIcon(value: Node | (js.Function1[/* props */ Focused, Node])): Self = StObject.set(x, "tabBarIcon", value.asInstanceOf[js.Any])
      
      inline def setTabBarIconFunction1(value: /* props */ Focused => Node): Self = StObject.set(x, "tabBarIcon", js.Any.fromFunction1(value))
      
      inline def setTabBarIconNull: Self = StObject.set(x, "tabBarIcon", null)
      
      inline def setTabBarIconUndefined: Self = StObject.set(x, "tabBarIcon", js.undefined)
      
      inline def setTabBarIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tabBarIcon", js.Array(value*))
      
      inline def setTabBarIconVdomElement(value: VdomElement): Self = StObject.set(x, "tabBarIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabBarLabel(value: VdomNode): Self = StObject.set(x, "tabBarLabel", value.rawNode.asInstanceOf[js.Any])
      
      inline def setTabBarLabelNull: Self = StObject.set(x, "tabBarLabel", null)
      
      inline def setTabBarLabelUndefined: Self = StObject.set(x, "tabBarLabel", js.undefined)
      
      inline def setTabBarLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "tabBarLabel", js.Array(value*))
      
      inline def setTabBarLabelVdomElement(value: VdomElement): Self = StObject.set(x, "tabBarLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setTabBarOnPress(value: /* props */ DefaultHandler => Callback): Self = StObject.set(x, "tabBarOnPress", js.Any.fromFunction1((t0: /* props */ DefaultHandler) => value(t0).runNow()))
      
      inline def setTabBarOnPressUndefined: Self = StObject.set(x, "tabBarOnPress", js.undefined)
      
      inline def setTabBarTestID(value: String): Self = StObject.set(x, "tabBarTestID", value.asInstanceOf[js.Any])
      
      inline def setTabBarTestIDUndefined: Self = StObject.set(x, "tabBarTestID", js.undefined)
      
      inline def setTabBarVisible(value: Boolean): Self = StObject.set(x, "tabBarVisible", value.asInstanceOf[js.Any])
      
      inline def setTabBarVisibleUndefined: Self = StObject.set(x, "tabBarVisible", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type NavigationMaterialBottomTabScreenComponent[Params, ScreenProps] = (ComponentType[NavigationTabScreenProps[Params, ScreenProps]]) & (NavigationOptions[Params, ScreenProps])
  
  @js.native
  trait NavigationTabProp[State, Params]
    extends StObject
       with NavigationScreenProp[State, Params] {
    
    def jumpTo(routeName: String): Unit = js.native
    def jumpTo(routeName: String, key: String): Unit = js.native
  }
  
  trait NavigationTabScreenProps[Params, ScreenProps] extends StObject {
    
    var navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params]
    
    var screenProps: ScreenProps
    
    var theme: SupportedThemes
  }
  object NavigationTabScreenProps {
    
    inline def apply[Params, ScreenProps](
      navigation: NavigationTabProp[NavigationRoute[NavigationParams], Params],
      screenProps: ScreenProps,
      theme: SupportedThemes
    ): NavigationTabScreenProps[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationTabScreenProps[Params, ScreenProps]]
    }
    
    extension [Self <: NavigationTabScreenProps[?, ?], Params, ScreenProps](x: Self & (NavigationTabScreenProps[Params, ScreenProps])) {
      
      inline def setNavigation(value: NavigationTabProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type NavigationTabState = NavigationState
}
