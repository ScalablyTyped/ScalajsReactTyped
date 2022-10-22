package typingsJapgolly.mapbox.mod.global.L.mapbox

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FeatureGroup<ILayer> * / any */ trait FeatureLayer_ extends StObject {
  
  /**
    * Gets the filter function for this data layer.
    */
  def getFilter(): FilterFunction
  
  /**
    * Get the contents of this layer as GeoJSON data.
    */
  def getGeoJSON(): Any
  
  /**
    * Load marker GeoJSON data from a map with the given id on Mapbox.
    */
  def loadID(id: String): Any
  
  /**
    * Load GeoJSON data for this layer from the URL given by url.
    */
  def loadURL(url: String): Any
  
  /**
    * Sets the filter function for this data layer.
    */
  def setFilter(filter: FilterFunction): Any
  
  /**
    * Set the contents of a markers layer: run the provided features through
    * the filter function and then through the factory function to create
    * elements for the map. If the layer already has features, they are
    * replaced with the new features. An empty array will clear the
    * layer of all features.
    */
  def setGeoJSON(geojson: Any): FeatureLayer_
}
object FeatureLayer_ {
  
  inline def apply(
    getFilter: CallbackTo[FilterFunction],
    getGeoJSON: CallbackTo[Any],
    loadID: String => Any,
    loadURL: String => Any,
    setFilter: FilterFunction => Any,
    setGeoJSON: Any => FeatureLayer_
  ): FeatureLayer_ = {
    val __obj = js.Dynamic.literal(getFilter = getFilter.toJsFn, getGeoJSON = getGeoJSON.toJsFn, loadID = js.Any.fromFunction1(loadID), loadURL = js.Any.fromFunction1(loadURL), setFilter = js.Any.fromFunction1(setFilter), setGeoJSON = js.Any.fromFunction1(setGeoJSON))
    __obj.asInstanceOf[FeatureLayer_]
  }
  
  extension [Self <: FeatureLayer_](x: Self) {
    
    inline def setGetFilter(value: CallbackTo[FilterFunction]): Self = StObject.set(x, "getFilter", value.toJsFn)
    
    inline def setGetGeoJSON(value: CallbackTo[Any]): Self = StObject.set(x, "getGeoJSON", value.toJsFn)
    
    inline def setLoadID(value: String => Any): Self = StObject.set(x, "loadID", js.Any.fromFunction1(value))
    
    inline def setLoadURL(value: String => Any): Self = StObject.set(x, "loadURL", js.Any.fromFunction1(value))
    
    inline def setSetFilter(value: FilterFunction => Any): Self = StObject.set(x, "setFilter", js.Any.fromFunction1(value))
    
    inline def setSetGeoJSON(value: Any => FeatureLayer_): Self = StObject.set(x, "setGeoJSON", js.Any.fromFunction1(value))
  }
}
