package typingsJapgolly.cassandraDriver.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.cassandraDriver.policiesMod.policies.loadBalancing.LoadBalancingPolicy
import typingsJapgolly.cassandraDriver.policiesMod.policies.retry.RetryPolicy
import typingsJapgolly.cassandraDriver.typesMod.types.Long
import typingsJapgolly.cassandraDriver.typesMod.types.consistencies
import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionOptions extends js.Object {
  def getCaptureStackTrace(): Boolean
  def getConsistency(): consistencies
  def getCustomPayload(): StringDictionary[js.Any]
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
  @scala.inline
  def apply(
    getCaptureStackTrace: CallbackTo[Boolean],
    getConsistency: CallbackTo[consistencies],
    getCustomPayload: CallbackTo[StringDictionary[js.Any]],
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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getCaptureStackTrace")(getCaptureStackTrace.toJsFn)
    __obj.updateDynamic("getConsistency")(getConsistency.toJsFn)
    __obj.updateDynamic("getCustomPayload")(getCustomPayload.toJsFn)
    __obj.updateDynamic("getFetchSize")(getFetchSize.toJsFn)
    __obj.updateDynamic("getFixedHost")(getFixedHost.toJsFn)
    __obj.updateDynamic("getHints")(getHints.toJsFn)
    __obj.updateDynamic("getKeyspace")(getKeyspace.toJsFn)
    __obj.updateDynamic("getLoadBalancingPolicy")(getLoadBalancingPolicy.toJsFn)
    __obj.updateDynamic("getPageState")(getPageState.toJsFn)
    __obj.updateDynamic("getRawQueryOptions")(getRawQueryOptions.toJsFn)
    __obj.updateDynamic("getReadTimeout")(getReadTimeout.toJsFn)
    __obj.updateDynamic("getRetryPolicy")(getRetryPolicy.toJsFn)
    __obj.updateDynamic("getRoutingKey")(getRoutingKey.toJsFn)
    __obj.updateDynamic("getSerialConsistency")(getSerialConsistency.toJsFn)
    __obj.updateDynamic("getTimestamp")(getTimestamp.toJsFn)
    __obj.updateDynamic("isAutoPage")(isAutoPage.toJsFn)
    __obj.updateDynamic("isBatchCounter")(isBatchCounter.toJsFn)
    __obj.updateDynamic("isBatchLogged")(isBatchLogged.toJsFn)
    __obj.updateDynamic("isIdempotent")(isIdempotent.toJsFn)
    __obj.updateDynamic("isPrepared")(isPrepared.toJsFn)
    __obj.updateDynamic("isQueryTracing")(isQueryTracing.toJsFn)
    __obj.updateDynamic("setHints")(js.Any.fromFunction1((t0: js.Array[java.lang.String]) => setHints(t0).runNow()))
    __obj.asInstanceOf[ExecutionOptions]
  }
}

