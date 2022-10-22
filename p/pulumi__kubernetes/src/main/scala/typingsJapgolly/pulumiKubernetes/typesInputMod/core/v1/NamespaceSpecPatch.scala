package typingsJapgolly.pulumiKubernetes.typesInputMod.core.v1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * NamespaceSpec describes the attributes on a Namespace.
  */
trait NamespaceSpecPatch extends StObject {
  
  /**
    * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
    */
  var finalizers: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
}
object NamespaceSpecPatch {
  
  inline def apply(): NamespaceSpecPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamespaceSpecPatch]
  }
  
  extension [Self <: NamespaceSpecPatch](x: Self) {
    
    inline def setFinalizers(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
    
    inline def setFinalizersUndefined: Self = StObject.set(x, "finalizers", js.undefined)
    
    inline def setFinalizersVarargs(value: Input[String]*): Self = StObject.set(x, "finalizers", js.Array(value*))
  }
}
