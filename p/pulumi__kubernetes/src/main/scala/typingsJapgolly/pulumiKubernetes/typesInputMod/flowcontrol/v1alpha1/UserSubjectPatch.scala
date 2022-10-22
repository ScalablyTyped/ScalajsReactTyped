package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1alpha1

import typingsJapgolly.pulumiPulumi.outputMod.Input
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
  var name: js.UndefOr[Input[String]] = js.undefined
}
object UserSubjectPatch {
  
  inline def apply(): UserSubjectPatch = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSubjectPatch]
  }
  
  extension [Self <: UserSubjectPatch](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
