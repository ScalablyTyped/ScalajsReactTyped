package typingsJapgolly.cassandraDriver.policiesMod.policies

import typingsJapgolly.cassandraDriver.AnonFilter
import typingsJapgolly.cassandraDriver.mod.Client
import typingsJapgolly.cassandraDriver.mod.EmptyCallback
import typingsJapgolly.cassandraDriver.mod.ExecutionOptions
import typingsJapgolly.cassandraDriver.mod.Host
import typingsJapgolly.cassandraDriver.mod.HostMap
import typingsJapgolly.cassandraDriver.typesMod.types.distance
import typingsJapgolly.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver/lib/policies", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy () extends LoadBalancingPolicy {
    def this(options: AnonFilter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy () extends js.Object {
    def getDistance(host: Host): distance = js.native
    def getOptions(): Map[String, js.Object] = js.native
    def init(client: Client, hosts: HostMap, callback: EmptyCallback): Unit = js.native
    def newQueryPlan(
      keyspace: String,
      executionOptions: ExecutionOptions,
      callback: js.Function2[/* error */ js.Error, /* iterator */ js.Iterator[Host], Unit]
    ): Unit = js.native
  }
  
  @js.native
  class RoundRobinPolicy () extends LoadBalancingPolicy
  
  @js.native
  class TokenAwarePolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected () extends LoadBalancingPolicy {
    def this(childPolicy: LoadBalancingPolicy, whiteList: js.Array[String]) = this()
  }
  
}

