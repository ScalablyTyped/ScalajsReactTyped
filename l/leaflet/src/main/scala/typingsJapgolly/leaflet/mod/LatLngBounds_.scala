package typingsJapgolly.leaflet.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "LatLngBounds")
@js.native
class LatLngBounds_ protected () extends js.Object {
  def this(latlngs: LatLngBoundsLiteral) = this()
  def this(southWest: LatLngExpression, northEast: LatLngExpression) = this()
  def contains(otherBoundsOrLatLng: LatLngBoundsExpression | LatLngExpression): Boolean = js.native
  def equals(otherBounds: LatLngBoundsExpression): Boolean = js.native
  def extend(latlngOrBounds: LatLngBoundsExpression | LatLngExpression): this.type = js.native
   // does this modify the current instance or does it return a new one?
  def getCenter(): LatLng_ = js.native
  def getEast(): Double = js.native
  def getNorth(): Double = js.native
  def getNorthEast(): LatLng_ = js.native
  def getNorthWest(): LatLng_ = js.native
  def getSouth(): Double = js.native
  def getSouthEast(): LatLng_ = js.native
  def getSouthWest(): LatLng_ = js.native
  def getWest(): Double = js.native
  def intersects(otherBounds: LatLngBoundsExpression): Boolean = js.native
  def isValid(): Boolean = js.native
  def overlaps(otherBounds: BoundsExpression): Boolean = js.native
  def pad(bufferRatio: Double): LatLngBounds_ = js.native
   // investigate if this is really bounds and not latlngbounds
  def toBBoxString(): String = js.native
}

