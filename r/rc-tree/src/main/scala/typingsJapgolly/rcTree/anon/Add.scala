package typingsJapgolly.rcTree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add extends StObject {
  
  var add: Boolean
  
  var key: typingsJapgolly.rcTree.esInterfaceMod.Key
}
object Add {
  
  inline def apply(add: Boolean, key: typingsJapgolly.rcTree.esInterfaceMod.Key): Add = {
    val __obj = js.Dynamic.literal(add = add.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[Add]
  }
  
  extension [Self <: Add](x: Self) {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setKey(value: typingsJapgolly.rcTree.esInterfaceMod.Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
  }
}
