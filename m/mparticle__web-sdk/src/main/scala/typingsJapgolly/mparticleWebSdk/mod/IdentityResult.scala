package typingsJapgolly.mparticleWebSdk.mod

import japgolly.scalajs.react.CallbackTo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IdentityResult extends StObject {
  
  var body: IdentityResultBody
  
  def getPreviousUser(): User
  
  def getUser(): User
  
  var httpCode: Any
}
object IdentityResult {
  
  inline def apply(
    body: IdentityResultBody,
    getPreviousUser: CallbackTo[User],
    getUser: CallbackTo[User],
    httpCode: Any
  ): IdentityResult = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], getPreviousUser = getPreviousUser.toJsFn, getUser = getUser.toJsFn, httpCode = httpCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[IdentityResult]
  }
  
  extension [Self <: IdentityResult](x: Self) {
    
    inline def setBody(value: IdentityResultBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setGetPreviousUser(value: CallbackTo[User]): Self = StObject.set(x, "getPreviousUser", value.toJsFn)
    
    inline def setGetUser(value: CallbackTo[User]): Self = StObject.set(x, "getUser", value.toJsFn)
    
    inline def setHttpCode(value: Any): Self = StObject.set(x, "httpCode", value.asInstanceOf[js.Any])
  }
}
