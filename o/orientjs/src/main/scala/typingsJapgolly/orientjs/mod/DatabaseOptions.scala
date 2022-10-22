package typingsJapgolly.orientjs.mod

import typingsJapgolly.orientjs.orientjsStrings.document
import typingsJapgolly.orientjs.orientjsStrings.graph
import typingsJapgolly.orientjs.orientjsStrings.memory
import typingsJapgolly.orientjs.orientjsStrings.plocal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DatabaseOptions extends StObject {
  
  var name: String
  
  var password: js.UndefOr[String] = js.undefined
  
  var storage: js.UndefOr[plocal | memory] = js.undefined
  
  var `type`: js.UndefOr[graph | document] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object DatabaseOptions {
  
  inline def apply(name: String): DatabaseOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DatabaseOptions]
  }
  
  extension [Self <: DatabaseOptions](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setStorage(value: plocal | memory): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
    
    inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    
    inline def setType(value: graph | document): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
