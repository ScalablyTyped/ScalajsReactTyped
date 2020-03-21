package typingsJapgolly.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic`
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
*/
trait DirectionsProfile extends js.Object

object DirectionsProfile {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def `driving-traffic`: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.`driving-traffic` = this.cast("driving-traffic")
  @scala.inline
  def walking: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

