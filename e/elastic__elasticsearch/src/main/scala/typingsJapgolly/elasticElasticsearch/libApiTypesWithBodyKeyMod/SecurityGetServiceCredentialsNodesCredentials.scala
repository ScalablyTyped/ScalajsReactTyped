package typingsJapgolly.elasticElasticsearch.libApiTypesWithBodyKeyMod

import typingsJapgolly.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityGetServiceCredentialsNodesCredentials extends StObject {
  
  var _nodes: NodeStatistics
  
  var file_tokens: Record[String, SecurityGetServiceCredentialsNodesCredentialsFileToken]
}
object SecurityGetServiceCredentialsNodesCredentials {
  
  inline def apply(
    _nodes: NodeStatistics,
    file_tokens: Record[String, SecurityGetServiceCredentialsNodesCredentialsFileToken]
  ): SecurityGetServiceCredentialsNodesCredentials = {
    val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], file_tokens = file_tokens.asInstanceOf[js.Any])
    __obj.asInstanceOf[SecurityGetServiceCredentialsNodesCredentials]
  }
  
  extension [Self <: SecurityGetServiceCredentialsNodesCredentials](x: Self) {
    
    inline def setFile_tokens(value: Record[String, SecurityGetServiceCredentialsNodesCredentialsFileToken]): Self = StObject.set(x, "file_tokens", value.asInstanceOf[js.Any])
    
    inline def set_nodes(value: NodeStatistics): Self = StObject.set(x, "_nodes", value.asInstanceOf[js.Any])
  }
}
