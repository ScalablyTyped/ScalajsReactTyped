package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.ckeditorCkeditor5Engine.srcViewStylesmapMod.BoxSides
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PathValue extends StObject {
  
  var path: String
  
  var value: String | (Record[String, (Record[String, String]) | String]) | BoxSides
}
object PathValue {
  
  inline def apply(path: String, value: String | (Record[String, (Record[String, String]) | String]) | BoxSides): PathValue = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[PathValue]
  }
  
  extension [Self <: PathValue](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | (Record[String, (Record[String, String]) | String]) | BoxSides): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
