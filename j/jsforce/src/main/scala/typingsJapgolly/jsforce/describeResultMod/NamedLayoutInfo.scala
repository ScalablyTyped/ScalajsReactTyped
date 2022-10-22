package typingsJapgolly.jsforce.describeResultMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedLayoutInfo extends StObject {
  
  var name: String
  
  var urls: Record[String, String]
}
object NamedLayoutInfo {
  
  inline def apply(name: String, urls: Record[String, String]): NamedLayoutInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedLayoutInfo]
  }
  
  extension [Self <: NamedLayoutInfo](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUrls(value: Record[String, String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
  }
}
