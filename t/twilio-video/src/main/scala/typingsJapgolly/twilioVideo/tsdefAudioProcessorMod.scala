package typingsJapgolly.twilioVideo

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.MediaStreamTrack
import typingsJapgolly.twilioVideo.tsdefTypesMod.NoiseCancellationVendor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tsdefAudioProcessorMod {
  
  trait AudioProcessor extends StObject {
    
    /**
      * connects and cleans given stream
      * @returns {MediaStreamTrack} clean track
      */
    def connect(sourceTrack: MediaStreamTrack): MediaStreamTrack
    
    /**
      * destroys the processor freeing up any resources
      * @returns {void}
      */
    def destroy(): Unit
    
    /**
      * disables noise cancellation.
      * @returns {void}
      */
    def disable(): Unit
    
    /**
      * stops processing previously connected stream
      * @returns {void}
      */
    def disconnect(): Unit
    
    /**
      * enables noise cancellation.
      * @returns {void}
      */
    def enable(): Unit
    
    /**
      * checks if AudioProcessor is connected to a stream
      * @returns {boolean} true if a stream is connected.
      */
    def isConnected(): Boolean
    
    /**
      * checks if AudioProcessor is currently enabled
      * @returns {boolean} true if audio processor is enabled.
      */
    def isEnabled(): Boolean
    
    /**
      * checks if AudioProcessor is initialized (not destroyed)
      * @returns {boolean} true if audio processor is initialized.
      */
    def isInitialized(): Boolean
    
    /**
      * enables/disables logging
      * @param {boolean} [enable] - Specify true to enable logging
      * @returns {void}
      */
    def setLogging(enable: Boolean): Unit
    
    /**
      * @property {NoiseCancellationVendor} vendor
      */
    var vendor: NoiseCancellationVendor
  }
  object AudioProcessor {
    
    inline def apply(
      connect: MediaStreamTrack => MediaStreamTrack,
      destroy: Callback,
      disable: Callback,
      disconnect: Callback,
      enable: Callback,
      isConnected: CallbackTo[Boolean],
      isEnabled: CallbackTo[Boolean],
      isInitialized: CallbackTo[Boolean],
      setLogging: Boolean => Callback,
      vendor: NoiseCancellationVendor
    ): AudioProcessor = {
      val __obj = js.Dynamic.literal(connect = js.Any.fromFunction1(connect), destroy = destroy.toJsFn, disable = disable.toJsFn, disconnect = disconnect.toJsFn, enable = enable.toJsFn, isConnected = isConnected.toJsFn, isEnabled = isEnabled.toJsFn, isInitialized = isInitialized.toJsFn, setLogging = js.Any.fromFunction1((t0: Boolean) => setLogging(t0).runNow()), vendor = vendor.asInstanceOf[js.Any])
      __obj.asInstanceOf[AudioProcessor]
    }
    
    extension [Self <: AudioProcessor](x: Self) {
      
      inline def setConnect(value: MediaStreamTrack => MediaStreamTrack): Self = StObject.set(x, "connect", js.Any.fromFunction1(value))
      
      inline def setDestroy(value: Callback): Self = StObject.set(x, "destroy", value.toJsFn)
      
      inline def setDisable(value: Callback): Self = StObject.set(x, "disable", value.toJsFn)
      
      inline def setDisconnect(value: Callback): Self = StObject.set(x, "disconnect", value.toJsFn)
      
      inline def setEnable(value: Callback): Self = StObject.set(x, "enable", value.toJsFn)
      
      inline def setIsConnected(value: CallbackTo[Boolean]): Self = StObject.set(x, "isConnected", value.toJsFn)
      
      inline def setIsEnabled(value: CallbackTo[Boolean]): Self = StObject.set(x, "isEnabled", value.toJsFn)
      
      inline def setIsInitialized(value: CallbackTo[Boolean]): Self = StObject.set(x, "isInitialized", value.toJsFn)
      
      inline def setSetLogging(value: Boolean => Callback): Self = StObject.set(x, "setLogging", js.Any.fromFunction1((t0: Boolean) => value(t0).runNow()))
      
      inline def setVendor(value: NoiseCancellationVendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
    }
  }
}
