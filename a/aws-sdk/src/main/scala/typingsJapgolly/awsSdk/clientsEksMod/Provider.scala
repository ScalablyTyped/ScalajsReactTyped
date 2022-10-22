package typingsJapgolly.awsSdk.clientsEksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Provider extends StObject {
  
  /**
    * Amazon Resource Name (ARN) or alias of the KMS key. The KMS key must be symmetric, created in the same region as the cluster, and if the KMS key was created in a different account, the user must have access to the KMS key. For more information, see Allowing Users in Other Accounts to Use a KMS key in the Key Management Service Developer Guide.
    */
  var keyArn: js.UndefOr[String] = js.undefined
}
object Provider {
  
  inline def apply(): Provider = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Provider]
  }
  
  extension [Self <: Provider](x: Self) {
    
    inline def setKeyArn(value: String): Self = StObject.set(x, "keyArn", value.asInstanceOf[js.Any])
    
    inline def setKeyArnUndefined: Self = StObject.set(x, "keyArn", js.undefined)
  }
}
