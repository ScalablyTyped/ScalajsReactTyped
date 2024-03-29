package typingsJapgolly.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateRoomMembershipRequest extends StObject {
  
  /**
    * The Amazon Chime account ID.
    */
  var AccountId: NonEmptyString
  
  /**
    * The member ID.
    */
  var MemberId: NonEmptyString
  
  /**
    * The role of the member.
    */
  var Role: js.UndefOr[RoomMembershipRole] = js.undefined
  
  /**
    * The room ID.
    */
  var RoomId: NonEmptyString
}
object UpdateRoomMembershipRequest {
  
  inline def apply(AccountId: NonEmptyString, MemberId: NonEmptyString, RoomId: NonEmptyString): UpdateRoomMembershipRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], MemberId = MemberId.asInstanceOf[js.Any], RoomId = RoomId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRoomMembershipRequest]
  }
  
  extension [Self <: UpdateRoomMembershipRequest](x: Self) {
    
    inline def setAccountId(value: NonEmptyString): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMemberId(value: NonEmptyString): Self = StObject.set(x, "MemberId", value.asInstanceOf[js.Any])
    
    inline def setRole(value: RoomMembershipRole): Self = StObject.set(x, "Role", value.asInstanceOf[js.Any])
    
    inline def setRoleUndefined: Self = StObject.set(x, "Role", js.undefined)
    
    inline def setRoomId(value: NonEmptyString): Self = StObject.set(x, "RoomId", value.asInstanceOf[js.Any])
  }
}
