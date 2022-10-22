package typingsJapgolly.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReprocessingSummary extends StObject {
  
  /**
    * The time the pipeline reprocessing was created.
    */
  var creationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The reprocessingId returned by StartPipelineReprocessing.
    */
  var id: js.UndefOr[ReprocessingId] = js.undefined
  
  /**
    * The status of the pipeline reprocessing.
    */
  var status: js.UndefOr[ReprocessingStatus] = js.undefined
}
object ReprocessingSummary {
  
  inline def apply(): ReprocessingSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReprocessingSummary]
  }
  
  extension [Self <: ReprocessingSummary](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "creationTime", js.undefined)
    
    inline def setId(value: ReprocessingId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: ReprocessingStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
