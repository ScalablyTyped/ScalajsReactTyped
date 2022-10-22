package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1alpha1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitResponse defines how to handle requests that can not be executed right now.
  */
trait LimitResponsePatch extends StObject {
  
  /**
    * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`.
    */
  var queuing: QueuingConfigurationPatch
  
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  var `type`: String
}
object LimitResponsePatch {
  
  inline def apply(queuing: QueuingConfigurationPatch, `type`: String): LimitResponsePatch = {
    val __obj = js.Dynamic.literal(queuing = queuing.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitResponsePatch]
  }
  
  extension [Self <: LimitResponsePatch](x: Self) {
    
    inline def setQueuing(value: QueuingConfigurationPatch): Self = StObject.set(x, "queuing", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
