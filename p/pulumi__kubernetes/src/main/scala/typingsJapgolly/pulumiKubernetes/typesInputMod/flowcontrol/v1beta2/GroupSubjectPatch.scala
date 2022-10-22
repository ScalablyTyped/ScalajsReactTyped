package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GroupSubject holds detailed information for group-kind subject.
  */
trait GroupSubjectPatch extends StObject {
  
  /**
    * name is the user group that matches, or "*" to match all user groups. See https://github.com/kubernetes/apiserver/blob/master/pkg/authentication/user/user.go for some well-known group names. Required.
    */
  var name: js.UndefOr[Input[String]] = js.undefined
}
object GroupSubjectPatch {
  
  inline def apply(): GroupSubjectPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupSubjectPatch]
  }
  
  extension [Self <: GroupSubjectPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
