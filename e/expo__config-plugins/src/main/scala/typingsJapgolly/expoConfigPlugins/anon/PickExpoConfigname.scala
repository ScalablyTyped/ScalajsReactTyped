package typingsJapgolly.expoConfigPlugins.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@expo/config-types.@expo/config-types.ExpoConfig, 'name'> */
trait PickExpoConfigname extends StObject {
  
  var name: String
}
object PickExpoConfigname {
  
  inline def apply(name: String): PickExpoConfigname = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickExpoConfigname]
  }
  
  extension [Self <: PickExpoConfigname](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
