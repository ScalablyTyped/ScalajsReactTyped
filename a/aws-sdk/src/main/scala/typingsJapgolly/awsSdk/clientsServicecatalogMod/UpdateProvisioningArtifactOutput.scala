package typingsJapgolly.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProvisioningArtifactOutput extends StObject {
  
  /**
    * The URL of the CloudFormation template in Amazon S3, Amazon Web Services CodeCommit, or GitHub in JSON format.
    */
  var Info: js.UndefOr[ProvisioningArtifactInfo] = js.undefined
  
  /**
    * Information about the provisioning artifact.
    */
  var ProvisioningArtifactDetail: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.ProvisioningArtifactDetail] = js.undefined
  
  /**
    * The status of the current request.
    */
  var Status: js.UndefOr[typingsJapgolly.awsSdk.clientsServicecatalogMod.Status] = js.undefined
}
object UpdateProvisioningArtifactOutput {
  
  inline def apply(): UpdateProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateProvisioningArtifactOutput]
  }
  
  extension [Self <: UpdateProvisioningArtifactOutput](x: Self) {
    
    inline def setInfo(value: ProvisioningArtifactInfo): Self = StObject.set(x, "Info", value.asInstanceOf[js.Any])
    
    inline def setInfoUndefined: Self = StObject.set(x, "Info", js.undefined)
    
    inline def setProvisioningArtifactDetail(value: ProvisioningArtifactDetail): Self = StObject.set(x, "ProvisioningArtifactDetail", value.asInstanceOf[js.Any])
    
    inline def setProvisioningArtifactDetailUndefined: Self = StObject.set(x, "ProvisioningArtifactDetail", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
