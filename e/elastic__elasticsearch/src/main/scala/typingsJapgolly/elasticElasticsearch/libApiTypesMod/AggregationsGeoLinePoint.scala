package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeoLinePoint extends StObject {
  
  var field: Field
}
object AggregationsGeoLinePoint {
  
  inline def apply(field: Field): AggregationsGeoLinePoint = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeoLinePoint]
  }
  
  extension [Self <: AggregationsGeoLinePoint](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
  }
}
