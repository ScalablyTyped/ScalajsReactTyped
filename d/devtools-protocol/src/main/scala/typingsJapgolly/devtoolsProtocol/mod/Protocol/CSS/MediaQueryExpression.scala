package typingsJapgolly.devtoolsProtocol.mod.Protocol.CSS

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MediaQueryExpression extends StObject {
  
  /**
    * Computed length of media query expression (if applicable).
    */
  var computedLength: js.UndefOr[Double] = js.undefined
  
  /**
    * Media query expression feature.
    */
  var feature: String
  
  /**
    * Media query expression units.
    */
  var unit: String
  
  /**
    * Media query expression value.
    */
  var value: Double
  
  /**
    * The associated range of the value text in the enclosing stylesheet (if available).
    */
  var valueRange: js.UndefOr[SourceRange] = js.undefined
}
object MediaQueryExpression {
  
  inline def apply(feature: String, unit: String, value: Double): MediaQueryExpression = {
    val __obj = js.Dynamic.literal(feature = feature.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MediaQueryExpression]
  }
  
  extension [Self <: MediaQueryExpression](x: Self) {
    
    inline def setComputedLength(value: Double): Self = StObject.set(x, "computedLength", value.asInstanceOf[js.Any])
    
    inline def setComputedLengthUndefined: Self = StObject.set(x, "computedLength", js.undefined)
    
    inline def setFeature(value: String): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueRange(value: SourceRange): Self = StObject.set(x, "valueRange", value.asInstanceOf[js.Any])
    
    inline def setValueRangeUndefined: Self = StObject.set(x, "valueRange", js.undefined)
  }
}
