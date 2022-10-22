package typingsJapgolly.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** IDBIndex interface of the IndexedDB API provides asynchronous access to an index in a database. An index is a kind of object store for looking up records in another object store, called the referenced object store. You use this interface to retrieve data. */
@js.native
trait IDBIndex extends StObject {
  
  /**
    * Retrieves the number of records matching the given key or key range in query.
    *
    * If successful, request's result will be the count.
    */
  /* standard dom */
  def count(): org.scalajs.dom.IDBRequest[Any, Double] = js.native
  def count(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, Double] = js.native
  def count(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, Double] = js.native
  
  def get(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, Any] = js.native
  /**
    * Retrieves the value of the first record matching the given key or key range in query.
    *
    * If successful, request's result will be the value, or undefined if there was no matching record.
    */
  /* standard dom */
  def get(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, Any] = js.native
  
  /**
    * Retrieves the values of the records matching the given key or key range in query (up to count if given).
    *
    * If successful, request's result will be an Array of the values.
    */
  /* standard dom */
  def getAll(): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: org.scalajs.dom.IDBKeyRange, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: Null, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: Unit, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  def getAll(query: IDBValidKey, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[Any]] = js.native
  
  /**
    * Retrieves the keys of records matching the given key or key range in query (up to count if given).
    *
    * If successful, request's result will be an Array of the keys.
    */
  /* standard dom */
  def getAllKeys(): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: org.scalajs.dom.IDBKeyRange, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: Null, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: Unit, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  def getAllKeys(query: IDBValidKey, count: Double): org.scalajs.dom.IDBRequest[Any, js.Array[IDBValidKey]] = js.native
  
  def getKey(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, js.UndefOr[IDBValidKey]] = js.native
  /**
    * Retrieves the key of the first record matching the given key or key range in query.
    *
    * If successful, request's result will be the key, or undefined if there was no matching record.
    */
  /* standard dom */
  def getKey(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, js.UndefOr[IDBValidKey]] = js.native
  
  /* standard dom */
  val keyPath: java.lang.String | js.Array[java.lang.String] = js.native
  
  /* standard dom */
  val multiEntry: scala.Boolean = js.native
  
  /** Returns the name of the index. */
  /* standard dom */
  var name: java.lang.String = js.native
  
  /** Returns the IDBObjectStore the index belongs to. */
  /* standard dom */
  val objectStore: org.scalajs.dom.IDBObjectStore = js.native
  
  /**
    * Opens a cursor over the records matching query, ordered by direction. If query is null, all records in index are matched.
    *
    * If successful, request's result will be an IDBCursorWithValue, or null if there were no matching records.
    */
  /* standard dom */
  def openCursor(): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: org.scalajs.dom.IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: Unit, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  def openCursor(query: IDBValidKey, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursorWithValue[Any] | Null] = js.native
  
  /**
    * Opens a cursor with key only flag set over the records matching query, ordered by direction. If query is null, all records in index are matched.
    *
    * If successful, request's result will be an IDBCursor, or null if there were no matching records.
    */
  /* standard dom */
  def openKeyCursor(): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: org.scalajs.dom.IDBKeyRange): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: org.scalajs.dom.IDBKeyRange, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: Null, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: Unit, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: IDBValidKey): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  def openKeyCursor(query: IDBValidKey, direction: IDBCursorDirection): org.scalajs.dom.IDBRequest[Any, org.scalajs.dom.IDBCursor[Any] | Null] = js.native
  
  /* standard dom */
  val unique: scala.Boolean = js.native
}
