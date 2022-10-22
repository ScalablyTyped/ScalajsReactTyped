package typingsJapgolly.twilioVideo.tsdefTypesMod

import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MediaStreamTrack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseCancellation extends StObject {
  
  def disable(): js.Promise[Unit]
  
  def enable(): js.Promise[Unit]
  
  val isEnabled: Boolean
  
  val sourceTrack: MediaStreamTrack
  
  val vendor: NoiseCancellationVendor
}
object NoiseCancellation {
  
  inline def apply(
    disable: CallbackTo[js.Promise[Unit]],
    enable: CallbackTo[js.Promise[Unit]],
    isEnabled: Boolean,
    sourceTrack: MediaStreamTrack,
    vendor: NoiseCancellationVendor
  ): NoiseCancellation = {
    val __obj = js.Dynamic.literal(disable = disable.toJsFn, enable = enable.toJsFn, isEnabled = isEnabled.asInstanceOf[js.Any], sourceTrack = sourceTrack.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseCancellation]
  }
  
  extension [Self <: NoiseCancellation](x: Self) {
    
    inline def setDisable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "disable", value.toJsFn)
    
    inline def setEnable(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "enable", value.toJsFn)
    
    inline def setIsEnabled(value: Boolean): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setSourceTrack(value: MediaStreamTrack): Self = StObject.set(x, "sourceTrack", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: NoiseCancellationVendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
