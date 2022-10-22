package typingsJapgolly.awsSdk.clientsAuditmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEvidenceFolderResponse extends StObject {
  
  /**
    *  The folder that the evidence is stored in. 
    */
  var evidenceFolder: js.UndefOr[AssessmentEvidenceFolder] = js.undefined
}
object GetEvidenceFolderResponse {
  
  inline def apply(): GetEvidenceFolderResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEvidenceFolderResponse]
  }
  
  extension [Self <: GetEvidenceFolderResponse](x: Self) {
    
    inline def setEvidenceFolder(value: AssessmentEvidenceFolder): Self = StObject.set(x, "evidenceFolder", value.asInstanceOf[js.Any])
    
    inline def setEvidenceFolderUndefined: Self = StObject.set(x, "evidenceFolder", js.undefined)
  }
}
