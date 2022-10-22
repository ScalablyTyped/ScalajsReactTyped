package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Subject matches the originator of a request, as identified by the request authentication system. There are three ways of matching an originator; by user, group, or service account.
  */
trait Subject extends StObject {
  
  var group: js.UndefOr[Input[GroupSubject]] = js.undefined
  
  /**
    * Required
    */
  var kind: Input[String]
  
  var serviceAccount: js.UndefOr[Input[ServiceAccountSubject]] = js.undefined
  
  var user: js.UndefOr[Input[UserSubject]] = js.undefined
}
object Subject {
  
  inline def apply(kind: Input[String]): Subject = {
    val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subject]
  }
  
  extension [Self <: Subject](x: Self) {
    
    inline def setGroup(value: Input[GroupSubject]): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setGroupUndefined: Self = StObject.set(x, "group", js.undefined)
    
    inline def setKind(value: Input[String]): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setServiceAccount(value: Input[ServiceAccountSubject]): Self = StObject.set(x, "serviceAccount", value.asInstanceOf[js.Any])
    
    inline def setServiceAccountUndefined: Self = StObject.set(x, "serviceAccount", js.undefined)
    
    inline def setUser(value: Input[UserSubject]): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
