package typingsJapgolly.elasticElasticsearch.anon

import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexDestination
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.ReindexSource
import typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.long
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Conflicts extends StObject {
  
  var conflicts: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Conflicts] = js.undefined
  
  var dest: ReindexDestination
  
  var max_docs: js.UndefOr[long] = js.undefined
  
  var script: js.UndefOr[typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script] = js.undefined
  
  var size: js.UndefOr[long] = js.undefined
  
  var source: ReindexSource
}
object Conflicts {
  
  inline def apply(dest: ReindexDestination, source: ReindexSource): Conflicts = {
    val __obj = js.Dynamic.literal(dest = dest.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflicts]
  }
  
  extension [Self <: Conflicts](x: Self) {
    
    inline def setConflicts(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Conflicts): Self = StObject.set(x, "conflicts", value.asInstanceOf[js.Any])
    
    inline def setConflictsUndefined: Self = StObject.set(x, "conflicts", js.undefined)
    
    inline def setDest(value: ReindexDestination): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
    
    inline def setMax_docs(value: long): Self = StObject.set(x, "max_docs", value.asInstanceOf[js.Any])
    
    inline def setMax_docsUndefined: Self = StObject.set(x, "max_docs", js.undefined)
    
    inline def setScript(value: typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod.Script): Self = StObject.set(x, "script", value.asInstanceOf[js.Any])
    
    inline def setScriptUndefined: Self = StObject.set(x, "script", js.undefined)
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSource(value: ReindexSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
  }
}
