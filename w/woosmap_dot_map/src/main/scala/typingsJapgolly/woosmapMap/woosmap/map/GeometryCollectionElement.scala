package typingsJapgolly.woosmapMap.woosmap.map

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.woosmapMap.woosmap.map.Data_.LineString
import typingsJapgolly.woosmapMap.woosmap.map.Data_.LinearRing
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.Point
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPoint
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.LineString
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiLineString
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon
  - typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPolygon
*/
trait GeometryCollectionElement
  extends StObject
     with GeometryClasses
object GeometryCollectionElement {
  
  inline def LineString(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    getArray: CallbackTo[js.Array[LatLng]],
    getAt: Double => LatLng,
    getLength: CallbackTo[Double],
    getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.LineString]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.LineString = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.LineString]
  }
  
  inline def MultiLineString(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    getArray: CallbackTo[js.Array[LineString]],
    getAt: Double => LineString,
    getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiLineString]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiLineString = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiLineString]
  }
  
  inline def MultiPoint(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    getArray: CallbackTo[js.Array[LatLng]],
    getAt: Double => LatLng,
    getLength: CallbackTo[Double],
    getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.MultiPoint]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPoint = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPoint]
  }
  
  inline def MultiPolygon(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    getArray: CallbackTo[js.Array[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]],
    getAt: Double => typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon,
    getLength: CallbackTo[Double],
    getType: CallbackTo[String]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPolygon = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.MultiPolygon]
  }
  
  inline def Point(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    get: CallbackTo[LatLng],
    getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Point]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.Point = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), get = get.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.Point]
  }
  
  inline def Polygon(
    forEachLatLng: js.Function1[/* point */ LatLng, Unit] => Callback,
    getArray: CallbackTo[js.Array[LinearRing]],
    getAt: Double => LinearRing,
    getLength: CallbackTo[Double],
    getType: CallbackTo[typingsJapgolly.woosmapMap.woosmapMapStrings.Polygon]
  ): typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon = {
    val __obj = js.Dynamic.literal(forEachLatLng = js.Any.fromFunction1((t0: js.Function1[/* point */ LatLng, Unit]) => forEachLatLng(t0).runNow()), getArray = getArray.toJsFn, getAt = js.Any.fromFunction1(getAt), getLength = getLength.toJsFn, getType = getType.toJsFn)
    __obj.asInstanceOf[typingsJapgolly.woosmapMap.woosmap.map.Data_.Polygon]
  }
}
