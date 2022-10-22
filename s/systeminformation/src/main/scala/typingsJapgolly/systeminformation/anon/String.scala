package typingsJapgolly.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait String extends StObject {
  
  var string: java.lang.String
  
  var value: Double
}
object String {
  
  inline def apply(string: java.lang.String, value: Double): String = {
    val __obj = js.Dynamic.literal(string = string.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  extension [Self <: String](x: Self) {
    
    inline def setString(value: java.lang.String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
