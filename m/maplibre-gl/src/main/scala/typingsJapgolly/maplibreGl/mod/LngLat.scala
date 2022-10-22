package typingsJapgolly.maplibreGl.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("maplibre-gl", "LngLat")
@js.native
open class LngLat protected ()
  extends StObject
     with _LngLatLike {
  def this(lng: Double, lat: Double) = this()
  
  /**
  	 * Returns the approximate distance between a pair of coordinates in meters
  	 * Uses the Haversine Formula (from R.W. Sinnott, "Virtues of the Haversine", Sky and Telescope, vol. 68, no. 2, 1984, p. 159)
  	 *
  	 * @param {LngLat} lngLat coordinates to compute the distance to
  	 * @returns {number} Distance in meters between the two coordinates.
  	 * @example
  	 * var new_york = new maplibregl.LngLat(-74.0060, 40.7128);
  	 * var los_angeles = new maplibregl.LngLat(-118.2437, 34.0522);
  	 * new_york.distanceTo(los_angeles); // = 3935751.690893987, "true distance" using a non-spherical approximation is ~3966km
  	 */
  def distanceTo(lngLat: LngLat): Double = js.native
  
  var lat: Double = js.native
  
  var lng: Double = js.native
  
  /**
  	 * Returns the coordinates represented as an array of two numbers.
  	 *
  	 * @returns {Array<number>} The coordinates represeted as an array of longitude and latitude.
  	 * @example
  	 * var ll = new maplibregl.LngLat(-73.9749, 40.7736);
  	 * ll.toArray(); // = [-73.9749, 40.7736]
  	 */
  def toArray(): js.Array[Double] = js.native
  
  /**
  	 * Returns a `LngLatBounds` from the coordinates extended by a given `radius`. The returned `LngLatBounds` completely contains the `radius`.
  	 *
  	 * @param {number} [radius=0] Distance in meters from the coordinates to extend the bounds.
  	 * @returns {LngLatBounds} A new `LngLatBounds` object representing the coordinates extended by the `radius`.
  	 * @example
  	 * var ll = new maplibregl.LngLat(-73.9749, 40.7736);
  	 * ll.toBounds(100).toArray(); // = [[-73.97501862141328, 40.77351016847229], [-73.97478137858673, 40.77368983152771]]
  	 */
  def toBounds(): LngLatBounds = js.native
  def toBounds(radius: Double): LngLatBounds = js.native
  
  /**
  	 * Returns a new `LngLat` object whose longitude is wrapped to the range (-180, 180).
  	 *
  	 * @returns {LngLat} The wrapped `LngLat` object.
  	 * @example
  	 * var ll = new maplibregl.LngLat(286.0251, 40.7736);
  	 * var wrapped = ll.wrap();
  	 * wrapped.lng; // = -73.9749
  	 */
  def wrap(): LngLat = js.native
}
/* static members */
object LngLat {
  
  @JSImport("maplibre-gl", "LngLat")
  @js.native
  val ^ : js.Any = js.native
  
  /**
  	 * Converts an array of two numbers or an object with `lng` and `lat` or `lon` and `lat` properties
  	 * to a `LngLat` object.
  	 *
  	 * If a `LngLat` object is passed in, the function returns it unchanged.
  	 *
  	 * @param {LngLatLike} input An array of two numbers or object to convert, or a `LngLat` object to return.
  	 * @returns {LngLat} A new `LngLat` object, if a conversion occurred, or the original `LngLat` object.
  	 * @example
  	 * var arr = [-73.9749, 40.7736];
  	 * var ll = maplibregl.LngLat.convert(arr);
  	 * ll;   // = LngLat {lng: -73.9749, lat: 40.7736}
  	 */
  inline def convert(input: LngLatLike): LngLat = ^.asInstanceOf[js.Dynamic].applyDynamic("convert")(input.asInstanceOf[js.Any]).asInstanceOf[LngLat]
}
