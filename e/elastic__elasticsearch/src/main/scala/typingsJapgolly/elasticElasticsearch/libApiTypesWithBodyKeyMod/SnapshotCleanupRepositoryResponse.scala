package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotCleanupRepositoryResponse extends StObject {
  
  var results: SnapshotCleanupRepositoryCleanupRepositoryResults
}
object SnapshotCleanupRepositoryResponse {
  
  inline def apply(results: SnapshotCleanupRepositoryCleanupRepositoryResults): SnapshotCleanupRepositoryResponse = {
    val __obj = js.Dynamic.literal(results = results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapshotCleanupRepositoryResponse]
  }
  
  extension [Self <: SnapshotCleanupRepositoryResponse](x: Self) {
    
    inline def setResults(value: SnapshotCleanupRepositoryCleanupRepositoryResults): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
  }
}
