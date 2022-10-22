package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends StObject {
  
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.FailedServiceActionAssociations] = js.undefined
}
object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
  
  inline def apply(): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
  }
  
  extension [Self <: BatchDisassociateServiceActionFromProvisioningArtifactOutput](x: Self) {
    
    inline def setFailedServiceActionAssociations(value: FailedServiceActionAssociations): Self = StObject.set(x, "FailedServiceActionAssociations", value.asInstanceOf[js.Any])
    
    inline def setFailedServiceActionAssociationsUndefined: Self = StObject.set(x, "FailedServiceActionAssociations", js.undefined)
    
    inline def setFailedServiceActionAssociationsVarargs(value: FailedServiceActionAssociation*): Self = StObject.set(x, "FailedServiceActionAssociations", js.Array(value*))
  }
}
