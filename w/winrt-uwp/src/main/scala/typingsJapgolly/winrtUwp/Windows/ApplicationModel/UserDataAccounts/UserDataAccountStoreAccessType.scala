package typingsJapgolly.winrtUwp.Windows.ApplicationModel.UserDataAccounts

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait UserDataAccountStoreAccessType extends js.Object

/** Specifies the requested access type in a call to RequestStoreAsync . */
@JSGlobal("Windows.ApplicationModel.UserDataAccounts.UserDataAccountStoreAccessType")
@js.native
object UserDataAccountStoreAccessType extends js.Object {
  /** Read-only access to app user data accounts and system user data accounts. */
  @js.native
  sealed trait allAccountsReadOnly extends UserDataAccountStoreAccessType
  
  /** Read/write access to the current app's user data accounts. */
  @js.native
  sealed trait appAccountsReadWrite extends UserDataAccountStoreAccessType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[UserDataAccountStoreAccessType with Double] = js.native
  /* 0 */ @js.native
  object allAccountsReadOnly extends TopLevel[allAccountsReadOnly with Double]
  
  /* 1 */ @js.native
  object appAccountsReadWrite extends TopLevel[appAccountsReadWrite with Double]
  
}

