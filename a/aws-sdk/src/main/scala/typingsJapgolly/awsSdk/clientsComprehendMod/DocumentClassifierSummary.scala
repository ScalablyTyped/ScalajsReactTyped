package typingsJapgolly.awsSdk.clientsComprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentClassifierSummary extends StObject {
  
  /**
    * The name that you assigned the document classifier.
    */
  var DocumentClassifierName: js.UndefOr[ComprehendArnName] = js.undefined
  
  /**
    * The time that the latest document classifier version was submitted for processing.
    */
  var LatestVersionCreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The version name you assigned to the latest document classifier version.
    */
  var LatestVersionName: js.UndefOr[VersionName] = js.undefined
  
  /**
    * Provides the status of the latest document classifier version.
    */
  var LatestVersionStatus: js.UndefOr[ModelStatus] = js.undefined
  
  /**
    * The number of versions you created.
    */
  var NumberOfVersions: js.UndefOr[Integer] = js.undefined
}
object DocumentClassifierSummary {
  
  inline def apply(): DocumentClassifierSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentClassifierSummary]
  }
  
  extension [Self <: DocumentClassifierSummary](x: Self) {
    
    inline def setDocumentClassifierName(value: ComprehendArnName): Self = StObject.set(x, "DocumentClassifierName", value.asInstanceOf[js.Any])
    
    inline def setDocumentClassifierNameUndefined: Self = StObject.set(x, "DocumentClassifierName", js.undefined)
    
    inline def setLatestVersionCreatedAt(value: js.Date): Self = StObject.set(x, "LatestVersionCreatedAt", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionCreatedAtUndefined: Self = StObject.set(x, "LatestVersionCreatedAt", js.undefined)
    
    inline def setLatestVersionName(value: VersionName): Self = StObject.set(x, "LatestVersionName", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionNameUndefined: Self = StObject.set(x, "LatestVersionName", js.undefined)
    
    inline def setLatestVersionStatus(value: ModelStatus): Self = StObject.set(x, "LatestVersionStatus", value.asInstanceOf[js.Any])
    
    inline def setLatestVersionStatusUndefined: Self = StObject.set(x, "LatestVersionStatus", js.undefined)
    
    inline def setNumberOfVersions(value: Integer): Self = StObject.set(x, "NumberOfVersions", value.asInstanceOf[js.Any])
    
    inline def setNumberOfVersionsUndefined: Self = StObject.set(x, "NumberOfVersions", js.undefined)
  }
}
