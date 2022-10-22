package typingsJapgolly.reactNavigationMaterialBottomTabs

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Node
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNavigation.anon.NavigationOptionsOptions
import typingsJapgolly.reactNavigation.mod.NavigationDescriptor
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationProp
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfig
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfigProps
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabOptions
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcTypesMod.NavigationTabProp
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcViewsMaterialBottomTabViewMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ActiveColorDark extends StObject {
    
    var activeColorDark: js.UndefOr[String] = js.undefined
    
    var activeColorLight: js.UndefOr[String] = js.undefined
    
    var barStyleDark: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var barStyleLight: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var inactiveColorDark: js.UndefOr[String] = js.undefined
    
    var inactiveColorLight: js.UndefOr[String] = js.undefined
  }
  object ActiveColorDark {
    
    inline def apply(): ActiveColorDark = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ActiveColorDark]
    }
    
    extension [Self <: ActiveColorDark](x: Self) {
      
      inline def setActiveColorDark(value: String): Self = StObject.set(x, "activeColorDark", value.asInstanceOf[js.Any])
      
      inline def setActiveColorDarkUndefined: Self = StObject.set(x, "activeColorDark", js.undefined)
      
      inline def setActiveColorLight(value: String): Self = StObject.set(x, "activeColorLight", value.asInstanceOf[js.Any])
      
      inline def setActiveColorLightUndefined: Self = StObject.set(x, "activeColorLight", js.undefined)
      
      inline def setBarStyleDark(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyleDark", value.asInstanceOf[js.Any])
      
      inline def setBarStyleDarkNull: Self = StObject.set(x, "barStyleDark", null)
      
      inline def setBarStyleDarkUndefined: Self = StObject.set(x, "barStyleDark", js.undefined)
      
      inline def setBarStyleLight(value: StyleProp[ViewStyle]): Self = StObject.set(x, "barStyleLight", value.asInstanceOf[js.Any])
      
      inline def setBarStyleLightNull: Self = StObject.set(x, "barStyleLight", null)
      
      inline def setBarStyleLightUndefined: Self = StObject.set(x, "barStyleLight", js.undefined)
      
      inline def setInactiveColorDark(value: String): Self = StObject.set(x, "inactiveColorDark", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorDarkUndefined: Self = StObject.set(x, "inactiveColorDark", js.undefined)
      
      inline def setInactiveColorLight(value: String): Self = StObject.set(x, "inactiveColorLight", value.asInstanceOf[js.Any])
      
      inline def setInactiveColorLightUndefined: Self = StObject.set(x, "inactiveColorLight", js.undefined)
    }
  }
  
  trait Color extends StObject {
    
    var color: String
    
    var focused: Boolean
    
    var route: Key
  }
  object Color {
    
    inline def apply(color: String, focused: Boolean, route: Key): Color = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Key): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait DefaultHandler extends StObject {
    
    def defaultHandler(): Unit
    
    var navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
  }
  object DefaultHandler {
    
    inline def apply(
      defaultHandler: Callback,
      navigation: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]
    ): DefaultHandler = {
      val __obj = js.Dynamic.literal(defaultHandler = defaultHandler.toJsFn, navigation = navigation.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultHandler]
    }
    
    extension [Self <: DefaultHandler](x: Self) {
      
      inline def setDefaultHandler(value: Callback): Self = StObject.set(x, "defaultHandler", value.toJsFn)
      
      inline def setNavigation(value: NavigationTabProp[NavigationRoute[NavigationParams], NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    }
  }
  
  trait Descriptors extends StObject {
    
    var descriptors: StringDictionary[
        NavigationDescriptor[
          Any, 
          Options, 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
        ]
      ]
    
    var navigation: NavigationProp[Any]
    
    def renderIcon(options: TintColor): Node
    
    var screenProps: js.UndefOr[Any] = js.undefined
  }
  object Descriptors {
    
    inline def apply(
      descriptors: StringDictionary[
          NavigationDescriptor[
            Any, 
            Options, 
            NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
          ]
        ],
      navigation: NavigationProp[Any],
      renderIcon: TintColor => Node
    ): Descriptors = {
      val __obj = js.Dynamic.literal(descriptors = descriptors.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], renderIcon = js.Any.fromFunction1(renderIcon))
      __obj.asInstanceOf[Descriptors]
    }
    
    extension [Self <: Descriptors](x: Self) {
      
      inline def setDescriptors(
        value: StringDictionary[
              NavigationDescriptor[
                Any, 
                Options, 
                NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams]
              ]
            ]
      ): Self = StObject.set(x, "descriptors", value.asInstanceOf[js.Any])
      
      inline def setNavigation(value: NavigationProp[Any]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setRenderIcon(value: TintColor => Node): Self = StObject.set(x, "renderIcon", js.Any.fromFunction1(value))
      
      inline def setScreenProps(value: Any): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setScreenPropsUndefined: Self = StObject.set(x, "screenProps", js.undefined)
    }
  }
  
  trait Focused extends StObject {
    
    var focused: Boolean
    
    var horizontal: js.UndefOr[Boolean] = js.undefined
    
    var tintColor: js.UndefOr[String] = js.undefined
  }
  object Focused {
    
    inline def apply(focused: Boolean): Focused = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any])
      __obj.asInstanceOf[Focused]
    }
    
    extension [Self <: Focused](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setHorizontal(value: Boolean): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      inline def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
      
      inline def setTintColorUndefined: Self = StObject.set(x, "tintColor", js.undefined)
    }
  }
  
  trait Key extends StObject {
    
    var key: String
  }
  object Key {
    
    inline def apply(key: String): Key = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[Key]
    }
    
    extension [Self <: Key](x: Self) {
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  trait NavigationOptions[Params, ScreenProps] extends StObject {
    
    var navigationOptions: js.UndefOr[
        NavigationScreenConfig[
          NavigationMaterialBottomTabOptions, 
          NavigationTabProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
      ] = js.undefined
  }
  object NavigationOptions {
    
    inline def apply[Params, ScreenProps](): NavigationOptions[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigationOptions[Params, ScreenProps]]
    }
    
    extension [Self <: NavigationOptions[?, ?], Params, ScreenProps](x: Self & (NavigationOptions[Params, ScreenProps])) {
      
      inline def setNavigationOptions(
        value: NavigationScreenConfig[
              NavigationMaterialBottomTabOptions, 
              NavigationTabProp[NavigationRoute[NavigationParams], Params], 
              ScreenProps
            ]
      ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
      
      inline def setNavigationOptionsFunction1(
        value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationTabProp[NavigationRoute[NavigationParams], Params], ScreenProps]) & NavigationOptionsOptions[NavigationMaterialBottomTabOptions] => NavigationMaterialBottomTabOptions
      ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
      
      inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    }
  }
  
  trait Route extends StObject {
    
    var route: NavigationRoute[NavigationParams]
  }
  object Route {
    
    inline def apply(route: NavigationRoute[NavigationParams]): Route = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[Route]
    }
    
    extension [Self <: Route](x: Self) {
      
      inline def setRoute(value: NavigationRoute[NavigationParams]): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait RouteKey extends StObject {
    
    var route: Key
  }
  object RouteKey {
    
    inline def apply(route: Key): RouteKey = {
      val __obj = js.Dynamic.literal(route = route.asInstanceOf[js.Any])
      __obj.asInstanceOf[RouteKey]
    }
    
    extension [Self <: RouteKey](x: Self) {
      
      inline def setRoute(value: Key): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    }
  }
  
  trait TintColor extends StObject {
    
    var focused: Boolean
    
    var route: Key
    
    var tintColor: String
  }
  object TintColor {
    
    inline def apply(focused: Boolean, route: Key, tintColor: String): TintColor = {
      val __obj = js.Dynamic.literal(focused = focused.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any], tintColor = tintColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TintColor]
    }
    
    extension [Self <: TintColor](x: Self) {
      
      inline def setFocused(value: Boolean): Self = StObject.set(x, "focused", value.asInstanceOf[js.Any])
      
      inline def setRoute(value: Key): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
      
      inline def setTintColor(value: String): Self = StObject.set(x, "tintColor", value.asInstanceOf[js.Any])
    }
  }
}
