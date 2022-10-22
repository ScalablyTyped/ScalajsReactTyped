package typingsJapgolly.elasticElasticsearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Id extends StObject {
  
  var id: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id
}
object Id {
  
  inline def apply(id: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Id]
  }
  
  extension [Self <: Id](x: Self) {
    
    inline def setId(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
