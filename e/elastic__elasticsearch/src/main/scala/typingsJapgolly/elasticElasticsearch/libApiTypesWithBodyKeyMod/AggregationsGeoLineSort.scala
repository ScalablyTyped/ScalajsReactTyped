package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLineSort extends StObject {
  
  var field: Field
}
object AggregationsGeoLineSort {
  
  inline def apply(field: Field): AggregationsGeoLineSort = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLineSort]
  }
  
  extension [Self <: AggregationsGeoLineSort](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
