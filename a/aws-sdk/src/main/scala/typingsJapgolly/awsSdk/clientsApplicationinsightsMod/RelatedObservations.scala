package typingsJapgolly.awsSdk.clientsApplicationinsightsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelatedObservations extends StObject {
  
  /**
    * The list of observations related to the problem.
    */
  var ObservationList: js.UndefOr[typingsJapgolly.awsSdk.clientsApplicationinsightsMod.ObservationList] = js.undefined
}
object RelatedObservations {
  
  inline def apply(): RelatedObservations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RelatedObservations]
  }
  
  extension [Self <: RelatedObservations](x: Self) {
    
    inline def setObservationList(value: ObservationList): Self = StObject.set(x, "ObservationList", value.asInstanceOf[js.Any])
    
    inline def setObservationListUndefined: Self = StObject.set(x, "ObservationList", js.undefined)
    
    inline def setObservationListVarargs(value: Observation*): Self = StObject.set(x, "ObservationList", js.Array(value*))
  }
}
