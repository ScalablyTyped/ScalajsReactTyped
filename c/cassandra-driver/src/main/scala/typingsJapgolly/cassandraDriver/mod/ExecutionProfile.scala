package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.AnonConsistency
import typingsJapgolly.cassandraDriver.AnonLanguage
import typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.typesMod.types.consistencies
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
class ExecutionProfile protected () extends js.Object {
  def this(name: String, options: AnonConsistency) = this()
  var consistency: js.UndefOr[consistencies] = js.native
  var graphOptions: js.UndefOr[AnonLanguage] = js.native
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  var name: String = js.native
  var readTimeout: js.UndefOr[Double] = js.native
  var retry: js.UndefOr[RetryPolicy] = js.native
  var serialConsistency: js.UndefOr[consistencies] = js.native
}

