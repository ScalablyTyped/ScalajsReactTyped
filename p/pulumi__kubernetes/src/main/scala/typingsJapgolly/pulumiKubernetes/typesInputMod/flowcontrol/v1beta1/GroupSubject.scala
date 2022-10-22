package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GroupSubject holds detailed information for group-kind subject.
  */
trait GroupSubject extends StObject {
  
  /**
    * name is the user group that matches, or "*" to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
    */
  var name: Input[String]
}
object GroupSubject {
  
  inline def apply(name: Input[String]): GroupSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupSubject]
  }
  
  extension [Self <: GroupSubject](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
