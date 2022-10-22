package typingsJapgolly.fhir.r4Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngredientSubstance
  extends StObject
     with BackboneElement {
  
  /**
    * A code or full resource that represents the ingredient substance.
    */
  var code: CodeableReference
  
  /**
    * The quantity of substance in the unit of presentation, or in the volume (or mass) of the single pharmaceutical product or manufactured item.
    */
  var strength: js.UndefOr[js.Array[IngredientSubstanceStrength]] = js.undefined
}
object IngredientSubstance {
  
  inline def apply(code: CodeableReference): IngredientSubstance = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngredientSubstance]
  }
  
  extension [Self <: IngredientSubstance](x: Self) {
    
    inline def setCode(value: CodeableReference): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setStrength(value: js.Array[IngredientSubstanceStrength]): Self = StObject.set(x, "strength", value.asInstanceOf[js.Any])
    
    inline def setStrengthUndefined: Self = StObject.set(x, "strength", js.undefined)
    
    inline def setStrengthVarargs(value: IngredientSubstanceStrength*): Self = StObject.set(x, "strength", js.Array(value*))
  }
}
