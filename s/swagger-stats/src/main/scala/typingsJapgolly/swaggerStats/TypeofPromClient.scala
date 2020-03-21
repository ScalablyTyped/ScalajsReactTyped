package typingsJapgolly.swaggerStats

import org.scalablytyped.runtime.Instantiable1
import typingsJapgolly.promClient.FnCall
import typingsJapgolly.promClient.mod.CounterConfiguration
import typingsJapgolly.promClient.mod.DefaultMetricsCollectorConfiguration
import typingsJapgolly.promClient.mod.GaugeConfiguration
import typingsJapgolly.promClient.mod.HistogramConfiguration
import typingsJapgolly.promClient.mod.Registry
import typingsJapgolly.promClient.mod.SummaryConfiguration
import typingsJapgolly.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofPromClient extends js.Object {
  var AggregatorRegistry: TypeofAggregatorRegistry = js.native
  var Counter: Instantiable1[/* configuration */ CounterConfiguration, typingsJapgolly.promClient.mod.Counter] = js.native
  var Gauge: Instantiable1[/* configuration */ GaugeConfiguration, typingsJapgolly.promClient.mod.Gauge] = js.native
  var Histogram: Instantiable1[
    /* configuration */ HistogramConfiguration, 
    typingsJapgolly.promClient.mod.Histogram
  ] = js.native
  var Pushgateway: Instantiable1[/* url */ String, typingsJapgolly.promClient.mod.Pushgateway] = js.native
  var Registry: TypeofRegistry = js.native
  var Summary: Instantiable1[/* configuration */ SummaryConfiguration, typingsJapgolly.promClient.mod.Summary] = js.native
  val register: Registry = js.native
  def collectDefaultMetrics(): ReturnType[FnCall] = js.native
  def collectDefaultMetrics(config: DefaultMetricsCollectorConfiguration): ReturnType[FnCall] = js.native
  def collectDefaultMetrics(timeout: Double): Double = js.native
  def exponentialBuckets(start: Double, factor: Double, count: Double): js.Array[Double] = js.native
  def linearBuckets(start: Double, width: Double, count: Double): js.Array[Double] = js.native
  def validateMetricName(name: String): Boolean = js.native
}

