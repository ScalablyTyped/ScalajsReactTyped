package typingsJapgolly.mapboxMapboxSdk.tilequeryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring
  - typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.point
*/
trait GeometryType extends js.Object

object GeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def linestring: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.linestring = this.cast("linestring")
  @scala.inline
  def point: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.point = this.cast("point")
  @scala.inline
  def polygon: typingsJapgolly.mapboxMapboxSdk.mapboxMapboxSdkStrings.polygon = this.cast("polygon")
}

