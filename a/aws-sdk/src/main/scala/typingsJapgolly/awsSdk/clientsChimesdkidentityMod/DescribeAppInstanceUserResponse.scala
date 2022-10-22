package typingsJapgolly.awsSdk.clientsChimesdkidentityMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAppInstanceUserResponse extends StObject {
  
  /**
    * The name of the AppInstanceUser.
    */
  var AppInstanceUser: js.UndefOr[typingsJapgolly.awsSdk.clientsChimesdkidentityMod.AppInstanceUser] = js.undefined
}
object DescribeAppInstanceUserResponse {
  
  inline def apply(): DescribeAppInstanceUserResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAppInstanceUserResponse]
  }
  
  extension [Self <: DescribeAppInstanceUserResponse](x: Self) {
    
    inline def setAppInstanceUser(value: AppInstanceUser): Self = StObject.set(x, "AppInstanceUser", value.asInstanceOf[js.Any])
    
    inline def setAppInstanceUserUndefined: Self = StObject.set(x, "AppInstanceUser", js.undefined)
  }
}
