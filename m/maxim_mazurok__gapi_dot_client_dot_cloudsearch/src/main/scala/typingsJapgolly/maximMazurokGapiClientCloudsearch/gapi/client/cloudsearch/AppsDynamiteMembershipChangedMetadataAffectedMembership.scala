package typingsJapgolly.maximMazurokGapiClientCloudsearch.gapi.client.cloudsearch

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AppsDynamiteMembershipChangedMetadataAffectedMembership extends StObject {
  
  var affectedMember: js.UndefOr[AppsDynamiteMemberId] = js.undefined
  
  var priorMembershipRole: js.UndefOr[String] = js.undefined
  
  var priorMembershipState: js.UndefOr[String] = js.undefined
  
  var targetMembershipRole: js.UndefOr[String] = js.undefined
}
object AppsDynamiteMembershipChangedMetadataAffectedMembership {
  
  inline def apply(): AppsDynamiteMembershipChangedMetadataAffectedMembership = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppsDynamiteMembershipChangedMetadataAffectedMembership]
  }
  
  extension [Self <: AppsDynamiteMembershipChangedMetadataAffectedMembership](x: Self) {
    
    inline def setAffectedMember(value: AppsDynamiteMemberId): Self = StObject.set(x, "affectedMember", value.asInstanceOf[js.Any])
    
    inline def setAffectedMemberUndefined: Self = StObject.set(x, "affectedMember", js.undefined)
    
    inline def setPriorMembershipRole(value: String): Self = StObject.set(x, "priorMembershipRole", value.asInstanceOf[js.Any])
    
    inline def setPriorMembershipRoleUndefined: Self = StObject.set(x, "priorMembershipRole", js.undefined)
    
    inline def setPriorMembershipState(value: String): Self = StObject.set(x, "priorMembershipState", value.asInstanceOf[js.Any])
    
    inline def setPriorMembershipStateUndefined: Self = StObject.set(x, "priorMembershipState", js.undefined)
    
    inline def setTargetMembershipRole(value: String): Self = StObject.set(x, "targetMembershipRole", value.asInstanceOf[js.Any])
    
    inline def setTargetMembershipRoleUndefined: Self = StObject.set(x, "targetMembershipRole", js.undefined)
  }
}
