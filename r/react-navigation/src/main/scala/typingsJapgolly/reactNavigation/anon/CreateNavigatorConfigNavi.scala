package typingsJapgolly.reactNavigation.anon

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationPathsConfig
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfig
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfigProps
import typingsJapgolly.reactNavigation.mod.NavigationScreenProp
import typingsJapgolly.reactNavigation.mod.NavigationSwitchProp
import typingsJapgolly.reactNavigation.reactNavigationStrings.history
import typingsJapgolly.reactNavigation.reactNavigationStrings.initialRoute
import typingsJapgolly.reactNavigation.reactNavigationStrings.none
import typingsJapgolly.reactNavigation.reactNavigationStrings.order
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-navigation.react-navigation.CreateNavigatorConfig<{}, react-navigation.react-navigation.NavigationSwitchRouterConfig, {}, react-navigation.react-navigation.NavigationSwitchProp<react-navigation.react-navigation.NavigationRoute<react-navigation.react-navigation.NavigationParams>, react-navigation.react-navigation.NavigationParams>> */
trait CreateNavigatorConfigNavi extends StObject {
  
  var backBehavior: js.UndefOr[none | initialRoute | history | order] = js.undefined
  
  var defaultNavigationOptions: js.UndefOr[
    NavigationScreenConfig[
      js.Object, 
      NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ]
  ] = js.undefined
  
  var initialRouteName: js.UndefOr[String] = js.undefined
  
  var initialRouteParams: js.UndefOr[NavigationParams] = js.undefined
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      StringDictionary[Any], 
      NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
      Any
    ]
  ] = js.undefined
  
  var order: js.UndefOr[js.Array[String]] = js.undefined
  
  var paths: js.UndefOr[NavigationPathsConfig] = js.undefined
  
  // defaults to 'none'
  var resetOnBlur: js.UndefOr[Boolean] = js.undefined
}
object CreateNavigatorConfigNavi {
  
  inline def apply(): CreateNavigatorConfigNavi = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateNavigatorConfigNavi]
  }
  
  extension [Self <: CreateNavigatorConfigNavi](x: Self) {
    
    inline def setBackBehavior(value: none | initialRoute | history | order): Self = StObject.set(x, "backBehavior", value.asInstanceOf[js.Any])
    
    inline def setBackBehaviorUndefined: Self = StObject.set(x, "backBehavior", js.undefined)
    
    inline def setDefaultNavigationOptions(
      value: NavigationScreenConfig[
          js.Object, 
          NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], 
          Any
        ]
    ): Self = StObject.set(x, "defaultNavigationOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationSwitchProp[NavigationRoute[NavigationParams], NavigationParams], Any]) & NavigationOptionsOptions[js.Object] => js.Object
    ): Self = StObject.set(x, "defaultNavigationOptions", js.Any.fromFunction1(value))
    
    inline def setDefaultNavigationOptionsUndefined: Self = StObject.set(x, "defaultNavigationOptions", js.undefined)
    
    inline def setInitialRouteName(value: String): Self = StObject.set(x, "initialRouteName", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteNameUndefined: Self = StObject.set(x, "initialRouteName", js.undefined)
    
    inline def setInitialRouteParams(value: NavigationParams): Self = StObject.set(x, "initialRouteParams", value.asInstanceOf[js.Any])
    
    inline def setInitialRouteParamsUndefined: Self = StObject.set(x, "initialRouteParams", js.undefined)
    
    inline def setNavigationOptions(
      value: NavigationScreenConfig[
          StringDictionary[Any], 
          NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], 
          Any
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationScreenProp[NavigationRoute[NavigationParams], NavigationParams], Any]) & NavigationOptionsOptions[StringDictionary[Any]] => StringDictionary[Any]
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
    
    inline def setOrder(value: js.Array[String]): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setOrderVarargs(value: String*): Self = StObject.set(x, "order", js.Array(value*))
    
    inline def setPaths(value: NavigationPathsConfig): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
    
    inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
    
    inline def setResetOnBlur(value: Boolean): Self = StObject.set(x, "resetOnBlur", value.asInstanceOf[js.Any])
    
    inline def setResetOnBlurUndefined: Self = StObject.set(x, "resetOnBlur", js.undefined)
  }
}
