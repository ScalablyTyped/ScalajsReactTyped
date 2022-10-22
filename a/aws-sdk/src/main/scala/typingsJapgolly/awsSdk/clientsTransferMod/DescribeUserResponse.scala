package typingsJapgolly.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserResponse extends StObject {
  
  /**
    * A system-assigned unique identifier for a server that has this user assigned.
    */
  var ServerId: typingsJapgolly.awsSdk.clientsTransferMod.ServerId
  
  /**
    * An array containing the properties of the user account for the ServerID value that you specified.
    */
  var User: DescribedUser
}
object DescribeUserResponse {
  
  inline def apply(ServerId: ServerId, User: DescribedUser): DescribeUserResponse = {
    val __obj = js.Dynamic.literal(ServerId = ServerId.asInstanceOf[js.Any], User = User.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserResponse]
  }
  
  extension [Self <: DescribeUserResponse](x: Self) {
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
    
    inline def setUser(value: DescribedUser): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
  }
}
