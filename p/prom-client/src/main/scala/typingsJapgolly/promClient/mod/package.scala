package typingsJapgolly.promClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Histogram = typingsJapgolly.promClient.mod.Histogram_
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.promClient.mod.Counter
    - typingsJapgolly.promClient.mod.Gauge
    - typingsJapgolly.promClient.mod.Summary
    - typingsJapgolly.promClient.mod.Histogram
  */
  type Metric_ = typingsJapgolly.promClient.mod._Metric_ | typingsJapgolly.promClient.mod.Summary | typingsJapgolly.promClient.mod.Histogram
  type Pushgateway = typingsJapgolly.promClient.mod.Pushgateway_
  type Summary = typingsJapgolly.promClient.mod.Summary_
  type labelValues = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double]
}
