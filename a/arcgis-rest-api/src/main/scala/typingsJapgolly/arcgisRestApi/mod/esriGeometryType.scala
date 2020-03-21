package typingsJapgolly.arcgisRestApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint
  - typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint
  - typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline
  - typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon
  - typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope
*/
trait esriGeometryType extends js.Object

object esriGeometryType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def esriGeometryEnvelope: typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryEnvelope = this.cast("esriGeometryEnvelope")
  @scala.inline
  def esriGeometryMultipoint: typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryMultipoint = this.cast("esriGeometryMultipoint")
  @scala.inline
  def esriGeometryPoint: typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPoint = this.cast("esriGeometryPoint")
  @scala.inline
  def esriGeometryPolygon: typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolygon = this.cast("esriGeometryPolygon")
  @scala.inline
  def esriGeometryPolyline: typingsJapgolly.arcgisRestApi.arcgisRestApiStrings.esriGeometryPolyline = this.cast("esriGeometryPolyline")
}

