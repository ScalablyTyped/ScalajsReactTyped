package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoIngestProcessor extends StObject {
  
  var `type`: String
}
object NodesInfoNodeInfoIngestProcessor {
  
  inline def apply(`type`: String): NodesInfoNodeInfoIngestProcessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoIngestProcessor]
  }
  
  extension [Self <: NodesInfoNodeInfoIngestProcessor](x: Self) {
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
