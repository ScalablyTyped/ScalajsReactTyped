package typingsJapgolly.awsSdk.clientsMigrationhubstrategyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAssessmentResponse extends StObject {
  
  /**
    *  Detailed information about the assessment. 
    */
  var dataCollectionDetails: js.UndefOr[DataCollectionDetails] = js.undefined
  
  /**
    *  The ID for the specific assessment task. 
    */
  var id: js.UndefOr[AsyncTaskId] = js.undefined
}
object GetAssessmentResponse {
  
  inline def apply(): GetAssessmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetAssessmentResponse]
  }
  
  extension [Self <: GetAssessmentResponse](x: Self) {
    
    inline def setDataCollectionDetails(value: DataCollectionDetails): Self = StObject.set(x, "dataCollectionDetails", value.asInstanceOf[js.Any])
    
    inline def setDataCollectionDetailsUndefined: Self = StObject.set(x, "dataCollectionDetails", js.undefined)
    
    inline def setId(value: AsyncTaskId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
