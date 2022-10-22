package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchStrings.join
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MappingJoinProperty
  extends StObject
     with MappingPropertyBase
     with MappingProperty {
  
  var relations: js.UndefOr[Record[RelationName, RelationName | js.Array[RelationName]]] = js.undefined
  
  var `type`: join
}
object MappingJoinProperty {
  
  inline def apply(): MappingJoinProperty = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("join")
    __obj.asInstanceOf[MappingJoinProperty]
  }
  
  extension [Self <: MappingJoinProperty](x: Self) {
    
    inline def setRelations(value: Record[RelationName, RelationName | js.Array[RelationName]]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    inline def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    inline def setType(value: join): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
