package typingsJapgolly.knockback.Knockback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoreOptions extends StObject {
  
  var creator: Any
  
  var factory: Factory
  
  var path: String
  
  var store: Store
}
object StoreOptions {
  
  inline def apply(creator: Any, factory: Factory, path: String, store: Store): StoreOptions = {
    val __obj = js.Dynamic.literal(creator = creator.asInstanceOf[js.Any], factory = factory.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], store = store.asInstanceOf[js.Any])
    __obj.asInstanceOf[StoreOptions]
  }
  
  extension [Self <: StoreOptions](x: Self) {
    
    inline def setCreator(value: Any): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setFactory(value: Factory): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setStore(value: Store): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
  }
}
