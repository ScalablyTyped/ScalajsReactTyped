package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicedScroll extends StObject {
  
  var field: js.UndefOr[Field] = js.undefined
  
  var id: integer
  
  var max: integer
}
object SlicedScroll {
  
  inline def apply(id: integer, max: integer): SlicedScroll = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlicedScroll]
  }
  
  extension [Self <: SlicedScroll](x: Self) {
    
    inline def setField(value: Field): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setMax(value: integer): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
  }
}
