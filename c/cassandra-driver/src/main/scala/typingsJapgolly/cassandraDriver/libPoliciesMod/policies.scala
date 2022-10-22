package typingsJapgolly.cassandraDriver.libPoliciesMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.cassandraDriver.anon.Filter
import typingsJapgolly.cassandraDriver.anon.NextExecution
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.addressResolution.AddressTranslator
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.reconnection.ReconnectionPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.speculativeExecution.SpeculativeExecutionPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.timestampGeneration.TimestampGenerator
import typingsJapgolly.cassandraDriver.libTypesMod.types.Long
import typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies
import typingsJapgolly.cassandraDriver.libTypesMod.types.distance
import typingsJapgolly.cassandraDriver.mod.Client
import typingsJapgolly.cassandraDriver.mod.EmptyCallback
import typingsJapgolly.cassandraDriver.mod.ExecutionOptions
import typingsJapgolly.cassandraDriver.mod.Host
import typingsJapgolly.cassandraDriver.mod.HostMap
import typingsJapgolly.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object policies {
  
  @JSImport("cassandra-driver/lib/policies", "policies")
  @js.native
  val ^ : js.Any = js.native
  
  object addressResolution {
    
    @JSImport("cassandra-driver/lib/policies", "policies.addressResolution.EC2MultiRegionTranslator")
    @js.native
    open class EC2MultiRegionTranslator ()
      extends StObject
         with AddressTranslator {
      
      /* CompleteClass */
      override def translate(address: String, port: Double, callback: js.Function): Unit = js.native
    }
    
    trait AddressTranslator extends StObject {
      
      def translate(address: String, port: Double, callback: js.Function): Unit
    }
    object AddressTranslator {
      
      inline def apply(translate: (String, Double, js.Function) => Callback): AddressTranslator = {
        val __obj = js.Dynamic.literal(translate = js.Any.fromFunction3((t0: String, t1: Double, t2: js.Function) => (translate(t0, t1, t2)).runNow()))
        __obj.asInstanceOf[AddressTranslator]
      }
      
      extension [Self <: AddressTranslator](x: Self) {
        
        inline def setTranslate(value: (String, Double, js.Function) => Callback): Self = StObject.set(x, "translate", js.Any.fromFunction3((t0: String, t1: Double, t2: js.Function) => (value(t0, t1, t2)).runNow()))
      }
    }
  }
  
  inline def defaultAddressTranslator(): AddressTranslator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAddressTranslator")().asInstanceOf[AddressTranslator]
  
  inline def defaultLoadBalancingPolicy(): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")().asInstanceOf[LoadBalancingPolicy]
  inline def defaultLoadBalancingPolicy(localDc: String): LoadBalancingPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultLoadBalancingPolicy")(localDc.asInstanceOf[js.Any]).asInstanceOf[LoadBalancingPolicy]
  
  inline def defaultReconnectionPolicy(): ReconnectionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultReconnectionPolicy")().asInstanceOf[ReconnectionPolicy]
  
  inline def defaultRetryPolicy(): RetryPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultRetryPolicy")().asInstanceOf[RetryPolicy]
  
  inline def defaultSpeculativeExecutionPolicy(): SpeculativeExecutionPolicy = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultSpeculativeExecutionPolicy")().asInstanceOf[SpeculativeExecutionPolicy]
  
  inline def defaultTimestampGenerator(): TimestampGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultTimestampGenerator")().asInstanceOf[TimestampGenerator]
  
  object loadBalancing {
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.AllowListPolicy")
    @js.native
    open class AllowListPolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy, allowList: js.Array[String]) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.DCAwareRoundRobinPolicy")
    @js.native
    open class DCAwareRoundRobinPolicy protected () extends LoadBalancingPolicy {
      def this(localDc: String) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.DefaultLoadBalancingPolicy")
    @js.native
    open class DefaultLoadBalancingPolicy () extends LoadBalancingPolicy {
      def this(options: Filter) = this()
    }
    
    /* note: abstract class */ @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.LoadBalancingPolicy")
    @js.native
    open class LoadBalancingPolicy () extends StObject {
      
      def getDistance(host: Host): distance = js.native
      
      def getOptions(): Map[String, js.Object] = js.native
      
      def init(client: Client, hosts: HostMap, callback: EmptyCallback): Unit = js.native
      
      def newQueryPlan(
        keyspace: String,
        executionOptions: ExecutionOptions,
        callback: js.Function2[/* error */ js.Error, /* iterator */ js.Iterator[Host], Unit]
      ): Unit = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.RoundRobinPolicy")
    @js.native
    open class RoundRobinPolicy () extends LoadBalancingPolicy
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.TokenAwarePolicy")
    @js.native
    open class TokenAwarePolicy protected () extends LoadBalancingPolicy {
      def this(childPolicy: LoadBalancingPolicy) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.loadBalancing.WhiteListPolicy")
    @js.native
    open class WhiteListPolicy protected () extends AllowListPolicy {
      def this(childPolicy: LoadBalancingPolicy, allowList: js.Array[String]) = this()
    }
  }
  
  object reconnection {
    
    @JSImport("cassandra-driver/lib/policies", "policies.reconnection.ConstantReconnectionPolicy")
    @js.native
    open class ConstantReconnectionPolicy protected ()
      extends StObject
         with ReconnectionPolicy {
      def this(delay: Double) = this()
      
      /* CompleteClass */
      override def getOptions(): Map[String, js.Object] = js.native
      
      /* CompleteClass */
      override def newSchedule(): js.Iterator[Double] = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.reconnection.ExponentialReconnectionPolicy")
    @js.native
    open class ExponentialReconnectionPolicy protected ()
      extends StObject
         with ReconnectionPolicy {
      def this(baseDelay: Double, maxDelay: Double) = this()
      def this(baseDelay: Double, maxDelay: Double, startWithNoDelay: Boolean) = this()
      
      /* CompleteClass */
      override def getOptions(): Map[String, js.Object] = js.native
      
      /* CompleteClass */
      override def newSchedule(): js.Iterator[Double] = js.native
    }
    
    trait ReconnectionPolicy extends StObject {
      
      def getOptions(): Map[String, js.Object]
      
      def newSchedule(): js.Iterator[Double]
    }
    object ReconnectionPolicy {
      
      inline def apply(getOptions: CallbackTo[Map[String, js.Object]], newSchedule: CallbackTo[js.Iterator[Double]]): ReconnectionPolicy = {
        val __obj = js.Dynamic.literal(getOptions = getOptions.toJsFn, newSchedule = newSchedule.toJsFn)
        __obj.asInstanceOf[ReconnectionPolicy]
      }
      
      extension [Self <: ReconnectionPolicy](x: Self) {
        
        inline def setGetOptions(value: CallbackTo[Map[String, js.Object]]): Self = StObject.set(x, "getOptions", value.toJsFn)
        
        inline def setNewSchedule(value: CallbackTo[js.Iterator[Double]]): Self = StObject.set(x, "newSchedule", value.toJsFn)
      }
    }
  }
  
  object retry {
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.DecisionInfo")
    @js.native
    open class DecisionInfo () extends StObject {
      
      var consistency: consistencies = js.native
      
      var decision: Double = js.native
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.FallthroughRetryPolicy")
    @js.native
    open class FallthroughRetryPolicy () extends RetryPolicy
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.IdempotenceAwareRetryPolicy")
    @js.native
    open class IdempotenceAwareRetryPolicy protected () extends RetryPolicy {
      def this(childPolicy: RetryPolicy) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.OperationInfo")
    @js.native
    open class OperationInfo () extends StObject {
      
      var executionOptions: ExecutionOptions = js.native
      
      var nbRetry: Double = js.native
      
      var query: String = js.native
    }
    
    object RetryDecision {
      
      @js.native
      sealed trait retryDecision extends StObject
      @JSImport("cassandra-driver/lib/policies", "policies.retry.RetryDecision.retryDecision")
      @js.native
      object retryDecision extends StObject {
        
        @JSBracketAccess
        def apply(value: Double): js.UndefOr[retryDecision & Double] = js.native
        
        @js.native
        sealed trait ignore
          extends StObject
             with retryDecision
        /* 0 */ val ignore: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.ignore & Double = js.native
        
        @js.native
        sealed trait rethrow
          extends StObject
             with retryDecision
        /* 1 */ val rethrow: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.rethrow & Double = js.native
        
        @js.native
        sealed trait retry
          extends StObject
             with retryDecision
        /* 2 */ val retry: typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryDecision.retryDecision.retry & Double = js.native
      }
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.retry.RetryPolicy")
    @js.native
    open class RetryPolicy () extends StObject {
      
      def onReadTimeout(
        info: OperationInfo,
        consistency: consistencies,
        received: Double,
        blockFor: Double,
        isDataPresent: Boolean
      ): DecisionInfo = js.native
      
      def onRequestError(info: OperationInfo, consistency: consistencies, err: js.Error): DecisionInfo = js.native
      
      def onUnavailable(info: OperationInfo, consistency: consistencies, required: Double, alive: Boolean): DecisionInfo = js.native
      
      def onWriteTimeout(
        info: OperationInfo,
        consistency: consistencies,
        received: Double,
        blockFor: Double,
        writeType: String
      ): DecisionInfo = js.native
      
      def rethrowResult(): DecisionInfo = js.native
      
      def retryResult(consistency: consistencies): DecisionInfo = js.native
      def retryResult(consistency: consistencies, useCurrentHost: Boolean): DecisionInfo = js.native
    }
  }
  
  object speculativeExecution {
    
    @JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution.ConstantSpeculativeExecutionPolicy")
    @js.native
    open class ConstantSpeculativeExecutionPolicy protected ()
      extends StObject
         with SpeculativeExecutionPolicy {
      def this(delay: Double, maxSpeculativeExecutions: Double) = this()
    }
    
    @JSImport("cassandra-driver/lib/policies", "policies.speculativeExecution.NoSpeculativeExecutionPolicy")
    @js.native
    open class NoSpeculativeExecutionPolicy ()
      extends StObject
         with SpeculativeExecutionPolicy
    
    @js.native
    trait SpeculativeExecutionPolicy extends StObject {
      
      def getOptions(): Map[String, js.Object] = js.native
      
      def init(client: Client): Unit = js.native
      
      def newPlan(keyspace: String, queryInfo: String): NextExecution = js.native
      def newPlan(keyspace: String, queryInfo: js.Array[js.Object]): NextExecution = js.native
      
      def shutdown(): Unit = js.native
    }
  }
  
  object timestampGeneration {
    
    @JSImport("cassandra-driver/lib/policies", "policies.timestampGeneration.MonotonicTimestampGenerator")
    @js.native
    open class MonotonicTimestampGenerator protected ()
      extends StObject
         with TimestampGenerator {
      def this(warningThreshold: Double, minLogInterval: Double) = this()
      
      def getDate(): Double = js.native
      
      /* CompleteClass */
      override def next(client: Client): Long | Double = js.native
    }
    
    trait TimestampGenerator extends StObject {
      
      def next(client: Client): Long | Double
    }
    object TimestampGenerator {
      
      inline def apply(next: Client => Long | Double): TimestampGenerator = {
        val __obj = js.Dynamic.literal(next = js.Any.fromFunction1(next))
        __obj.asInstanceOf[TimestampGenerator]
      }
      
      extension [Self <: TimestampGenerator](x: Self) {
        
        inline def setNext(value: Client => Long | Double): Self = StObject.set(x, "next", js.Any.fromFunction1(value))
      }
    }
  }
}
