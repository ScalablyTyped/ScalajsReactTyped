package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ResourceQuotaStatus defines the enforced hard limits and observed use.
  */
trait ResourceQuotaStatusPatch extends StObject {
  
  /**
    * Hard is the set of enforced hard limits for each named resource. More info: https://kubernetes.io/docs/concepts/policy/resource-quotas/
    */
  var hard: StringDictionary[String]
  
  /**
    * Used is the current observed total usage of the resource in the namespace.
    */
  var used: StringDictionary[String]
}
object ResourceQuotaStatusPatch {
  
  inline def apply(hard: StringDictionary[String], used: StringDictionary[String]): ResourceQuotaStatusPatch = {
    val __obj = js.Dynamic.literal(hard = hard.asInstanceOf[js.Any], used = used.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceQuotaStatusPatch]
  }
  
  extension [Self <: ResourceQuotaStatusPatch](x: Self) {
    
    inline def setHard(value: StringDictionary[String]): Self = StObject.set(x, "hard", value.asInstanceOf[js.Any])
    
    inline def setUsed(value: StringDictionary[String]): Self = StObject.set(x, "used", value.asInstanceOf[js.Any])
  }
}
