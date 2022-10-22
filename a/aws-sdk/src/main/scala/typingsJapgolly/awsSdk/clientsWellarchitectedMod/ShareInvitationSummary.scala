package typingsJapgolly.awsSdk.clientsWellarchitectedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShareInvitationSummary extends StObject {
  
  /**
    * The ARN for the lens.
    */
  var LensArn: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensArn] = js.undefined
  
  var LensName: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.LensName] = js.undefined
  
  var PermissionType: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.PermissionType] = js.undefined
  
  /**
    * The ID assigned to the share invitation.
    */
  var ShareInvitationId: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareInvitationId] = js.undefined
  
  /**
    * The resource type of the share invitation.
    */
  var ShareResourceType: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.ShareResourceType] = js.undefined
  
  var SharedBy: js.UndefOr[AwsAccountId] = js.undefined
  
  var SharedWith: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.SharedWith] = js.undefined
  
  var WorkloadId: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadId] = js.undefined
  
  var WorkloadName: js.UndefOr[typingsJapgolly.awsSdk.clientsWellarchitectedMod.WorkloadName] = js.undefined
}
object ShareInvitationSummary {
  
  inline def apply(): ShareInvitationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShareInvitationSummary]
  }
  
  extension [Self <: ShareInvitationSummary](x: Self) {
    
    inline def setLensArn(value: LensArn): Self = StObject.set(x, "LensArn", value.asInstanceOf[js.Any])
    
    inline def setLensArnUndefined: Self = StObject.set(x, "LensArn", js.undefined)
    
    inline def setLensName(value: LensName): Self = StObject.set(x, "LensName", value.asInstanceOf[js.Any])
    
    inline def setLensNameUndefined: Self = StObject.set(x, "LensName", js.undefined)
    
    inline def setPermissionType(value: PermissionType): Self = StObject.set(x, "PermissionType", value.asInstanceOf[js.Any])
    
    inline def setPermissionTypeUndefined: Self = StObject.set(x, "PermissionType", js.undefined)
    
    inline def setShareInvitationId(value: ShareInvitationId): Self = StObject.set(x, "ShareInvitationId", value.asInstanceOf[js.Any])
    
    inline def setShareInvitationIdUndefined: Self = StObject.set(x, "ShareInvitationId", js.undefined)
    
    inline def setShareResourceType(value: ShareResourceType): Self = StObject.set(x, "ShareResourceType", value.asInstanceOf[js.Any])
    
    inline def setShareResourceTypeUndefined: Self = StObject.set(x, "ShareResourceType", js.undefined)
    
    inline def setSharedBy(value: AwsAccountId): Self = StObject.set(x, "SharedBy", value.asInstanceOf[js.Any])
    
    inline def setSharedByUndefined: Self = StObject.set(x, "SharedBy", js.undefined)
    
    inline def setSharedWith(value: SharedWith): Self = StObject.set(x, "SharedWith", value.asInstanceOf[js.Any])
    
    inline def setSharedWithUndefined: Self = StObject.set(x, "SharedWith", js.undefined)
    
    inline def setWorkloadId(value: WorkloadId): Self = StObject.set(x, "WorkloadId", value.asInstanceOf[js.Any])
    
    inline def setWorkloadIdUndefined: Self = StObject.set(x, "WorkloadId", js.undefined)
    
    inline def setWorkloadName(value: WorkloadName): Self = StObject.set(x, "WorkloadName", value.asInstanceOf[js.Any])
    
    inline def setWorkloadNameUndefined: Self = StObject.set(x, "WorkloadName", js.undefined)
  }
}
