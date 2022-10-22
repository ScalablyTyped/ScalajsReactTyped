package typingsJapgolly.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateIPSetRequest extends StObject {
  
  /**
    * A Boolean value that indicates whether GuardDuty is to start using the uploaded IPSet.
    */
  var Activate: Boolean
  
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typingsJapgolly.awsSdk.clientsGuarddutyMod.ClientToken] = js.undefined
  
  /**
    * The unique ID of the detector of the GuardDuty account that you want to create an IPSet for.
    */
  var DetectorId: typingsJapgolly.awsSdk.clientsGuarddutyMod.DetectorId
  
  /**
    * The format of the file that contains the IPSet.
    */
  var Format: IpSetFormat
  
  /**
    * The URI of the file that contains the IPSet. 
    */
  var Location: typingsJapgolly.awsSdk.clientsGuarddutyMod.Location
  
  /**
    * The user-friendly name to identify the IPSet.  Allowed characters are alphanumerics, spaces, hyphens (-), and underscores (_).
    */
  var Name: typingsJapgolly.awsSdk.clientsGuarddutyMod.Name
  
  /**
    * The tags to be added to a new IP set resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}
object CreateIPSetRequest {
  
  inline def apply(Activate: Boolean, DetectorId: DetectorId, Format: IpSetFormat, Location: Location, Name: Name): CreateIPSetRequest = {
    val __obj = js.Dynamic.literal(Activate = Activate.asInstanceOf[js.Any], DetectorId = DetectorId.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Location = Location.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIPSetRequest]
  }
  
  extension [Self <: CreateIPSetRequest](x: Self) {
    
    inline def setActivate(value: Boolean): Self = StObject.set(x, "Activate", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDetectorId(value: DetectorId): Self = StObject.set(x, "DetectorId", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: IpSetFormat): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setLocation(value: Location): Self = StObject.set(x, "Location", value.asInstanceOf[js.Any])
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
  }
}
