package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * LimitResponse defines how to handle requests that can not be executed right now.
  */
trait LimitResponse extends StObject {
  
  /**
    * `queuing` holds the configuration parameters for queuing. This field may be non-empty only if `type` is `"Queue"`.
    */
  var queuing: js.UndefOr[Input[QueuingConfiguration]] = js.undefined
  
  /**
    * `type` is "Queue" or "Reject". "Queue" means that requests that can not be executed upon arrival are held in a queue until they can be executed or a queuing limit is reached. "Reject" means that requests that can not be executed upon arrival are rejected. Required.
    */
  var `type`: Input[String]
}
object LimitResponse {
  
  inline def apply(`type`: Input[String]): LimitResponse = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitResponse]
  }
  
  extension [Self <: LimitResponse](x: Self) {
    
    inline def setQueuing(value: Input[QueuingConfiguration]): Self = StObject.set(x, "queuing", value.asInstanceOf[js.Any])
    
    inline def setQueuingUndefined: Self = StObject.set(x, "queuing", js.undefined)
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
