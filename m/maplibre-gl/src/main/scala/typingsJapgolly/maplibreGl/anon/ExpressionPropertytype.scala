package typingsJapgolly.maplibreGl.anon

import typingsJapgolly.maplibreGl.maplibreGlStrings.padding
import typingsJapgolly.maplibreGl.mod.ExpressionSpecificationDefinition
import typingsJapgolly.maplibreGl.mod.ExpressionType
import typingsJapgolly.maplibreGl.mod.StylePropertySpecification
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExpressionPropertytype
  extends StObject
     with StylePropertySpecification {
  
  var default: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  var expression: js.UndefOr[ExpressionSpecificationDefinition] = js.undefined
  
  var `property-type`: ExpressionType
  
  var transition: Boolean
  
  var `type`: padding
}
object ExpressionPropertytype {
  
  inline def apply(`property-type`: ExpressionType, transition: Boolean): ExpressionPropertytype = {
    val __obj = js.Dynamic.literal(transition = transition.asInstanceOf[js.Any])
    __obj.updateDynamic("property-type")(`property-type`.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("padding")
    __obj.asInstanceOf[ExpressionPropertytype]
  }
  
  extension [Self <: ExpressionPropertytype](x: Self) {
    
    inline def setDefault(value: Double | js.Array[Double]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDefaultVarargs(value: Double*): Self = StObject.set(x, "default", js.Array(value*))
    
    inline def setExpression(value: ExpressionSpecificationDefinition): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def `setProperty-type`(value: ExpressionType): Self = StObject.set(x, "property-type", value.asInstanceOf[js.Any])
    
    inline def setTransition(value: Boolean): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
    
    inline def setType(value: padding): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
