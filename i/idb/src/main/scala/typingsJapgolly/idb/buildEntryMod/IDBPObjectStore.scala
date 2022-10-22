package typingsJapgolly.idb.buildEntryMod

import org.scalajs.dom.IDBKeyRange
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.AsyncIterableIterator
import typingsJapgolly.std.IDBCursorDirection
import typingsJapgolly.std.IDBTransactionMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDBPObjectStore[DBTypes /* <: DBSchema | Any */, TxStores /* <: ArrayLike[StoreNames[DBTypes]] */, StoreName /* <: StoreNames[DBTypes] */, Mode /* <: IDBTransactionMode */]
  extends StObject
     with IDBPObjectStoreExtends {
  
  /**
    * Add a value to the store.
    *
    * Rejects if an item of a given key already exists in the store.
    */
  var add: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>, key : idb.idb/build/entry.StoreKey<DBTypes, StoreName> | std.IDBKeyRange | undefined): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any = js.native
  
  /**
    * Deletes all records in store.
    */
  var clear: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (): std.Promise<void> */ js.Any = js.native
  
  /**
    * Retrieves the number of records matching the given query.
    */
  def count(): js.Promise[Double] = js.native
  def count(key: IDBKeyRange): js.Promise[Double] = js.native
  def count(key: StoreKey[DBTypes, StoreName]): js.Promise[Double] = js.native
  
  /**
    * Creates a new index in store.
    *
    * Throws an "InvalidStateError" DOMException if not called within an upgrade transaction.
    */
  var createIndex: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'versionchange' ? <IndexName extends idb.idb/build/entry.IndexNames<DBTypes, StoreName>>(name : IndexName, keyPath : string | std.Array<string>, options : std.IDBIndexParameters | undefined): idb.idb/build/entry.IDBPIndex<DBTypes, TxStores, StoreName, IndexName, Mode> : undefined */ js.Any = js.native
  
  /**
    * Deletes records in store matching the given query.
    */
  var delete: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (key : idb.idb/build/entry.StoreKey<DBTypes, StoreName> | std.IDBKeyRange): std.Promise<void> */ js.Any = js.native
  
  def get(query: IDBKeyRange): js.Promise[js.UndefOr[StoreValue[DBTypes, StoreName]]] = js.native
  /**
    * Retrieves the value of the first record matching the query.
    *
    * Resolves with undefined if no match is found.
    */
  def get(query: StoreKey[DBTypes, StoreName]): js.Promise[js.UndefOr[StoreValue[DBTypes, StoreName]]] = js.native
  
  /**
    * Retrieves all values that match the query.
    *
    * @param query
    * @param count Maximum number of values to return.
    */
  def getAll(): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IDBKeyRange): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: Null, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: Unit, count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: StoreKey[DBTypes, StoreName]): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  def getAll(query: StoreKey[DBTypes, StoreName], count: Double): js.Promise[js.Array[StoreValue[DBTypes, StoreName]]] = js.native
  
  /**
    * Retrieves the keys of records matching the query.
    *
    * @param query
    * @param count Maximum number of keys to return.
    */
  def getAllKeys(): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IDBKeyRange): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: IDBKeyRange, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: Null, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: Unit, count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: StoreKey[DBTypes, StoreName]): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  def getAllKeys(query: StoreKey[DBTypes, StoreName], count: Double): js.Promise[js.Array[StoreKey[DBTypes, StoreName]]] = js.native
  
  def getKey(query: IDBKeyRange): js.Promise[js.UndefOr[StoreKey[DBTypes, StoreName]]] = js.native
  /**
    * Retrieves the key of the first record that matches the query.
    *
    * Resolves with undefined if no match is found.
    */
  def getKey(query: StoreKey[DBTypes, StoreName]): js.Promise[js.UndefOr[StoreKey[DBTypes, StoreName]]] = js.native
  
  /**
    * Get a query of a given name.
    */
  def index[IndexName /* <: IndexNames[DBTypes, StoreName] */](name: IndexName): IDBPIndex[DBTypes, TxStores, StoreName, IndexName, Mode] = js.native
  
  /**
    * The names of indexes in the store.
    */
  val indexNames: TypedDOMStringList[IndexNames[DBTypes, StoreName]] = js.native
  
  /**
    * Iterate over the records matching the query.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def iterate(): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: IDBKeyRange): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: IDBKeyRange, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: Null, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: Unit, direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: StoreKey[DBTypes, StoreName]): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  def iterate(query: StoreKey[DBTypes, StoreName], direction: IDBCursorDirection): AsyncIterableIterator[IDBPCursorWithValueIteratorValue[DBTypes, TxStores, StoreName, Any, Mode]] = js.native
  
  /**
    * Opens a cursor over the records matching the query.
    *
    * Resolves with null if no matches are found.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def openCursor(): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: IDBKeyRange): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: IDBKeyRange, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: Null, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: Unit, direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: StoreKey[DBTypes, StoreName]): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openCursor(query: StoreKey[DBTypes, StoreName], direction: IDBCursorDirection): js.Promise[(IDBPCursorWithValue[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  
  /**
    * Opens a cursor over the keys matching the query.
    *
    * Resolves with null if no matches are found.
    *
    * @param query If null, all records match.
    * @param direction
    */
  def openKeyCursor(): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: IDBKeyRange): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: IDBKeyRange, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: Null, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: Unit, direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: StoreKey[DBTypes, StoreName]): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  def openKeyCursor(query: StoreKey[DBTypes, StoreName], direction: IDBCursorDirection): js.Promise[(IDBPCursor[DBTypes, TxStores, StoreName, Any, Mode]) | Null] = js.native
  
  /**
    * Put an item in the store.
    *
    * Replaces any item with the same key.
    */
  var put: /* import warning: importer.ImportType#apply Failed type conversion: Mode extends 'readonly' ? undefined : (value : idb.idb/build/entry.StoreValue<DBTypes, StoreName>, key : idb.idb/build/entry.StoreKey<DBTypes, StoreName> | std.IDBKeyRange | undefined): std.Promise<idb.idb/build/entry.StoreKey<DBTypes, StoreName>> */ js.Any = js.native
  
  /**
    * The associated transaction.
    */
  val transaction: IDBPTransaction[DBTypes, TxStores, Mode] = js.native
}
