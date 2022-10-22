package typingsJapgolly.azureMsalBrowser.mod

import typingsJapgolly.azureMsalCommon.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object InteractionRequiredAuthErrorMessage {
  
  @JSImport("@azure/msal-browser", "InteractionRequiredAuthErrorMessage")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@azure/msal-browser", "InteractionRequiredAuthErrorMessage.native_account_unavailable")
  @js.native
  def nativeAccountUnavailable: Code = js.native
  
  inline def nativeAccountUnavailable_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("native_account_unavailable")(x.asInstanceOf[js.Any])
  
  @JSImport("@azure/msal-browser", "InteractionRequiredAuthErrorMessage.noTokensFoundError")
  @js.native
  def noTokensFoundError: Code = js.native
  inline def noTokensFoundError_=(x: Code): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("noTokensFoundError")(x.asInstanceOf[js.Any])
}
