package typingsJapgolly.maximMazurokGapiClientTranscoder.gapi.client.transcoder

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Audio extends StObject {
  
  /** Enable boosting high frequency components. The default is `false`. **Note:** This field is not supported. */
  var highBoost: js.UndefOr[Boolean] = js.undefined
  
  /** Enable boosting low frequency components. The default is `false`. **Note:** This field is not supported. */
  var lowBoost: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify audio loudness normalization in loudness units relative to full scale (LUFS). Enter a value between -24 and 0 (the default), where: * -24 is the Advanced Television Systems
    * Committee (ATSC A/85) standard * -23 is the EU R128 broadcast standard * -19 is the prior standard for online mono audio * -18 is the ReplayGain standard * -16 is the prior standard
    * for stereo audio * -14 is the new online audio standard recommended by Spotify, as well as Amazon Echo * 0 disables normalization
    */
  var lufs: js.UndefOr[Double] = js.undefined
}
object Audio {
  
  inline def apply(): Audio = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Audio]
  }
  
  extension [Self <: Audio](x: Self) {
    
    inline def setHighBoost(value: Boolean): Self = StObject.set(x, "highBoost", value.asInstanceOf[js.Any])
    
    inline def setHighBoostUndefined: Self = StObject.set(x, "highBoost", js.undefined)
    
    inline def setLowBoost(value: Boolean): Self = StObject.set(x, "lowBoost", value.asInstanceOf[js.Any])
    
    inline def setLowBoostUndefined: Self = StObject.set(x, "lowBoost", js.undefined)
    
    inline def setLufs(value: Double): Self = StObject.set(x, "lufs", value.asInstanceOf[js.Any])
    
    inline def setLufsUndefined: Self = StObject.set(x, "lufs", js.undefined)
  }
}
