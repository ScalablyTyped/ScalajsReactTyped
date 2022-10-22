package typingsJapgolly.reactNavigationDrawer

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import japgolly.scalajs.react.facade.Empty
import japgolly.scalajs.react.facade.JsNumber
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.vdom.VdomElement
import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.Node
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.TextStyle
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigation.mod.NavigationState
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationDrawer.anon.ActiveItemKey
import typingsJapgolly.reactNavigationDrawer.anon.Dark
import typingsJapgolly.reactNavigationDrawer.anon.Focused
import typingsJapgolly.reactNavigationDrawer.anon.NavigationOptions
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`on-drag`
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.back
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.fade
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.front
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.history
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.initialRoute
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.left
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.none
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.right
import typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.slide
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTypesMod {
  
  trait DrawerContentComponentProps
    extends StObject
       with DrawerNavigatorItemsProps {
    
    var descriptors: SceneDescriptorMap
    
    var drawerOpenProgress: Node
    
    var navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams]
  }
  object DrawerContentComponentProps {
    
    inline def apply(
      descriptors: SceneDescriptorMap,
      drawerOpenProgress: Node,
      drawerPosition: left | right,
      getLabel: Scene => japgolly.scalajs.react.facade.React.Node,
      items: js.Array[NavigationRoute[NavigationParams]],
      navigation: NavigationScreenProp[NavigationDrawerState, NavigationParams],
      onItemPress: Focused => Callback,
      renderIcon: Scene => japgolly.scalajs.react.facade.React.Node,
      screenProps: Any
    ): DrawerContentComponentProps = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], drawerOpenProgress = drawerOpenProgress.asInstanceOf[js.Any], drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1((t0: Focused) => onItemPress(t0).runNow()), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerContentComponentProps]
    }
    
    extension [Self <: DrawerContentComponentProps](x: Self) {
      
      inline def setDescriptors(value: SceneDescriptorMap): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setDrawerOpenProgress(value: Node): Self = StObject.set(x, "drawerOpenProgress", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationScreenProp[NavigationDrawerState, NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerIconProps extends StObject {
    
    var focused: Boolean
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object DrawerIconProps {
    
    inline def apply(focused: Boolean): DrawerIconProps = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerIconProps]
    }
    
    extension [Self <: DrawerIconProps](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
  
  trait DrawerItem extends StObject {
    
    var focused: Boolean
    
    var route: NavigationRoute[NavigationParams]
  }
  object DrawerItem {
    
    inline def apply(focused: Boolean, route: NavigationRoute[NavigationParams]): DrawerItem = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerItem]
    }
    
    extension [Self <: DrawerItem](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: NavigationRoute[NavigationParams]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait DrawerLabelProps extends StObject {
    
    var focused: Boolean
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object DrawerLabelProps {
    
    inline def apply(focused: Boolean): DrawerLabelProps = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerLabelProps]
    }
    
    extension [Self <: DrawerLabelProps](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked
    - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`
    - typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`
  */
  trait DrawerLockMode extends StObject
  object DrawerLockMode {
    
    inline def `locked-closed`: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed` = "locked-closed".asInstanceOf[typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-closed`]
    
    inline def `locked-open`: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open` = "locked-open".asInstanceOf[typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.`locked-open`]
    
    inline def unlocked: typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked = "unlocked".asInstanceOf[typingsJapgolly.reactNavigationDrawer.reactNavigationDrawerStrings.unlocked]
  }
  
  trait DrawerNavigatorItemsProps extends StObject {
    
    var activeBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
    
    var activeItemKey: js.UndefOr[String | Null] = js.undefined
    
    var activeLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var activeTintColor: js.UndefOr[String | ThemedColor] = js.undefined
    
    var drawerPosition: left | right
    
    def getLabel(scene: Scene): japgolly.scalajs.react.facade.React.Node
    
    var iconContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var inactiveBackgroundColor: js.UndefOr[String | ThemedColor] = js.undefined
    
    var inactiveLabelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var inactiveTintColor: js.UndefOr[String | ThemedColor] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var items: js.Array[NavigationRoute[NavigationParams]]
    
    var itemsContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var labelStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    def onItemPress(scene: Focused): Unit
    
    def renderIcon(scene: Scene): japgolly.scalajs.react.facade.React.Node
    
    var screenProps: Any
  }
  object DrawerNavigatorItemsProps {
    
    inline def apply(
      drawerPosition: left | right,
      getLabel: Scene => japgolly.scalajs.react.facade.React.Node,
      items: js.Array[NavigationRoute[NavigationParams]],
      onItemPress: Focused => Callback,
      renderIcon: Scene => japgolly.scalajs.react.facade.React.Node,
      screenProps: Any
    ): DrawerNavigatorItemsProps = {
      val __obj = js.Dynamic.literal(drawerPosition = drawerPosition.asInstanceOf[js.Any], getLabel = js.Any.fromFunction1(getLabel), items = items.asInstanceOf[js.Any], onItemPress = js.Any.fromFunction1((t0: Focused) => onItemPress(t0).runNow()), renderIcon = js.Any.fromFunction1(renderIcon), screenProps = screenProps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DrawerNavigatorItemsProps]
    }
    
    extension [Self <: DrawerNavigatorItemsProps](x: Self) {
      
      inline def setActiveBackgroundColor(value: String | ThemedColor): Self = StObject.set(x, "activeBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setActiveBackgroundColorUndefined: Self = StObject.set(x, "activeBackgroundColor", js.undefined)
      
      inline def setActiveItemKey(value: String): Self = StObject.set(x, "activeItemKey", value.asInstanceOf[js.Any])
      
      inline def setActiveItemKeyNull: Self = StObject.set(x, "activeItemKey", null)
      
      inline def setActiveItemKeyUndefined: Self = StObject.set(x, "activeItemKey", js.undefined)
      
      inline def setActiveLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "activeLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveLabelStyleNull: Self = StObject.set(x, "activeLabelStyle", null)
      
      inline def setActiveLabelStyleUndefined: Self = StObject.set(x, "activeLabelStyle", js.undefined)
      
      inline def setActiveTintColor(value: String | ThemedColor): Self = StObject.set(x, "activeTintColor", value.asInstanceOf[js.Any])
      
      inline def setActiveTintColorUndefined: Self = StObject.set(x, "activeTintColor", js.undefined)
      
      inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setGetLabel(value: Scene => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "getLabel", js.Any.fromFunction1(value))
      
      inline def setIconContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "iconContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setIconContainerStyleNull: Self = StObject.set(x, "iconContainerStyle", null)
      
      inline def setIconContainerStyleUndefined: Self = StObject.set(x, "iconContainerStyle", js.undefined)
      
      inline def setInactiveBackgroundColor(value: String | ThemedColor): Self = StObject.set(x, "inactiveBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveBackgroundColorUndefined: Self = StObject.set(x, "inactiveBackgroundColor", js.undefined)
      
      inline def setInactiveLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "inactiveLabelStyle", value.asInstanceOf[js.Any])
      
      inline def setInactiveLabelStyleNull: Self = StObject.set(x, "inactiveLabelStyle", null)
      
      inline def setInactiveLabelStyleUndefined: Self = StObject.set(x, "inactiveLabelStyle", js.undefined)
      
      inline def setInactiveTintColor(value: String | ThemedColor): Self = StObject.set(x, "inactiveTintColor", value.asInstanceOf[js.Any])
      
      inline def setInactiveTintColorUndefined: Self = StObject.set(x, "inactiveTintColor", js.undefined)
      
      inline def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setItems(value: js.Array[NavigationRoute[NavigationParams]]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemsContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setItemsContainerStyleNull: Self = StObject.set(x, "itemsContainerStyle", null)
      
      inline def setItemsContainerStyleUndefined: Self = StObject.set(x, "itemsContainerStyle", js.undefined)
      
      inline def setItemsVarargs(value: NavigationRoute[NavigationParams]*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLabelStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "labelStyle", value.asInstanceOf[js.Any])
      
      inline def setLabelStyleNull: Self = StObject.set(x, "labelStyle", null)
      
      inline def setLabelStyleUndefined: Self = StObject.set(x, "labelStyle", js.undefined)
      
      inline def setOnItemPress(value: Focused => Callback): Self = StObject.set(x, "onItemPress", js.Any.fromFunction1((t0: Focused) => value(t0).runNow()))
      
      inline def setRenderIcon(value: Scene => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationDrawerConfig extends StObject {
    
    var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
    
    var detachInactiveScreens: js.UndefOr[Boolean] = js.undefined
    
    var drawerBackgroundColor: js.UndefOr[ThemedColor] = js.undefined
    
    var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
    
    var drawerPosition: js.UndefOr[left | right] = js.undefined
    
    var drawerType: js.UndefOr[front | back | slide] = js.undefined
    
    var drawerWidth: js.UndefOr[Double | js.Function0[Double]] = js.undefined
    
    var edgeWidth: js.UndefOr[Double] = js.undefined
    
    var hideStatusBar: js.UndefOr[Boolean] = js.undefined
    
    var keyboardDismissMode: js.UndefOr[none | `on-drag`] = js.undefined
    
    var minSwipeDistance: js.UndefOr[Double] = js.undefined
    
    var overlayColor: js.UndefOr[ThemedColor] = js.undefined
    
    var screenContainerStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var statusBarAnimation: js.UndefOr[slide | none | fade] = js.undefined
    
    var swipeDistanceThreshold: js.UndefOr[Double] = js.undefined
    
    var swipeEdgeWidth: js.UndefOr[Double] = js.undefined
    
    var swipeVelocityThreshold: js.UndefOr[Double] = js.undefined
  }
  object NavigationDrawerConfig {
    
    inline def apply(): NavigationDrawerConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationDrawerConfig]
    }
    
    extension [Self <: NavigationDrawerConfig](x: Self) {
      
      inline def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      inline def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      inline def setDetachInactiveScreens(value: Boolean): Self = StObject.set(x, "detachInactiveScreens", value.asInstanceOf[js.Any])
      
      inline def setDetachInactiveScreensUndefined: Self = StObject.set(x, "detachInactiveScreens", js.undefined)
      
      inline def setDrawerBackgroundColor(value: ThemedColor): Self = StObject.set(x, "drawerBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setDrawerBackgroundColorUndefined: Self = StObject.set(x, "drawerBackgroundColor", js.undefined)
      
      inline def setDrawerLockMode(value: DrawerLockMode): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      inline def setDrawerPosition(value: left | right): Self = StObject.set(x, "drawerPosition", value.asInstanceOf[js.Any])
      
      inline def setDrawerPositionUndefined: Self = StObject.set(x, "drawerPosition", js.undefined)
      
      inline def setDrawerType(value: front | back | slide): Self = StObject.set(x, "drawerType", value.asInstanceOf[js.Any])
      
      inline def setDrawerTypeUndefined: Self = StObject.set(x, "drawerType", js.undefined)
      
      inline def setDrawerWidth(value: Double | js.Function0[Double]): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
      
      inline def setDrawerWidthCallbackTo(value: CallbackTo[Double]): Self = StObject.set(x, "drawerWidth", value.toJsFn)
      
      inline def setDrawerWidthUndefined: Self = StObject.set(x, "drawerWidth", js.undefined)
      
      inline def setEdgeWidth(value: Double): Self = StObject.set(x, "edgeWidth", value.asInstanceOf[js.Any])
      
      inline def setEdgeWidthUndefined: Self = StObject.set(x, "edgeWidth", js.undefined)
      
      inline def setHideStatusBar(value: Boolean): Self = StObject.set(x, "hideStatusBar", value.asInstanceOf[js.Any])
      
      inline def setHideStatusBarUndefined: Self = StObject.set(x, "hideStatusBar", js.undefined)
      
      inline def setKeyboardDismissMode(value: none | `on-drag`): Self = StObject.set(x, "keyboardDismissMode", value.asInstanceOf[js.Any])
      
      inline def setKeyboardDismissModeUndefined: Self = StObject.set(x, "keyboardDismissMode", js.undefined)
      
      inline def setMinSwipeDistance(value: Double): Self = StObject.set(x, "minSwipeDistance", value.asInstanceOf[js.Any])
      
      inline def setMinSwipeDistanceUndefined: Self = StObject.set(x, "minSwipeDistance", js.undefined)
      
      inline def setOverlayColor(value: ThemedColor): Self = StObject.set(x, "overlayColor", value.asInstanceOf[js.Any])
      
      inline def setOverlayColorUndefined: Self = StObject.set(x, "overlayColor", js.undefined)
      
      inline def setScreenContainerStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "screenContainerStyle", value.asInstanceOf[js.Any])
      
      inline def setScreenContainerStyleNull: Self = StObject.set(x, "screenContainerStyle", null)
      
      inline def setScreenContainerStyleUndefined: Self = StObject.set(x, "screenContainerStyle", js.undefined)
      
      inline def setStatusBarAnimation(value: slide | none | fade): Self = StObject.set(x, "statusBarAnimation", value.asInstanceOf[js.Any])
      
      inline def setStatusBarAnimationUndefined: Self = StObject.set(x, "statusBarAnimation", js.undefined)
      
      inline def setSwipeDistanceThreshold(value: Double): Self = StObject.set(x, "swipeDistanceThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeDistanceThresholdUndefined: Self = StObject.set(x, "swipeDistanceThreshold", js.undefined)
      
      inline def setSwipeEdgeWidth(value: Double): Self = StObject.set(x, "swipeEdgeWidth", value.asInstanceOf[js.Any])
      
      inline def setSwipeEdgeWidthUndefined: Self = StObject.set(x, "swipeEdgeWidth", js.undefined)
      
      inline def setSwipeVelocityThreshold(value: Double): Self = StObject.set(x, "swipeVelocityThreshold", value.asInstanceOf[js.Any])
      
      inline def setSwipeVelocityThresholdUndefined: Self = StObject.set(x, "swipeVelocityThreshold", js.undefined)
    }
  }
  
  trait NavigationDrawerOptions extends StObject {
    
    var drawerIcon: js.UndefOr[
        japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ DrawerIconProps, japgolly.scalajs.react.facade.React.Node])
      ] = js.undefined
    
    var drawerLabel: js.UndefOr[
        japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ DrawerLabelProps, japgolly.scalajs.react.facade.React.Node])
      ] = js.undefined
    
    var drawerLockMode: js.UndefOr[DrawerLockMode] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object NavigationDrawerOptions {
    
    inline def apply(): NavigationDrawerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationDrawerOptions]
    }
    
    extension [Self <: NavigationDrawerOptions](x: Self) {
      
      inline def setDrawerIcon(
        value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ DrawerIconProps, japgolly.scalajs.react.facade.React.Node])
      ): Self = StObject.set(x, "drawerIcon", value.asInstanceOf[js.Any])
      
      inline def setDrawerIconFunction1(value: /* props */ DrawerIconProps => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "drawerIcon", js.Any.fromFunction1(value))
      
      inline def setDrawerIconNull: Self = StObject.set(x, "drawerIcon", null)
      
      inline def setDrawerIconUndefined: Self = StObject.set(x, "drawerIcon", js.undefined)
      
      inline def setDrawerIconVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "drawerIcon", js.Array(value*))
      
      inline def setDrawerIconVdomElement(value: VdomElement): Self = StObject.set(x, "drawerIcon", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDrawerLabel(
        value: japgolly.scalajs.react.facade.React.Node | (js.Function1[/* props */ DrawerLabelProps, japgolly.scalajs.react.facade.React.Node])
      ): Self = StObject.set(x, "drawerLabel", value.asInstanceOf[js.Any])
      
      inline def setDrawerLabelFunction1(value: /* props */ DrawerLabelProps => japgolly.scalajs.react.facade.React.Node): Self = StObject.set(x, "drawerLabel", js.Any.fromFunction1(value))
      
      inline def setDrawerLabelNull: Self = StObject.set(x, "drawerLabel", null)
      
      inline def setDrawerLabelUndefined: Self = StObject.set(x, "drawerLabel", js.undefined)
      
      inline def setDrawerLabelVarargs(value: (Empty | String | JsNumber | Element)*): Self = StObject.set(x, "drawerLabel", js.Array(value*))
      
      inline def setDrawerLabelVdomElement(value: VdomElement): Self = StObject.set(x, "drawerLabel", value.rawElement.asInstanceOf[js.Any])
      
      inline def setDrawerLockMode(value: DrawerLockMode): Self = StObject.set(x, "drawerLockMode", value.asInstanceOf[js.Any])
      
      inline def setDrawerLockModeUndefined: Self = StObject.set(x, "drawerLockMode", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  @js.native
  trait NavigationDrawerProp[State, Params]
    extends StObject
       with NavigationScreenProp[State, Params] {
    
    def closeDrawer(): Unit = js.native
    
    def jumpTo(routeName: String): Unit = js.native
    def jumpTo(routeName: String, key: String): Unit = js.native
    
    def openDrawer(): Unit = js.native
    
    def toggleDrawer(): Unit = js.native
  }
  
  trait NavigationDrawerRouterConfig extends StObject {
    
    var backBehavior: js.UndefOr[none | initialRoute | history] = js.undefined
    
    var contentComponent: js.UndefOr[ComponentType[DrawerContentComponentProps]] = js.undefined
    
    var contentOptions: js.UndefOr[ActiveItemKey] = js.undefined
    
    var initialRouteName: js.UndefOr[String] = js.undefined
    
    var resetOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var unmountInactiveRoutes: js.UndefOr[Boolean] = js.undefined
  }
  object NavigationDrawerRouterConfig {
    
    inline def apply(): NavigationDrawerRouterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationDrawerRouterConfig]
    }
    
    extension [Self <: NavigationDrawerRouterConfig](x: Self) {
      
      inline def setBackBehavior(value: none | initialRoute | history): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
      
      inline def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
      
      inline def setContentComponent(value: ComponentType[DrawerContentComponentProps]): Self = StObject.set(x, "contentComponent", value.asInstanceOf[js.Any])
      
      inline def setContentComponentUndefined: Self = StObject.set(x, "contentComponent", js.undefined)
      
      inline def setContentOptions(value: ActiveItemKey): Self = StObject.set(x, "contentOptions", value.asInstanceOf[js.Any])
      
      inline def setContentOptionsUndefined: Self = StObject.set(x, "contentOptions", js.undefined)
      
      inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
      
      inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
      
      inline def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
      
      inline def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
      
      inline def setUnmountInactiveRoutes(value: Boolean): Self = StObject.set(x, "unmountInactiveRoutes", value.asInstanceOf[js.Any])
      
      inline def setUnmountInactiveRoutesUndefined: Self = StObject.set(x, "unmountInactiveRoutes", js.undefined)
    }
  }
  
  type NavigationDrawerScreenComponent[Params, ScreenProps] = (ComponentType[NavigationDrawerScreenProps[Params, ScreenProps]]) & (NavigationOptions[Params, ScreenProps])
  
  trait NavigationDrawerScreenProps[Params, ScreenProps] extends StObject {
    
    var navigation: NavigationDrawerProp[NavigationRoute[NavigationParams], Params]
    
    var screenProps: ScreenProps
    
    var theme: SupportedThemes
  }
  object NavigationDrawerScreenProps {
    
    inline def apply[Params, ScreenProps](
      navigation: NavigationDrawerProp[NavigationRoute[NavigationParams], Params],
      screenProps: ScreenProps,
      theme: SupportedThemes
    ): NavigationDrawerScreenProps[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationDrawerScreenProps[Params, ScreenProps]]
    }
    
    extension [Self <: NavigationDrawerScreenProps[?, ?], Params, ScreenProps](x: Self & (NavigationDrawerScreenProps[Params, ScreenProps])) {
      
      inline def setNavigation(value: NavigationDrawerProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationDrawerState
    extends StObject
       with NavigationState {
    
    var isDrawerOpen: Boolean
  }
  object NavigationDrawerState {
    
    inline def apply(
      index: Double,
      isDrawerOpen: Boolean,
      isTransitioning: Boolean,
      key: String,
      routes: js.Array[NavigationRoute[NavigationParams]]
    ): NavigationDrawerState = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], isDrawerOpen = isDrawerOpen.asInstanceOf[js.Any], isTransitioning = isTransitioning.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], routes = routes.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationDrawerState]
    }
    
    extension [Self <: NavigationDrawerState](x: Self) {
      
      inline def setIsDrawerOpen(value: Boolean): Self = StObject.set(x, "isDrawerOpen", value.asInstanceOf[js.Any])
    }
  }
  
  trait Scene extends StObject {
    
    var focused: Boolean
    
    var index: Double
    
    var route: NavigationRoute[NavigationParams]
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object Scene {
    
    inline def apply(focused: Boolean, index: Double, route: NavigationRoute[NavigationParams]): Scene = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Scene]
    }
    
    extension [Self <: Scene](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: NavigationRoute[NavigationParams]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
  
  type SceneDescriptorMap = StringDictionary[
    NavigationDescriptor[
      NavigationParams, 
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Any]
    ]
  ]
  
  type ThemedColor = String | Dark
}
