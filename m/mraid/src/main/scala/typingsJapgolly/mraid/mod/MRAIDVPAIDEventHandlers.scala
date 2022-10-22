package typingsJapgolly.mraid.mod

import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MRAIDVPAIDEventHandlers extends StObject {
  
  def AdClickThru(url: String, id: String, playerHandles: Boolean): Unit
  
  def AdError(message: String): Unit
  
  def AdImpression(): Unit
  
  def AdPaused(): Unit
  
  def AdPlaying(): Unit
  
  def AdVideoComplete(): Unit
  
  def AdVideoFirstQuartile(): Unit
  
  def AdVideoMidpoint(): Unit
  
  def AdVideoStart(): Unit
  
  def AdVideoThirdQuartile(): Unit
}
object MRAIDVPAIDEventHandlers {
  
  inline def apply(
    AdClickThru: (String, String, Boolean) => Callback,
    AdError: String => Callback,
    AdImpression: Callback,
    AdPaused: Callback,
    AdPlaying: Callback,
    AdVideoComplete: Callback,
    AdVideoFirstQuartile: Callback,
    AdVideoMidpoint: Callback,
    AdVideoStart: Callback,
    AdVideoThirdQuartile: Callback
  ): MRAIDVPAIDEventHandlers = {
    val __obj = js.Dynamic.literal(AdClickThru = js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (AdClickThru(t0, t1, t2)).runNow()), AdError = js.Any.fromFunction1((t0: String) => AdError(t0).runNow()), AdImpression = AdImpression.toJsFn, AdPaused = AdPaused.toJsFn, AdPlaying = AdPlaying.toJsFn, AdVideoComplete = AdVideoComplete.toJsFn, AdVideoFirstQuartile = AdVideoFirstQuartile.toJsFn, AdVideoMidpoint = AdVideoMidpoint.toJsFn, AdVideoStart = AdVideoStart.toJsFn, AdVideoThirdQuartile = AdVideoThirdQuartile.toJsFn)
    __obj.asInstanceOf[MRAIDVPAIDEventHandlers]
  }
  
  extension [Self <: MRAIDVPAIDEventHandlers](x: Self) {
    
    inline def setAdClickThru(value: (String, String, Boolean) => Callback): Self = StObject.set(x, "AdClickThru", js.Any.fromFunction3((t0: String, t1: String, t2: Boolean) => (value(t0, t1, t2)).runNow()))
    
    inline def setAdError(value: String => Callback): Self = StObject.set(x, "AdError", js.Any.fromFunction1((t0: String) => value(t0).runNow()))
    
    inline def setAdImpression(value: Callback): Self = StObject.set(x, "AdImpression", value.toJsFn)
    
    inline def setAdPaused(value: Callback): Self = StObject.set(x, "AdPaused", value.toJsFn)
    
    inline def setAdPlaying(value: Callback): Self = StObject.set(x, "AdPlaying", value.toJsFn)
    
    inline def setAdVideoComplete(value: Callback): Self = StObject.set(x, "AdVideoComplete", value.toJsFn)
    
    inline def setAdVideoFirstQuartile(value: Callback): Self = StObject.set(x, "AdVideoFirstQuartile", value.toJsFn)
    
    inline def setAdVideoMidpoint(value: Callback): Self = StObject.set(x, "AdVideoMidpoint", value.toJsFn)
    
    inline def setAdVideoStart(value: Callback): Self = StObject.set(x, "AdVideoStart", value.toJsFn)
    
    inline def setAdVideoThirdQuartile(value: Callback): Self = StObject.set(x, "AdVideoThirdQuartile", value.toJsFn)
  }
}
