package typingsJapgolly.reactNativeCommunityCliPluginMetro.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameParse extends StObject {
  
  var default: Boolean
  
  var description: String
  
  var name: String
  
  var parse: Unit
}
object NameParse {
  
  inline def apply(default: Boolean, description: String, name: String, parse: Unit): NameParse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameParse]
  }
  
  extension [Self <: NameParse](x: Self) {
    
    inline def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: Unit): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
