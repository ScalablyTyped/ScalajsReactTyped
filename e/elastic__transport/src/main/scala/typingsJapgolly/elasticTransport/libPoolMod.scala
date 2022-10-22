package typingsJapgolly.elasticTransport

import typingsJapgolly.elasticTransport.anon.None
import typingsJapgolly.elasticTransport.libPoolBaseConnectionPoolMod.ConnectionPoolOptions
import typingsJapgolly.elasticTransport.libPoolBaseConnectionPoolMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPoolMod {
  
  @JSImport("@elastic/transport/lib/pool", "BaseConnectionPool")
  @js.native
  open class BaseConnectionPool protected () extends default {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/transport/lib/pool", "CloudConnectionPool")
  @js.native
  open class CloudConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolCloudConnectionPoolMod.default {
    def this(opts: ConnectionPoolOptions) = this()
  }
  
  @JSImport("@elastic/transport/lib/pool", "ClusterConnectionPool")
  @js.native
  open class ClusterConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolClusterConnectionPoolMod.default {
    def this(opts: ConnectionPoolOptions) = this()
  }
  /* static members */
  object ClusterConnectionPool {
    
    @JSImport("@elastic/transport/lib/pool", "ClusterConnectionPool")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@elastic/transport/lib/pool", "ClusterConnectionPool.resurrectStrategies")
    @js.native
    def resurrectStrategies: None = js.native
    inline def resurrectStrategies_=(x: None): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("resurrectStrategies")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@elastic/transport/lib/pool", "WeightedConnectionPool")
  @js.native
  open class WeightedConnectionPool protected ()
    extends typingsJapgolly.elasticTransport.libPoolWeightedConnectionPoolMod.default {
    def this(opts: ConnectionPoolOptions) = this()
  }
}
