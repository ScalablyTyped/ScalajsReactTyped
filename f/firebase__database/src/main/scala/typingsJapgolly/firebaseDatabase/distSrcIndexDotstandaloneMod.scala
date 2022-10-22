package typingsJapgolly.firebaseDatabase

import typingsJapgolly.firebaseApp.mod.FirebaseApp
import typingsJapgolly.firebaseAppCheckInteropTypes.mod.AppCheckInternalComponentName
import typingsJapgolly.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typingsJapgolly.firebaseComponent.mod.Provider
import typingsJapgolly.firebaseDatabase.anon.MockUserToken
import typingsJapgolly.firebaseDatabase.distSrcApiOnDisconnectMod.OnDisconnect
import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.DatabaseReference
import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.ListenOptions
import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.Query
import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.ThenableReference
import typingsJapgolly.firebaseDatabase.distSrcApiReferenceMod.Unsubscribe
import typingsJapgolly.firebaseDatabase.distSrcApiTransactionMod.TransactionOptions
import typingsJapgolly.firebaseDatabase.distSrcCoreRepoMod.Repo
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapIndexesIndexMod.Index
import typingsJapgolly.firebaseDatabase.distSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distSrcCoreUtilPathMod.Path
import typingsJapgolly.firebaseDatabase.distSrcCoreViewEventMod.EventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcIndexDotstandaloneMod {
  
  @JSImport("@firebase/database/dist/src/index.standalone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/src/index.standalone", "DataSnapshot")
  @js.native
  open class DataSnapshot protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.DataSnapshot {
    /**
      * @param _node - A SnapshotNode to wrap.
      * @param ref - The location this snapshot came from.
      * @param _index - The iteration order for this snapshot
      * @hideconstructor
      */
    def this(_node: Node, /**
      * The location of this DataSnapshot.
      */
    ref: DatabaseReference, _index: Index) = this()
  }
  
  @JSImport("@firebase/database/dist/src/index.standalone", "Database")
  @js.native
  open class Database protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.Database {
    /** @hideconstructor */
    def this(
      _repoInternal: Repo,
      /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
    app: FirebaseApp
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/src/index.standalone", "OnDisconnect")
  @js.native
  open class OnDisconnect_ protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.OnDisconnect_ {
    /** @hideconstructor */
    def this(_repo: Repo, _path: Path) = this()
  }
  
  /* note: abstract class */ @JSImport("@firebase/database/dist/src/index.standalone", "QueryConstraint")
  @js.native
  open class QueryConstraint ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.QueryConstraint
  
  @JSImport("@firebase/database/dist/src/index.standalone", "_QueryImpl")
  @js.native
  open class QueryImpl protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.QueryImpl {
    /**
      * @hideconstructor
      */
    def this(
      _repo: Repo,
      _path: Path,
      _queryParams: typingsJapgolly.firebaseDatabase.distSrcCoreViewQueryParamsMod.QueryParams,
      _orderByCalled: Boolean
    ) = this()
  }
  
  @JSImport("@firebase/database/dist/src/index.standalone", "_QueryParams")
  @js.native
  open class QueryParams ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.QueryParams
  
  @JSImport("@firebase/database/dist/src/index.standalone", "_ReferenceImpl")
  @js.native
  open class ReferenceImpl protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.ReferenceImpl {
    /** @hideconstructor */
    def this(repo: Repo, path: Path) = this()
  }
  
  inline def TESTACCESSForceRestClient(forceRestClient: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_forceRestClient")(forceRestClient.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def TESTACCESSHijackHash(newHash: js.Function0[String]): js.Function0[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("_TEST_ACCESS_hijackHash")(newHash.asInstanceOf[js.Any]).asInstanceOf[js.Function0[Unit]]
  
  @JSImport("@firebase/database/dist/src/index.standalone", "TransactionResult")
  @js.native
  open class TransactionResult protected ()
    extends typingsJapgolly.firebaseDatabase.distSrcApiDotstandaloneMod.TransactionResult {
    /** @hideconstructor */
    def this(
      /** Whether the transaction was successfully committed. */
    committed: Boolean,
      /** The resulting data snapshot. */
    snapshot: typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot
    ) = this()
  }
  
  inline def child(parent: DatabaseReference, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("child")(parent.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def connectDatabaseEmulator(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database, host: String, port: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def connectDatabaseEmulator(
    db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database,
    host: String,
    port: Double,
    options: MockUserToken
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("connectDatabaseEmulator")(db.asInstanceOf[js.Any], host.asInstanceOf[js.Any], port.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def enableLogging(enabled: Boolean): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def enableLogging(enabled: Boolean, persistent: Boolean): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(enabled.asInstanceOf[js.Any], persistent.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def enableLogging(logger: js.Function1[/* message */ String, Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("enableLogging")(logger.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def endAt(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: String, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def endBefore(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: String, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Double, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def endBefore(value: Null, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("endBefore")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def equalTo(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: String, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Double, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def equalTo(value: Null, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("equalTo")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def forceLongPolling(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceLongPolling")().asInstanceOf[Unit]
  
  inline def forceWebSockets(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("forceWebSockets")().asInstanceOf[Unit]
  
  inline def get(query: Query): js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot] = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot]]
  
  inline def goOffline(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOffline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def goOnline(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("goOnline")(db.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def increment(delta: Double): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(delta.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def limitToFirst(limit: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToFirst")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def limitToLast(limit: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("limitToLast")(limit.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def off(query: Query): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: Unit,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(query: Query, eventType: EventType): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def off(
    query: Query,
    eventType: EventType,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("off")(query.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ js.UndefOr[String | Null], 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildAdded(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildAdded")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildChanged(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildChanged")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildMoved(
    query: Query,
    callback: js.Function2[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      /* previousChildName */ String | Null, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildMoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onChildRemoved(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onChildRemoved")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def onDisconnect(ref: DatabaseReference): OnDisconnect = ^.asInstanceOf[js.Dynamic].applyDynamic("onDisconnect")(ref.asInstanceOf[js.Any]).asInstanceOf[OnDisconnect]
  
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any]
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    cancelCallback: js.Function1[/* error */ js.Error, Any],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], cancelCallback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  inline def onValue(
    query: Query,
    callback: js.Function1[
      /* snapshot */ typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.DataSnapshot, 
      Any
    ],
    options: ListenOptions
  ): Unsubscribe = (^.asInstanceOf[js.Dynamic].applyDynamic("onValue")(query.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Unsubscribe]
  
  inline def orderByChild(path: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByChild")(path.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByKey(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByKey")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByPriority(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByPriority")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def orderByValue(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("orderByValue")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def push(parent: DatabaseReference): ThenableReference = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any]).asInstanceOf[ThenableReference]
  inline def push(parent: DatabaseReference, value: Any): ThenableReference = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(parent.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[ThenableReference]
  
  inline def query(
    query: Query,
    queryConstraints: typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint*
  ): Query = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(scala.List(query.asInstanceOf[js.Any]).`++`(queryConstraints.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Query]
  
  inline def ref(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database): DatabaseReference = ^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any]).asInstanceOf[DatabaseReference]
  inline def ref(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database, path: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("ref")(db.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def refFromURL(db: typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database, url: String): DatabaseReference = (^.asInstanceOf[js.Dynamic].applyDynamic("refFromURL")(db.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[DatabaseReference]
  
  inline def remove(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def repoManagerDatabaseFromApp(app: FirebaseApp, authProvider: Provider[FirebaseAuthInternalName]): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: String,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Unit,
    url: Unit,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName]
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: String,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  inline def repoManagerDatabaseFromApp(
    app: FirebaseApp,
    authProvider: Provider[FirebaseAuthInternalName],
    appCheckProvider: Provider[AppCheckInternalComponentName],
    url: Unit,
    nodeAdmin: Boolean
  ): typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database = (^.asInstanceOf[js.Dynamic].applyDynamic("_repoManagerDatabaseFromApp")(app.asInstanceOf[js.Any], authProvider.asInstanceOf[js.Any], appCheckProvider.asInstanceOf[js.Any], url.asInstanceOf[js.Any], nodeAdmin.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiDatabaseMod.Database]
  
  inline def runTransaction(ref: DatabaseReference, transactionUpdate: js.Function1[/* currentData */ Any, Any]): js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiTransactionMod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiTransactionMod.TransactionResult]]
  inline def runTransaction(
    ref: DatabaseReference,
    transactionUpdate: js.Function1[/* currentData */ Any, Any],
    options: TransactionOptions
  ): js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiTransactionMod.TransactionResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(ref.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.firebaseDatabase.distSrcApiTransactionMod.TransactionResult]]
  
  inline def serverTimestamp(): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("serverTimestamp")().asInstanceOf[js.Object]
  
  inline def set(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setPriority(ref: DatabaseReference): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setPriority(ref: DatabaseReference, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setPriority")(ref.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def setSDKVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_setSDKVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def setWithPriority(ref: DatabaseReference, value: Any): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def setWithPriority(ref: DatabaseReference, value: Any, priority: Double): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("setWithPriority")(ref.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def startAfter(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: String, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Double, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAfter(value: Null, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAfter")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def startAt(): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")().asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: String, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Boolean, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Double): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = ^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Double, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Null, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  inline def startAt(value: Unit, key: String): typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint = (^.asInstanceOf[js.Dynamic].applyDynamic("startAt")(value.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.firebaseDatabase.distSrcApiReferenceImplMod.QueryConstraint]
  
  inline def update(ref: DatabaseReference, values: js.Object): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(ref.asInstanceOf[js.Any], values.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def validatePathString(fnName: String, argumentName: String, pathString: String, optional: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validatePathString")(fnName.asInstanceOf[js.Any], argumentName.asInstanceOf[js.Any], pathString.asInstanceOf[js.Any], optional.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def validateWritablePath(fnName: String, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("_validateWritablePath")(fnName.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
