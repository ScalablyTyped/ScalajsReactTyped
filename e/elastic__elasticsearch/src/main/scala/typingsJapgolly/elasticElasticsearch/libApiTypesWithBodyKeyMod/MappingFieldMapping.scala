package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.std.Partial
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingFieldMapping extends StObject {
  
  var full_name: String
  
  var mapping: Partial[Record[Field, MappingProperty]]
}
object MappingFieldMapping {
  
  inline def apply(full_name: String, mapping: Partial[Record[Field, MappingProperty]]): MappingFieldMapping = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], mapping = mapping.asInstanceOf[js.Any])
    __obj.asInstanceOf[MappingFieldMapping]
  }
  
  extension [Self <: MappingFieldMapping](x: Self) {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setMapping(value: Partial[Record[Field, MappingProperty]]): Self = StObject.set(x, "mapping", value.asInstanceOf[js.Any])
  }
}
