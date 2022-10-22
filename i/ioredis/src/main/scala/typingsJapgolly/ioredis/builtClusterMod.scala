package typingsJapgolly.ioredis

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.ioredis.anon.Port
import typingsJapgolly.ioredis.anon.`0`
import typingsJapgolly.ioredis.anon.`1`
import typingsJapgolly.ioredis.builtClusterClusterOptionsMod.ClusterOptions
import typingsJapgolly.ioredis.builtClusterUtilMod.NodeKey
import typingsJapgolly.ioredis.builtClusterUtilMod.NodeRole
import typingsJapgolly.ioredis.builtTransactionMod.Transaction
import typingsJapgolly.ioredis.builtTypesMod.Callback
import typingsJapgolly.ioredis.builtTypesMod.ScanStreamOptions
import typingsJapgolly.node.eventsMod.global.NodeJS.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtClusterMod {
  
  /**
    * Client for the official Redis Cluster
    */
  @JSImport("ioredis/built/cluster", JSImport.Default)
  @js.native
  open class default protected () extends Cluster {
    /**
      * Creates an instance of Cluster.
      */
    def this(startupNodes: js.Array[ClusterNode]) = this()
    def this(startupNodes: js.Array[ClusterNode], options: ClusterOptions) = this()
  }
  
  /**
    * Client for the official Redis Cluster
    */
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsJapgolly.node.eventsMod.EventEmitter because Inheritance from two classes. Inlined  */ @js.native
  trait Cluster
    extends typingsJapgolly.ioredis.builtUtilsCommanderMod.default[`0`]
       with Transaction
       with EventEmitter {
    
    /* private */ var _autoPipelines: Any = js.native
    
    /**
      * @ignore
      */
    var _groupsBySlot: js.Array[Double] = js.native
    
    /**
      * @ignore
      */
    var _groupsIds: StringDictionary[Double] = js.native
    
    /* private */ var _readyDelayedCallbacks: Any = js.native
    
    /* private */ var _runningAutoPipelines: Any = js.native
    
    /**
      * Get the number of commands queued in automatic pipelines.
      *
      * This is not available (and returns 0) until the cluster is connected and slots information have been received.
      */
    def autoPipelineQueueSize: Double = js.native
    
    /* private */ var clearNodesRefreshInterval: Any = js.native
    
    /**
      * Connect to a cluster
      */
    def connect(): js.Promise[Unit] = js.native
    
    /**
      * Every time Cluster#connect() is called, this value will be
      * auto-incrementing. The purpose of this value is used for
      * discarding previous connect attampts when creating a new
      * connection.
      */
    /* private */ var connectionEpoch: Any = js.native
    
    /* private */ var connectionPool: Any = js.native
    
    /* private */ var createScanStream: Any = js.native
    
    /* private */ var delayQueue: Any = js.native
    
    /**
      * This is needed in order not to install a listener for each auto pipeline
      *
      * @ignore
      */
    def delayUntilReady(callback: Callback[Any]): Unit = js.native
    
    /**
      * Disconnect from every node in the cluster.
      */
    def disconnect(): Unit = js.native
    def disconnect(reconnect: Boolean): Unit = js.native
    
    /* private */ var dnsLookup: Any = js.native
    
    /**
      * Create a new instance with the same startup nodes and options as the current one.
      *
      * @example
      * ```js
      * var cluster = new Redis.Cluster([{ host: "127.0.0.1", port: "30001" }]);
      * var anotherCluster = cluster.duplicate();
      * ```
      */
    def duplicate(): Cluster = js.native
    def duplicate(overrideStartupNodes: js.Array[Any]): Cluster = js.native
    def duplicate(overrideStartupNodes: js.Array[Any], overrideOptions: js.Object): Cluster = js.native
    def duplicate(overrideStartupNodes: Unit, overrideOptions: js.Object): Cluster = js.native
    
    /* private */ var executeOfflineCommands: Any = js.native
    
    /**
      * Flush offline queue with error.
      */
    /* private */ var flushQueue: Any = js.native
    
    /* private */ var getInfoFromNode: Any = js.native
    
    /**
      * Called when closed to check whether a reconnection should be made
      */
    /* private */ var handleCloseEvent: Any = js.native
    
    /**
      * @ignore
      */
    def handleError(error: js.Error, ttl: `1`, handlers: Any): Unit = js.native
    
    def hscanBufferStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def hscanBufferStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    
    def hscanStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def hscanStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    
    /* private */ var invokeReadyDelayedCallbacks: Any = js.native
    
    /**
      * @ignore
      */
    var isCluster: Boolean = js.native
    
    /* private */ var isRefreshing: Any = js.native
    
    /* private */ var manuallyClosing: Any = js.native
    
    /* private */ var natMapper: Any = js.native
    
    /**
      * Get nodes with the specified role
      */
    def nodes(): js.Array[typingsJapgolly.ioredis.builtRedisMod.default] = js.native
    def nodes(role: NodeRole): js.Array[typingsJapgolly.ioredis.builtRedisMod.default] = js.native
    
    /* private */ var offlineQueue: Any = js.native
    
    @JSName("options")
    var options_Cluster: ClusterOptions = js.native
    
    /**
      * Check whether Cluster is able to process commands
      */
    /* private */ var readyCheck: Any = js.native
    
    /* private */ var reconnectTimeout: Any = js.native
    
    /**
      * Refresh the slot cache
      *
      * @ignore
      */
    def refreshSlotsCache(): Unit = js.native
    def refreshSlotsCache(callback: Callback[Unit]): Unit = js.native
    
    /* private */ var resetNodesRefreshInterval: Any = js.native
    
    /* private */ var resetOfflineQueue: Any = js.native
    
    /* private */ var resolveSrv: Any = js.native
    
    /**
      * Normalize startup nodes, and resolving hostnames to IPs.
      *
      * This process happens every time when #connect() is called since
      * #startupNodes and DNS records may chanage.
      */
    /* private */ var resolveStartupNodeHostnames: Any = js.native
    
    /* private */ var retryAttempts: Any = js.native
    
    /**
      * Change cluster instance's status
      */
    /* private */ var setStatus: Any = js.native
    
    var slots: js.Array[js.Array[NodeKey]] = js.native
    
    /* private */ var slotsTimer: Any = js.native
    
    def sscanBufferStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def sscanBufferStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    
    def sscanStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def sscanStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    
    /* private */ var startupNodes: Any = js.native
    
    var status: ClusterStatus = js.native
    
    /* private */ var subscriber: Any = js.native
    
    def zscanBufferStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def zscanBufferStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    
    def zscanStream(key: String): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
    def zscanStream(key: String, options: ScanStreamOptions): typingsJapgolly.ioredis.builtScanStreamMod.default = js.native
  }
  
  type ClusterNode = String | Double | Port
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.ioredis.ioredisStrings.end
    - typingsJapgolly.ioredis.ioredisStrings.close
    - typingsJapgolly.ioredis.ioredisStrings.wait
    - typingsJapgolly.ioredis.ioredisStrings.connecting
    - typingsJapgolly.ioredis.ioredisStrings.connect
    - typingsJapgolly.ioredis.ioredisStrings.ready
    - typingsJapgolly.ioredis.ioredisStrings.reconnecting
    - typingsJapgolly.ioredis.ioredisStrings.disconnecting
  */
  trait ClusterStatus extends StObject
  object ClusterStatus {
    
    inline def close: typingsJapgolly.ioredis.ioredisStrings.close = "close".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.close]
    
    inline def connect: typingsJapgolly.ioredis.ioredisStrings.connect = "connect".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.connect]
    
    inline def connecting: typingsJapgolly.ioredis.ioredisStrings.connecting = "connecting".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.connecting]
    
    inline def disconnecting: typingsJapgolly.ioredis.ioredisStrings.disconnecting = "disconnecting".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.disconnecting]
    
    inline def end: typingsJapgolly.ioredis.ioredisStrings.end = "end".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.end]
    
    inline def ready: typingsJapgolly.ioredis.ioredisStrings.ready = "ready".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.ready]
    
    inline def reconnecting: typingsJapgolly.ioredis.ioredisStrings.reconnecting = "reconnecting".asInstanceOf[typingsJapgolly.ioredis.ioredisStrings.reconnecting]
  }
}
