package typingsJapgolly.jitsiMeet.mod

import typingsJapgolly.jitsiMeet.jitsiMeetBooleans.`false`
import typingsJapgolly.jitsiMeet.jitsiMeetInts.`0`
import typingsJapgolly.jitsiMeet.jitsiMeetInts.`1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigTesting extends StObject {
  
  var callStatsThreshold: js.UndefOr[Double] = js.undefined
  
  var capScreenshareBitrate: js.UndefOr[`0` | `1`] = js.undefined
  
  var disableE2EE: js.UndefOr[`false`] = js.undefined
  
  var noAutoPlayVideo: js.UndefOr[`false`] = js.undefined
  
  var p2pTestMode: js.UndefOr[`false`] = js.undefined
  
  var testMode: js.UndefOr[`false`] = js.undefined
}
object ConfigTesting {
  
  inline def apply(): ConfigTesting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigTesting]
  }
  
  extension [Self <: ConfigTesting](x: Self) {
    
    inline def setCallStatsThreshold(value: Double): Self = StObject.set(x, "callStatsThreshold", value.asInstanceOf[js.Any])
    
    inline def setCallStatsThresholdUndefined: Self = StObject.set(x, "callStatsThreshold", js.undefined)
    
    inline def setCapScreenshareBitrate(value: `0` | `1`): Self = StObject.set(x, "capScreenshareBitrate", value.asInstanceOf[js.Any])
    
    inline def setCapScreenshareBitrateUndefined: Self = StObject.set(x, "capScreenshareBitrate", js.undefined)
    
    inline def setDisableE2EE(value: `false`): Self = StObject.set(x, "disableE2EE", value.asInstanceOf[js.Any])
    
    inline def setDisableE2EEUndefined: Self = StObject.set(x, "disableE2EE", js.undefined)
    
    inline def setNoAutoPlayVideo(value: `false`): Self = StObject.set(x, "noAutoPlayVideo", value.asInstanceOf[js.Any])
    
    inline def setNoAutoPlayVideoUndefined: Self = StObject.set(x, "noAutoPlayVideo", js.undefined)
    
    inline def setP2pTestMode(value: `false`): Self = StObject.set(x, "p2pTestMode", value.asInstanceOf[js.Any])
    
    inline def setP2pTestModeUndefined: Self = StObject.set(x, "p2pTestMode", js.undefined)
    
    inline def setTestMode(value: `false`): Self = StObject.set(x, "testMode", value.asInstanceOf[js.Any])
    
    inline def setTestModeUndefined: Self = StObject.set(x, "testMode", js.undefined)
  }
}
