package typingsJapgolly.cassandraDriver.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.libPoliciesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.libTypesMod.types.Long
import typingsJapgolly.cassandraDriver.libTypesMod.types.consistencies
import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionOptions extends StObject {
  
  def getCaptureStackTrace(): Boolean
  
  def getConsistency(): consistencies
  
  def getCustomPayload(): StringDictionary[Any]
  
  def getFetchSize(): Double
  
  def getFixedHost(): Host
  
  def getHints(): js.Array[js.Array[String] | String]
  
  def getKeyspace(): String
  
  def getLoadBalancingPolicy(): LoadBalancingPolicy
  
  def getPageState(): Buffer
  
  def getRawQueryOptions(): QueryOptions
  
  def getReadTimeout(): Double
  
  def getRetryPolicy(): RetryPolicy
  
  def getRoutingKey(): Buffer | js.Array[Buffer]
  
  def getSerialConsistency(): consistencies
  
  def getTimestamp(): js.UndefOr[Double | Long | Null]
  
  def isAutoPage(): Boolean
  
  def isBatchCounter(): Boolean
  
  def isBatchLogged(): Boolean
  
  def isIdempotent(): Boolean
  
  def isPrepared(): Boolean
  
  def isQueryTracing(): Boolean
  
  def setHints(hints: js.Array[String]): Unit
}
object ExecutionOptions {
  
  inline def apply(
    getCaptureStackTrace: CallbackTo[Boolean],
    getConsistency: CallbackTo[consistencies],
    getCustomPayload: CallbackTo[StringDictionary[Any]],
    getFetchSize: CallbackTo[Double],
    getFixedHost: CallbackTo[Host],
    getHints: CallbackTo[js.Array[js.Array[String] | String]],
    getKeyspace: CallbackTo[String],
    getLoadBalancingPolicy: CallbackTo[LoadBalancingPolicy],
    getPageState: CallbackTo[Buffer],
    getRawQueryOptions: CallbackTo[QueryOptions],
    getReadTimeout: CallbackTo[Double],
    getRetryPolicy: CallbackTo[RetryPolicy],
    getRoutingKey: CallbackTo[Buffer | js.Array[Buffer]],
    getSerialConsistency: CallbackTo[consistencies],
    getTimestamp: CallbackTo[js.UndefOr[Double | Long | Null]],
    isAutoPage: CallbackTo[Boolean],
    isBatchCounter: CallbackTo[Boolean],
    isBatchLogged: CallbackTo[Boolean],
    isIdempotent: CallbackTo[Boolean],
    isPrepared: CallbackTo[Boolean],
    isQueryTracing: CallbackTo[Boolean],
    setHints: js.Array[String] => Callback
  ): ExecutionOptions = {
    val __obj = js.Dynamic.literal(getCaptureStackTrace = getCaptureStackTrace.toJsFn, getConsistency = getConsistency.toJsFn, getCustomPayload = getCustomPayload.toJsFn, getFetchSize = getFetchSize.toJsFn, getFixedHost = getFixedHost.toJsFn, getHints = getHints.toJsFn, getKeyspace = getKeyspace.toJsFn, getLoadBalancingPolicy = getLoadBalancingPolicy.toJsFn, getPageState = getPageState.toJsFn, getRawQueryOptions = getRawQueryOptions.toJsFn, getReadTimeout = getReadTimeout.toJsFn, getRetryPolicy = getRetryPolicy.toJsFn, getRoutingKey = getRoutingKey.toJsFn, getSerialConsistency = getSerialConsistency.toJsFn, getTimestamp = getTimestamp.toJsFn, isAutoPage = isAutoPage.toJsFn, isBatchCounter = isBatchCounter.toJsFn, isBatchLogged = isBatchLogged.toJsFn, isIdempotent = isIdempotent.toJsFn, isPrepared = isPrepared.toJsFn, isQueryTracing = isQueryTracing.toJsFn, setHints = js.Any.fromFunction1((t0: js.Array[String]) => setHints(t0).runNow()))
    __obj.asInstanceOf[ExecutionOptions]
  }
  
  extension [Self <: ExecutionOptions](x: Self) {
    
    inline def setGetCaptureStackTrace(value: CallbackTo[Boolean]): Self = StObject.set(x, "getCaptureStackTrace", value.toJsFn)
    
    inline def setGetConsistency(value: CallbackTo[consistencies]): Self = StObject.set(x, "getConsistency", value.toJsFn)
    
    inline def setGetCustomPayload(value: CallbackTo[StringDictionary[Any]]): Self = StObject.set(x, "getCustomPayload", value.toJsFn)
    
    inline def setGetFetchSize(value: CallbackTo[Double]): Self = StObject.set(x, "getFetchSize", value.toJsFn)
    
    inline def setGetFixedHost(value: CallbackTo[Host]): Self = StObject.set(x, "getFixedHost", value.toJsFn)
    
    inline def setGetHints(value: CallbackTo[js.Array[js.Array[String] | String]]): Self = StObject.set(x, "getHints", value.toJsFn)
    
    inline def setGetKeyspace(value: CallbackTo[String]): Self = StObject.set(x, "getKeyspace", value.toJsFn)
    
    inline def setGetLoadBalancingPolicy(value: CallbackTo[LoadBalancingPolicy]): Self = StObject.set(x, "getLoadBalancingPolicy", value.toJsFn)
    
    inline def setGetPageState(value: CallbackTo[Buffer]): Self = StObject.set(x, "getPageState", value.toJsFn)
    
    inline def setGetRawQueryOptions(value: CallbackTo[QueryOptions]): Self = StObject.set(x, "getRawQueryOptions", value.toJsFn)
    
    inline def setGetReadTimeout(value: CallbackTo[Double]): Self = StObject.set(x, "getReadTimeout", value.toJsFn)
    
    inline def setGetRetryPolicy(value: CallbackTo[RetryPolicy]): Self = StObject.set(x, "getRetryPolicy", value.toJsFn)
    
    inline def setGetRoutingKey(value: CallbackTo[Buffer | js.Array[Buffer]]): Self = StObject.set(x, "getRoutingKey", value.toJsFn)
    
    inline def setGetSerialConsistency(value: CallbackTo[consistencies]): Self = StObject.set(x, "getSerialConsistency", value.toJsFn)
    
    inline def setGetTimestamp(value: CallbackTo[js.UndefOr[Double | Long | Null]]): Self = StObject.set(x, "getTimestamp", value.toJsFn)
    
    inline def setIsAutoPage(value: CallbackTo[Boolean]): Self = StObject.set(x, "isAutoPage", value.toJsFn)
    
    inline def setIsBatchCounter(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBatchCounter", value.toJsFn)
    
    inline def setIsBatchLogged(value: CallbackTo[Boolean]): Self = StObject.set(x, "isBatchLogged", value.toJsFn)
    
    inline def setIsIdempotent(value: CallbackTo[Boolean]): Self = StObject.set(x, "isIdempotent", value.toJsFn)
    
    inline def setIsPrepared(value: CallbackTo[Boolean]): Self = StObject.set(x, "isPrepared", value.toJsFn)
    
    inline def setIsQueryTracing(value: CallbackTo[Boolean]): Self = StObject.set(x, "isQueryTracing", value.toJsFn)
    
    inline def setSetHints(value: js.Array[String] => Callback): Self = StObject.set(x, "setHints", js.Any.fromFunction1((t0: js.Array[String]) => value(t0).runNow()))
  }
}
