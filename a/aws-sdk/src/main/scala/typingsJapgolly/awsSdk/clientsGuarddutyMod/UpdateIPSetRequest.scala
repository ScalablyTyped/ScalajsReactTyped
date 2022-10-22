package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateIPSetRequest extends StObject {
  
  /**
    * The updated Boolean value that specifies whether the IPSet is active or not.
    */
  var Activate: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The detectorID that specifies the GuardDuty service whose IPSet you want to update.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var IpSetId: String
  
  /**
    * The updated URI of the file that contains the IPSet. 
    */
  var Location: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.Location] = js.undefined
  
  /**
    * The unique ID that specifies the IPSet that you want to update.
    */
  var Name: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.Name] = js.undefined
}
object UpdateIPSetRequest {
  
  inline def apply(DetectorId: DetectorId, IpSetId: String): UpdateIPSetRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId.asInstanceOf[js.Any], IpSetId = IpSetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateIPSetRequest]
  }
  
  extension [Self <: UpdateIPSetRequest](x: Self) {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "Activate", value.asInstanceOf[js.Any])
    
    inline def setActivateUndefined: Self = StObject.set(x, "Activate", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setIpSetId(value: String): Self = StObject.set(x, "IpSetId", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "Location", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
