package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaConnectionMarker
  extends StObject
     with IPanoramaConnection
     with IPanoramaMarker
object IPanoramaConnectionMarker {
  
  inline def apply(
    getConnectedPanorama: CallbackTo[js.Promise[IPanorama]],
    getIconSet: CallbackTo[js.Promise[IPanoramaMarkerIconSet]],
    getPanorama: CallbackTo[IPanorama],
    getPosition: CallbackTo[js.Array[Double]],
    properties: Manager
  ): IPanoramaConnectionMarker = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama.toJsFn, getIconSet = getIconSet.toJsFn, getPanorama = getPanorama.toJsFn, getPosition = getPosition.toJsFn, properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionMarker]
  }
}
