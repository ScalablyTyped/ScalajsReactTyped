package typingsJapgolly.storybookMdx1Csf

import japgolly.scalajs.react.Callback
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTsStoriesHeaderMod {
  
  @JSImport("@storybook/mdx1-csf/dist/ts/stories/Header", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Header(hasUserOnLoginOnLogoutOnCreateAccount: HeaderProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Header")(hasUserOnLoginOnLogoutOnCreateAccount.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait HeaderProps extends StObject {
    
    def onCreateAccount(): Unit
    
    def onLogin(): Unit
    
    def onLogout(): Unit
    
    var user: js.UndefOr[User] = js.undefined
  }
  object HeaderProps {
    
    inline def apply(onCreateAccount: Callback, onLogin: Callback, onLogout: Callback): HeaderProps = {
      val __obj = js.Dynamic.literal(onCreateAccount = onCreateAccount.toJsFn, onLogin = onLogin.toJsFn, onLogout = onLogout.toJsFn)
      __obj.asInstanceOf[HeaderProps]
    }
    
    extension [Self <: HeaderProps](x: Self) {
      
      inline def setOnCreateAccount(value: Callback): Self = StObject.set(x, "onCreateAccount", value.toJsFn)
      
      inline def setOnLogin(value: Callback): Self = StObject.set(x, "onLogin", value.toJsFn)
      
      inline def setOnLogout(value: Callback): Self = StObject.set(x, "onLogout", value.toJsFn)
      
      inline def setUser(value: User): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  trait User extends StObject {
    
    var name: String
  }
  object User {
    
    inline def apply(name: String): User = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[User]
    }
    
    extension [Self <: User](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
