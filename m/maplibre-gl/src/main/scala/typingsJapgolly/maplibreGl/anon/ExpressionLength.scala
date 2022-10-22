package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.distStyleSpecMod.ExpressionSpecificationDefinition
import typingsJapgolly.maplibreGl.distStyleSpecMod.ExpressionType
import typingsJapgolly.maplibreGl.distStyleSpecMod.StylePropertySpecification
import typingsJapgolly.maplibreGl.maplibreGlStrings.array
import typingsJapgolly.maplibreGl.maplibreGlStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionLength
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[js.Array[Double]] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var length: js.UndefOr[Double] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: array
  
  var value: number
}
object ExpressionLength {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): ExpressionLength = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any], value = "number")
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("array")
    __obj.asInstanceOf[ExpressionLength]
  }
  
  extension [Self <: ExpressionLength](x: Self) {
    
    inline def setDefault(value: js.Array[Double]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: number): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
