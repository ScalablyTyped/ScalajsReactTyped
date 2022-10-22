package typingsJapgolly.firebase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseDatabase.anon.MockUserToken
import typingsJapgolly.firebaseDatabase.mod.DatabaseReference
import typingsJapgolly.firebaseDatabase.mod.EventType
import typingsJapgolly.firebaseDatabase.mod.ListenOptions
import typingsJapgolly.firebaseDatabase.mod.Query_
import typingsJapgolly.firebaseDatabase.mod.ThenableReference
import typingsJapgolly.firebaseDatabase.mod.TransactionOptions
import typingsJapgolly.firebaseDatabase.mod.Unsubscribe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compatAuthDistDatabaseMod {
  
  @JSImport("firebase/compat/auth/dist/database", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("firebase/compat/auth/dist/database", "DataSnapshot")
  @js.native
  /* private */ open class DataSnapshot ()
    extends typingsJapgolly.firebaseDatabase.mod.DataSnapshot
  
  @JSImport("firebase/compat/auth/dist/database", "Database")
  @js.native
  /* private */ open class Database ()
    extends typingsJapgolly.firebaseDatabase.mod.Database
  
  @JSImport("firebase/compat/auth/dist/database", "OnDisconnect")
  @js.native
  /* private */ open class OnDisconnect_ ()
    extends typingsJapgolly.firebaseDatabase.mod.OnDisconnect_
  
  /* note: abstract class */ @JSImport("firebase/compat/auth/dist/database", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseDatabase.mod.QueryConstraint
  
  @JSImport("firebase/compat/auth/dist/database", "TransactionResult")
  @js.native
  /* private */ open class TransactionResult ()
    extends typingsJapgolly.firebaseDatabase.mod.TransactionResult
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(db: typingsJapgolly.firebaseDatabase.mod.Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(
    db: typingsJapgolly.firebaseDatabase.mod.Database,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: String, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Boolean): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def endBefore(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: String, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Boolean): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Double, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def endBefore(value: Null, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def equalTo(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: String, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Boolean): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Double, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def equalTo(value: Null, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query_): js.Promise[typingsJapgolly.firebaseDatabase.mod.DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.mod.DataSnapshot]]
  
  inline def getDatabase(): typingsJapgolly.firebaseDatabase.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.Database]
  inline def getDatabase(app: Unit, url: String): typingsJapgolly.firebaseDatabase.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.Database]
  inline def getDatabase(app: FirebaseApp): typingsJapgolly.firebaseDatabase.mod.Database = ^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.Database]
  inline def getDatabase(app: FirebaseApp, url: String): typingsJapgolly.firebaseDatabase.mod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("getDatabase")(app.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.Database]
  
  inline def goOffline(db: typingsJapgolly.firebaseDatabase.mod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: typingsJapgolly.firebaseDatabase.mod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def off(query: Query_): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: Unit,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query_, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query_,
    eventType: EventType,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query_,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): typingsJapgolly.firebaseDatabase.mod.OnDisconnect_ = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.OnDisconnect_]
  
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query_,
    callback: js.Function1[/* snapshot */ typingsJapgolly.firebaseDatabase.mod.DataSnapshot, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByKey(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByPriority(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def orderByValue(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(query: Query_, queryConstraints: typingsJapgolly.firebaseDatabase.mod.QueryConstraint*): Query_ = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query_]
  
  inline def ref(db: typingsJapgolly.firebaseDatabase.mod.Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: typingsJapgolly.firebaseDatabase.mod.Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: typingsJapgolly.firebaseDatabase.mod.Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[typingsJapgolly.firebaseDatabase.mod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.mod.TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[typingsJapgolly.firebaseDatabase.mod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.mod.TransactionResult]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: String, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Boolean): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Double, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAfter(value: Null, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def startAt(): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: String, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Boolean): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Double): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  inline def startAt(value: Unit, key: String): typingsJapgolly.firebaseDatabase.mod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.mod.QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
