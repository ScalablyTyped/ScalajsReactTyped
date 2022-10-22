package typingsJapgolly.reactNavigationStack

import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationStack.anon.NavigationOptions
import typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod.StackNavigationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcTypesMod {
  
  type NavigationStackScreenComponent[Params, ScreenProps] = (ComponentType[NavigationStackScreenProps[Params, ScreenProps]]) & (NavigationOptions[Params, ScreenProps])
  
  trait NavigationStackScreenProps[Params, ScreenProps] extends StObject {
    
    var navigation: StackNavigationProp[NavigationRoute[NavigationParams], Params]
    
    var screenProps: ScreenProps
    
    var theme: SupportedThemes
  }
  object NavigationStackScreenProps {
    
    inline def apply[Params, ScreenProps](
      navigation: StackNavigationProp[NavigationRoute[NavigationParams], Params],
      screenProps: ScreenProps,
      theme: SupportedThemes
    ): NavigationStackScreenProps[Params, ScreenProps] = {
      val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], screenProps = screenProps.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[NavigationStackScreenProps[Params, ScreenProps]]
    }
    
    extension [Self <: NavigationStackScreenProps[?, ?], Params, ScreenProps](x: Self & (NavigationStackScreenProps[Params, ScreenProps])) {
      
      inline def setNavigation(value: StackNavigationProp[NavigationRoute[NavigationParams], Params]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
      
      inline def setScreenProps(value: ScreenProps): Self = StObject.set(x, "screenProps", value.asInstanceOf[js.Any])
      
      inline def setTheme(value: SupportedThemes): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
}
