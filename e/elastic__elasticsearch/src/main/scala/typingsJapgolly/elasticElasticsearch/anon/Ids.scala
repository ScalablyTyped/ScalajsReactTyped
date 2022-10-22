package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MgetOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Ids extends StObject {
  
  var docs: js.UndefOr[js.Array[MgetOperation]] = js.undefined
  
  var ids: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids] = js.undefined
}
object Ids {
  
  inline def apply(): Ids = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Ids]
  }
  
  extension [Self <: Ids](x: Self) {
    
    inline def setDocs(value: js.Array[MgetOperation]): Self = StObject.set(x, "docs", value.asInstanceOf[js.Any])
    
    inline def setDocsUndefined: Self = StObject.set(x, "docs", js.undefined)
    
    inline def setDocsVarargs(value: MgetOperation*): Self = StObject.set(x, "docs", js.Array(value*))
    
    inline def setIds(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Ids): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsUndefined: Self = StObject.set(x, "ids", js.undefined)
    
    inline def setIdsVarargs(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Id*): Self = StObject.set(x, "ids", js.Array(value*))
  }
}
