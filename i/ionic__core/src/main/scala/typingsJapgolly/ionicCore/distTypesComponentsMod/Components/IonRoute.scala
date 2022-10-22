package typingsJapgolly.ionicCore.distTypesComponentsMod.Components

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ionicCore.distTypesComponentsRouteRouteInterfaceMod.NavigationHookCallback
import typingsJapgolly.ionicCore.distTypesComponentsRouteRouteInterfaceMod.NavigationHookResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IonRoute extends StObject {
  
  /**
    * A navigation hook that is fired when the route tries to enter. Returning `true` allows the navigation to proceed, while returning `false` causes it to be cancelled. Returning a `NavigationHookOptions` object causes the router to redirect to the path specified.
    */
  var beforeEnter: js.UndefOr[NavigationHookCallback] = js.undefined
  
  /**
    * A navigation hook that is fired when the route tries to leave. Returning `true` allows the navigation to proceed, while returning `false` causes it to be cancelled. Returning a `NavigationHookOptions` object causes the router to redirect to the path specified.
    */
  var beforeLeave: js.UndefOr[NavigationHookCallback] = js.undefined
  
  /**
    * Name of the component to load/select in the navigation outlet (`ion-tabs`, `ion-nav`) when the route matches.  The value of this property is not always the tagname of the component to load, in `ion-tabs` it actually refers to the name of the `ion-tab` to select.
    */
  var component: String
  
  /**
    * A key value `{ 'red': true, 'blue': 'white'}` containing props that should be passed to the defined component when rendered.
    */
  var componentProps: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  /**
    * Relative path that needs to match in order for this route to apply.  Accepts paths similar to expressjs so that you can define parameters in the url /foo/:bar where bar would be available in incoming props.
    */
  var url: String
}
object IonRoute {
  
  inline def apply(component: String, url: String): IonRoute = {
    val __obj = js.Dynamic.literal(component = component.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[IonRoute]
  }
  
  extension [Self <: IonRoute](x: Self) {
    
    inline def setBeforeEnter(value: CallbackTo[NavigationHookResult | js.Promise[NavigationHookResult]]): Self = StObject.set(x, "beforeEnter", value.toJsFn)
    
    inline def setBeforeEnterUndefined: Self = StObject.set(x, "beforeEnter", js.undefined)
    
    inline def setBeforeLeave(value: CallbackTo[NavigationHookResult | js.Promise[NavigationHookResult]]): Self = StObject.set(x, "beforeLeave", value.toJsFn)
    
    inline def setBeforeLeaveUndefined: Self = StObject.set(x, "beforeLeave", js.undefined)
    
    inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentProps(value: StringDictionary[Any]): Self = StObject.set(x, "componentProps", value.asInstanceOf[js.Any])
    
    inline def setComponentPropsUndefined: Self = StObject.set(x, "componentProps", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
