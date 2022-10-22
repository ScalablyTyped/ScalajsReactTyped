package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainManaged
  - typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainUnmanaged
*/
trait IlmExplainLifecycleLifecycleExplain extends StObject
object IlmExplainLifecycleLifecycleExplain {
  
  inline def IlmExplainLifecycleLifecycleExplainManaged(phase: Name, policy: Name): typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainManaged = {
    val __obj = js.Dynamic.literal(managed = true, phase = phase.asInstanceOf[js.Any], policy = policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainManaged]
  }
  
  inline def IlmExplainLifecycleLifecycleExplainUnmanaged(index: IndexName): typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainUnmanaged = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], managed = false)
    __obj.asInstanceOf[typingsJapgolly.elasticElasticsearch.libApiTypesMod.IlmExplainLifecycleLifecycleExplainUnmanaged]
  }
}
