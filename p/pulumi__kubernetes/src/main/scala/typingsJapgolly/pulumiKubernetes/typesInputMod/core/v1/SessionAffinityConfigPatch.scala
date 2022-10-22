package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var clientIP: js.UndefOr[Input[ClientIPConfigPatch]] = js.undefined
}
object SessionAffinityConfigPatch {
  
  inline def apply(): SessionAffinityConfigPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SessionAffinityConfigPatch]
  }
  
  extension [Self <: SessionAffinityConfigPatch](x: Self) {
    
    inline def setClientIP(value: Input[ClientIPConfigPatch]): Self = StObject.set(x, "clientIP", value.asInstanceOf[js.Any])
    
    inline def setClientIPUndefined: Self = StObject.set(x, "clientIP", js.undefined)
  }
}
