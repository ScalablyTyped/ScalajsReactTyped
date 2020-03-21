package typingsJapgolly.googleAppsScript.GoogleAppsScript.Maps

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Allows for direction finding, geocoding, elevation sampling and the creation of static map
  * images.
  */
trait Maps extends js.Object {
  var DirectionFinder: DirectionFinderEnums
  var StaticMap: StaticMapEnums
  def decodePolyline(polyline: String): js.Array[Double]
  def encodePolyline(points: js.Array[Double]): String
  def newDirectionFinder(): DirectionFinder
  def newElevationSampler(): ElevationSampler
  def newGeocoder(): Geocoder
  def newStaticMap(): StaticMap
  def setAuthentication(clientId: String, signingKey: String): Unit
}

object Maps {
  @scala.inline
  def apply(
    DirectionFinder: DirectionFinderEnums,
    StaticMap: StaticMapEnums,
    decodePolyline: String => CallbackTo[js.Array[Double]],
    encodePolyline: js.Array[Double] => CallbackTo[String],
    newDirectionFinder: CallbackTo[DirectionFinder],
    newElevationSampler: CallbackTo[ElevationSampler],
    newGeocoder: CallbackTo[Geocoder],
    newStaticMap: CallbackTo[StaticMap],
    setAuthentication: (String, String) => Callback
  ): Maps = {
    val __obj = js.Dynamic.literal(DirectionFinder = DirectionFinder.asInstanceOf[js.Any], StaticMap = StaticMap.asInstanceOf[js.Any])
    __obj.updateDynamic("decodePolyline")(js.Any.fromFunction1((t0: java.lang.String) => decodePolyline(t0).runNow()))
    __obj.updateDynamic("encodePolyline")(js.Any.fromFunction1((t0: js.Array[scala.Double]) => encodePolyline(t0).runNow()))
    __obj.updateDynamic("newDirectionFinder")(newDirectionFinder.toJsFn)
    __obj.updateDynamic("newElevationSampler")(newElevationSampler.toJsFn)
    __obj.updateDynamic("newGeocoder")(newGeocoder.toJsFn)
    __obj.updateDynamic("newStaticMap")(newStaticMap.toJsFn)
    __obj.updateDynamic("setAuthentication")(js.Any.fromFunction2((t0: java.lang.String, t1: java.lang.String) => setAuthentication(t0, t1).runNow()))
    __obj.asInstanceOf[Maps]
  }
}

