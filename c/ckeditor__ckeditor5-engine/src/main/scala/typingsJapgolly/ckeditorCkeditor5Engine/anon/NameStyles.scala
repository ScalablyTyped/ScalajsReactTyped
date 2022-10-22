package typingsJapgolly.ckeditorCkeditor5Engine.anon

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NameStyles extends StObject {
  
  var name: String
  
  var styles: Record[String, String | js.RegExp]
}
object NameStyles {
  
  inline def apply(name: String, styles: Record[String, String | js.RegExp]): NameStyles = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[NameStyles]
  }
  
  extension [Self <: NameStyles](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: Record[String, String | js.RegExp]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
  }
}
