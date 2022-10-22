package typingsJapgolly.devtoolsProtocol.mod.Protocol.DOM

import typingsJapgolly.devtoolsProtocol.mod.Protocol.Runtime.RemoteObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolveNodeResponse extends StObject {
  
  /**
    * JavaScript object wrapper for given node.
    */
  var `object`: RemoteObject
}
object ResolveNodeResponse {
  
  inline def apply(`object`: RemoteObject): ResolveNodeResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveNodeResponse]
  }
  
  extension [Self <: ResolveNodeResponse](x: Self) {
    
    inline def setObject(value: RemoteObject): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
