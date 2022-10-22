package typingsJapgolly.awsSdk.clientsAppmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MeshStatus extends StObject {
  
  /**
    * The current mesh status.
    */
  var status: js.UndefOr[MeshStatusCode] = js.undefined
}
object MeshStatus {
  
  inline def apply(): MeshStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MeshStatus]
  }
  
  extension [Self <: MeshStatus](x: Self) {
    
    inline def setStatus(value: MeshStatusCode): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
