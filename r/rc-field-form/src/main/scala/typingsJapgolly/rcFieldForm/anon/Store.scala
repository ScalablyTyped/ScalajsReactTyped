package typingsJapgolly.rcFieldForm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  var store: typingsJapgolly.rcFieldForm.esInterfaceMod.Store
}
object Store {
  
  inline def apply(store: typingsJapgolly.rcFieldForm.esInterfaceMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setStore(value: typingsJapgolly.rcFieldForm.esInterfaceMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
