package typingsJapgolly.cassandraDriver.mod.policies

import typingsJapgolly.cassandraDriver.AnonFilter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.loadBalancing")
@js.native
object loadBalancing extends js.Object {
  @js.native
  class DCAwareRoundRobinPolicy protected ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
    def this(localDc: String) = this()
  }
  
  @js.native
  class DefaultLoadBalancingPolicy ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
    def this(options: AnonFilter) = this()
  }
  
  @js.native
  abstract class LoadBalancingPolicy ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
  
  @js.native
  class RoundRobinPolicy ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.RoundRobinPolicy
  
  @js.native
  class TokenAwarePolicy protected ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.TokenAwarePolicy {
    def this(childPolicy: typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
  }
  
  @js.native
  class WhiteListPolicy protected ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.WhiteListPolicy {
    def this(
      childPolicy: typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy,
      whiteList: js.Array[String]
    ) = this()
  }
  
}

