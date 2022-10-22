package typingsJapgolly.baidumapWebSdk.BMap

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.baidumapWebSdk.anon.Content
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomLayer
  extends StObject
     with TileLayer {
  
  def onhotspotclick(event: Content): Unit
}
object CustomLayer {
  
  inline def apply(
    getCopyright: CallbackTo[Copyright],
    getTilesUrl: (Pixel, Double) => String,
    isTransparentPng: CallbackTo[Boolean],
    onhotspotclick: Content => japgolly.scalajs.react.Callback
  ): CustomLayer = {
    val __obj = js.Dynamic.literal(getCopyright = getCopyright.toJsFn, getTilesUrl = js.Any.fromFunction2(getTilesUrl), isTransparentPng = isTransparentPng.toJsFn, onhotspotclick = js.Any.fromFunction1((t0: Content) => onhotspotclick(t0).runNow()))
    __obj.asInstanceOf[CustomLayer]
  }
  
  extension [Self <: CustomLayer](x: Self) {
    
    inline def setOnhotspotclick(value: Content => japgolly.scalajs.react.Callback): Self = StObject.set(x, "onhotspotclick", js.Any.fromFunction1((t0: Content) => value(t0).runNow()))
  }
}
