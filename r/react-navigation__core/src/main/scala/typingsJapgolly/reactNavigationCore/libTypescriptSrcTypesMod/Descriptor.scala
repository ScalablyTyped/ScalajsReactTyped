package typingsJapgolly.reactNavigationCore.libTypescriptSrcTypesMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Descriptor[ScreenOptions /* <: js.Object */, Navigation /* <: NavigationProp[Any, Any, Any, Any, Any, Any] */, Route /* <: RouteProp[Any, Any] */] extends StObject {
  
  /**
    * Navigation object for the screen
    */
  var navigation: Navigation
  
  /**
    * Options for the route.
    */
  var options: ScreenOptions
  
  /**
    * Render the component associated with this route.
    */
  def render(): Element
  
  /**
    * Route object for the screen
    */
  var route: Route
}
object Descriptor {
  
  inline def apply[ScreenOptions /* <: js.Object */, Navigation /* <: NavigationProp[Any, Any, Any, Any, Any, Any] */, Route /* <: RouteProp[Any, Any] */](navigation: Navigation, options: ScreenOptions, render: CallbackTo[Element], route: Route): Descriptor[ScreenOptions, Navigation, Route] = {
    val __obj = js.Dynamic.literal(navigation = navigation.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], render = render.toJsFn, route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[Descriptor[ScreenOptions, Navigation, Route]]
  }
  
  extension [Self <: Descriptor[?, ?, ?], ScreenOptions /* <: js.Object */, Navigation /* <: NavigationProp[Any, Any, Any, Any, Any, Any] */, Route /* <: RouteProp[Any, Any] */](x: Self & (Descriptor[ScreenOptions, Navigation, Route])) {
    
    inline def setNavigation(value: Navigation): Self = StObject.set(x, "navigation", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: ScreenOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setRender(value: CallbackTo[Element]): Self = StObject.set(x, "render", value.toJsFn)
    
    inline def setRoute(value: Route): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
  }
}
