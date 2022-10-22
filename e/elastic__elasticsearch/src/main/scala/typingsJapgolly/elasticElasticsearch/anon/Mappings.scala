package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesAlias
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesIndexSettings
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.MappingTypeMapping
import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Mappings extends StObject {
  
  var aliases: js.UndefOr[
    Record[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name, IndicesAlias]
  ] = js.undefined
  
  var mappings: js.UndefOr[MappingTypeMapping] = js.undefined
  
  var settings: js.UndefOr[IndicesIndexSettings] = js.undefined
}
object Mappings {
  
  inline def apply(): Mappings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mappings]
  }
  
  extension [Self <: Mappings](x: Self) {
    
    inline def setAliases(value: Record[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name, IndicesAlias]): Self = StObject.set(x, "aliases", value.asInstanceOf[js.Any])
    
    inline def setAliasesUndefined: Self = StObject.set(x, "aliases", js.undefined)
    
    inline def setMappings(value: MappingTypeMapping): Self = StObject.set(x, "mappings", value.asInstanceOf[js.Any])
    
    inline def setMappingsUndefined: Self = StObject.set(x, "mappings", js.undefined)
    
    inline def setSettings(value: IndicesIndexSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
