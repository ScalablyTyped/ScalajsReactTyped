package typingsJapgolly.cassandraDriver.mod.policies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cassandra-driver", "policies.retry")
@js.native
object retry extends js.Object {
  @js.native
  class DecisionInfo ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.retry.DecisionInfo
  
  @js.native
  class FallthroughRetryPolicy ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.retry.FallthroughRetryPolicy
  
  @js.native
  class IdempotenceAwareRetryPolicy protected ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.retry.IdempotenceAwareRetryPolicy {
    def this(childPolicy: typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryPolicy) = this()
  }
  
  @js.native
  class OperationInfo ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.retry.OperationInfo
  
  @js.native
  class RetryPolicy ()
    extends typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryPolicy
  
  @js.native
  object RetryDecision extends js.Object {
    @js.native
    object retryDecision extends js.Object {
      /* 0 */ val ignore: typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.ignore with Double = js.native
      /* 1 */ val rethrow: typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.rethrow with Double = js.native
      /* 2 */ val retry: typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision.retry with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryDecision.retryDecision with Double
          ] = js.native
    }
    
  }
  
}

