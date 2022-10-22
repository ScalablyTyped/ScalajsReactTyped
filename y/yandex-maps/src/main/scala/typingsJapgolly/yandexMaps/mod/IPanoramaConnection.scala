package typingsJapgolly.yandexMaps.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaConnection extends StObject {
  
  def getConnectedPanorama(): js.Promise[IPanorama]
}
object IPanoramaConnection {
  
  inline def apply(getConnectedPanorama: CallbackTo[js.Promise[IPanorama]]): IPanoramaConnection = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = getConnectedPanorama.toJsFn)
    __obj.asInstanceOf[IPanoramaConnection]
  }
  
  extension [Self <: IPanoramaConnection](x: Self) {
    
    inline def setGetConnectedPanorama(value: CallbackTo[js.Promise[IPanorama]]): Self = StObject.set(x, "getConnectedPanorama", value.toJsFn)
  }
}
