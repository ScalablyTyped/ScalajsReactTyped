package typingsJapgolly.nodeTurn

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("node-turn", JSImport.Namespace)
  @js.native
  open class ^ () extends TurnServer {
    def this(options: TurnOptions) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeTurn.nodeTurnStrings.none
    - typingsJapgolly.nodeTurn.nodeTurnStrings.`short-term`
    - typingsJapgolly.nodeTurn.nodeTurnStrings.`long-term`
  */
  trait TurnAuthMech extends StObject
  object TurnAuthMech {
    
    inline def `long-term`: typingsJapgolly.nodeTurn.nodeTurnStrings.`long-term` = "long-term".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.`long-term`]
    
    inline def none: typingsJapgolly.nodeTurn.nodeTurnStrings.none = "none".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.none]
    
    inline def `short-term`: typingsJapgolly.nodeTurn.nodeTurnStrings.`short-term` = "short-term".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.`short-term`]
  }
  
  type TurnCredentials = StringDictionary[String]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.nodeTurn.nodeTurnStrings.OFF
    - typingsJapgolly.nodeTurn.nodeTurnStrings.FATAL
    - typingsJapgolly.nodeTurn.nodeTurnStrings.ERROR
    - typingsJapgolly.nodeTurn.nodeTurnStrings.WARN
    - typingsJapgolly.nodeTurn.nodeTurnStrings.INFO
    - typingsJapgolly.nodeTurn.nodeTurnStrings.DEBUG
    - typingsJapgolly.nodeTurn.nodeTurnStrings.TRACE
    - typingsJapgolly.nodeTurn.nodeTurnStrings.ALL
  */
  trait TurnDebugLevel extends StObject
  object TurnDebugLevel {
    
    inline def ALL: typingsJapgolly.nodeTurn.nodeTurnStrings.ALL = "ALL".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.ALL]
    
    inline def DEBUG: typingsJapgolly.nodeTurn.nodeTurnStrings.DEBUG = "DEBUG".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.DEBUG]
    
    inline def ERROR: typingsJapgolly.nodeTurn.nodeTurnStrings.ERROR = "ERROR".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.ERROR]
    
    inline def FATAL: typingsJapgolly.nodeTurn.nodeTurnStrings.FATAL = "FATAL".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.FATAL]
    
    inline def INFO: typingsJapgolly.nodeTurn.nodeTurnStrings.INFO = "INFO".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.INFO]
    
    inline def OFF: typingsJapgolly.nodeTurn.nodeTurnStrings.OFF = "OFF".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.OFF]
    
    inline def TRACE: typingsJapgolly.nodeTurn.nodeTurnStrings.TRACE = "TRACE".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.TRACE]
    
    inline def WARN: typingsJapgolly.nodeTurn.nodeTurnStrings.WARN = "WARN".asInstanceOf[typingsJapgolly.nodeTurn.nodeTurnStrings.WARN]
  }
  
  /* Inlined parent std.Partial<node-turn.node-turn.TurnProps> */
  trait TurnOptions extends StObject {
    
    var authMech: js.UndefOr[TurnAuthMech] = js.undefined
    
    var credentials: js.UndefOr[TurnCredentials] = js.undefined
    
    var debug: js.UndefOr[js.Function2[/* debugLevel */ TurnDebugLevel, /* message */ String, Unit]] = js.undefined
    
    var debugLevel: js.UndefOr[TurnDebugLevel] = js.undefined
    
    var defaultAllocatetLifetime: js.UndefOr[Double] = js.undefined
    
    var externalIps: js.UndefOr[String | StringDictionary[String] | Null] = js.undefined
    
    var listeningIps: js.UndefOr[js.Array[String]] = js.undefined
    
    var listeningPort: js.UndefOr[Double] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* repeated */ Any, Unit]] = js.undefined
    
    var maxAllocateLifetime: js.UndefOr[Double] = js.undefined
    
    var maxPort: js.UndefOr[Double] = js.undefined
    
    var minPort: js.UndefOr[Double] = js.undefined
    
    var realm: js.UndefOr[String] = js.undefined
    
    var relayIps: js.UndefOr[js.Array[String]] = js.undefined
  }
  object TurnOptions {
    
    inline def apply(): TurnOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TurnOptions]
    }
    
    extension [Self <: TurnOptions](x: Self) {
      
      inline def setAuthMech(value: TurnAuthMech): Self = StObject.set(x, "authMech", value.asInstanceOf[js.Any])
      
      inline def setAuthMechUndefined: Self = StObject.set(x, "authMech", js.undefined)
      
      inline def setCredentials(value: TurnCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setDebug(value: (/* debugLevel */ TurnDebugLevel, /* message */ String) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: /* debugLevel */ TurnDebugLevel, t1: /* message */ String) => (value(t0, t1)).runNow()))
      
      inline def setDebugLevel(value: TurnDebugLevel): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDebugLevelUndefined: Self = StObject.set(x, "debugLevel", js.undefined)
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def setDefaultAllocatetLifetime(value: Double): Self = StObject.set(x, "defaultAllocatetLifetime", value.asInstanceOf[js.Any])
      
      inline def setDefaultAllocatetLifetimeUndefined: Self = StObject.set(x, "defaultAllocatetLifetime", js.undefined)
      
      inline def setExternalIps(value: String | StringDictionary[String]): Self = StObject.set(x, "externalIps", value.asInstanceOf[js.Any])
      
      inline def setExternalIpsNull: Self = StObject.set(x, "externalIps", null)
      
      inline def setExternalIpsUndefined: Self = StObject.set(x, "externalIps", js.undefined)
      
      inline def setListeningIps(value: js.Array[String]): Self = StObject.set(x, "listeningIps", value.asInstanceOf[js.Any])
      
      inline def setListeningIpsUndefined: Self = StObject.set(x, "listeningIps", js.undefined)
      
      inline def setListeningIpsVarargs(value: String*): Self = StObject.set(x, "listeningIps", js.Array(value*))
      
      inline def setListeningPort(value: Double): Self = StObject.set(x, "listeningPort", value.asInstanceOf[js.Any])
      
      inline def setListeningPortUndefined: Self = StObject.set(x, "listeningPort", js.undefined)
      
      inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setMaxAllocateLifetime(value: Double): Self = StObject.set(x, "maxAllocateLifetime", value.asInstanceOf[js.Any])
      
      inline def setMaxAllocateLifetimeUndefined: Self = StObject.set(x, "maxAllocateLifetime", js.undefined)
      
      inline def setMaxPort(value: Double): Self = StObject.set(x, "maxPort", value.asInstanceOf[js.Any])
      
      inline def setMaxPortUndefined: Self = StObject.set(x, "maxPort", js.undefined)
      
      inline def setMinPort(value: Double): Self = StObject.set(x, "minPort", value.asInstanceOf[js.Any])
      
      inline def setMinPortUndefined: Self = StObject.set(x, "minPort", js.undefined)
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRealmUndefined: Self = StObject.set(x, "realm", js.undefined)
      
      inline def setRelayIps(value: js.Array[String]): Self = StObject.set(x, "relayIps", value.asInstanceOf[js.Any])
      
      inline def setRelayIpsUndefined: Self = StObject.set(x, "relayIps", js.undefined)
      
      inline def setRelayIpsVarargs(value: String*): Self = StObject.set(x, "relayIps", js.Array(value*))
    }
  }
  
  trait TurnProps extends StObject {
    
    var authMech: TurnAuthMech
    
    def debug(debugLevel: TurnDebugLevel, message: String): Unit
    
    var debugLevel: TurnDebugLevel
    
    var defaultAllocatetLifetime: Double
    
    var externalIps: String | StringDictionary[String] | Null
    
    var listeningIps: js.Array[String]
    
    var listeningPort: Double
    
    def log(args: Any*): Unit
    
    var maxAllocateLifetime: Double
    
    var maxPort: Double
    
    var minPort: Double
    
    var realm: String
    
    var relayIps: js.Array[String]
  }
  object TurnProps {
    
    inline def apply(
      authMech: TurnAuthMech,
      debug: (TurnDebugLevel, String) => Callback,
      debugLevel: TurnDebugLevel,
      defaultAllocatetLifetime: Double,
      listeningIps: js.Array[String],
      listeningPort: Double,
      log: /* repeated */ Any => Callback,
      maxAllocateLifetime: Double,
      maxPort: Double,
      minPort: Double,
      realm: String,
      relayIps: js.Array[String]
    ): TurnProps = {
      val __obj = js.Dynamic.literal(authMech = authMech.asInstanceOf[js.Any], debug = js.Any.fromFunction2((t0: TurnDebugLevel, t1: String) => (debug(t0, t1)).runNow()), debugLevel = debugLevel.asInstanceOf[js.Any], defaultAllocatetLifetime = defaultAllocatetLifetime.asInstanceOf[js.Any], listeningIps = listeningIps.asInstanceOf[js.Any], listeningPort = listeningPort.asInstanceOf[js.Any], log = js.Any.fromFunction1((t0: /* repeated */ Any) => log(t0).runNow()), maxAllocateLifetime = maxAllocateLifetime.asInstanceOf[js.Any], maxPort = maxPort.asInstanceOf[js.Any], minPort = minPort.asInstanceOf[js.Any], realm = realm.asInstanceOf[js.Any], relayIps = relayIps.asInstanceOf[js.Any], externalIps = null)
      __obj.asInstanceOf[TurnProps]
    }
    
    extension [Self <: TurnProps](x: Self) {
      
      inline def setAuthMech(value: TurnAuthMech): Self = StObject.set(x, "authMech", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: (TurnDebugLevel, String) => Callback): Self = StObject.set(x, "debug", js.Any.fromFunction2((t0: TurnDebugLevel, t1: String) => (value(t0, t1)).runNow()))
      
      inline def setDebugLevel(value: TurnDebugLevel): Self = StObject.set(x, "debugLevel", value.asInstanceOf[js.Any])
      
      inline def setDefaultAllocatetLifetime(value: Double): Self = StObject.set(x, "defaultAllocatetLifetime", value.asInstanceOf[js.Any])
      
      inline def setExternalIps(value: String | StringDictionary[String]): Self = StObject.set(x, "externalIps", value.asInstanceOf[js.Any])
      
      inline def setExternalIpsNull: Self = StObject.set(x, "externalIps", null)
      
      inline def setListeningIps(value: js.Array[String]): Self = StObject.set(x, "listeningIps", value.asInstanceOf[js.Any])
      
      inline def setListeningIpsVarargs(value: String*): Self = StObject.set(x, "listeningIps", js.Array(value*))
      
      inline def setListeningPort(value: Double): Self = StObject.set(x, "listeningPort", value.asInstanceOf[js.Any])
      
      inline def setLog(value: /* repeated */ Any => Callback): Self = StObject.set(x, "log", js.Any.fromFunction1((t0: /* repeated */ Any) => value(t0).runNow()))
      
      inline def setMaxAllocateLifetime(value: Double): Self = StObject.set(x, "maxAllocateLifetime", value.asInstanceOf[js.Any])
      
      inline def setMaxPort(value: Double): Self = StObject.set(x, "maxPort", value.asInstanceOf[js.Any])
      
      inline def setMinPort(value: Double): Self = StObject.set(x, "minPort", value.asInstanceOf[js.Any])
      
      inline def setRealm(value: String): Self = StObject.set(x, "realm", value.asInstanceOf[js.Any])
      
      inline def setRelayIps(value: js.Array[String]): Self = StObject.set(x, "relayIps", value.asInstanceOf[js.Any])
      
      inline def setRelayIpsVarargs(value: String*): Self = StObject.set(x, "relayIps", js.Array(value*))
    }
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {readonly [ P in keyof node-turn.node-turn.TurnProps ]: node-turn.node-turn.TurnProps[P]} */ @js.native
  trait TurnServer extends EventEmitter {
    
    def addUser(username: String, password: String): Unit = js.native
    
    def removeUser(username: String): Unit = js.native
    
    val software: String = js.native
    
    def start(): Unit = js.native
    
    val staticCredentials: TurnCredentials = js.native
    
    def stop(): Unit = js.native
  }
}
