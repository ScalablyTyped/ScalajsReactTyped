package typingsJapgolly.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableImportFindingsForProductRequest extends StObject {
  
  /**
    * The ARN of the integrated product to disable the integration for.
    */
  var ProductSubscriptionArn: NonEmptyString
}
object DisableImportFindingsForProductRequest {
  
  inline def apply(ProductSubscriptionArn: NonEmptyString): DisableImportFindingsForProductRequest = {
    val __obj = js.Dynamic.literal(ProductSubscriptionArn = ProductSubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableImportFindingsForProductRequest]
  }
  
  extension [Self <: DisableImportFindingsForProductRequest](x: Self) {
    
    inline def setProductSubscriptionArn(value: NonEmptyString): Self = StObject.set(x, "ProductSubscriptionArn", value.asInstanceOf[js.Any])
  }
}
