package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskRestriction
  extends StObject
     with BackboneElement {
  
  /**
    * Note that period.high is the due date representing the time by which the task should be completed.
    */
  var period: js.UndefOr[Period] = js.undefined
  
  /**
    * For requests that are targeted to more than on potential recipient/target, for whom is fulfillment sought?
    */
  var recipient: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Indicates the number of times the requested action should occur.
    */
  var repetitions: js.UndefOr[Double] = js.undefined
}
object TaskRestriction {
  
  inline def apply(): TaskRestriction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TaskRestriction]
  }
  
  extension [Self <: TaskRestriction](x: Self) {
    
    inline def setPeriod(value: Period): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
    
    inline def setRecipient(value: js.Array[Reference]): Self = StObject.set(x, "recipient", value.asInstanceOf[js.Any])
    
    inline def setRecipientUndefined: Self = StObject.set(x, "recipient", js.undefined)
    
    inline def setRecipientVarargs(value: Reference*): Self = StObject.set(x, "recipient", js.Array(value*))
    
    inline def setRepetitions(value: Double): Self = StObject.set(x, "repetitions", value.asInstanceOf[js.Any])
    
    inline def setRepetitionsUndefined: Self = StObject.set(x, "repetitions", js.undefined)
  }
}
