package typingsJapgolly.agoraRtcSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bitrate extends StObject {
  
  /**
    * The bitrate of the low-quality video stream frame in Kbps.
    *
    * A positive integer, and the value range is [1,10000000]. The default value is 50.
    */
  var bitrate: js.UndefOr[Double] = js.undefined
  
  /**
    * The frame rate of the low-quality video stream frame in fps.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 15.
    */
  var framerate: js.UndefOr[Double] = js.undefined
  
  /**
    * The height of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 120.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * The width of the low-quality video stream frame.
    *
    * A positive integer, and the value range is [1,10000]. The default value is 160.
    *
    * The width and height parameters are bound together, and take effect only when both are set. Otherwise, the SDK assigns the default values.
    */
  var width: js.UndefOr[Double] = js.undefined
}
object Bitrate {
  
  inline def apply(): Bitrate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bitrate]
  }
  
  extension [Self <: Bitrate](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setBitrateUndefined: Self = StObject.set(x, "bitrate", js.undefined)
    
    inline def setFramerate(value: Double): Self = StObject.set(x, "framerate", value.asInstanceOf[js.Any])
    
    inline def setFramerateUndefined: Self = StObject.set(x, "framerate", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
