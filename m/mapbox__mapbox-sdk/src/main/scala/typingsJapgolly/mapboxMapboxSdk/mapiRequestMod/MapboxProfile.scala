package typingsJapgolly.mapboxMapboxSdk.mapiRequestMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
*/
trait MapboxProfile extends js.Object

object MapboxProfile {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def walking: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

