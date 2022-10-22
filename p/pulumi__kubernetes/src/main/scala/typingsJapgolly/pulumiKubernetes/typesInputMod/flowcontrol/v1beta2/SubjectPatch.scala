package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
  */
trait SubjectPatch extends StObject {
  
  /**
    * `group` matches based on user group name.
    */
  var group: js.UndefOr[Input[GroupSubjectPatch]] = js.undefined
  
  /**
    * `kind` indicates which one of the other fields is non-empty. Required
    */
  var kind: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * `serviceAccount` matches ServiceAccounts.
    */
  var serviceAccount: js.UndefOr[Input[ServiceAccountSubjectPatch]] = js.undefined
  
  /**
    * `user` matches based on username.
    */
  var user: js.UndefOr[Input[UserSubjectPatch]] = js.undefined
}
object SubjectPatch {
  
  inline def apply(): SubjectPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubjectPatch]
  }
  
  extension [Self <: SubjectPatch](x: Self) {
    
    inline def setGroup(value: Input[GroupSubjectPatch]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setServiceAccount(value: Input[ServiceAccountSubjectPatch]): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUser(value: Input[UserSubjectPatch]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
