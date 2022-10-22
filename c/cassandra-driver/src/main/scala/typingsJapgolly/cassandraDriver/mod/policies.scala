package typingsJapgolly.cassandraDriver.mod

import typingsJapgolly.cassandraDriver.anon.Filter
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.addressResolution.AddressTranslator
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.reconnection.ReconnectionPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.timestampGeneration.TimestampGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policies {
  
  @JSImport("cassandra-driver", "policies")
  @js.native
  val ^ : js.Any = js.native
  
  object addressResolution {
    
    @JSImport("cassandra-driver", "policies.addressResolution.EC2MultiRegionTranslator")
    @js.native
    open class EC2MultiRegionTranslator ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.addressResolution.EC2MultiRegionTranslator
  }
  
  inline def defaultAddressTranslator(): AddressTranslator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAddressTranslator")().asInstanceOf[AddressTranslator]
  
  inline def defaultLoadBalancingPolicy(): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")().asInstanceOf[LoadBalancingPolicy]
  inline def defaultLoadBalancingPolicy(localDc: String): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")(localDc.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingPolicy]
  
  inline def defaultReconnectionPolicy(): ReconnectionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultReconnectionPolicy")().asInstanceOf[ReconnectionPolicy]
  
  inline def defaultRetryPolicy(): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[RetryPolicy]
  
  inline def defaultSpeculativeExecutionPolicy(): SpeculativeExecutionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSpeculativeExecutionPolicy")().asInstanceOf[SpeculativeExecutionPolicy]
  
  inline def defaultTimestampGenerator(): TimestampGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimestampGenerator")().asInstanceOf[TimestampGenerator]
  
  object loadBalancing {
    
    @JSImport("cassandra-driver", "policies.loadBalancing.AllowListPolicy")
    @js.native
    open class AllowListPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.AllowListPolicy {
      def this(
        childPolicy: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy,
        allowList: js.Array[String]
      ) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.DCAwareRoundRobinPolicy")
    @js.native
    open class DCAwareRoundRobinPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.DCAwareRoundRobinPolicy {
      def this(localDc: String) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.DefaultLoadBalancingPolicy")
    @js.native
    open class DefaultLoadBalancingPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.DefaultLoadBalancingPolicy {
      def this(options: Filter) = this()
    }
    
    /* note: abstract class */ @JSImport("cassandra-driver", "policies.loadBalancing.LoadBalancingPolicy")
    @js.native
    open class LoadBalancingPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
    
    @JSImport("cassandra-driver", "policies.loadBalancing.RoundRobinPolicy")
    @js.native
    open class RoundRobinPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.RoundRobinPolicy
    
    @JSImport("cassandra-driver", "policies.loadBalancing.TokenAwarePolicy")
    @js.native
    open class TokenAwarePolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.TokenAwarePolicy {
      def this(childPolicy: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy) = this()
    }
    
    @JSImport("cassandra-driver", "policies.loadBalancing.WhiteListPolicy")
    @js.native
    open class WhiteListPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.WhiteListPolicy {
      def this(
        childPolicy: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy,
        allowList: js.Array[String]
      ) = this()
    }
  }
  
  object reconnection {
    
    @JSImport("cassandra-driver", "policies.reconnection.ConstantReconnectionPolicy")
    @js.native
    open class ConstantReconnectionPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.reconnection.ConstantReconnectionPolicy {
      def this(delay: Double) = this()
    }
    
    @JSImport("cassandra-driver", "policies.reconnection.ExponentialReconnectionPolicy")
    @js.native
    open class ExponentialReconnectionPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.reconnection.ExponentialReconnectionPolicy {
      def this(baseDelay: Double, maxDelay: Double) = this()
      def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
    }
  }
  
  object retry {
    
    @JSImport("cassandra-driver", "policies.retry.DecisionInfo")
    @js.native
    open class DecisionInfo ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.DecisionInfo
    
    @JSImport("cassandra-driver", "policies.retry.FallthroughRetryPolicy")
    @js.native
    open class FallthroughRetryPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.FallthroughRetryPolicy
    
    @JSImport("cassandra-driver", "policies.retry.IdempotenceAwareRetryPolicy")
    @js.native
    open class IdempotenceAwareRetryPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.IdempotenceAwareRetryPolicy {
      def this(childPolicy: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy) = this()
    }
    
    @JSImport("cassandra-driver", "policies.retry.OperationInfo")
    @js.native
    open class OperationInfo ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.OperationInfo
    
    object RetryDecision {
      
      @JSImport("cassandra-driver", "policies.retry.RetryDecision.retryDecision")
      @js.native
      object retryDecision extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[
                typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision & Double
              ] = js.native
        
        /* 0 */ val ignore: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.ignore & Double = js.native
        
        /* 1 */ val rethrow: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.rethrow & Double = js.native
        
        /* 2 */ val retry: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.retry & Double = js.native
      }
    }
    
    @JSImport("cassandra-driver", "policies.retry.RetryPolicy")
    @js.native
    open class RetryPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
  }
  
  object speculativeExecution {
    
    @JSImport("cassandra-driver", "policies.speculativeExecution.ConstantSpeculativeExecutionPolicy")
    @js.native
    open class ConstantSpeculativeExecutionPolicy protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.speculativeExecution.ConstantSpeculativeExecutionPolicy {
      def this(delay: Double, maxSpeculativeExecutions: Double) = this()
    }
    
    @JSImport("cassandra-driver", "policies.speculativeExecution.NoSpeculativeExecutionPolicy")
    @js.native
    open class NoSpeculativeExecutionPolicy ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.speculativeExecution.NoSpeculativeExecutionPolicy
  }
  
  object timestampGeneration {
    
    @JSImport("cassandra-driver", "policies.timestampGeneration.MonotonicTimestampGenerator")
    @js.native
    open class MonotonicTimestampGenerator protected ()
      extends typingsJapgolly.cassandraDriver.libPoliciesMod.policies.timestampGeneration.MonotonicTimestampGenerator {
      def this(warningThreshold: Double, minLogInterval: Double) = this()
    }
  }
}
