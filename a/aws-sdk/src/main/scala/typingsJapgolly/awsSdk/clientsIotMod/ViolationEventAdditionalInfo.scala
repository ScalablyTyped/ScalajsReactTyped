package typingsJapgolly.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViolationEventAdditionalInfo extends StObject {
  
  /**
    *  The sensitivity of anomalous behavior evaluation. Can be Low, Medium, or High. 
    */
  var confidenceLevel: js.UndefOr[ConfidenceLevel] = js.undefined
}
object ViolationEventAdditionalInfo {
  
  inline def apply(): ViolationEventAdditionalInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViolationEventAdditionalInfo]
  }
  
  extension [Self <: ViolationEventAdditionalInfo](x: Self) {
    
    inline def setConfidenceLevel(value: ConfidenceLevel): Self = StObject.set(x, "confidenceLevel", value.asInstanceOf[js.Any])
    
    inline def setConfidenceLevelUndefined: Self = StObject.set(x, "confidenceLevel", js.undefined)
  }
}
