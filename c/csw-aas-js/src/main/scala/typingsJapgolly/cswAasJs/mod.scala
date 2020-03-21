package typingsJapgolly.cswAasJs

import japgolly.scalajs.react.raw.React.Element
import typingsJapgolly.cswAasJs.authContextMod.AuthContextType
import typingsJapgolly.cswAasJs.authContextProviderMod.AuthContextProps
import typingsJapgolly.cswAasJs.checkLoginMod.CheckLoginProps
import typingsJapgolly.cswAasJs.clientRoleMod.ClientRoleProps
import typingsJapgolly.cswAasJs.realmRoleMod.RealmRoleProps
import typingsJapgolly.react.mod.Context
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("csw-aas-js", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val AuthContext: Context[AuthContextType] = js.native
  def AuthContextProvider(props: AuthContextProps): Element = js.native
  def CheckLogin(hasChildrenError: CheckLoginProps): Element = js.native
  def ClientRole(hasClientRoleClientChildrenError: ClientRoleProps): Element = js.native
  /**
    * React component which renders Login button.
    */
  def Login(): Element = js.native
  /**
    * React component which renders Logout button.
    */
  def Logout(): Element = js.native
  def RealmRole(hasRealmRoleChildrenError: RealmRoleProps): Element = js.native
}

