package typingsJapgolly.mapboxMapboxGlDraw.mod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.geojson.mod.GeoJSON
import typingsJapgolly.geojson.mod.GeoJsonProperties
import typingsJapgolly.geojson.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawFeature extends StObject {
  
  def changed(): Unit
  
  var coordinates: Position
  
  def getCoordinates(): Position
  
  def incomingCoords(coords: Position): Unit
  
  var properties: GeoJsonProperties
  
  def setCoordinates(coords: Position): Unit
  
  def setProperty(property: String, value: Any): Unit
  
  def toGeoJSON(): GeoJSON
}
object DrawFeature {
  
  inline def apply(
    changed: Callback,
    coordinates: Position,
    getCoordinates: CallbackTo[Position],
    incomingCoords: Position => Callback,
    setCoordinates: Position => Callback,
    setProperty: (String, Any) => Callback,
    toGeoJSON: CallbackTo[GeoJSON]
  ): DrawFeature = {
    val __obj = js.Dynamic.literal(changed = changed.toJsFn, coordinates = coordinates.asInstanceOf[js.Any], getCoordinates = getCoordinates.toJsFn, incomingCoords = js.Any.fromFunction1((t0: Position) => incomingCoords(t0).runNow()), setCoordinates = js.Any.fromFunction1((t0: Position) => setCoordinates(t0).runNow()), setProperty = js.Any.fromFunction2((t0: String, t1: Any) => (setProperty(t0, t1)).runNow()), toGeoJSON = toGeoJSON.toJsFn, properties = null)
    __obj.asInstanceOf[DrawFeature]
  }
  
  extension [Self <: DrawFeature](x: Self) {
    
    inline def setChanged(value: Callback): Self = StObject.set(x, "changed", value.toJsFn)
    
    inline def setCoordinates(value: Position): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    
    inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
    
    inline def setGetCoordinates(value: CallbackTo[Position]): Self = StObject.set(x, "getCoordinates", value.toJsFn)
    
    inline def setIncomingCoords(value: Position => Callback): Self = StObject.set(x, "incomingCoords", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
    
    inline def setProperties(value: GeoJsonProperties): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesNull: Self = StObject.set(x, "properties", null)
    
    inline def setSetCoordinates(value: Position => Callback): Self = StObject.set(x, "setCoordinates", js.Any.fromFunction1((t0: Position) => value(t0).runNow()))
    
    inline def setSetProperty(value: (String, Any) => Callback): Self = StObject.set(x, "setProperty", js.Any.fromFunction2((t0: String, t1: Any) => (value(t0, t1)).runNow()))
    
    inline def setToGeoJSON(value: CallbackTo[GeoJSON]): Self = StObject.set(x, "toGeoJSON", value.toJsFn)
  }
}
