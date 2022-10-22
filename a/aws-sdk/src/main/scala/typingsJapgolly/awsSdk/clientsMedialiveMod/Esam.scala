package typingsJapgolly.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Esam extends StObject {
  
  /**
    * Sent as acquisitionPointIdentity to identify the MediaLive channel to the POIS.
    */
  var AcquisitionPointId: stringMax256
  
  /**
    * When specified, this offset (in milliseconds) is added to the input Ad Avail PTS time. This only applies to embedded SCTE 104/35 messages and does not apply to OOB messages.
    */
  var AdAvailOffset: js.UndefOr[integerMinNegative1000Max1000] = js.undefined
  
  /**
    * Password if credentials are required to access the POIS endpoint.  This is a reference to an AWS parameter store name from which the password can be retrieved.  AWS Parameter store format: "ssm://"
    */
  var PasswordParam: js.UndefOr[string] = js.undefined
  
  /**
    * The URL of the signal conditioner endpoint on the Placement Opportunity Information System (POIS). MediaLive sends SignalProcessingEvents here when SCTE-35 messages are read.
    */
  var PoisEndpoint: string
  
  /**
    * Username if credentials are required to access the POIS endpoint.  This can be either a plaintext username, or a reference to an AWS parameter store name from which the username can be retrieved.  AWS Parameter store format: "ssm://"
    */
  var Username: js.UndefOr[string] = js.undefined
  
  /**
    * Optional data sent as zoneIdentity to identify the MediaLive channel to the POIS.
    */
  var ZoneIdentity: js.UndefOr[stringMax256] = js.undefined
}
object Esam {
  
  inline def apply(AcquisitionPointId: stringMax256, PoisEndpoint: string): Esam = {
    val __obj = js.Dynamic.literal(AcquisitionPointId = AcquisitionPointId.asInstanceOf[js.Any], PoisEndpoint = PoisEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[Esam]
  }
  
  extension [Self <: Esam](x: Self) {
    
    inline def setAcquisitionPointId(value: stringMax256): Self = StObject.set(x, "AcquisitionPointId", value.asInstanceOf[js.Any])
    
    inline def setAdAvailOffset(value: integerMinNegative1000Max1000): Self = StObject.set(x, "AdAvailOffset", value.asInstanceOf[js.Any])
    
    inline def setAdAvailOffsetUndefined: Self = StObject.set(x, "AdAvailOffset", js.undefined)
    
    inline def setPasswordParam(value: string): Self = StObject.set(x, "PasswordParam", value.asInstanceOf[js.Any])
    
    inline def setPasswordParamUndefined: Self = StObject.set(x, "PasswordParam", js.undefined)
    
    inline def setPoisEndpoint(value: string): Self = StObject.set(x, "PoisEndpoint", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: string): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
    
    inline def setZoneIdentity(value: stringMax256): Self = StObject.set(x, "ZoneIdentity", value.asInstanceOf[js.Any])
    
    inline def setZoneIdentityUndefined: Self = StObject.set(x, "ZoneIdentity", js.undefined)
  }
}
