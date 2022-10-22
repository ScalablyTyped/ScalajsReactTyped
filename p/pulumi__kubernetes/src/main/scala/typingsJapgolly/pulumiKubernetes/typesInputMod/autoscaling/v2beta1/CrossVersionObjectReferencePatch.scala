package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CrossVersionObjectReference contains enough information to let you identify the referred resource.
  */
trait CrossVersionObjectReferencePatch extends StObject {
  
  /**
    * API version of the referent
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object CrossVersionObjectReferencePatch {
  
  inline def apply(): CrossVersionObjectReferencePatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CrossVersionObjectReferencePatch]
  }
  
  extension [Self <: CrossVersionObjectReferencePatch](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
