package typingsJapgolly.redisClient

import typingsJapgolly.redisClient.distLibLuaScriptMod.RedisScriptConfig
import typingsJapgolly.redisClient.distLibLuaScriptMod.SHA1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@redis/client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@redis/client", "AbortError")
  @js.native
  open class AbortError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.AbortError
  
  @JSImport("@redis/client", "ClientClosedError")
  @js.native
  open class ClientClosedError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.ClientClosedError
  
  @JSImport("@redis/client", "ConnectionTimeoutError")
  @js.native
  open class ConnectionTimeoutError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.ConnectionTimeoutError
  
  @JSImport("@redis/client", "DisconnectsClientError")
  @js.native
  open class DisconnectsClientError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.DisconnectsClientError
  
  @JSImport("@redis/client", "ErrorReply")
  @js.native
  open class ErrorReply protected ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.ErrorReply {
    def this(message: String) = this()
  }
  
  @JSImport("@redis/client", "GeoReplyWith")
  @js.native
  object GeoReplyWith extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith & String
      ] = js.native
    
    /* "WITHCOORD" */ val COORDINATES: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.COORDINATES & String = js.native
    
    /* "WITHDIST" */ val DISTANCE: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.DISTANCE & String = js.native
    
    /* "WITHHASH" */ val HASH: typingsJapgolly.redisClient.distLibCommandsGenericTransformersMod.GeoReplyWith.HASH & String = js.native
  }
  
  @JSImport("@redis/client", "ReconnectStrategyError")
  @js.native
  open class ReconnectStrategyError protected ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.ReconnectStrategyError {
    def this(originalError: js.Error, socketError: Any) = this()
  }
  
  @JSImport("@redis/client", "RootNodesUnavailableError")
  @js.native
  open class RootNodesUnavailableError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.RootNodesUnavailableError
  
  @JSImport("@redis/client", "SocketClosedUnexpectedlyError")
  @js.native
  open class SocketClosedUnexpectedlyError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.SocketClosedUnexpectedlyError
  
  @JSImport("@redis/client", "WatchError")
  @js.native
  open class WatchError ()
    extends typingsJapgolly.redisClient.distLibErrorsMod.WatchError
  
  @JSImport("@redis/client", "commandOptions")
  @js.native
  val commandOptions: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.commandOptions */ Any = js.native
  
  @JSImport("@redis/client", "createClient")
  @js.native
  val createClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisClient.create */ Any = js.native
  
  @JSImport("@redis/client", "createCluster")
  @js.native
  val createCluster: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof RedisCluster.create */ Any = js.native
  
  inline def defineScript[S /* <: RedisScriptConfig */](script: S): S & SHA1 = ^.asInstanceOf[js.Dynamic].applyDynamic("defineScript")(script.asInstanceOf[js.Any]).asInstanceOf[S & SHA1]
}
