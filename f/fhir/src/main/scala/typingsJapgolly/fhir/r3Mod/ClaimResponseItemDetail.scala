package typingsJapgolly.fhir.r3Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClaimResponseItemDetail
  extends StObject
     with BackboneElement {
  
  /**
    * The adjudications results.
    */
  var adjudication: js.UndefOr[js.Array[ClaimResponseItemAdjudication]] = js.undefined
  
  /**
    * A list of note references to the notes provided below.
    */
  var noteNumber: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * A service line number.
    */
  var sequenceLinkId: Double
  
  /**
    * The third tier service adjudications for submitted services.
    */
  var subDetail: js.UndefOr[js.Array[ClaimResponseItemDetailSubDetail]] = js.undefined
}
object ClaimResponseItemDetail {
  
  inline def apply(sequenceLinkId: Double): ClaimResponseItemDetail = {
    val __obj = js.Dynamic.literal(sequenceLinkId = sequenceLinkId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClaimResponseItemDetail]
  }
  
  extension [Self <: ClaimResponseItemDetail](x: Self) {
    
    inline def setAdjudication(value: js.Array[ClaimResponseItemAdjudication]): Self = StObject.set(x, "adjudication", value.asInstanceOf[js.Any])
    
    inline def setAdjudicationUndefined: Self = StObject.set(x, "adjudication", js.undefined)
    
    inline def setAdjudicationVarargs(value: ClaimResponseItemAdjudication*): Self = StObject.set(x, "adjudication", js.Array(value*))
    
    inline def setNoteNumber(value: js.Array[Double]): Self = StObject.set(x, "noteNumber", value.asInstanceOf[js.Any])
    
    inline def setNoteNumberUndefined: Self = StObject.set(x, "noteNumber", js.undefined)
    
    inline def setNoteNumberVarargs(value: Double*): Self = StObject.set(x, "noteNumber", js.Array(value*))
    
    inline def setSequenceLinkId(value: Double): Self = StObject.set(x, "sequenceLinkId", value.asInstanceOf[js.Any])
    
    inline def setSubDetail(value: js.Array[ClaimResponseItemDetailSubDetail]): Self = StObject.set(x, "subDetail", value.asInstanceOf[js.Any])
    
    inline def setSubDetailUndefined: Self = StObject.set(x, "subDetail", js.undefined)
    
    inline def setSubDetailVarargs(value: ClaimResponseItemDetailSubDetail*): Self = StObject.set(x, "subDetail", js.Array(value*))
  }
}
