package typingsJapgolly.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsSystem extends StObject {
  
  var isSystem: js.UndefOr[Boolean] = js.undefined
}
object IsSystem {
  
  inline def apply(): IsSystem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IsSystem]
  }
  
  extension [Self <: IsSystem](x: Self) {
    
    inline def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
    
    inline def setIsSystemUndefined: Self = StObject.set(x, "isSystem", js.undefined)
  }
}
