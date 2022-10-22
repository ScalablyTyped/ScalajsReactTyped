package typingsJapgolly.idb.buildEntryMod

import org.scalajs.dom.IDBRequest
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.IDBCursorDirection
import typingsJapgolly.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined idb.idb/build/entry.Omit<idb.idb/build/entry.IDBPCursorWithValue<DBTypes, TxStores, StoreName, IndexName, Mode>, 'advance' | 'continue' | 'continuePrimaryKey'> */
trait IDBPCursorWithValueIteratorValueExtends[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */] extends StObject {
  
  var delete: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (): std.Promise<void> */ js.Any
  
  var direction: IDBCursorDirection
  
  var key: CursorKey[DBTypes, StoreName, IndexName]
  
  var primaryKey: StoreKey[DBTypes, StoreName]
  
  var request: IDBRequest[Any, Any]
  
  var source: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode]
  
  var update: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any
  
  var value: StoreValue[DBTypes, StoreName]
}
object IDBPCursorWithValueIteratorValueExtends {
  
  inline def apply[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */](
    delete: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (): std.Promise<void> */ js.Any,
    direction: IDBCursorDirection,
    key: CursorKey[DBTypes, StoreName, IndexName],
    primaryKey: StoreKey[DBTypes, StoreName],
    request: IDBRequest[Any, Any],
    source: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode],
    update: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any,
    value: StoreValue[DBTypes, StoreName]
  ): IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode] = {
    val __obj = js.Dynamic.literal(delete = delete.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], primaryKey = primaryKey.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], update = update.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode]]
  }
  
  extension [Self <: IDBPCursorWithValueIteratorValueExtends[?, ?, ?, ?, ?], DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, IndexName /* <: (IndexNames[DBTypes, StoreName]) | Any */, Mode /* <: IDBTransactionMode */](x: Self & (IDBPCursorWithValueIteratorValueExtends[DBTypes, TxStores, StoreName, IndexName, Mode])) {
    
    inline def setDelete(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (): std.Promise<void> */ js.Any
    ): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDirection(value: IDBCursorDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setKey(value: CursorKey[DBTypes, StoreName, IndexName]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setPrimaryKey(value: StoreKey[DBTypes, StoreName]): Self = StObject.set(x, "primaryKey", value.asInstanceOf[js.Any])
    
    inline def setRequest(value: IDBRequest[Any, Any]): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    
    inline def setSource(value: CursorSource[DBTypes, TxStores, StoreName, IndexName, Mode]): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setUpdate(
      value: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any
    ): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StoreValue[DBTypes, StoreName]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
