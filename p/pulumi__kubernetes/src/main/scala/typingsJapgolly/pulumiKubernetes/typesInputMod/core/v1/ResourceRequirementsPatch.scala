package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceRequirements describes the compute resource requirements.
  */
trait ResourceRequirementsPatch extends StObject {
  
  /**
    * Limits describes the maximum amount of compute resources allowed. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
    */
  var limits: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
  
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
    */
  var requests: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
}
object ResourceRequirementsPatch {
  
  inline def apply(): ResourceRequirementsPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceRequirementsPatch]
  }
  
  extension [Self <: ResourceRequirementsPatch](x: Self) {
    
    inline def setLimits(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
    
    inline def setRequests(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
    
    inline def setRequestsUndefined: Self = StObject.set(x, "requests", js.undefined)
  }
}
