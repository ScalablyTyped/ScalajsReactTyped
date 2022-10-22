package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceActionAssociation extends StObject {
  
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: Id
  
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: Id
  
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: Id
}
object ServiceActionAssociation {
  
  inline def apply(ProductId: Id, ProvisioningArtifactId: Id, ServiceActionId: Id): ServiceActionAssociation = {
    val __obj = js.Dynamic.literal(ProductId = ProductId.asInstanceOf[js.Any], ProvisioningArtifactId = ProvisioningArtifactId.asInstanceOf[js.Any], ServiceActionId = ServiceActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceActionAssociation]
  }
  
  extension [Self <: ServiceActionAssociation](x: Self) {
    
    inline def setProductId(value: Id): Self = StObject.set(x, "ProductId", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactId(value: Id): Self = StObject.set(x, "ProvisioningArtifactId", value.asInstanceOf[js.Any])
    
    inline def setServiceActionId(value: Id): Self = StObject.set(x, "ServiceActionId", value.asInstanceOf[js.Any])
  }
}
