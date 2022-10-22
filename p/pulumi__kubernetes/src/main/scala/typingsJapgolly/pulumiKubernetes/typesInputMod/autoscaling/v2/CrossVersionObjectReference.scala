package typingsJapgolly.pulumiKubernetes.typesInputMod.autoscaling.v2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CrossVersionObjectReference contains enough information to let you identify the referred resource.
  */
trait CrossVersionObjectReference extends StObject {
  
  /**
    * API version of the referent
    */
  var apiVersion: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * Kind of the referent; More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds"
    */
  var kind: Input[String]
  
  /**
    * Name of the referent; More info: http://kubernetes.io/docs/user-guide/identifiers#names
    */
  var name: Input[String]
}
object CrossVersionObjectReference {
  
  inline def apply(kind: Input[String], name: Input[String]): CrossVersionObjectReference = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossVersionObjectReference]
  }
  
  extension [Self <: CrossVersionObjectReference](x: Self) {
    
    inline def setApiVersion(value: Input[String]): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
