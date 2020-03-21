package typingsJapgolly.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.imperial
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.metric
*/
trait DirectionsUnits extends js.Object

object DirectionsUnits {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def imperial: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.imperial = this.cast("imperial")
  @scala.inline
  def metric: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.metric = this.cast("metric")
}

