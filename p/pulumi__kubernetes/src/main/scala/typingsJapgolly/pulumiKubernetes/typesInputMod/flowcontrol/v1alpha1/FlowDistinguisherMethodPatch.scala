package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FlowDistinguisherMethod specifies the method of a flow distinguisher.
  */
trait FlowDistinguisherMethodPatch extends StObject {
  
  /**
    * `type` is the type of flow distinguisher method The supported types are "ByUser" and "ByNamespace". Required.
    */
  var `type`: js.UndefOr[Input[String]] = js.undefined
}
object FlowDistinguisherMethodPatch {
  
  inline def apply(): FlowDistinguisherMethodPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FlowDistinguisherMethodPatch]
  }
  
  extension [Self <: FlowDistinguisherMethodPatch](x: Self) {
    
    inline def setType(value: Input[String]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
