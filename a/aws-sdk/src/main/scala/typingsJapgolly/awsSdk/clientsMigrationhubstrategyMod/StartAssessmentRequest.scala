package typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartAssessmentRequest extends StObject {
  
  /**
    *  The S3 bucket used by the collectors to send analysis data to the service. The bucket name must begin with migrationhub-strategy-. 
    */
  var s3bucketForAnalysisData: js.UndefOr[StartAssessmentRequestS3bucketForAnalysisDataString] = js.undefined
  
  /**
    *  The S3 bucket where all the reports generated by the service are stored. The bucket name must begin with migrationhub-strategy-. 
    */
  var s3bucketForReportData: js.UndefOr[StartAssessmentRequestS3bucketForReportDataString] = js.undefined
}
object StartAssessmentRequest {
  
  inline def apply(): StartAssessmentRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartAssessmentRequest]
  }
  
  extension [Self <: StartAssessmentRequest](x: Self) {
    
    inline def setS3bucketForAnalysisData(value: StartAssessmentRequestS3bucketForAnalysisDataString): Self = StObject.set(x, "s3bucketForAnalysisData", value.asInstanceOf[js.Any])
    
    inline def setS3bucketForAnalysisDataUndefined: Self = StObject.set(x, "s3bucketForAnalysisData", js.undefined)
    
    inline def setS3bucketForReportData(value: StartAssessmentRequestS3bucketForReportDataString): Self = StObject.set(x, "s3bucketForReportData", value.asInstanceOf[js.Any])
    
    inline def setS3bucketForReportDataUndefined: Self = StObject.set(x, "s3bucketForReportData", js.undefined)
  }
}
