package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.long_range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingLongRangeProperty
  extends StObject
     with MappingRangePropertyBase
     with MappingProperty {
  
  var `type`: long_range
}
object MappingLongRangeProperty {
  
  inline def apply(): MappingLongRangeProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("long_range")
    __obj.asInstanceOf[MappingLongRangeProperty]
  }
  
  extension [Self <: MappingLongRangeProperty](x: Self) {
    
    inline def setType(value: long_range): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
