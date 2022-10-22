package typingsJapgolly.cswAasJs

import typingsJapgolly.cswAasJs.distComponentsAuthenticationCheckLoginMod.CheckLoginProps
import typingsJapgolly.cswAasJs.distComponentsAuthorizationClientRoleMod.ClientRoleProps
import typingsJapgolly.cswAasJs.distComponentsAuthorizationRealmRoleMod.RealmRoleProps
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextMod.AuthContextType
import typingsJapgolly.cswAasJs.distComponentsContextAuthContextProviderMod.AuthContextProps
import typingsJapgolly.react.mod.Context
import typingsJapgolly.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("csw-aas-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("csw-aas-js", "AuthContext")
  @js.native
  val AuthContext: Context[AuthContextType] = js.native
  
  inline def AuthContextProvider(props: AuthContextProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("AuthContextProvider")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def CheckLogin(hasChildrenError: CheckLoginProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CheckLogin")(hasChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  inline def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("ClientRole")(hasClientRoleClientChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  /**
    * React component which renders Login button.
    */
  inline def Login(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Login")().asInstanceOf[Element]
  
  /**
    * React component which renders Logout button.
    */
  inline def Logout(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Logout")().asInstanceOf[Element]
  
  inline def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("RealmRole")(hasRealmRoleChildrenError.asInstanceOf[js.Any]).asInstanceOf[Element]
}
