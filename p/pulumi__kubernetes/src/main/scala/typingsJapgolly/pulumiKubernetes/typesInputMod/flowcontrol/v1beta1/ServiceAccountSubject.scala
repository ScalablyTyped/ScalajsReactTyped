package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountSubject holds detailed information for service-account-kind subject.
  */
trait ServiceAccountSubject extends StObject {
  
  /**
    * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
    */
  var name: Input[String]
  
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  var namespace: Input[String]
}
object ServiceAccountSubject {
  
  inline def apply(name: Input[String], namespace: Input[String]): ServiceAccountSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceAccountSubject]
  }
  
  extension [Self <: ServiceAccountSubject](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
  }
}
