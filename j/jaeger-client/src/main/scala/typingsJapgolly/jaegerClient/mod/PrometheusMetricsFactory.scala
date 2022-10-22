package typingsJapgolly.jaegerClient.mod

import typingsJapgolly.jaegerClient.anon.Typeofprometheus
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jaeger-client", "PrometheusMetricsFactory")
@js.native
open class PrometheusMetricsFactory protected () extends StObject {
  def this(client: Typeofprometheus) = this()
  def this(client: Typeofprometheus, serviceName: String) = this()
  
  def createCounter(name: String, tags: js.Object): Counter = js.native
  
  def createGauge(name: String, tags: js.Object): Gauge = js.native
}
