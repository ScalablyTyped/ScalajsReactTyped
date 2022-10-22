package typingsJapgolly.reactNativeNavigation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Store extends StObject {
  
  var store: typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store
}
object Store {
  
  inline def apply(store: typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store): Store = {
    val __obj = js.Dynamic.literal(store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[Store]
  }
  
  extension [Self <: Store](x: Self) {
    
    inline def setStore(value: typingsJapgolly.reactNativeNavigation.libDistSrcComponentsStoreMod.Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
