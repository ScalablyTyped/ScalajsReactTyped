package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndexName
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesDataStreamVisibility
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.IndicesPutIndexTemplateIndexTemplateMapping
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.VersionNumber
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Composedof extends StObject {
  
  var _meta: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata] = js.undefined
  
  var composed_of: js.UndefOr[js.Array[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name]] = js.undefined
  
  var data_stream: js.UndefOr[IndicesDataStreamVisibility] = js.undefined
  
  var index_patterns: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices] = js.undefined
  
  var priority: js.UndefOr[integer] = js.undefined
  
  var template: js.UndefOr[IndicesPutIndexTemplateIndexTemplateMapping] = js.undefined
  
  var version: js.UndefOr[VersionNumber] = js.undefined
}
object Composedof {
  
  inline def apply(): Composedof = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Composedof]
  }
  
  extension [Self <: Composedof](x: Self) {
    
    inline def setComposed_of(value: js.Array[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name]): Self = StObject.set(x, "composed_of", value.asInstanceOf[js.Any])
    
    inline def setComposed_ofUndefined: Self = StObject.set(x, "composed_of", js.undefined)
    
    inline def setComposed_ofVarargs(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Name*): Self = StObject.set(x, "composed_of", js.Array(value*))
    
    inline def setData_stream(value: IndicesDataStreamVisibility): Self = StObject.set(x, "data_stream", value.asInstanceOf[js.Any])
    
    inline def setData_streamUndefined: Self = StObject.set(x, "data_stream", js.undefined)
    
    inline def setIndex_patterns(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Indices): Self = StObject.set(x, "index_patterns", value.asInstanceOf[js.Any])
    
    inline def setIndex_patternsUndefined: Self = StObject.set(x, "index_patterns", js.undefined)
    
    inline def setIndex_patternsVarargs(value: IndexName*): Self = StObject.set(x, "index_patterns", js.Array(value*))
    
    inline def setPriority(value: integer): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setTemplate(value: IndicesPutIndexTemplateIndexTemplateMapping): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    
    inline def setVersion(value: VersionNumber): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def set_meta(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Metadata): Self = StObject.set(x, "_meta", value.asInstanceOf[js.Any])
    
    inline def set_metaUndefined: Self = StObject.set(x, "_meta", js.undefined)
  }
}
