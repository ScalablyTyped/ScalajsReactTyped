package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.half_float
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingHalfFloatNumberProperty
  extends StObject
     with MappingStandardNumberProperty
     with MappingProperty {
  
  var null_value: js.UndefOr[float] = js.undefined
  
  var `type`: half_float
}
object MappingHalfFloatNumberProperty {
  
  inline def apply(): MappingHalfFloatNumberProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("half_float")
    __obj.asInstanceOf[MappingHalfFloatNumberProperty]
  }
  
  extension [Self <: MappingHalfFloatNumberProperty](x: Self) {
    
    inline def setNull_value(value: float): Self = StObject.set(x, "null_value", value.asInstanceOf[js.Any])
    
    inline def setNull_valueUndefined: Self = StObject.set(x, "null_value", js.undefined)
    
    inline def setType(value: half_float): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
