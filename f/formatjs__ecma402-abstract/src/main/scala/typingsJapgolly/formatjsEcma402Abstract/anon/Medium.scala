package typingsJapgolly.formatjsEcma402Abstract.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Medium extends StObject {
  
  var full: String
  
  var long: String
  
  var medium: String
  
  var short: String
}
object Medium {
  
  inline def apply(full: String, long: String, medium: String, short: String): Medium = {
    val __obj = js.Dynamic.literal(full = full.asInstanceOf[js.Any], long = long.asInstanceOf[js.Any], medium = medium.asInstanceOf[js.Any], short = short.asInstanceOf[js.Any])
    __obj.asInstanceOf[Medium]
  }
  
  extension [Self <: Medium](x: Self) {
    
    inline def setFull(value: String): Self = StObject.set(x, "full", value.asInstanceOf[js.Any])
    
    inline def setLong(value: String): Self = StObject.set(x, "long", value.asInstanceOf[js.Any])
    
    inline def setMedium(value: String): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
    
    inline def setShort(value: String): Self = StObject.set(x, "short", value.asInstanceOf[js.Any])
  }
}
