package typingsJapgolly.mapboxMapboxSdk.directionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.restricted
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.tunnel
*/
trait DirectionsClass extends js.Object

object DirectionsClass {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def ferry: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.ferry = this.cast("ferry")
  @scala.inline
  def motorway: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.motorway = this.cast("motorway")
  @scala.inline
  def restricted: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.restricted = this.cast("restricted")
  @scala.inline
  def toll: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.toll = this.cast("toll")
  @scala.inline
  def tunnel: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.tunnel = this.cast("tunnel")
}

