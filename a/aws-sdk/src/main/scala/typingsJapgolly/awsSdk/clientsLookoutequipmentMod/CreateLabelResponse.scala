package typingsJapgolly.awsSdk.clientsLookoutequipmentMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateLabelResponse extends StObject {
  
  /**
    *  The ID of the label that you have created. 
    */
  var LabelId: js.UndefOr[typingsJapgolly.awsSdk.clientsLookoutequipmentMod.LabelId] = js.undefined
}
object CreateLabelResponse {
  
  inline def apply(): CreateLabelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateLabelResponse]
  }
  
  extension [Self <: CreateLabelResponse](x: Self) {
    
    inline def setLabelId(value: LabelId): Self = StObject.set(x, "LabelId", value.asInstanceOf[js.Any])
    
    inline def setLabelIdUndefined: Self = StObject.set(x, "LabelId", js.undefined)
  }
}
