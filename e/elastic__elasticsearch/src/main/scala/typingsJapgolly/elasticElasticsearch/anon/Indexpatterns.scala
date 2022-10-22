package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAlias
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTypeMapping
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.VersionNumber
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Indexpatterns extends StObject {
  
  var aliases: js.UndefOr[Record[IndexName, IndicesAlias]] = js.undefined
  
  var index_patterns: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var order: js.UndefOr[integer] = js.undefined
  
  var settings: js.UndefOr[Record[String, Any]] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Indexpatterns {
  
  inline def apply(): Indexpatterns = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Indexpatterns]
  }
  
  extension [Self <: Indexpatterns](x: Self) {
    
    inline def setAliases(value: Record[IndexName, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setIndex_patterns(value: String | js.Array[String]): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsUndefined: Self = StObject.set(x, "index_patterns", js.undefined)
    
    inline def setIndex_patternsVarargs(value: String*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setOrder(value: integer): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
    
    inline def setSettings(value: Record[String, Any]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
