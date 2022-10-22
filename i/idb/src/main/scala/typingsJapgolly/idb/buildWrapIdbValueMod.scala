package typingsJapgolly.idb

import org.scalajs.dom.IDBCursor
import org.scalajs.dom.IDBCursorWithValue
import org.scalajs.dom.IDBDatabase
import org.scalajs.dom.IDBIndex
import org.scalajs.dom.IDBObjectStore
import org.scalajs.dom.IDBOpenDBRequest
import org.scalajs.dom.IDBRequest
import org.scalajs.dom.IDBTransaction
import typingsJapgolly.idb.buildEntryMod.IDBPCursor
import typingsJapgolly.idb.buildEntryMod.IDBPCursorWithValue
import typingsJapgolly.idb.buildEntryMod.IDBPDatabase
import typingsJapgolly.idb.buildEntryMod.IDBPIndex
import typingsJapgolly.idb.buildEntryMod.IDBPObjectStore
import typingsJapgolly.idb.buildEntryMod.IDBPTransaction
import typingsJapgolly.idb.buildEntryMod.IndexNames
import typingsJapgolly.idb.buildEntryMod.StoreNames
import typingsJapgolly.idb.idbStrings.readonly
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.ProxyHandler
import typingsJapgolly.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildWrapIdbValueMod {
  
  @JSImport("idb/build/wrap-idb-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def replaceTraps(callback: js.Function1[/* currentTraps */ ProxyHandler[Any], ProxyHandler[Any]]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceTraps")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("idb/build/wrap-idb-value", "reverseTransformCache")
  @js.native
  val reverseTransformCache: WeakMap[js.Object, Any] = js.native
  
  @JSImport("idb/build/wrap-idb-value", "unwrap")
  @js.native
  val unwrap: Unwrap_ = js.native
  
  inline def wrap(value: IDBDatabase): IDBPDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPDatabase[Any]]
  inline def wrap(value: IDBIndex): IDBPIndex[
    Any, 
    ArrayLike[StoreNames[Any]], 
    StoreNames[Any], 
    IndexNames[Any, StoreNames[Any]], 
    readonly
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPIndex[
    Any, 
    ArrayLike[StoreNames[Any]], 
    StoreNames[Any], 
    IndexNames[Any, StoreNames[Any]], 
    readonly
  ]]
  inline def wrap(value: IDBObjectStore): IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly]]
  inline def wrap(value: IDBOpenDBRequest[Any]): js.Promise[js.UndefOr[IDBPDatabase[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IDBPDatabase[Any]]]]
  inline def wrap(value: IDBTransaction): IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly]]
  inline def wrap[T](value: IDBRequest[Any, T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  
  /**
    * Revert an enhanced IDB object to a plain old miserable IDB one.
    *
    * Will also revert a promise back to an IDBRequest.
    *
    * @param value The enhanced object to revert.
    */
  @js.native
  trait Unwrap_ extends StObject {
    
    def apply(value: js.Promise[IDBPDatabase[Any]]): IDBOpenDBRequest[Any] = js.native
    def apply(value: IDBPCursor[Any, Any, Any, Any, Any]): IDBCursor[Any] = js.native
    def apply(value: IDBPCursorWithValue[Any, Any, Any, Any, Any]): IDBCursorWithValue[Any] = js.native
    def apply(value: IDBPDatabase[Any]): IDBDatabase = js.native
    def apply(value: IDBPIndex[Any, Any, Any, Any, Any]): IDBIndex = js.native
    def apply(value: IDBPObjectStore[Any, Any, Any, Any]): IDBObjectStore = js.native
    def apply(value: IDBPTransaction[Any, Any, Any]): IDBTransaction = js.native
  }
}
