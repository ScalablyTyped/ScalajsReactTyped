package typingsJapgolly.awsSdkClientPinpointBrowser

import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.COMPLETING
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.CREATED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILED
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.FAILING
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.INITIALIZING
import typingsJapgolly.awsSdkClientPinpointBrowser.awsSdkClientPinpointBrowserStrings.PROCESSING
import typingsJapgolly.awsSdkClientPinpointBrowser.typesExportJobResourceMod.ExportJobResource
import typingsJapgolly.awsSdkClientPinpointBrowser.typesExportJobResourceMod.UnmarshalledExportJobResource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesExportJobResponseMod {
  
  trait ExportJobResponse extends StObject {
    
    /**
      * The unique ID of the application associated with the export job.
      */
    var ApplicationId: js.UndefOr[String] = js.undefined
    
    /**
      * The number of pieces that have successfully completed as of the time of the request.
      */
    var CompletedPieces: js.UndefOr[Double] = js.undefined
    
    /**
      * The date the job completed in ISO 8601 format.
      */
    var CompletionDate: js.UndefOr[String] = js.undefined
    
    /**
      * The date the job was created in ISO 8601 format.
      */
    var CreationDate: js.UndefOr[String] = js.undefined
    
    /**
      * The export job settings.
      */
    var Definition: js.UndefOr[ExportJobResource] = js.undefined
    
    /**
      * The number of pieces that failed to be processed as of the time of the request.
      */
    var FailedPieces: js.UndefOr[Double] = js.undefined
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    var Failures: js.UndefOr[js.Array[String] | js.Iterable[String]] = js.undefined
    
    /**
      * The unique ID of the job.
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * The status of the job.
      * Valid values: CREATED, INITIALIZING, PROCESSING, COMPLETING, COMPLETED, FAILING, FAILED
      *
      * The job status is FAILED if one or more pieces failed.
      */
    var JobStatus: js.UndefOr[
        CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String
      ] = js.undefined
    
    /**
      * The number of endpoints that were not processed; for example, because of syntax errors.
      */
    var TotalFailures: js.UndefOr[Double] = js.undefined
    
    /**
      * The total number of pieces that must be processed to finish the job. Each piece is an approximately equal portion of the endpoints.
      */
    var TotalPieces: js.UndefOr[Double] = js.undefined
    
    /**
      * The number of endpoints that were processed by the job.
      */
    var TotalProcessed: js.UndefOr[Double] = js.undefined
    
    /**
      * The job type. Will be 'EXPORT'.
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object ExportJobResponse {
    
    inline def apply(): ExportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportJobResponse]
    }
    
    extension [Self <: ExportJobResponse](x: Self) {
      
      inline def setApplicationId(value: String): Self = StObject.set(x, "ApplicationId", value.asInstanceOf[js.Any])
      
      inline def setApplicationIdUndefined: Self = StObject.set(x, "ApplicationId", js.undefined)
      
      inline def setCompletedPieces(value: Double): Self = StObject.set(x, "CompletedPieces", value.asInstanceOf[js.Any])
      
      inline def setCompletedPiecesUndefined: Self = StObject.set(x, "CompletedPieces", js.undefined)
      
      inline def setCompletionDate(value: String): Self = StObject.set(x, "CompletionDate", value.asInstanceOf[js.Any])
      
      inline def setCompletionDateUndefined: Self = StObject.set(x, "CompletionDate", js.undefined)
      
      inline def setCreationDate(value: String): Self = StObject.set(x, "CreationDate", value.asInstanceOf[js.Any])
      
      inline def setCreationDateUndefined: Self = StObject.set(x, "CreationDate", js.undefined)
      
      inline def setDefinition(value: ExportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
      
      inline def setFailedPieces(value: Double): Self = StObject.set(x, "FailedPieces", value.asInstanceOf[js.Any])
      
      inline def setFailedPiecesUndefined: Self = StObject.set(x, "FailedPieces", js.undefined)
      
      inline def setFailures(value: js.Array[String] | js.Iterable[String]): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
      
      inline def setFailuresVarargs(value: String*): Self = StObject.set(x, "Failures", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setJobStatus(value: CREATED | INITIALIZING | PROCESSING | COMPLETING | COMPLETED | FAILING | FAILED | String): Self = StObject.set(x, "JobStatus", value.asInstanceOf[js.Any])
      
      inline def setJobStatusUndefined: Self = StObject.set(x, "JobStatus", js.undefined)
      
      inline def setTotalFailures(value: Double): Self = StObject.set(x, "TotalFailures", value.asInstanceOf[js.Any])
      
      inline def setTotalFailuresUndefined: Self = StObject.set(x, "TotalFailures", js.undefined)
      
      inline def setTotalPieces(value: Double): Self = StObject.set(x, "TotalPieces", value.asInstanceOf[js.Any])
      
      inline def setTotalPiecesUndefined: Self = StObject.set(x, "TotalPieces", js.undefined)
      
      inline def setTotalProcessed(value: Double): Self = StObject.set(x, "TotalProcessed", value.asInstanceOf[js.Any])
      
      inline def setTotalProcessedUndefined: Self = StObject.set(x, "TotalProcessed", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
  
  trait UnmarshalledExportJobResponse
    extends StObject
       with ExportJobResponse {
    
    /**
      * The export job settings.
      */
    @JSName("Definition")
    var Definition_UnmarshalledExportJobResponse: js.UndefOr[UnmarshalledExportJobResource] = js.undefined
    
    /**
      * Provides up to 100 of the first failed entries for the job, if any exist.
      */
    @JSName("Failures")
    var Failures_UnmarshalledExportJobResponse: js.UndefOr[js.Array[String]] = js.undefined
  }
  object UnmarshalledExportJobResponse {
    
    inline def apply(): UnmarshalledExportJobResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledExportJobResponse]
    }
    
    extension [Self <: UnmarshalledExportJobResponse](x: Self) {
      
      inline def setDefinition(value: UnmarshalledExportJobResource): Self = StObject.set(x, "Definition", value.asInstanceOf[js.Any])
      
      inline def setDefinitionUndefined: Self = StObject.set(x, "Definition", js.undefined)
      
      inline def setFailures(value: js.Array[String]): Self = StObject.set(x, "Failures", value.asInstanceOf[js.Any])
      
      inline def setFailuresUndefined: Self = StObject.set(x, "Failures", js.undefined)
      
      inline def setFailuresVarargs(value: String*): Self = StObject.set(x, "Failures", js.Array(value*))
    }
  }
}
