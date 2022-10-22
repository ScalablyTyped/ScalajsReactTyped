package typingsJapgolly.atlassianConnectJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FullName extends StObject {
  
  var fullName: String
  
  var id: String
  
  var key: String
}
object FullName {
  
  inline def apply(fullName: String, id: String, key: String): FullName = {
    val __obj = js.Dynamic.literal(fullName = fullName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[FullName]
  }
  
  extension [Self <: FullName](x: Self) {
    
    inline def setFullName(value: String): Self = StObject.set(x, "fullName", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
