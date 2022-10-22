package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingTextIndexPrefixes extends StObject {
  
  var max_chars: integer
  
  var min_chars: integer
}
object MappingTextIndexPrefixes {
  
  inline def apply(max_chars: integer, min_chars: integer): MappingTextIndexPrefixes = {
    val __obj = js.Dynamic.literal(max_chars = max_chars.asInstanceOf[js.Any], min_chars = min_chars.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingTextIndexPrefixes]
  }
  
  extension [Self <: MappingTextIndexPrefixes](x: Self) {
    
    inline def setMax_chars(value: integer): Self = StObject.set(x, "max_chars", value.asInstanceOf[js.Any])
    
    inline def setMin_chars(value: integer): Self = StObject.set(x, "min_chars", value.asInstanceOf[js.Any])
  }
}
