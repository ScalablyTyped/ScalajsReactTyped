package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
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
  var limits: StringDictionary[String]
  
  /**
    * Requests describes the minimum amount of compute resources required. If Requests is omitted for a container, it defaults to Limits if that is explicitly specified, otherwise to an implementation-defined value. More info: https://kubernetes.io/docs/concepts/configuration/manage-resources-containers/
    */
  var requests: StringDictionary[String]
}
object ResourceRequirementsPatch {
  
  inline def apply(limits: StringDictionary[String], requests: StringDictionary[String]): ResourceRequirementsPatch = {
    val __obj = js.Dynamic.literal(limits = limits.asInstanceOf[js.Any], requests = requests.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceRequirementsPatch]
  }
  
  extension [Self <: ResourceRequirementsPatch](x: Self) {
    
    inline def setLimits(value: StringDictionary[String]): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
    
    inline def setRequests(value: StringDictionary[String]): Self = StObject.set(x, "requests", value.asInstanceOf[js.Any])
  }
}
