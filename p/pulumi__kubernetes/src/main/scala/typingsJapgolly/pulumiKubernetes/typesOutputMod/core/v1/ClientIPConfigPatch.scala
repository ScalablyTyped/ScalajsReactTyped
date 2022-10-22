package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ClientIPConfig represents the configurations of Client IP based session affinity.
  */
trait ClientIPConfigPatch extends StObject {
  
  /**
    * timeoutSeconds specifies the seconds of ClientIP type session sticky time. The value must be >0 && <=86400(for 1 day) if ServiceAffinity == "ClientIP". Default value is 10800(for 3 hours).
    */
  var timeoutSeconds: Double
}
object ClientIPConfigPatch {
  
  inline def apply(timeoutSeconds: Double): ClientIPConfigPatch = {
    val __obj = js.Dynamic.literal(timeoutSeconds = timeoutSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientIPConfigPatch]
  }
  
  extension [Self <: ClientIPConfigPatch](x: Self) {
    
    inline def setTimeoutSeconds(value: Double): Self = StObject.set(x, "timeoutSeconds", value.asInstanceOf[js.Any])
  }
}
