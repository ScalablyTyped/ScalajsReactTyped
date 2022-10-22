package typingsJapgolly.pulumiKubernetes.typesOutputMod.core.v1

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
  var finalizers: js.Array[String]
}
object NamespaceSpecPatch {
  
  inline def apply(finalizers: js.Array[String]): NamespaceSpecPatch = {
    val __obj = js.Dynamic.literal(finalizers = finalizers.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamespaceSpecPatch]
  }
  
  extension [Self <: NamespaceSpecPatch](x: Self) {
    
    inline def setFinalizers(value: js.Array[String]): Self = StObject.set(x, "finalizers", value.asInstanceOf[js.Any])
    
    inline def setFinalizersVarargs(value: String*): Self = StObject.set(x, "finalizers", js.Array(value*))
  }
}
