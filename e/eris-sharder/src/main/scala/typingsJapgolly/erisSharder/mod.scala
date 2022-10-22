package typingsJapgolly.erisSharder

import japgolly.scalajs.react.Callback
import typingsJapgolly.erisSharder.anon.Bot
import typingsJapgolly.erisSharder.anon.Broadcast
import typingsJapgolly.erisSharder.anon.ClientOptions
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* note: abstract class */ @JSImport("eris-sharder", "Base")
  @js.native
  open class Base protected () extends StObject {
    def this(setup: Bot) = this()
    
    /* protected */ var bot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any = js.native
    
    /* protected */ var clusterID: Double = js.native
    
    /* protected */ var ipc: Broadcast = js.native
    
    def launch(): Any = js.native
    
    def restartCluster(clusterID: Double): Unit = js.native
  }
  
  @JSImport("eris-sharder", "Master")
  @js.native
  open class Master protected () extends EventEmitter {
    def this(token: String, mainFile: String, options: ClientOptions) = this()
    
    def broadcast(start: Double, message: String): Unit = js.native
    
    def calculateShards(): js.Promise[Any] = js.native
    
    def chunk(shards: Any, clusterCount: Double): Any = js.native
    
    def connectShards(): Unit = js.native
    
    def executeStats(clusters: Any, stat: Double): Unit = js.native
    
    def fetchInfo(start: Double, `type`: Any, value: Any): Unit = js.native
    
    def isMaster(): Boolean = js.native
    
    def launch(test: Any): Double = js.native
    
    def printLogo(): Unit = js.native
    
    def restartCluster(worker: Any, code: String, signal: Any): Unit = js.native
    
    def sendTo(cluster: Cluster, message: String): Unit = js.native
    
    def sendWebhook(`type`: Any, embed: Any): Unit = js.native
    
    def start(): Double = js.native
    
    def startStats(): Unit = js.native
  }
  
  trait Cluster extends StObject {
    
    var app: Any
    
    var bot: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any) | Null
    
    var clusterCount: Double
    
    var clusterID: Double
    
    def connect(
      firstShardID: Double,
      lastShardID: Double,
      maxShards: Double,
      token: String,
      `type`: Any,
      clientOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any
    ): Unit
    
    var exclusiveGuilds: Double
    
    var firstShardID: Double
    
    var guilds: Double
    
    var largeGuilds: Double
    
    var lastShardID: Double
    
    def loadCode(
      bot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any
    ): Unit
    
    def logOverride(message: String): String
    
    var mainFile: Any
    
    var maxShards: Double
    
    var shards: Double
    
    var shardsStats: js.Array[Any]
    
    def spawn(): Unit
    
    def startStats(
      bot: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any
    ): Unit
    
    var test: Boolean
    
    var uptime: Double
    
    var users: Double
    
    var voiceChannels: Double
  }
  object Cluster {
    
    inline def apply(
      app: Any,
      clusterCount: Double,
      clusterID: Double,
      connect: (Double, Double, Double, String, Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any) => Callback,
      exclusiveGuilds: Double,
      firstShardID: Double,
      guilds: Double,
      largeGuilds: Double,
      lastShardID: Double,
      loadCode: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any => Callback,
      logOverride: String => String,
      mainFile: Any,
      maxShards: Double,
      shards: Double,
      shardsStats: js.Array[Any],
      spawn: Callback,
      startStats: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any => Callback,
      test: Boolean,
      uptime: Double,
      users: Double,
      voiceChannels: Double
    ): Cluster = {
      val __obj = js.Dynamic.literal(app = app.asInstanceOf[js.Any], clusterCount = clusterCount.asInstanceOf[js.Any], clusterID = clusterID.asInstanceOf[js.Any], connect = js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: String, t4: Any, t5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any) => (connect(t0, t1, t2, t3, t4, t5)).runNow()), exclusiveGuilds = exclusiveGuilds.asInstanceOf[js.Any], firstShardID = firstShardID.asInstanceOf[js.Any], guilds = guilds.asInstanceOf[js.Any], largeGuilds = largeGuilds.asInstanceOf[js.Any], lastShardID = lastShardID.asInstanceOf[js.Any], loadCode = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any) => loadCode(t0).runNow()), logOverride = js.Any.fromFunction1(logOverride), mainFile = mainFile.asInstanceOf[js.Any], maxShards = maxShards.asInstanceOf[js.Any], shards = shards.asInstanceOf[js.Any], shardsStats = shardsStats.asInstanceOf[js.Any], spawn = spawn.toJsFn, startStats = js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any) => startStats(t0).runNow()), test = test.asInstanceOf[js.Any], uptime = uptime.asInstanceOf[js.Any], users = users.asInstanceOf[js.Any], voiceChannels = voiceChannels.asInstanceOf[js.Any], bot = null)
      __obj.asInstanceOf[Cluster]
    }
    
    extension [Self <: Cluster](x: Self) {
      
      inline def setApp(value: Any): Self = StObject.set(x, "app", value.asInstanceOf[js.Any])
      
      inline def setBot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any
      ): Self = StObject.set(x, "bot", value.asInstanceOf[js.Any])
      
      inline def setBotNull: Self = StObject.set(x, "bot", null)
      
      inline def setClusterCount(value: Double): Self = StObject.set(x, "clusterCount", value.asInstanceOf[js.Any])
      
      inline def setClusterID(value: Double): Self = StObject.set(x, "clusterID", value.asInstanceOf[js.Any])
      
      inline def setConnect(
        value: (Double, Double, Double, String, Any, /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any) => Callback
      ): Self = StObject.set(x, "connect", js.Any.fromFunction6((t0: Double, t1: Double, t2: Double, t3: String, t4: Any, t5: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.ClientOptions */ Any) => (value(t0, t1, t2, t3, t4, t5)).runNow()))
      
      inline def setExclusiveGuilds(value: Double): Self = StObject.set(x, "exclusiveGuilds", value.asInstanceOf[js.Any])
      
      inline def setFirstShardID(value: Double): Self = StObject.set(x, "firstShardID", value.asInstanceOf[js.Any])
      
      inline def setGuilds(value: Double): Self = StObject.set(x, "guilds", value.asInstanceOf[js.Any])
      
      inline def setLargeGuilds(value: Double): Self = StObject.set(x, "largeGuilds", value.asInstanceOf[js.Any])
      
      inline def setLastShardID(value: Double): Self = StObject.set(x, "lastShardID", value.asInstanceOf[js.Any])
      
      inline def setLoadCode(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any => Callback
      ): Self = StObject.set(x, "loadCode", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any) => value(t0).runNow()))
      
      inline def setLogOverride(value: String => String): Self = StObject.set(x, "logOverride", js.Any.fromFunction1(value))
      
      inline def setMainFile(value: Any): Self = StObject.set(x, "mainFile", value.asInstanceOf[js.Any])
      
      inline def setMaxShards(value: Double): Self = StObject.set(x, "maxShards", value.asInstanceOf[js.Any])
      
      inline def setShards(value: Double): Self = StObject.set(x, "shards", value.asInstanceOf[js.Any])
      
      inline def setShardsStats(value: js.Array[Any]): Self = StObject.set(x, "shardsStats", value.asInstanceOf[js.Any])
      
      inline def setShardsStatsVarargs(value: Any*): Self = StObject.set(x, "shardsStats", js.Array(value*))
      
      inline def setSpawn(value: Callback): Self = StObject.set(x, "spawn", value.toJsFn)
      
      inline def setStartStats(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any => Callback
      ): Self = StObject.set(x, "startStats", js.Any.fromFunction1((t0: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eris.Client */ Any) => value(t0).runNow()))
      
      inline def setTest(value: Boolean): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setUptime(value: Double): Self = StObject.set(x, "uptime", value.asInstanceOf[js.Any])
      
      inline def setUsers(value: Double): Self = StObject.set(x, "users", value.asInstanceOf[js.Any])
      
      inline def setVoiceChannels(value: Double): Self = StObject.set(x, "voiceChannels", value.asInstanceOf[js.Any])
    }
  }
}
