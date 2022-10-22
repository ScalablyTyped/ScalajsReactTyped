package typingsJapgolly.reactNativeCommunityCliPlatformIos.anon

import typingsJapgolly.std.NumberConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Parse extends StObject {
  
  var default: String | Double
  
  var description: Unit
  
  var name: String
  
  /* standard es5 */
  def parse(): Double
  def parse(value: Any): Double
  @JSName("parse")
  var parse_Original: NumberConstructor
}
object Parse {
  
  inline def apply(default: String | Double, description: Unit, name: String, parse: NumberConstructor): Parse = {
    val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], parse = parse.asInstanceOf[js.Any])
    __obj.asInstanceOf[Parse]
  }
  
  extension [Self <: Parse](x: Self) {
    
    inline def setDefault(value: String | Double): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Unit): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setParse(value: NumberConstructor): Self = StObject.set(x, "parse", value.asInstanceOf[js.Any])
  }
}
