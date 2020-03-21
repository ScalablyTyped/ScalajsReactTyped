package typingsJapgolly.leafletDraw.mod

import typingsJapgolly.leaflet.mod.Handler
import typingsJapgolly.leaflet.mod.LatLngExpression
import typingsJapgolly.leafletDraw.mod.EditOptions.EditPolyVerticesEditOptions
import typingsJapgolly.leafletDraw.mod.EditOptions.EditSimpleShapeOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("leaflet", "Edit")
@js.native
object Edit extends js.Object {
  @js.native
  class Circle protected () extends CircleMarker {
    def this(shape: Circle) = this()
    def this(shape: Circle, options: EditSimpleShapeOptions) = this()
  }
  
  @js.native
  class CircleMarker protected () extends SimpleShape {
    def this(shape: CircleMarker) = this()
    def this(shape: CircleMarker, options: EditSimpleShapeOptions) = this()
  }
  
  @js.native
  class Marker protected () extends Handler {
    def this(marker: Marker) = this()
    def this(marker: Marker, options: js.Object) = this()
  }
  
  @js.native
  class PolyVerticesEdit protected () extends Handler {
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression]) = this()
    def this(poly: Polyline, latlngs: js.Array[LatLngExpression], options: EditPolyVerticesEditOptions) = this()
    def updateMarkers(): Unit = js.native
  }
  
  @js.native
  class Polyline protected () extends Handler {
    def this(polyline: typingsJapgolly.leafletDraw.mod.Draw.Polyline) = this()
    def updateMarkers(): Unit = js.native
  }
  
  @js.native
  class Rectangle protected () extends SimpleShape {
    def this(shape: Rectangle) = this()
    def this(shape: Rectangle, options: EditSimpleShapeOptions) = this()
  }
  
  @js.native
  class SimpleShape protected () extends Handler {
    def this(shape: SimpleShape) = this()
    def this(shape: SimpleShape, options: EditSimpleShapeOptions) = this()
    def updateMarkers(): Unit = js.native
  }
  
}

