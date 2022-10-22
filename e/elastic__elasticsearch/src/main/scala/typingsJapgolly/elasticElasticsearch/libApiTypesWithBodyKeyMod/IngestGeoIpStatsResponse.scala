package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IngestGeoIpStatsResponse extends StObject {
  
  var nodes: Record[Id, IngestGeoIpStatsGeoIpNodeDatabases]
  
  var stats: IngestGeoIpStatsGeoIpDownloadStatistics
}
object IngestGeoIpStatsResponse {
  
  inline def apply(
    nodes: Record[Id, IngestGeoIpStatsGeoIpNodeDatabases],
    stats: IngestGeoIpStatsGeoIpDownloadStatistics
  ): IngestGeoIpStatsResponse = {
    val __obj = js.Dynamic.literal(nodes = nodes.asInstanceOf[js.Any], stats = stats.asInstanceOf[js.Any])
    __obj.asInstanceOf[IngestGeoIpStatsResponse]
  }
  
  extension [Self <: IngestGeoIpStatsResponse](x: Self) {
    
    inline def setNodes(value: Record[Id, IngestGeoIpStatsGeoIpNodeDatabases]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
    
    inline def setStats(value: IngestGeoIpStatsGeoIpDownloadStatistics): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
  }
}
