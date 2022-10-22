package typingsJapgolly.yaml.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key[K, V] extends StObject {
  
  var key: K
  
  var value: V
}
object Key {
  
  inline def apply[K, V](key: K, value: V): Key[K, V] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key[K, V]]
  }
  
  extension [Self <: Key[?, ?], K, V](x: Self & (Key[K, V])) {
    
    inline def setKey(value: K): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: V): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
