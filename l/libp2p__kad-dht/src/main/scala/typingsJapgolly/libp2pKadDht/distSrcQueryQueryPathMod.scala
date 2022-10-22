package typingsJapgolly.libp2pKadDht

import org.scalajs.dom.AbortSignal
import typingsJapgolly.libp2pInterfaceDht.mod.QueryEvent
import typingsJapgolly.libp2pInterfacePeerId.mod.PeerId
import typingsJapgolly.libp2pInterfaces.eventsMod.EventEmitter
import typingsJapgolly.libp2pKadDht.distSrcQueryManagerMod.CleanUpEvents
import typingsJapgolly.libp2pKadDht.distSrcQueryTypesMod.QueryContext
import typingsJapgolly.libp2pKadDht.distSrcQueryTypesMod.QueryFunc
import typingsJapgolly.libp2pLogger.mod.Logger_
import typingsJapgolly.std.AsyncGenerator
import typingsJapgolly.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcQueryQueryPathMod {
  
  @JSImport("@libp2p/kad-dht/dist/src/query/query-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def queryPath(options: QueryPathOptions): AsyncGenerator[QueryEvent, Unit, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("queryPath")(options.asInstanceOf[js.Any]).asInstanceOf[AsyncGenerator[QueryEvent, Unit, Unit]]
  
  trait QueryPathOptions extends StObject {
    
    /**
      * How many concurrent node/value lookups to run
      */
    var alpha: Double
    
    /**
      * will emit a 'cleanup' event if the caller exits the for..await of early
      */
    var cleanUp: EventEmitter[CleanUpEvents]
    
    /**
      * What are we trying to find
      */
    var key: js.typedarray.Uint8Array
    
    /**
      * Query log
      */
    def log(formatter: Any, args: Any*): Unit
    /**
      * Query log
      */
    @JSName("log")
    var log_Original: Logger_
    
    /**
      * How many concurrent node/value lookups to run
      */
    var numPaths: Double
    
    /**
      * Who we are
      */
    var ourPeerId: PeerId
    
    /**
      * How many concurrent node/value lookups to run
      */
    var pathIndex: Double
    
    /**
      * The query function to run with each peer
      */
    def query(context: QueryContext): AsyncIterable[QueryEvent]
    
    /**
      * A timeout for queryFunc in ms
      */
    var queryFuncTimeout: js.UndefOr[Double] = js.undefined
    
    /**
      * The query function to run with each peer
      */
    @JSName("query")
    var query_Original: QueryFunc
    
    /**
      * When to stop querying
      */
    var signal: AbortSignal
    
    /**
      * Where we start our query
      */
    var startingPeer: PeerId
  }
  object QueryPathOptions {
    
    inline def apply(
      alpha: Double,
      cleanUp: EventEmitter[CleanUpEvents],
      key: js.typedarray.Uint8Array,
      log: Logger_,
      numPaths: Double,
      ourPeerId: PeerId,
      pathIndex: Double,
      query: /* context */ QueryContext => AsyncIterable[QueryEvent],
      signal: AbortSignal,
      startingPeer: PeerId
    ): QueryPathOptions = {
      val __obj = js.Dynamic.literal(alpha = alpha.asInstanceOf[js.Any], cleanUp = cleanUp.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], log = log.asInstanceOf[js.Any], numPaths = numPaths.asInstanceOf[js.Any], ourPeerId = ourPeerId.asInstanceOf[js.Any], pathIndex = pathIndex.asInstanceOf[js.Any], query = js.Any.fromFunction1(query), signal = signal.asInstanceOf[js.Any], startingPeer = startingPeer.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryPathOptions]
    }
    
    extension [Self <: QueryPathOptions](x: Self) {
      
      inline def setAlpha(value: Double): Self = StObject.set(x, "alpha", value.asInstanceOf[js.Any])
      
      inline def setCleanUp(value: EventEmitter[CleanUpEvents]): Self = StObject.set(x, "cleanUp", value.asInstanceOf[js.Any])
      
      inline def setKey(value: js.typedarray.Uint8Array): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setLog(value: Logger_): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
      
      inline def setNumPaths(value: Double): Self = StObject.set(x, "numPaths", value.asInstanceOf[js.Any])
      
      inline def setOurPeerId(value: PeerId): Self = StObject.set(x, "ourPeerId", value.asInstanceOf[js.Any])
      
      inline def setPathIndex(value: Double): Self = StObject.set(x, "pathIndex", value.asInstanceOf[js.Any])
      
      inline def setQuery(value: /* context */ QueryContext => AsyncIterable[QueryEvent]): Self = StObject.set(x, "query", js.Any.fromFunction1(value))
      
      inline def setQueryFuncTimeout(value: Double): Self = StObject.set(x, "queryFuncTimeout", value.asInstanceOf[js.Any])
      
      inline def setQueryFuncTimeoutUndefined: Self = StObject.set(x, "queryFuncTimeout", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setStartingPeer(value: PeerId): Self = StObject.set(x, "startingPeer", value.asInstanceOf[js.Any])
    }
  }
}
