package typingsJapgolly.dexie.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.dexie.mod.DBCoreAddRequest
  - typingsJapgolly.dexie.mod.DBCorePutRequest
  - typingsJapgolly.dexie.mod.DBCoreDeleteRequest
  - typingsJapgolly.dexie.mod.DBCoreDeleteRangeRequest
*/
trait DBCoreMutateRequest extends StObject
object DBCoreMutateRequest {
  
  inline def DBCoreAddRequest(trans: DBCoreTransaction, values: js.Array[Any]): typingsJapgolly.dexie.mod.DBCoreAddRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("add")
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.DBCoreAddRequest]
  }
  
  inline def DBCoreDeleteRangeRequest(range: DBCoreKeyRange, trans: DBCoreTransaction): typingsJapgolly.dexie.mod.DBCoreDeleteRangeRequest = {
    val __obj = js.Dynamic.literal(range = range.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("deleteRange")
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.DBCoreDeleteRangeRequest]
  }
  
  inline def DBCoreDeleteRequest(keys: js.Array[Any], trans: DBCoreTransaction): typingsJapgolly.dexie.mod.DBCoreDeleteRequest = {
    val __obj = js.Dynamic.literal(keys = keys.asInstanceOf[js.Any], trans = trans.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("delete")
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.DBCoreDeleteRequest]
  }
  
  inline def DBCorePutRequest(trans: DBCoreTransaction, values: js.Array[Any]): typingsJapgolly.dexie.mod.DBCorePutRequest = {
    val __obj = js.Dynamic.literal(trans = trans.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("put")
    __obj.asInstanceOf[typingsJapgolly.dexie.mod.DBCorePutRequest]
  }
}
