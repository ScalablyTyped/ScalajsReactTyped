package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
trait NamespaceStatusPatch extends StObject {
  
  /**
    * Represents the latest available observations of a namespace's current state.
    */
  var conditions: js.Array[NamespaceConditionPatch]
  
  /**
    * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: String
}
object NamespaceStatusPatch {
  
  inline def apply(conditions: js.Array[NamespaceConditionPatch], phase: String): NamespaceStatusPatch = {
    val __obj = js.Dynamic.literal(conditions = conditions.asInstanceOf[js.Any], phase = phase.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceStatusPatch]
  }
  
  extension [Self <: NamespaceStatusPatch](x: Self) {
    
    inline def setConditions(value: js.Array[NamespaceConditionPatch]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsVarargs(value: NamespaceConditionPatch*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setPhase(value: String): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
  }
}
