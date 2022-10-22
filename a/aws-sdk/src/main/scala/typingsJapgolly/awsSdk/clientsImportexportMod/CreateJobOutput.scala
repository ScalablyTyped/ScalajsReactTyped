package typingsJapgolly.awsSdk.clientsImportexportMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateJobOutput extends StObject {
  
  var ArtifactList: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.ArtifactList] = js.undefined
  
  var JobId: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.JobId] = js.undefined
  
  var JobType: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.JobType] = js.undefined
  
  var Signature: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.Signature] = js.undefined
  
  var SignatureFileContents: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.SignatureFileContents] = js.undefined
  
  var WarningMessage: js.UndefOr[typingsJapgolly.awsSdk.clientsImportexportMod.WarningMessage] = js.undefined
}
object CreateJobOutput {
  
  inline def apply(): CreateJobOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateJobOutput]
  }
  
  extension [Self <: CreateJobOutput](x: Self) {
    
    inline def setArtifactList(value: ArtifactList): Self = StObject.set(x, "ArtifactList", value.asInstanceOf[js.Any])
    
    inline def setArtifactListUndefined: Self = StObject.set(x, "ArtifactList", js.undefined)
    
    inline def setArtifactListVarargs(value: Artifact*): Self = StObject.set(x, "ArtifactList", js.Array(value*))
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "JobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "JobId", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "JobType", value.asInstanceOf[js.Any])
    
    inline def setJobTypeUndefined: Self = StObject.set(x, "JobType", js.undefined)
    
    inline def setSignature(value: Signature): Self = StObject.set(x, "Signature", value.asInstanceOf[js.Any])
    
    inline def setSignatureFileContents(value: SignatureFileContents): Self = StObject.set(x, "SignatureFileContents", value.asInstanceOf[js.Any])
    
    inline def setSignatureFileContentsUndefined: Self = StObject.set(x, "SignatureFileContents", js.undefined)
    
    inline def setSignatureUndefined: Self = StObject.set(x, "Signature", js.undefined)
    
    inline def setWarningMessage(value: WarningMessage): Self = StObject.set(x, "WarningMessage", value.asInstanceOf[js.Any])
    
    inline def setWarningMessageUndefined: Self = StObject.set(x, "WarningMessage", js.undefined)
  }
}
