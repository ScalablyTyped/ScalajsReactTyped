package typingsJapgolly.leaflet.mod

import org.scalajs.dom.HTMLElement
import typingsJapgolly.geojson.mod.Feature
import typingsJapgolly.geojson.mod.Point
import typingsJapgolly.leaflet.leafletBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("leaflet", "Marker")
@js.native
open class Marker_[P] protected () extends Layer {
  def this(latlng: LatLngExpression) = this()
  def this(latlng: LatLngExpression, options: MarkerOptions) = this()
  
  /* protected */ var _shadow: js.UndefOr[HTMLElement] = js.native
  
  var dragging: js.UndefOr[Handler] = js.native
  
  var feature: js.UndefOr[Feature[Point, P]] = js.native
  
  def getElement(): js.UndefOr[HTMLElement] = js.native
  
  def getIcon(): Icon_[IconOptions] | DivIcon_ = js.native
  
  def getLatLng(): LatLng_ = js.native
  
  // Properties
  var options: MarkerOptions = js.native
  
  def setIcon(icon: DivIcon_): this.type = js.native
  def setIcon(icon: Icon_[IconOptions]): this.type = js.native
  
  def setLatLng(latlng: LatLngExpression): this.type = js.native
  
  def setOpacity(opacity: Double): this.type = js.native
  
  def setZIndexOffset(offset: Double): this.type = js.native
  
  def toGeoJSON(): Feature[Point, P] = js.native
  def toGeoJSON(precision: Double): Feature[Point, P] = js.native
  @JSName("toGeoJSON")
  def toGeoJSON_false(precision: `false`): Feature[Point, P] = js.native
}
