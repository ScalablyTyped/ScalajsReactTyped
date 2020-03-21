package typingsJapgolly.d3.mod

import typingsJapgolly.d3Geo.mod.GeoContext
import typingsJapgolly.d3Geo.mod.GeoPath_
import typingsJapgolly.d3Geo.mod.GeoPermissibleObjects
import typingsJapgolly.d3Geo.mod.GeoProjection_
import typingsJapgolly.d3Geo.mod.GeoStreamWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoPath")
@js.native
object geoPath extends js.Object {
  def apply(): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: Null, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection_): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection_, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper): GeoPath_[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper, context: GeoContext): GeoPath_[_, GeoPermissibleObjects] = js.native
}

