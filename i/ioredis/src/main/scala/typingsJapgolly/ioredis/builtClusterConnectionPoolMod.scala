package typingsJapgolly.ioredis

import typingsJapgolly.ioredis.builtClusterUtilMod.NodeKey
import typingsJapgolly.ioredis.builtClusterUtilMod.NodeRole
import typingsJapgolly.ioredis.builtClusterUtilMod.RedisOptions
import typingsJapgolly.node.eventsMod.EventEmitter
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object builtClusterConnectionPoolMod {
  
  @JSImport("ioredis/built/cluster/ConnectionPool", JSImport.Default)
  @js.native
  open class default protected () extends ConnectionPool {
    def this(redisOptions: Any) = this()
  }
  
  @js.native
  trait ConnectionPool extends EventEmitter {
    
    /**
      * Find or create a connection to the node
      */
    def findOrCreate(node: RedisOptions): typingsJapgolly.ioredis.builtRedisMod.default = js.native
    def findOrCreate(node: RedisOptions, readOnly: Boolean): typingsJapgolly.ioredis.builtRedisMod.default = js.native
    
    def getInstanceByKey(key: NodeKey): typingsJapgolly.ioredis.builtRedisMod.default = js.native
    
    def getNodes(): js.Array[typingsJapgolly.ioredis.builtRedisMod.default] = js.native
    def getNodes(role: NodeRole): js.Array[typingsJapgolly.ioredis.builtRedisMod.default] = js.native
    
    def getSampleInstance(role: NodeRole): typingsJapgolly.ioredis.builtRedisMod.default = js.native
    
    /* private */ var nodes: Any = js.native
    
    /* private */ var redisOptions: Any = js.native
    
    /**
      * Remove a node from the pool.
      */
    /* private */ var removeNode: Any = js.native
    
    /**
      * Reset the pool with a set of nodes.
      * The old node will be removed.
      */
    def reset(nodes: js.Array[RedisOptions]): Unit = js.native
    
    /* private */ var specifiedOptions: Any = js.native
  }
}
