package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowDistinguisherMethod specifies the method of a flow distinguisher.
  */
trait FlowDistinguisherMethod extends StObject {
  
  /**
    * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
    */
  var `type`: Input[String]
}
object FlowDistinguisherMethod {
  
  inline def apply(`type`: Input[String]): FlowDistinguisherMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlowDistinguisherMethod]
  }
  
  extension [Self <: FlowDistinguisherMethod](x: Self) {
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
