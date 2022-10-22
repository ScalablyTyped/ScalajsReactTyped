package typingsJapgolly.pusherJs

import typingsJapgolly.pusherJs.typesSrcCoreConnectionCallbacksMod.ConnectionCallbacks
import typingsJapgolly.pusherJs.typesSrcCoreConnectionCallbacksMod.ErrorCallbacks
import typingsJapgolly.pusherJs.typesSrcCoreConnectionCallbacksMod.HandshakeCallbacks
import typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionManagerOptionsMod.ConnectionManagerOptions
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyMod.Strategy
import typingsJapgolly.pusherJs.typesSrcCoreStrategiesStrategyRunnerMod.StrategyRunner
import typingsJapgolly.pusherJs.typesSrcCoreUtilsTimersMod.OneOffTimer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSrcCoreConnectionConnectionManagerMod {
  
  @JSImport("pusher-js/types/src/core/connection/connection_manager", JSImport.Default)
  @js.native
  open class default protected () extends ConnectionManager {
    def this(key: String, options: ConnectionManagerOptions) = this()
  }
  
  @js.native
  trait ConnectionManager
    extends typingsJapgolly.pusherJs.typesSrcCoreEventsDispatcherMod.default {
    
    /* private */ var abandonConnection: Any = js.native
    
    /* private */ var abortConnecting: Any = js.native
    
    var activityTimeout: Double = js.native
    
    var activityTimer: OneOffTimer = js.native
    
    /* private */ var buildConnectionCallbacks: Any = js.native
    
    /* private */ var buildErrorCallbacks: Any = js.native
    
    /* private */ var buildHandshakeCallbacks: Any = js.native
    
    /* private */ var clearRetryTimer: Any = js.native
    
    /* private */ var clearUnavailableTimer: Any = js.native
    
    def connect(): Unit = js.native
    
    var connection: typingsJapgolly.pusherJs.typesSrcCoreConnectionConnectionMod.default = js.native
    
    var connectionCallbacks: ConnectionCallbacks = js.native
    
    def disconnect(): Unit = js.native
    
    /* private */ var disconnectInternally: Any = js.native
    
    var errorCallbacks: ErrorCallbacks = js.native
    
    var handshakeCallbacks: HandshakeCallbacks = js.native
    
    def isUsingTLS(): Boolean = js.native
    
    var key: String = js.native
    
    var options: ConnectionManagerOptions = js.native
    
    /* private */ var resetActivityCheck: Any = js.native
    
    /* private */ var retryIn: Any = js.native
    
    var retryTimer: OneOffTimer = js.native
    
    var runner: StrategyRunner = js.native
    
    def send(data: Any): Boolean = js.native
    
    /* private */ var sendActivityCheck: Any = js.native
    
    def send_event(name: String, data: Any): Boolean = js.native
    def send_event(name: String, data: Any, channel: String): Boolean = js.native
    
    /* private */ var setConnection: Any = js.native
    
    /* private */ var setUnavailableTimer: Any = js.native
    
    /* private */ var shouldRetry: Any = js.native
    
    var socket_id: String = js.native
    
    /* private */ var startConnecting: Any = js.native
    
    var state: String = js.native
    
    /* private */ var stopActivityCheck: Any = js.native
    
    var strategy: Strategy = js.native
    
    var timeline: typingsJapgolly.pusherJs.typesSrcCoreTimelineTimelineMod.default = js.native
    
    var unavailableTimer: OneOffTimer = js.native
    
    /* private */ var updateState: Any = js.native
    
    /* private */ var updateStrategy: Any = js.native
    
    var usingTLS: Boolean = js.native
  }
}
