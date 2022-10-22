package typingsJapgolly.sparkpost.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransmissionOptions extends StObject {
  
  /** Whether click tracking is enabled for this transmission */
  var click_tracking: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to perform CSS inlining in HTML content */
  var inline_css: js.UndefOr[Boolean] = js.undefined
  
  /** The ID of a dedicated IP pool associated with your account ( Note: SparkPost only ). */
  var ip_pool: js.UndefOr[String] = js.undefined
  
  /** Whether open tracking is enabled for this transmission */
  var open_tracking: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to use the sandbox sending domain */
  var sandbox: js.UndefOr[Boolean] = js.undefined
  
  /** SparkPost Enterprise API only: Whether or not to ignore customer suppression rules, for this transmission only. Only applicable if your configuration supports this parameter. */
  var skip_suppression: js.UndefOr[Boolean] = js.undefined
  
  /** Delay generation of messages until this datetime. */
  var start_time: js.UndefOr[String] = js.undefined
  
  /** Whether message is transactional or non-transactional for unsubscribe and suppression purposes */
  var transactional: js.UndefOr[Boolean] = js.undefined
}
object TransmissionOptions {
  
  inline def apply(): TransmissionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransmissionOptions]
  }
  
  extension [Self <: TransmissionOptions](x: Self) {
    
    inline def setClick_tracking(value: Boolean): Self = StObject.set(x, "click_tracking", value.asInstanceOf[js.Any])
    
    inline def setClick_trackingUndefined: Self = StObject.set(x, "click_tracking", js.undefined)
    
    inline def setInline_css(value: Boolean): Self = StObject.set(x, "inline_css", value.asInstanceOf[js.Any])
    
    inline def setInline_cssUndefined: Self = StObject.set(x, "inline_css", js.undefined)
    
    inline def setIp_pool(value: String): Self = StObject.set(x, "ip_pool", value.asInstanceOf[js.Any])
    
    inline def setIp_poolUndefined: Self = StObject.set(x, "ip_pool", js.undefined)
    
    inline def setOpen_tracking(value: Boolean): Self = StObject.set(x, "open_tracking", value.asInstanceOf[js.Any])
    
    inline def setOpen_trackingUndefined: Self = StObject.set(x, "open_tracking", js.undefined)
    
    inline def setSandbox(value: Boolean): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
    
    inline def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
    
    inline def setSkip_suppression(value: Boolean): Self = StObject.set(x, "skip_suppression", value.asInstanceOf[js.Any])
    
    inline def setSkip_suppressionUndefined: Self = StObject.set(x, "skip_suppression", js.undefined)
    
    inline def setStart_time(value: String): Self = StObject.set(x, "start_time", value.asInstanceOf[js.Any])
    
    inline def setStart_timeUndefined: Self = StObject.set(x, "start_time", js.undefined)
    
    inline def setTransactional(value: Boolean): Self = StObject.set(x, "transactional", value.asInstanceOf[js.Any])
    
    inline def setTransactionalUndefined: Self = StObject.set(x, "transactional", js.undefined)
  }
}
