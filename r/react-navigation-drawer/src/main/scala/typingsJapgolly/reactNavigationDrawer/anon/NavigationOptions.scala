package typingsJapgolly.reactNavigationDrawer.anon

import typingsJapgolly.reactNavigation.anon.NavigationOptionsOptions
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfig
import typingsJapgolly.reactNavigation.mod.NavigationScreenConfigProps
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerOptions
import typingsJapgolly.reactNavigationDrawer.libTypescriptSrcTypesMod.NavigationDrawerProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationOptions[Params, ScreenProps] extends StObject {
  
  var navigationOptions: js.UndefOr[
    NavigationScreenConfig[
      NavigationDrawerOptions, 
      NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
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
          NavigationDrawerOptions, 
          NavigationDrawerProp[NavigationRoute[NavigationParams], Params], 
          ScreenProps
        ]
    ): Self = StObject.set(x, "navigationOptions", value.asInstanceOf[js.Any])
    
    inline def setNavigationOptionsFunction1(
      value: /* navigationOptionsContainer */ (NavigationScreenConfigProps[NavigationDrawerProp[NavigationRoute[NavigationParams], Params], ScreenProps]) & NavigationOptionsOptions[NavigationDrawerOptions] => NavigationDrawerOptions
    ): Self = StObject.set(x, "navigationOptions", js.Any.fromFunction1(value))
    
    inline def setNavigationOptionsUndefined: Self = StObject.set(x, "navigationOptions", js.undefined)
  }
}
