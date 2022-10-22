package typingsJapgolly.winrtUwp.Windows.Media.MediaProperties

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Describes the format of a video stream. */
trait VideoEncodingProperties extends StObject {
  
  /** Gets or sets the video bit rate. */
  var bitrate: Double
  
  /** Gets or sets the video frame rate. */
  var frameRate: MediaRatio
  
  /**
    * Gets the media format user data.
    * @return Receives the media format data.
    */
  def getFormatUserData(): js.Array[Double]
  
  /** Gets or sets the video image height. */
  var height: Double
  
  /** Gets or sets the pixel aspect ratio. */
  var pixelAspectRatio: MediaRatio
  
  /** Gets or sets the media format profile. */
  var profileId: Double
  
  /** Gets additional format properties for the video stream. */
  var properties: MediaPropertySet
  
  /**
    * Sets the media format user data.
    * @param value The media data to set.
    */
  def setFormatUserData(value: js.Array[Double]): Unit
  
  /** Gets or sets the subtype of the format. */
  var subtype: String
  
  /** Gets the format type. */
  var `type`: String
  
  /** Gets or sets the video image width. */
  var width: Double
}
object VideoEncodingProperties {
  
  inline def apply(
    bitrate: Double,
    frameRate: MediaRatio,
    getFormatUserData: CallbackTo[js.Array[Double]],
    height: Double,
    pixelAspectRatio: MediaRatio,
    profileId: Double,
    properties: MediaPropertySet,
    setFormatUserData: js.Array[Double] => Callback,
    subtype: String,
    `type`: String,
    width: Double
  ): VideoEncodingProperties = {
    val __obj = js.Dynamic.literal(bitrate = bitrate.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], getFormatUserData = getFormatUserData.toJsFn, height = height.asInstanceOf[js.Any], pixelAspectRatio = pixelAspectRatio.asInstanceOf[js.Any], profileId = profileId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], setFormatUserData = js.Any.fromFunction1((t0: js.Array[Double]) => setFormatUserData(t0).runNow()), subtype = subtype.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VideoEncodingProperties]
  }
  
  extension [Self <: VideoEncodingProperties](x: Self) {
    
    inline def setBitrate(value: Double): Self = StObject.set(x, "bitrate", value.asInstanceOf[js.Any])
    
    inline def setFrameRate(value: MediaRatio): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
    
    inline def setGetFormatUserData(value: CallbackTo[js.Array[Double]]): Self = StObject.set(x, "getFormatUserData", value.toJsFn)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setPixelAspectRatio(value: MediaRatio): Self = StObject.set(x, "pixelAspectRatio", value.asInstanceOf[js.Any])
    
    inline def setProfileId(value: Double): Self = StObject.set(x, "profileId", value.asInstanceOf[js.Any])
    
    inline def setProperties(value: MediaPropertySet): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setSetFormatUserData(value: js.Array[Double] => Callback): Self = StObject.set(x, "setFormatUserData", js.Any.fromFunction1((t0: js.Array[Double]) => value(t0).runNow()))
    
    inline def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
