package typingsJapgolly.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.train
*/
trait DirectionsMode extends js.Object

object DirectionsMode {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def cycling: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.cycling = this.cast("cycling")
  @scala.inline
  def driving: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.driving = this.cast("driving")
  @scala.inline
  def ferry: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def train: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.train = this.cast("train")
  @scala.inline
  def unaccessible: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.unaccessible = this.cast("unaccessible")
  @scala.inline
  def walking: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.walking = this.cast("walking")
}

