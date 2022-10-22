package typingsJapgolly.pulumiKubernetes.typesOutputMod.flowcontrol.v1beta2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UserSubject holds detailed information for user-kind subject.
  */
trait UserSubjectPatch extends StObject {
  
  /**
    * `name` is the username that matches, or "*" to match all usernames. Required.
    */
  var name: String
}
object UserSubjectPatch {
  
  inline def apply(name: String): UserSubjectPatch = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSubjectPatch]
  }
  
  extension [Self <: UserSubjectPatch](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
