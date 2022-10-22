package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.anon.Consistency
import typingsJapgolly.cassandraDriver.anon.Language
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cassandra-driver", "ExecutionProfile")
@js.native
open class ExecutionProfile protected () extends StObject {
  def this(name: String, options: Consistency) = this()
  
  var consistency: js.UndefOr[consistencies] = js.native
  
  var graphOptions: js.UndefOr[Language] = js.native
  
  var loadBalancing: js.UndefOr[LoadBalancingPolicy] = js.native
  
  var name: String = js.native
  
  var readTimeout: js.UndefOr[Double] = js.native
  
  var retry: js.UndefOr[RetryPolicy] = js.native
  
  var serialConsistency: js.UndefOr[consistencies] = js.native
}
