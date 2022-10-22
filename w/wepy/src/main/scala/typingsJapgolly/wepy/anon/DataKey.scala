package typingsJapgolly.wepy.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataKey extends StObject {
  
  var data: String | js.Object
  
  var key: String
}
object DataKey {
  
  inline def apply(data: String | js.Object, key: String): DataKey = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataKey]
  }
  
  extension [Self <: DataKey](x: Self) {
    
    inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
