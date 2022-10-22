package typingsJapgolly.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait H265QvbrSettings extends StObject {
  
  /**
    * Use this setting only when Rate control mode is QVBR and Quality tuning level is Multi-pass HQ. For Max average bitrate values suited to the complexity of your input video, the service limits the average bitrate of the video part of this output to the value that you choose. That is, the total size of the video element is less than or equal to the value you set multiplied by the number of seconds of encoded output.
    */
  var MaxAverageBitrate: js.UndefOr[integerMin1000Max1466400000] = js.undefined
  
  /**
    * Use this setting only when you set Rate control mode (RateControlMode) to QVBR. Specify the target quality level for this output. MediaConvert determines the right number of bits to use for each part of the video to maintain the video quality that you specify. When you keep the default value, AUTO, MediaConvert picks a quality level for you, based on characteristics of your input video. If you prefer to specify a quality level, specify a number from 1 through 10. Use higher numbers for greater quality. Level 10 results in nearly lossless compression. The quality level for most broadcast-quality transcodes is between 6 and 9. Optionally, to specify a value between whole numbers, also provide a value for the setting qvbrQualityLevelFineTune. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33.
    */
  var QvbrQualityLevel: js.UndefOr[integerMin1Max10] = js.undefined
  
  /**
    * Optional. Specify a value here to set the QVBR quality to a level that is between whole numbers. For example, if you want your QVBR quality level to be 7.33, set qvbrQualityLevel to 7 and set qvbrQualityLevelFineTune to .33. MediaConvert rounds your QVBR quality level to the nearest third of a whole number. For example, if you set qvbrQualityLevel to 7 and you set qvbrQualityLevelFineTune to .25, your actual QVBR quality level is 7.33.
    */
  var QvbrQualityLevelFineTune: js.UndefOr[doubleMin0Max1] = js.undefined
}
object H265QvbrSettings {
  
  inline def apply(): H265QvbrSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[H265QvbrSettings]
  }
  
  extension [Self <: H265QvbrSettings](x: Self) {
    
    inline def setMaxAverageBitrate(value: integerMin1000Max1466400000): Self = StObject.set(x, "MaxAverageBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxAverageBitrateUndefined: Self = StObject.set(x, "MaxAverageBitrate", js.undefined)
    
    inline def setQvbrQualityLevel(value: integerMin1Max10): Self = StObject.set(x, "QvbrQualityLevel", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelFineTune(value: doubleMin0Max1): Self = StObject.set(x, "QvbrQualityLevelFineTune", value.asInstanceOf[js.Any])
    
    inline def setQvbrQualityLevelFineTuneUndefined: Self = StObject.set(x, "QvbrQualityLevelFineTune", js.undefined)
    
    inline def setQvbrQualityLevelUndefined: Self = StObject.set(x, "QvbrQualityLevel", js.undefined)
  }
}
