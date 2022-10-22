package typingsJapgolly.reactNavigationMaterialBottomTabs

import japgolly.scalajs.react.facade.React.Node
import typingsJapgolly.callstackReactThemeProvider.typingsHoistNonReactStaticsMod.NonReactStatics
import typingsJapgolly.react.mod.Component
import typingsJapgolly.react.mod.ComponentProps
import typingsJapgolly.react.mod.ComponentType
import typingsJapgolly.react.mod.Context
import typingsJapgolly.reactNative.mod.StyleProp
import typingsJapgolly.reactNative.mod.ViewStyle
import typingsJapgolly.reactNativePaper.anon.PickPropsstylenavigationS
import typingsJapgolly.reactNativePaper.anon.SceneMap
import typingsJapgolly.reactNavigation.mod.SupportedThemes
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.Color
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.Descriptors
import typingsJapgolly.reactNavigationMaterialBottomTabs.anon.RouteKey
import typingsJapgolly.reactNavigationMaterialBottomTabs.libTypescriptSrcTypesMod.NavigationMaterialBottomTabConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcViewsMaterialBottomTabViewMod {
  
  @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
  @js.native
  open class default () extends MaterialBottomTabView
  /* static members */
  object default {
    
    @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-navigation-material-bottom-tabs/lib/typescript/src/views/MaterialBottomTabView", "default.contextType")
    @js.native
    def contextType: Context[SupportedThemes] = js.native
    inline def contextType_=(x: Context[SupportedThemes]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait MaterialBottomTabView
    extends Component[Props, js.Object, Any] {
    
    def _getBarStyle(): js.Array[StyleProp[ViewStyle]] = js.native
    
    def _getColor(hasRoute: RouteKey): js.UndefOr[String] = js.native
    
    def _getInactiveColor(): js.UndefOr[String] = js.native
    
    def _getactiveColor(): js.UndefOr[String] = js.native
    
    def _isVisible(): js.UndefOr[Boolean] = js.native
    
    def _renderIcon(hasRouteFocusedColor: Color): Node = js.native
  }
  
  trait Options extends StObject {
    
    var tabBarColor: js.UndefOr[String] = js.undefined
    
    var tabBarColorDark: js.UndefOr[String] = js.undefined
    
    var tabBarColorLight: js.UndefOr[String] = js.undefined
    
    var tabBarVisible: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setTabBarColor(value: String): Self = StObject.set(x, "tabBarColor", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorDark(value: String): Self = StObject.set(x, "tabBarColorDark", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorDarkUndefined: Self = StObject.set(x, "tabBarColorDark", js.undefined)
      
      inline def setTabBarColorLight(value: String): Self = StObject.set(x, "tabBarColorLight", value.asInstanceOf[js.Any])
      
      inline def setTabBarColorLightUndefined: Self = StObject.set(x, "tabBarColorLight", js.undefined)
      
      inline def setTabBarColorUndefined: Self = StObject.set(x, "tabBarColor", js.undefined)
      
      inline def setTabBarVisible(value: Boolean): Self = StObject.set(x, "tabBarVisible", value.asInstanceOf[js.Any])
      
      inline def setTabBarVisibleUndefined: Self = StObject.set(x, "tabBarVisible", js.undefined)
    }
  }
  
  type Props = (ComponentProps[
    ComponentType[PickPropsstylenavigationS] & (NonReactStatics[
      (ComponentType[
        typingsJapgolly.reactNativePaper.libTypescriptComponentsBottomNavigationBottomNavigationMod.Props
      ]) & SceneMap, 
      js.Object
    ])
  ]) & NavigationMaterialBottomTabConfig & Descriptors
}
