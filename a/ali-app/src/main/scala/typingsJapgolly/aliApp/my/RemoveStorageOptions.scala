package typingsJapgolly.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveStorageOptions
  extends StObject
     with BaseOptions[Any, Any] {
  
  var key: String
}
object RemoveStorageOptions {
  
  inline def apply(key: String): RemoveStorageOptions = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveStorageOptions]
  }
  
  extension [Self <: RemoveStorageOptions](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
