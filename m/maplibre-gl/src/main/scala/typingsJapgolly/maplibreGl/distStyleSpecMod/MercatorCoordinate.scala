package typingsJapgolly.maplibreGl.distStyleSpecMod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MercatorCoordinate extends StObject {
  
  /**
  	 * Returns the distance of 1 meter in `MercatorCoordinate` units at this latitude.
  	 *
  	 * For coordinates in real world units using meters, this naturally provides the scale
  	 * to transform into `MercatorCoordinate`s.
  	 *
  	 * @returns {number} Distance of 1 meter in `MercatorCoordinate` units.
  	 */
  def meterInMercatorCoordinateUnits(): Double
  
  /**
  	 * Returns the altitude in meters of the coordinate.
  	 *
  	 * @returns {number} The altitude in meters.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0, 0, 0.02);
  	 * coord.toAltitude(); // 6914.281956295339
  	 */
  def toAltitude(): Double
  
  /**
  	 * Returns the `LngLat` for the coordinate.
  	 *
  	 * @returns {LngLat} The `LngLat` object.
  	 * @example
  	 * var coord = new maplibregl.MercatorCoordinate(0.5, 0.5, 0);
  	 * var lngLat = coord.toLngLat(); // LngLat(0, 0)
  	 */
  def toLngLat(): LngLat
  
  var x: Double
  
  var y: Double
  
  var z: Double
}
object MercatorCoordinate {
  
  inline def apply(
    meterInMercatorCoordinateUnits: CallbackTo[Double],
    toAltitude: CallbackTo[Double],
    toLngLat: CallbackTo[LngLat],
    x: Double,
    y: Double,
    z: Double
  ): MercatorCoordinate = {
    val __obj = js.Dynamic.literal(meterInMercatorCoordinateUnits = meterInMercatorCoordinateUnits.toJsFn, toAltitude = toAltitude.toJsFn, toLngLat = toLngLat.toJsFn, x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.asInstanceOf[MercatorCoordinate]
  }
  
  extension [Self <: MercatorCoordinate](x: Self) {
    
    inline def setMeterInMercatorCoordinateUnits(value: CallbackTo[Double]): Self = StObject.set(x, "meterInMercatorCoordinateUnits", value.toJsFn)
    
    inline def setToAltitude(value: CallbackTo[Double]): Self = StObject.set(x, "toAltitude", value.toJsFn)
    
    inline def setToLngLat(value: CallbackTo[LngLat]): Self = StObject.set(x, "toLngLat", value.toJsFn)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setZ(value: Double): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
