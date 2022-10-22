package typingsJapgolly.arangodb.anon

import typingsJapgolly.arangodb.ArangoDB.KeyGeneratorType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AllowUserKeys extends StObject {
  
  var allowUserKeys: js.UndefOr[Boolean] = js.undefined
  
  var increment: js.UndefOr[Double] = js.undefined
  
  var offset: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[KeyGeneratorType] = js.undefined
}
object AllowUserKeys {
  
  inline def apply(): AllowUserKeys = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AllowUserKeys]
  }
  
  extension [Self <: AllowUserKeys](x: Self) {
    
    inline def setAllowUserKeys(value: Boolean): Self = StObject.set(x, "allowUserKeys", value.asInstanceOf[js.Any])
    
    inline def setAllowUserKeysUndefined: Self = StObject.set(x, "allowUserKeys", js.undefined)
    
    inline def setIncrement(value: Double): Self = StObject.set(x, "increment", value.asInstanceOf[js.Any])
    
    inline def setIncrementUndefined: Self = StObject.set(x, "increment", js.undefined)
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
    
    inline def setType(value: KeyGeneratorType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
