package typingsJapgolly.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteGroupMembershipRequest extends StObject {
  
  /**
    * The ID for the Amazon Web Services account that the group is in. Currently, you use the ID for the Amazon Web Services account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typingsJapgolly.awsSdk.clientsQuicksightMod.AwsAccountId
  
  /**
    * The name of the group that you want to delete the user from.
    */
  var GroupName: typingsJapgolly.awsSdk.clientsQuicksightMod.GroupName
  
  /**
    * The name of the user that you want to delete from the group membership.
    */
  var MemberName: GroupMemberName
  
  /**
    * The namespace of the group that you want to remove a user from.
    */
  var Namespace: typingsJapgolly.awsSdk.clientsQuicksightMod.Namespace
}
object DeleteGroupMembershipRequest {
  
  inline def apply(
    AwsAccountId: AwsAccountId,
    GroupName: GroupName,
    MemberName: GroupMemberName,
    Namespace: Namespace
  ): DeleteGroupMembershipRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], GroupName = GroupName.asInstanceOf[js.Any], MemberName = MemberName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteGroupMembershipRequest]
  }
  
  extension [Self <: DeleteGroupMembershipRequest](x: Self) {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
    
    inline def setGroupName(value: GroupName): Self = StObject.set(x, "GroupName", value.asInstanceOf[js.Any])
    
    inline def setMemberName(value: GroupMemberName): Self = StObject.set(x, "MemberName", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Namespace): Self = StObject.set(x, "Namespace", value.asInstanceOf[js.Any])
  }
}
