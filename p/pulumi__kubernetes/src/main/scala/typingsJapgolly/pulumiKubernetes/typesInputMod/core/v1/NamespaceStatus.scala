package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceStatus is information about the current status of a Namespace.
  */
trait NamespaceStatus extends StObject {
  
  /**
    * Represents the latest available observations of a namespace's current state.
    */
  var conditions: js.UndefOr[Input[js.Array[Input[NamespaceCondition]]]] = js.undefined
  
  /**
    * Phase is the current lifecycle phase of the namespace. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var phase: js.UndefOr[Input[String]] = js.undefined
}
object NamespaceStatus {
  
  inline def apply(): NamespaceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceStatus]
  }
  
  extension [Self <: NamespaceStatus](x: Self) {
    
    inline def setConditions(value: Input[js.Array[Input[NamespaceCondition]]]): Self = StObject.set(x, "conditions", value.asInstanceOf[js.Any])
    
    inline def setConditionsUndefined: Self = StObject.set(x, "conditions", js.undefined)
    
    inline def setConditionsVarargs(value: Input[NamespaceCondition]*): Self = StObject.set(x, "conditions", js.Array(value*))
    
    inline def setPhase(value: Input[String]): Self = StObject.set(x, "phase", value.asInstanceOf[js.Any])
    
    inline def setPhaseUndefined: Self = StObject.set(x, "phase", js.undefined)
  }
}
