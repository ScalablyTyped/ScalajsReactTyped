package typingsJapgolly.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KeyStringNameRouteName[RouteName /* <: String */] extends StObject {
  
  /**
    * Unique key for the route.
    */
  var key: String
  
  /**
    * User-provided name for the route.
    */
  var name: RouteName
}
object KeyStringNameRouteName {
  
  inline def apply[RouteName /* <: String */](key: String, name: RouteName): KeyStringNameRouteName[RouteName] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyStringNameRouteName[RouteName]]
  }
  
  extension [Self <: KeyStringNameRouteName[?], RouteName /* <: String */](x: Self & KeyStringNameRouteName[RouteName]) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setName(value: RouteName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
