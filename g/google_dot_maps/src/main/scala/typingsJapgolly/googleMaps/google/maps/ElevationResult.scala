package typingsJapgolly.googleMaps.google.maps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The result of an <code>ElevationService</code> request, consisting of the
  * set of elevation coordinates and their elevation values. Note that a single
  * request may produce multiple <code>ElevationResult</code>s.
  */
trait ElevationResult extends StObject {
  
  /**
    * The elevation of this point on Earth, in meters above sea level.
    */
  var elevation: Double
  
  /**
    * The location of this elevation result.
    */
  var location: LatLng | Null
  
  /**
    * The distance, in meters, between sample points from which the elevation
    * was interpolated. This property will be missing if the resolution is not
    * known. Note that elevation data becomes more coarse (larger
    * <code>resolution</code> values) when multiple points are passed. To
    * obtain the most accurate elevation value for a point, it should be
    * queried independently.
    */
  var resolution: Double
}
object ElevationResult {
  
  inline def apply(elevation: Double, resolution: Double): ElevationResult = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], resolution = resolution.asInstanceOf[js.Any], location = null)
    __obj.asInstanceOf[ElevationResult]
  }
  
  extension [Self <: ElevationResult](x: Self) {
    
    inline def setElevation(value: Double): Self = StObject.set(x, "elevation", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: LatLng): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationNull: Self = StObject.set(x, "location", null)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
  }
}
