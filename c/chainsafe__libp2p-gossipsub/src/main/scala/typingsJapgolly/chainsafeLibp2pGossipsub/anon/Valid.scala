package typingsJapgolly.chainsafeLibp2pGossipsub.anon

import typingsJapgolly.chainsafeLibp2pGossipsub.chainsafeLibp2pGossipsubBooleans.`true`
import typingsJapgolly.chainsafeLibp2pGossipsub.distSrcUtilsBuildRawMessageMod.ValidationResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Valid
  extends StObject
     with ValidationResult {
  
  var message: typingsJapgolly.libp2pInterfacePubsub.mod.Message
  
  var valid: `true`
}
object Valid {
  
  inline def apply(message: typingsJapgolly.libp2pInterfacePubsub.mod.Message): Valid = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], valid = true)
    __obj.asInstanceOf[Valid]
  }
  
  extension [Self <: Valid](x: Self) {
    
    inline def setMessage(value: typingsJapgolly.libp2pInterfacePubsub.mod.Message): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setValid(value: `true`): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
  }
}
