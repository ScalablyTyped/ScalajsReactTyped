package typingsJapgolly.awsSdk.clientsKendraMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberUser extends StObject {
  
  /**
    * The identifier of the user you want to map to a group.
    */
  var UserId: typingsJapgolly.awsSdk.clientsKendraMod.UserId
}
object MemberUser {
  
  inline def apply(UserId: UserId): MemberUser = {
    val __obj = js.Dynamic.literal(UserId = UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberUser]
  }
  
  extension [Self <: MemberUser](x: Self) {
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
  }
}
