package typingsJapgolly.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodesInfoNodeInfoSearchRemote extends StObject {
  
  var connect: String
}
object NodesInfoNodeInfoSearchRemote {
  
  inline def apply(connect: String): NodesInfoNodeInfoSearchRemote = {
    val __obj = js.Dynamic.literal(connect = connect.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodesInfoNodeInfoSearchRemote]
  }
  
  extension [Self <: NodesInfoNodeInfoSearchRemote](x: Self) {
    
    inline def setConnect(value: String): Self = StObject.set(x, "connect", value.asInstanceOf[js.Any])
  }
}
