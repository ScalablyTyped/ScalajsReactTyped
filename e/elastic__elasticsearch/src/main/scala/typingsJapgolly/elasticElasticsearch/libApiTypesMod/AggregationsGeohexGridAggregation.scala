package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsGeohexGridAggregation
  extends StObject
     with AggregationsAggregation {
  
  var bounds: js.UndefOr[GeoBounds] = js.undefined
  
  var field: Field
  
  var precision: js.UndefOr[integer] = js.undefined
  
  var shard_size: js.UndefOr[integer] = js.undefined
  
  var size: js.UndefOr[integer] = js.undefined
}
object AggregationsGeohexGridAggregation {
  
  inline def apply(field: Field): AggregationsGeohexGridAggregation = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationsGeohexGridAggregation]
  }
  
  extension [Self <: AggregationsGeohexGridAggregation](x: Self) {
    
    inline def setBounds(value: GeoBounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
    
    inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setPrecision(value: integer): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
    
    inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
    
    inline def setShard_size(value: integer): Self = StObject.set(x, "shard_size", value.asInstanceOf[js.Any])
    
    inline def setShard_sizeUndefined: Self = StObject.set(x, "shard_size", js.undefined)
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
  }
}
