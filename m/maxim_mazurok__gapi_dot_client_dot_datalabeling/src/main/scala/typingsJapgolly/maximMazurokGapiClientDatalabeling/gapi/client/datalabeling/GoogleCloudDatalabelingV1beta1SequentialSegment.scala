package typingsJapgolly.maximMazurokGapiClientDatalabeling.gapi.client.datalabeling

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GoogleCloudDatalabelingV1beta1SequentialSegment extends StObject {
  
  /** End position (exclusive). */
  var end: js.UndefOr[Double] = js.undefined
  
  /** Start position (inclusive). */
  var start: js.UndefOr[Double] = js.undefined
}
object GoogleCloudDatalabelingV1beta1SequentialSegment {
  
  inline def apply(): GoogleCloudDatalabelingV1beta1SequentialSegment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleCloudDatalabelingV1beta1SequentialSegment]
  }
  
  extension [Self <: GoogleCloudDatalabelingV1beta1SequentialSegment](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
  }
}
