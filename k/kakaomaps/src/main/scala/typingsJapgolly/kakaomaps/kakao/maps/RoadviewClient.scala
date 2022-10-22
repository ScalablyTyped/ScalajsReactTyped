package typingsJapgolly.kakaomaps.kakao.maps

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadviewClient extends StObject {
  
  def getNearestPanoId(position: LatLng, radius: Double, callback: js.Function1[/* panoId */ Double, Unit]): Unit
}
object RoadviewClient {
  
  inline def apply(getNearestPanoId: (LatLng, Double, js.Function1[/* panoId */ Double, Unit]) => Callback): RoadviewClient = {
    val __obj = js.Dynamic.literal(getNearestPanoId = js.Any.fromFunction3((t0: LatLng, t1: Double, t2: js.Function1[/* panoId */ Double, Unit]) => (getNearestPanoId(t0, t1, t2)).runNow()))
    __obj.asInstanceOf[RoadviewClient]
  }
  
  extension [Self <: RoadviewClient](x: Self) {
    
    inline def setGetNearestPanoId(value: (LatLng, Double, js.Function1[/* panoId */ Double, Unit]) => Callback): Self = StObject.set(x, "getNearestPanoId", js.Any.fromFunction3((t0: LatLng, t1: Double, t2: js.Function1[/* panoId */ Double, Unit]) => (value(t0, t1, t2)).runNow()))
  }
}
