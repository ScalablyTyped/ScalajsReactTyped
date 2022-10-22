package typingsJapgolly.ionic.definitionsMod

import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.ionic.anon.IdNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISession extends StObject {
  
  def getUser(): IdNumber
  
  def getUserToken(): String
  
  def isLoggedIn(): Boolean
  
  def login(email: String, password: String): js.Promise[Unit]
  
  def logout(): js.Promise[Unit]
  
  def ssoLogin(email: String): js.Promise[Unit]
  
  def tokenLogin(token: String): js.Promise[Unit]
}
object ISession {
  
  inline def apply(
    getUser: CallbackTo[IdNumber],
    getUserToken: CallbackTo[String],
    isLoggedIn: CallbackTo[Boolean],
    login: (String, String) => js.Promise[Unit],
    logout: CallbackTo[js.Promise[Unit]],
    ssoLogin: String => js.Promise[Unit],
    tokenLogin: String => js.Promise[Unit]
  ): ISession = {
    val __obj = js.Dynamic.literal(getUser = getUser.toJsFn, getUserToken = getUserToken.toJsFn, isLoggedIn = isLoggedIn.toJsFn, login = js.Any.fromFunction2(login), logout = logout.toJsFn, ssoLogin = js.Any.fromFunction1(ssoLogin), tokenLogin = js.Any.fromFunction1(tokenLogin))
    __obj.asInstanceOf[ISession]
  }
  
  extension [Self <: ISession](x: Self) {
    
    inline def setGetUser(value: CallbackTo[IdNumber]): Self = StObject.set(x, "getUser", value.toJsFn)
    
    inline def setGetUserToken(value: CallbackTo[String]): Self = StObject.set(x, "getUserToken", value.toJsFn)
    
    inline def setIsLoggedIn(value: CallbackTo[Boolean]): Self = StObject.set(x, "isLoggedIn", value.toJsFn)
    
    inline def setLogin(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "login", js.Any.fromFunction2(value))
    
    inline def setLogout(value: CallbackTo[js.Promise[Unit]]): Self = StObject.set(x, "logout", value.toJsFn)
    
    inline def setSsoLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "ssoLogin", js.Any.fromFunction1(value))
    
    inline def setTokenLogin(value: String => js.Promise[Unit]): Self = StObject.set(x, "tokenLogin", js.Any.fromFunction1(value))
  }
}
