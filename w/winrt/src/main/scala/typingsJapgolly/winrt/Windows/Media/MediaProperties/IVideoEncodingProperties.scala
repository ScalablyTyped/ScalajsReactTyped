package typingsJapgolly.winrt.Windows.Media.MediaProperties

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVideoEncodingProperties
  extends StObject
     with IMediaEncodingProperties {
  
  var bitrate: Double
  
  var frameRate: MediaRatio
  
  var height: Double
  
  var pixelAspectRatio: MediaRatio
  
  var width: Double
}
object IVideoEncodingProperties {
  
  inline def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    height: Double,
    pixelAspectRatio: MediaRatio,
    properties: MediaPropertySet,
    subtype: String,
    `type`: String,
    width: Double
  ): IVideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IVideoEncodingProperties]
  }
  
  extension [Self <: IVideoEncodingProperties](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setFrameRate(value: MediaRatio): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPixelAspectRatio(value: MediaRatio): Self = StObject.set(x, "pixelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
