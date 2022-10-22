package typingsJapgolly.reactNavigationStack.libTypescriptSrcVendorTypesMod

import typingsJapgolly.reactNativeSafeAreaContext.libTypescriptSafeAreaDottypesMod.EdgeInsets
import typingsJapgolly.reactNavigation.mod.NavigationParams
import typingsJapgolly.reactNavigation.mod.NavigationRoute
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.float
import typingsJapgolly.reactNavigationStack.reactNavigationStackStrings.screen
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackHeaderProps extends StObject {
  
  /**
    * Safe area insets to use in the header, e.g. to apply extra spacing for statusbar and notch.
    */
  var insets: EdgeInsets
  
  /**
    * Layout of the screen.
    */
  var layout: Layout
  
  /**
    * Mode of the header: `float` renders a single floating header across all screens,
    * `screen` renders separate headers for each screen.
    */
  var mode: float | screen
  
  /**
    * Navigation prop for the header.
    */
  var navigation: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]
  
  /**
    * Object representing the previous scene.
    */
  var previous: js.UndefOr[Scene[Route[String]]] = js.undefined
  
  /**
    * Object representing the current scene, such as the route object and animation progress.
    */
  var scene: Scene[Route[String]]
  
  /**
    * Interpolated styles for various elements in the header.
    */
  var styleInterpolator: StackHeaderStyleInterpolator
}
object StackHeaderProps {
  
  inline def apply(
    insets: EdgeInsets,
    layout: Layout,
    mode: float | screen,
    navigation: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams],
    scene: Scene[Route[String]],
    styleInterpolator: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle
  ): StackHeaderProps = {
    val __obj = js.Dynamic.literal(insets = insets.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], navigation = navigation.asInstanceOf[js.Any], scene = scene.asInstanceOf[js.Any], styleInterpolator = js.Any.fromFunction1(styleInterpolator))
    __obj.asInstanceOf[StackHeaderProps]
  }
  
  extension [Self <: StackHeaderProps](x: Self) {
    
    inline def setInsets(value: EdgeInsets): Self = StObject.set(x, "insets", value.asInstanceOf[js.Any])
    
    inline def setLayout(value: Layout): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setMode(value: float | screen): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setNavigation(value: StackNavigationProp[NavigationRoute[NavigationParams], NavigationParams]): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setPrevious(value: Scene[Route[String]]): Self = StObject.set(x, "previous", value.asInstanceOf[js.Any])
    
    inline def setPreviousUndefined: Self = StObject.set(x, "previous", js.undefined)
    
    inline def setScene(value: Scene[Route[String]]): Self = StObject.set(x, "scene", value.asInstanceOf[js.Any])
    
    inline def setStyleInterpolator(value: /* props */ StackHeaderInterpolationProps => StackHeaderInterpolatedStyle): Self = StObject.set(x, "styleInterpolator", js.Any.fromFunction1(value))
  }
}
