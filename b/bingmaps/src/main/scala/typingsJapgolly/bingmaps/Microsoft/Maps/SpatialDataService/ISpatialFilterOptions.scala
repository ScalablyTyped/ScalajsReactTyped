package typingsJapgolly.bingmaps.Microsoft.Maps.SpatialDataService

import typingsJapgolly.bingmaps.Microsoft.Maps.IPrimitive
import typingsJapgolly.bingmaps.Microsoft.Maps.Location
import typingsJapgolly.bingmaps.Microsoft.Maps.LocationRect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISpatialFilterOptions extends StObject {
  
  /** End location of the route (only for nearroute filter). */
  var end: js.UndefOr[String | Location] = js.undefined
  
  /** Intersection object. Can be a well known text string or a LocationRect object (only for intersects filter). */
  var intersects: js.UndefOr[String | LocationRect | IPrimitive] = js.undefined
  
  /** Location at which the filter should be applied (only for nearby filter). */
  var location: js.UndefOr[String | Location] = js.undefined
  
  /** 
    * Radius to use when performing a nearby search. The distance in kilometers and must be between 0.16 and 1000 kilometers
    * (only for nearby filter).
    */
  var radius: js.UndefOr[Double] = js.undefined
  
  /** 
    * One of the following values:
    * • nearby – Searches in a radius around a location.
    * • nearRoute – Searches for results that are within 1 mile of a route.
    * • intersects – Searches for results that intersect with the specified geometry.
    * Note: Note that the NavteqNA and NavteqEU data sources only support nearby queries.
    */
  var spatialFilterType: String
  
  /** Start location of the route (only for nearroute filter). */
  var start: js.UndefOr[String | Location] = js.undefined
}
object ISpatialFilterOptions {
  
  inline def apply(spatialFilterType: String): ISpatialFilterOptions = {
    val __obj = js.Dynamic.literal(spatialFilterType = spatialFilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISpatialFilterOptions]
  }
  
  extension [Self <: ISpatialFilterOptions](x: Self) {
    
    inline def setEnd(value: String | Location): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIntersects(value: String | LocationRect | IPrimitive): Self = StObject.set(x, "intersects", value.asInstanceOf[js.Any])
    
    inline def setIntersectsUndefined: Self = StObject.set(x, "intersects", js.undefined)
    
    inline def setLocation(value: String | Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
    
    inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
    
    inline def setSpatialFilterType(value: String): Self = StObject.set(x, "spatialFilterType", value.asInstanceOf[js.Any])
    
    inline def setStart(value: String | Location): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
