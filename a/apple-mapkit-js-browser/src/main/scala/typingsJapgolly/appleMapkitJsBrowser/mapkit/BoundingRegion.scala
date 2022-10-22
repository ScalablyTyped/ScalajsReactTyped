package typingsJapgolly.appleMapkitJsBrowser.mapkit

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A rectangular area on a map, defined by coordinates of the rectangle's
  * northeast and southwest corners.
  */
trait BoundingRegion extends StObject {
  
  /**
    * Returns a copy of the calling bounding region.
    */
  def copy(): BoundingRegion
  
  /**
    * The east longitude of the bounding region.
    */
  var eastLongitude: Double
  
  /**
    * The north latitude of the bounding region.
    */
  var northLatitude: Double
  
  /**
    * The south latitude of the bounding region.
    */
  var southLatitude: Double
  
  /**
    * Returns the coordinate region that corresponds to the calling bounding region.
    */
  def toCoordinateRegion(): CoordinateRegion
  
  /**
    * The west longitude of the bounding region.
    */
  var westLongitude: Double
}
object BoundingRegion {
  
  inline def apply(
    copy: CallbackTo[BoundingRegion],
    eastLongitude: Double,
    northLatitude: Double,
    southLatitude: Double,
    toCoordinateRegion: CallbackTo[CoordinateRegion],
    westLongitude: Double
  ): BoundingRegion = {
    val __obj = js.Dynamic.literal(copy = copy.toJsFn, eastLongitude = eastLongitude.asInstanceOf[js.Any], northLatitude = northLatitude.asInstanceOf[js.Any], southLatitude = southLatitude.asInstanceOf[js.Any], toCoordinateRegion = toCoordinateRegion.toJsFn, westLongitude = westLongitude.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoundingRegion]
  }
  
  extension [Self <: BoundingRegion](x: Self) {
    
    inline def setCopy(value: CallbackTo[BoundingRegion]): Self = StObject.set(x, "copy", value.toJsFn)
    
    inline def setEastLongitude(value: Double): Self = StObject.set(x, "eastLongitude", value.asInstanceOf[js.Any])
    
    inline def setNorthLatitude(value: Double): Self = StObject.set(x, "northLatitude", value.asInstanceOf[js.Any])
    
    inline def setSouthLatitude(value: Double): Self = StObject.set(x, "southLatitude", value.asInstanceOf[js.Any])
    
    inline def setToCoordinateRegion(value: CallbackTo[CoordinateRegion]): Self = StObject.set(x, "toCoordinateRegion", value.toJsFn)
    
    inline def setWestLongitude(value: Double): Self = StObject.set(x, "westLongitude", value.asInstanceOf[js.Any])
  }
}
