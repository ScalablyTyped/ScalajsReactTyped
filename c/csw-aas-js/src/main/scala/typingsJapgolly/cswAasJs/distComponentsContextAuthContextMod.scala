package typingsJapgolly.cswAasJs

import japgolly.scalajs.react.Callback
import typingsJapgolly.cswAasJs.distComponentsAuthMod.Auth
import typingsJapgolly.react.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsContextAuthContextMod {
  
  @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  /**
    * Default state for AuthContextProvider
    * @type {{auth: undefined, login: (function(): boolean), logout: (function(): boolean)}}
    */
  object AuthContextDefaultState {
    
    @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContextDefaultState")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("csw-aas-js/dist/components/context/AuthContext", "AuthContextDefaultState.auth")
    @js.native
    def auth: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any = js.native
    inline def auth_=(x: /* is `Null`, but independent javascript fields cannot be in scala 3 */ Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("auth")(x.asInstanceOf[js.Any])
    
    inline def login(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("login")().asInstanceOf[Unit]
    
    inline def logout(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("logout")().asInstanceOf[Unit]
  }
  
  /* import warning: parser.TsParser#tsDeclVar Dropped IArray(Consumer) */ @JSImport("csw-aas-js/dist/components/context/AuthContext", "Provider")
  @js.native
  val Provider: typingsJapgolly.react.mod.Provider[AuthContextType] = js.native
  
  trait AuthContextType extends StObject {
    
    var auth: Auth | Null
    
    def login(): Unit
    
    def logout(): Unit
  }
  object AuthContextType {
    
    inline def apply(login: Callback, logout: Callback): AuthContextType = {
      val __obj = js.Dynamic.literal(login = login.toJsFn, logout = logout.toJsFn, auth = null)
      __obj.asInstanceOf[AuthContextType]
    }
    
    extension [Self <: AuthContextType](x: Self) {
      
      inline def setAuth(value: Auth): Self = StObject.set(x, "auth", value.asInstanceOf[js.Any])
      
      inline def setAuthNull: Self = StObject.set(x, "auth", null)
      
      inline def setLogin(value: Callback): Self = StObject.set(x, "login", value.toJsFn)
      
      inline def setLogout(value: Callback): Self = StObject.set(x, "logout", value.toJsFn)
    }
  }
}
