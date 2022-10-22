package typingsJapgolly.hippyReact.mod

import japgolly.scalajs.react.facade.React.ComponentClassP
import typingsJapgolly.react.mod.FunctionComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Route extends StObject {
  
  var animated: js.UndefOr[Boolean] = js.undefined
  
  var component: js.UndefOr[String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])] = js.undefined
  
  var initProps: js.UndefOr[Any] = js.undefined
  
  var routeName: String
}
object Route {
  
  inline def apply(routeName: String): Route = {
    val __obj = js.Dynamic.literal(routeName = routeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  extension [Self <: Route](x: Self) {
    
    inline def setAnimated(value: Boolean): Self = StObject.set(x, "animated", value.asInstanceOf[js.Any])
    
    inline def setAnimatedUndefined: Self = StObject.set(x, "animated", js.undefined)
    
    inline def setComponent(value: String | FunctionComponent[Any] | (ComponentClassP[Any & js.Object])): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
    
    inline def setInitProps(value: Any): Self = StObject.set(x, "initProps", value.asInstanceOf[js.Any])
    
    inline def setInitPropsUndefined: Self = StObject.set(x, "initProps", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
  }
}
