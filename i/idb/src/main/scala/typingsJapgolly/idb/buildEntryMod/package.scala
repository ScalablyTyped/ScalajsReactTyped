package typingsJapgolly.idb.buildEntryMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.IDBDatabase
import org.scalajs.dom.IDBIndex
import org.scalajs.dom.IDBObjectStore
import org.scalajs.dom.IDBOpenDBRequest
import org.scalajs.dom.IDBRequest
import org.scalajs.dom.IDBTransaction
import typingsJapgolly.idb.buildEntryMod.^
import typingsJapgolly.idb.buildWrapIdbValueMod.Unwrap_
import typingsJapgolly.idb.idbStrings.readonly
import typingsJapgolly.std.ArrayLike
import typingsJapgolly.std.Exclude
import typingsJapgolly.std.IDBValidKey
import typingsJapgolly.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def deleteDB(name: String): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
inline def deleteDB(name: String, hasBlocked: DeleteDBCallbacks): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteDB")(name.asInstanceOf[js.Any], hasBlocked.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]

inline def openDB[DBTypes /* <: DBSchema | Any */](name: String): js.Promise[IDBPDatabase[DBTypes]] = ^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Double, hasBlockedUpgradeBlockingTerminated: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], hasBlockedUpgradeBlockingTerminated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]
inline def openDB[DBTypes /* <: DBSchema | Any */](name: String, version: Unit, hasBlockedUpgradeBlockingTerminated: OpenDBCallbacks[DBTypes]): js.Promise[IDBPDatabase[DBTypes]] = (^.asInstanceOf[js.Dynamic].applyDynamic("openDB")(name.asInstanceOf[js.Any], version.asInstanceOf[js.Any], hasBlockedUpgradeBlockingTerminated.asInstanceOf[js.Any])).asInstanceOf[js.Promise[IDBPDatabase[DBTypes]]]

inline def unwrap: Unwrap_ = ^.asInstanceOf[js.Dynamic].selectDynamic("unwrap").asInstanceOf[Unwrap_]

inline def wrap(value: IDBDatabase): IDBPDatabase[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPDatabase[Any]]
inline def wrap(value: IDBIndex): IDBPIndex[
Any, 
ArrayLike[StoreNames[Any]], 
StoreNames[Any], 
IndexNames[Any, StoreNames[Any]], 
readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPIndex[
Any, 
ArrayLike[StoreNames[Any]], 
StoreNames[Any], 
IndexNames[Any, StoreNames[Any]], 
readonly]]
inline def wrap(value: IDBObjectStore): IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPObjectStore[Any, ArrayLike[StoreNames[Any]], StoreNames[Any], readonly]]
inline def wrap(value: IDBOpenDBRequest[Any]): js.Promise[js.UndefOr[IDBPDatabase[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[IDBPDatabase[Any]]]]
inline def wrap(value: IDBTransaction): IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[IDBPTransaction[Any, ArrayLike[StoreNames[Any]], readonly]]
inline def wrap[T](value: IDBRequest[Any, T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]

type DBSchema = StringDictionary[DBSchemaValue]

type IndexKeys = StringDictionary[IDBValidKey]

type KnownKeys[T] = ValuesOf[KeyToKeyNoIndex[T]]

type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
