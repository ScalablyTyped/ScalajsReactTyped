package typingsJapgolly.awsSdk.clientsCodestarMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserProfileRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the user.
    */
  var userArn: UserArn
}
object DescribeUserProfileRequest {
  
  inline def apply(userArn: UserArn): DescribeUserProfileRequest = {
    val __obj = js.Dynamic.literal(userArn = userArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserProfileRequest]
  }
  
  extension [Self <: DescribeUserProfileRequest](x: Self) {
    
    inline def setUserArn(value: UserArn): Self = StObject.set(x, "userArn", value.asInstanceOf[js.Any])
  }
}
