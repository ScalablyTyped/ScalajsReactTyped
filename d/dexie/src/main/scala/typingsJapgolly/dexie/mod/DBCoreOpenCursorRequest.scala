package typingsJapgolly.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DBCoreOpenCursorRequest extends StObject {
  
  var query: DBCoreQuery
  
  var reverse: js.UndefOr[Boolean] = js.undefined
  
  var trans: DBCoreTransaction
  
  var unique: js.UndefOr[Boolean] = js.undefined
  
  var values: js.UndefOr[Boolean] = js.undefined
}
object DBCoreOpenCursorRequest {
  
  inline def apply(query: DBCoreQuery, trans: DBCoreTransaction): DBCoreOpenCursorRequest = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBCoreOpenCursorRequest]
  }
  
  extension [Self <: DBCoreOpenCursorRequest](x: Self) {
    
    inline def setQuery(value: DBCoreQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setReverse(value: Boolean): Self = StObject.set(x, "reverse", value.asInstanceOf[js.Any])
    
    inline def setReverseUndefined: Self = StObject.set(x, "reverse", js.undefined)
    
    inline def setTrans(value: DBCoreTransaction): Self = StObject.set(x, "trans", value.asInstanceOf[js.Any])
    
    inline def setUnique(value: Boolean): Self = StObject.set(x, "unique", value.asInstanceOf[js.Any])
    
    inline def setUniqueUndefined: Self = StObject.set(x, "unique", js.undefined)
    
    inline def setValues(value: Boolean): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
  }
}
