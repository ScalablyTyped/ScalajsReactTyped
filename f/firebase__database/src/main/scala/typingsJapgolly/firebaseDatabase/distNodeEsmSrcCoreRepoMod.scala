package typingsJapgolly.firebaseDatabase

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcApiReferenceImplMod.ValueEventRegistration
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreAppCheckTokenProviderMod.AppCheckTokenProvider
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreAuthTokenProviderMod.AuthTokenProvider
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCorePersistentConnectionMod.PersistentConnection
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreRepoInfoMod.RepoInfo
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreServerActionsMod.ServerActions
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapNodeMod.Node
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSnapshotHolderMod.SnapshotHolder
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSparseSnapshotTreeMod.SparseSnapshotTree
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreStatsStatsCollectionMod.StatsCollection
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreStatsStatsListenerMod.StatsListener
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreStatsStatsReporterMod.StatsReporter
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreSyncTreeMod.SyncTree
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilMiscMod.Indexable
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilPathMod.Path
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreUtilTreeMod.Tree
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventQueueMod.EventQueue
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.EventRegistration
import typingsJapgolly.firebaseDatabase.distNodeEsmSrcCoreViewEventRegistrationMod.QueryContext
import typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`0`
import typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`1`
import typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`2`
import typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`3`
import typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`4`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distNodeEsmSrcCoreRepoMod {
  
  @JSImport("@firebase/database/dist/node-esm/src/core/Repo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/database/dist/node-esm/src/core/Repo", "Repo")
  @js.native
  open class Repo protected () extends StObject {
    def this(
      repoInfo_ : RepoInfo,
      forceRestClient_ : Boolean,
      authTokenProvider_ : AuthTokenProvider,
      appCheckProvider_ : AppCheckTokenProvider
    ) = this()
    
    var appCheckProvider_ : AppCheckTokenProvider = js.native
    
    var authTokenProvider_ : AuthTokenProvider = js.native
    
    var dataUpdateCount: Double = js.native
    
    var eventQueue_ : EventQueue = js.native
    
    var forceRestClient_ : Boolean = js.native
    
    var infoData_ : SnapshotHolder = js.native
    
    var infoSyncTree_ : SyncTree = js.native
    
    var interceptServerDataCallback_ : (js.Function2[/* a */ String, /* b */ Any, Unit]) | Null = js.native
    
    /** Key for uniquely identifying this repo, used in RepoManager */
    val key: String = js.native
    
    var nextWriteId_ : Double = js.native
    
    /** A list of data pieces and paths to be set when this client disconnects. */
    var onDisconnect_ : SparseSnapshotTree = js.native
    
    var persistentConnection_ : PersistentConnection | Null = js.native
    
    var repoInfo_ : RepoInfo = js.native
    
    var serverSyncTree_ : SyncTree = js.native
    
    var server_ : ServerActions = js.native
    
    var statsListener_ : StatsListener | Null = js.native
    
    var statsReporter_ : StatsReporter = js.native
    
    var stats_ : StatsCollection = js.native
    
    /** Stores queues of outstanding transactions for Firebase locations. */
    var transactionQueueTree_ : Tree[js.Array[Transaction]] = js.native
  }
  
  inline def repoAddEventCallbackForQuery(repo: Repo, query: QueryContext, eventRegistration: EventRegistration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoAddEventCallbackForQuery")(repo.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoCallOnCompleteCallback(repo: Repo, callback: js.Function2[js.Error | Null, js.UndefOr[String], Unit], status: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoCallOnCompleteCallback")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoCallOnCompleteCallback(
    repo: Repo,
    callback: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit],
    status: String,
    errorReason: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoCallOnCompleteCallback")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], status.asInstanceOf[js.Any], errorReason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoCallOnCompleteCallback(repo: Repo, callback: Null, status: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoCallOnCompleteCallback")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoCallOnCompleteCallback(repo: Repo, callback: Null, status: String, errorReason: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoCallOnCompleteCallback")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], status.asInstanceOf[js.Any], errorReason.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoGenerateServerValues(repo: Repo): Indexable = ^.asInstanceOf[js.Dynamic].applyDynamic("repoGenerateServerValues")(repo.asInstanceOf[js.Any]).asInstanceOf[Indexable]
  
  inline def repoGetValue(repo: Repo, query: QueryContext, eventRegistration: ValueEventRegistration): js.Promise[Node] = (^.asInstanceOf[js.Dynamic].applyDynamic("repoGetValue")(repo.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Node]]
  
  inline def repoInterceptServerData(repo: Repo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repoInterceptServerData")(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def repoInterceptServerData(repo: Repo, callback: js.Function2[/* a */ String, /* b */ Any, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoInterceptServerData")(repo.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoInterrupt(repo: Repo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repoInterrupt")(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def repoOnDisconnectCancel(repo: Repo, path: Path): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectCancel")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoOnDisconnectCancel(
    repo: Repo,
    path: Path,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectCancel")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoOnDisconnectSet(repo: Repo, path: Path, value: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectSet")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoOnDisconnectSet(
    repo: Repo,
    path: Path,
    value: Any,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectSet")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoOnDisconnectSetWithPriority(repo: Repo, path: Path, value: Any, priority: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoOnDisconnectSetWithPriority(
    repo: Repo,
    path: Path,
    value: Any,
    priority: Any,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], priority.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoOnDisconnectUpdate(repo: Repo, path: Path, childrenToMerge: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectUpdate")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], childrenToMerge.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoOnDisconnectUpdate(
    repo: Repo,
    path: Path,
    childrenToMerge: StringDictionary[Any],
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoOnDisconnectUpdate")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], childrenToMerge.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoRemoveEventCallbackForQuery(repo: Repo, query: QueryContext, eventRegistration: EventRegistration): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoRemoveEventCallbackForQuery")(repo.asInstanceOf[js.Any], query.asInstanceOf[js.Any], eventRegistration.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoResume(repo: Repo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repoResume")(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def repoServerTime(repo: Repo): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("repoServerTime")(repo.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def repoSetWithPriority(repo: Repo, path: Path, newVal: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoSetWithPriority(repo: Repo, path: Path, newVal: Any, newPriority: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], newPriority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoSetWithPriority(
    repo: Repo,
    path: Path,
    newVal: Any,
    newPriority: String,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], newPriority.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoSetWithPriority(repo: Repo, path: Path, newVal: Any, newPriority: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], newPriority.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoSetWithPriority(
    repo: Repo,
    path: Path,
    newVal: Any,
    newPriority: Double,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], newPriority.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoSetWithPriority(
    repo: Repo,
    path: Path,
    newVal: Any,
    newPriority: Null,
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoSetWithPriority")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], newVal.asInstanceOf[js.Any], newPriority.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoStart(repo: Repo, appId: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStart")(repo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoStart(repo: Repo, appId: String, authOverride: js.Object): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStart")(repo.asInstanceOf[js.Any], appId.asInstanceOf[js.Any], authOverride.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoStartTransaction(
    repo: Repo,
    path: Path,
    transactionUpdate: js.Function1[/* a */ Any, Any],
    onComplete: js.Function3[/* error */ js.Error, /* committed */ Boolean, /* node */ Node, Unit],
    unwatcher: js.Function0[Unit],
    applyLocally: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStartTransaction")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], unwatcher.asInstanceOf[js.Any], applyLocally.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoStartTransaction(
    repo: Repo,
    path: Path,
    transactionUpdate: js.Function1[/* a */ Any, Any],
    onComplete: Null,
    unwatcher: js.Function0[Unit],
    applyLocally: Boolean
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStartTransaction")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], transactionUpdate.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any], unwatcher.asInstanceOf[js.Any], applyLocally.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoStats(repo: Repo): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("repoStats")(repo.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def repoStats(repo: Repo, showDelta: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStats")(repo.asInstanceOf[js.Any], showDelta.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoStatsIncrementCounter(repo: Repo, metric: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoStatsIncrementCounter")(repo.asInstanceOf[js.Any], metric.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def repoUpdate(repo: Repo, path: Path, childrenToMerge: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoUpdate")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], childrenToMerge.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def repoUpdate(
    repo: Repo,
    path: Path,
    childrenToMerge: StringDictionary[Any],
    onComplete: js.Function2[/* status */ js.Error | Null, /* errorReason */ js.UndefOr[String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("repoUpdate")(repo.asInstanceOf[js.Any], path.asInstanceOf[js.Any], childrenToMerge.asInstanceOf[js.Any], onComplete.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @js.native
  trait Transaction extends StObject {
    
    var abortReason: String | Null = js.native
    
    var applyLocally: Boolean = js.native
    
    var currentInputSnapshot: Node | Null = js.native
    
    var currentOutputSnapshotRaw: Node | Null = js.native
    
    var currentOutputSnapshotResolved: Node | Null = js.native
    
    var currentWriteId: Double = js.native
    
    def onComplete(error: js.Error, committed: Boolean): Unit = js.native
    def onComplete(error: js.Error, committed: Boolean, node: Node): Unit = js.native
    def onComplete(error: Null, committed: Boolean): Unit = js.native
    def onComplete(error: Null, committed: Boolean, node: Node): Unit = js.native
    
    var order: Double = js.native
    
    var path: Path = js.native
    
    var retryCount: Double = js.native
    
    var status: TransactionStatus = js.native
    
    def unwatcher(): Unit = js.native
    
    def update(a: Any): Any = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`0`
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`1`
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`2`
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`3`
    - typingsJapgolly.firebaseDatabase.firebaseDatabaseInts.`4`
  */
  trait TransactionStatus extends StObject
  object TransactionStatus {
    
    inline def COMPLETED: `2` = 2.asInstanceOf[`2`]
    
    inline def NEEDS_ABORT: `4` = 4.asInstanceOf[`4`]
    
    inline def RUN: `0` = 0.asInstanceOf[`0`]
    
    inline def SENT: `1` = 1.asInstanceOf[`1`]
    
    inline def SENT_NEEDS_ABORT: `3` = 3.asInstanceOf[`3`]
  }
}
