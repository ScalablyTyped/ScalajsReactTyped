package typingsJapgolly.winrtUwp.Windows.Security.Authentication.Web.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WebAccountScope extends js.Object

/** Represents the scope of a web account. */
@JSGlobal("Windows.Security.Authentication.Web.Provider.WebAccountScope")
@js.native
object WebAccountScope extends js.Object {
  /** Scope that hides the account from PC settings. Use this scope if you do not want the user's login to persist. For these accounts, only per-app tokens should be retained. */
  @js.native
  sealed trait perApplication extends WebAccountScope
  
  /** Scope for single-sign-on accounts that appear in PC settings. This is the default scope. */
  @js.native
  sealed trait perUser extends WebAccountScope
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WebAccountScope with Double] = js.native
  /* 1 */ @js.native
  object perApplication extends TopLevel[perApplication with Double]
  
  /* 0 */ @js.native
  object perUser extends TopLevel[perUser with Double]
  
}

