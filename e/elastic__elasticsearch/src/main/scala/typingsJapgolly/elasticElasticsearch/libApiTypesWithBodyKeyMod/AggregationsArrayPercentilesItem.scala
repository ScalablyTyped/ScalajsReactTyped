package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationsArrayPercentilesItem extends StObject {
  
  var key: String
  
  var value: double | Null
  
  var value_as_string: js.UndefOr[String] = js.undefined
}
object AggregationsArrayPercentilesItem {
  
  inline def apply(key: String): AggregationsArrayPercentilesItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = null)
    __obj.asInstanceOf[AggregationsArrayPercentilesItem]
  }
  
  extension [Self <: AggregationsArrayPercentilesItem](x: Self) {
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueNull: Self = StObject.set(x, "value", null)
    
    inline def setValue_as_string(value: String): Self = StObject.set(x, "value_as_string", value.asInstanceOf[js.Any])
    
    inline def setValue_as_stringUndefined: Self = StObject.set(x, "value_as_string", js.undefined)
  }
}
