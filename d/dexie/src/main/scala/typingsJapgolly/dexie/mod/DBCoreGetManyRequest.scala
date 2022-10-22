package typingsJapgolly.dexie.mod

import typingsJapgolly.dexie.dexieStrings.clone
import typingsJapgolly.dexie.dexieStrings.immutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreGetManyRequest extends StObject {
  
  var cache: js.UndefOr[immutable | clone] = js.undefined
  
  var keys: js.Array[Any]
  
  var trans: DBCoreTransaction
}
object DBCoreGetManyRequest {
  
  inline def apply(keys: js.Array[Any], trans: DBCoreTransaction): DBCoreGetManyRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreGetManyRequest]
  }
  
  extension [Self <: DBCoreGetManyRequest](x: Self) {
    
    inline def setCache(value: immutable | clone): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setKeys(value: js.Array[Any]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: Any*): Self = StObject.set(x, "keys", js.Array(value*))
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
  }
}
