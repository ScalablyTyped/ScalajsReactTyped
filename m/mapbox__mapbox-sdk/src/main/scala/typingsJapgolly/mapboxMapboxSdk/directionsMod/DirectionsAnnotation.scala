package typingsJapgolly.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion
*/
trait DirectionsAnnotation extends js.Object

object DirectionsAnnotation {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def congestion: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.congestion = this.cast("congestion")
  @scala.inline
  def distance: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.distance = this.cast("distance")
  @scala.inline
  def duration: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.duration = this.cast("duration")
  @scala.inline
  def speed: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.speed = this.cast("speed")
}

