package typingsJapgolly.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DesiredWeightAndCapacity extends StObject {
  
  /**
    * The variant's capacity.
    */
  var DesiredInstanceCount: js.UndefOr[TaskCount] = js.undefined
  
  /**
    * The variant's weight.
    */
  var DesiredWeight: js.UndefOr[VariantWeight] = js.undefined
  
  /**
    * The name of the variant to update.
    */
  var VariantName: typingsJapgolly.awsSdk.clientsSagemakerMod.VariantName
}
object DesiredWeightAndCapacity {
  
  inline def apply(VariantName: VariantName): DesiredWeightAndCapacity = {
    val __obj = js.Dynamic.literal(VariantName = VariantName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DesiredWeightAndCapacity]
  }
  
  extension [Self <: DesiredWeightAndCapacity](x: Self) {
    
    inline def setDesiredInstanceCount(value: TaskCount): Self = StObject.set(x, "DesiredInstanceCount", value.asInstanceOf[js.Any])
    
    inline def setDesiredInstanceCountUndefined: Self = StObject.set(x, "DesiredInstanceCount", js.undefined)
    
    inline def setDesiredWeight(value: VariantWeight): Self = StObject.set(x, "DesiredWeight", value.asInstanceOf[js.Any])
    
    inline def setDesiredWeightUndefined: Self = StObject.set(x, "DesiredWeight", js.undefined)
    
    inline def setVariantName(value: VariantName): Self = StObject.set(x, "VariantName", value.asInstanceOf[js.Any])
  }
}
