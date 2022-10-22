package typingsJapgolly.pulumiKubernetes.typesInputMod.flowcontrol.v1beta2

import typingsJapgolly.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * UserSubject holds detailed information for user-kind subject.
  */
trait UserSubject extends StObject {
  
  /**
    * `name` is the username that matches, or "*" to match all usernames. Required.
    */
  var name: Input[String]
}
object UserSubject {
  
  inline def apply(name: Input[String]): UserSubject = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserSubject]
  }
  
  extension [Self <: UserSubject](x: Self) {
    
    inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
