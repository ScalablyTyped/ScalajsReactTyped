package typingsJapgolly.devtoolsProtocol.typesProtocolProxyApiMod.ProtocolProxyApi

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.devtoolsProtocol.devtoolsProtocolStrings.metrics
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Performance.EnableRequest
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Performance.GetMetricsResponse
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Performance.MetricsEvent
import typingsJapgolly.devtoolsProtocol.mod.Protocol.Performance.SetTimeDomainRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PerformanceApi extends StObject {
  
  /**
    * Disable collecting and reporting metrics.
    */
  def disable(): js.Promise[Unit]
  
  /**
    * Enable collecting and reporting metrics.
    */
  def enable(params: EnableRequest): js.Promise[Unit]
  
  /**
    * Retrieve current values of run-time metrics.
    */
  def getMetrics(): js.Promise[GetMetricsResponse]
  
  /**
    * Current values of the metrics.
    */
  @JSName("on")
  def on_metrics(event: metrics, listener: js.Function1[/* params */ MetricsEvent, Unit]): Unit
  
  /**
    * Sets time domain to use for collecting and reporting duration metrics.
    * Note that this must be called before enabling metrics collection. Calling
    * this method while metrics collection is enabled returns an error.
    */
  def setTimeDomain(params: SetTimeDomainRequest): js.Promise[Unit]
}
object PerformanceApi {
  
  inline def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: EnableRequest => js.Promise[Unit],
    getMetrics: CallbackTo[js.Promise[GetMetricsResponse]],
    on: (metrics, js.Function1[/* params */ MetricsEvent, Unit]) => Callback,
    setTimeDomain: SetTimeDomainRequest => js.Promise[Unit]
  ): PerformanceApi = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = js.Any.fromFunction1(enable), getMetrics = getMetrics.toJsFn, on = js.Any.fromFunction2((t0: metrics, t1: js.Function1[/* params */ MetricsEvent, Unit]) => (on(t0, t1)).runNow()), setTimeDomain = js.Any.fromFunction1(setTimeDomain))
    __obj.asInstanceOf[PerformanceApi]
  }
  
  extension [Self <: PerformanceApi](x: Self) {
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: EnableRequest => js.Promise[Unit]): Self = StObject.set(x, "enable", js.Any.fromFunction1(value))
    
    inline def setGetMetrics(value: CallbackTo[js.Promise[GetMetricsResponse]]): Self = StObject.set(x, "getMetrics", value.toJsFn)
    
    inline def setOn(value: (metrics, js.Function1[/* params */ MetricsEvent, Unit]) => Callback): Self = StObject.set(x, "on", js.Any.fromFunction2((t0: metrics, t1: js.Function1[/* params */ MetricsEvent, Unit]) => (value(t0, t1)).runNow()))
    
    inline def setSetTimeDomain(value: SetTimeDomainRequest => js.Promise[Unit]): Self = StObject.set(x, "setTimeDomain", js.Any.fromFunction1(value))
  }
}
