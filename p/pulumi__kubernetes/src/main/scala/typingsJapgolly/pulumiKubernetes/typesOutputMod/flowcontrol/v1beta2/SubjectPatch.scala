package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta2

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
  var group: GroupSubjectPatch
  
  /**
    * `kind` indicates which one of the other fields is non-empty. Required
    */
  var kind: String
  
  /**
    * `serviceAccount` matches ServiceAccounts.
    */
  var serviceAccount: ServiceAccountSubjectPatch
  
  /**
    * `user` matches based on username.
    */
  var user: UserSubjectPatch
}
object SubjectPatch {
  
  inline def apply(
    group: GroupSubjectPatch,
    kind: String,
    serviceAccount: ServiceAccountSubjectPatch,
    user: UserSubjectPatch
  ): SubjectPatch = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], serviceAccount = serviceAccount.asInstanceOf[js.Any], user = user.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubjectPatch]
  }
  
  extension [Self <: SubjectPatch](x: Self) {
    
    inline def setGroup(value: GroupSubjectPatch): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: ServiceAccountSubjectPatch): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setUser(value: UserSubjectPatch): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
  }
}
