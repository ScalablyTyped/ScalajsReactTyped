package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ServiceAccountSubject holds detailed information for service-account-kind subject.
  */
trait ServiceAccountSubjectPatch extends StObject {
  
  /**
    * `name` is the name of matching ServiceAccount objects, or "*" to match regardless of name. Required.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * `namespace` is the namespace of matching ServiceAccount objects. Required.
    */
  var namespace: js.UndefOr[Input[String]] = js.undefined
}
object ServiceAccountSubjectPatch {
  
  inline def apply(): ServiceAccountSubjectPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAccountSubjectPatch]
  }
  
  extension [Self <: ServiceAccountSubjectPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNamespace(value: Input[String]): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    inline def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
  }
}
