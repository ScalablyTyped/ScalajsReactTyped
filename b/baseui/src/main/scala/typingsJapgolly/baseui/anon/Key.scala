package typingsJapgolly.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Key extends StObject {
  
  var expanded: js.Array[typingsJapgolly.react.mod.Key]
  
  var key: typingsJapgolly.react.mod.Key
}
object Key {
  
  inline def apply(expanded: js.Array[typingsJapgolly.react.mod.Key], key: typingsJapgolly.react.mod.Key): Key = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  
  extension [Self <: Key](x: Self) {
    
    inline def setExpanded(value: js.Array[typingsJapgolly.react.mod.Key]): Self = StObject.set(x, "expanded", value.asInstanceOf[js.Any])
    
    inline def setExpandedVarargs(value: typingsJapgolly.react.mod.Key*): Self = StObject.set(x, "expanded", js.Array(value*))
    
    inline def setKey(value: typingsJapgolly.react.mod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
