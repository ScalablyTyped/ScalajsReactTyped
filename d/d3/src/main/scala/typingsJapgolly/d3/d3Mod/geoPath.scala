package typingsJapgolly.d3.d3Mod

import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoContext
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoPath
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoPermissibleObjects
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoProjection
import typingsJapgolly.d3DashGeo.d3DashGeoMod.GeoStreamWrapper
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("d3", "geoPath")
@js.native
object geoPath extends js.Object {
  def apply(): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: Null, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoProjection, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper): GeoPath[_, GeoPermissibleObjects] = js.native
  def apply(projection: GeoStreamWrapper, context: GeoContext): GeoPath[_, GeoPermissibleObjects] = js.native
}

