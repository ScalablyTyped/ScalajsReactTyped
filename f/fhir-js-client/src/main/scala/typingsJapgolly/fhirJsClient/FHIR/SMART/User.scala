package typingsJapgolly.fhirJsClient.FHIR.SMART

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * User in context
  */
trait User extends StObject {
  
  /**
    * Fetch the current user information from server. The library expects the userId to be of the format "ResourceType/Id"
    */
  def read(): js.Promise[Response]
}
object User {
  
  inline def apply(read: CallbackTo[js.Promise[Response]]): User = {
    val __obj = js.Dynamic.literal(read = read.toJsFn)
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setRead(value: CallbackTo[js.Promise[Response]]): Self = StObject.set(x, "read", value.toJsFn)
  }
}
