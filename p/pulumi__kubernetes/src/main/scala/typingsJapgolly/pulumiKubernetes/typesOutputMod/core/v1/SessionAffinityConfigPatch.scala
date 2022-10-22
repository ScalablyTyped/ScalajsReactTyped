package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SessionAffinityConfig represents the configurations of session affinity.
  */
trait SessionAffinityConfigPatch extends StObject {
  
  /**
    * clientIP contains the configurations of Client IP based session affinity.
    */
  var clientIP: ClientIPConfigPatch
}
object SessionAffinityConfigPatch {
  
  inline def apply(clientIP: ClientIPConfigPatch): SessionAffinityConfigPatch = {
    val __obj = js.Dynamic.literal(clientIP = clientIP.asInstanceOf[js.Any])
    __obj.asInstanceOf[SessionAffinityConfigPatch]
  }
  
  extension [Self <: SessionAffinityConfigPatch](x: Self) {
    
    inline def setClientIP(value: ClientIPConfigPatch): Self = StObject.set(x, "clientIP", value.asInstanceOf[js.Any])
  }
}
