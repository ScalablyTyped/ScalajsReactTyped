package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.elasticElasticsearch.elasticElasticsearchBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmExplainLifecycleLifecycleExplainUnmanaged
  extends StObject
     with IlmExplainLifecycleLifecycleExplain {
  
  var index: IndexName
  
  var managed: `false`
}
object IlmExplainLifecycleLifecycleExplainUnmanaged {
  
  inline def apply(index: IndexName): IlmExplainLifecycleLifecycleExplainUnmanaged = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], managed = false)
    __obj.asInstanceOf[IlmExplainLifecycleLifecycleExplainUnmanaged]
  }
  
  extension [Self <: IlmExplainLifecycleLifecycleExplainUnmanaged](x: Self) {
    
    inline def setIndex(value: IndexName): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setManaged(value: `false`): Self = StObject.set(x, "managed", value.asInstanceOf[js.Any])
  }
}
