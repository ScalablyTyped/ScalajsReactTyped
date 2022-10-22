package typingsJapgolly.azureMsalBrowser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@azure/msal-browser", "AuthError")
@js.native
open class AuthError ()
  extends typingsJapgolly.azureMsalCommon.mod.AuthError {
  def this(errorCode: String) = this()
  def this(errorCode: String, errorMessage: String) = this()
  def this(errorCode: Unit, errorMessage: String) = this()
  def this(errorCode: String, errorMessage: String, suberror: String) = this()
  def this(errorCode: String, errorMessage: Unit, suberror: String) = this()
  def this(errorCode: Unit, errorMessage: String, suberror: String) = this()
  def this(errorCode: Unit, errorMessage: Unit, suberror: String) = this()
}
/* static members */
object AuthError {
  
  @JSImport("@azure/msal-browser", "AuthError")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Creates an error for post request failures.
    * @param errDesc
    * @returns
    */
  inline def createPostRequestFailed(errDesc: String): typingsJapgolly.azureMsalCommon.distErrorAuthErrorMod.AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createPostRequestFailed")(errDesc.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorAuthErrorMod.AuthError]
  
  /**
    * Creates an error that is thrown when something unexpected happens in the library.
    * @param errDesc
    */
  inline def createUnexpectedError(errDesc: String): typingsJapgolly.azureMsalCommon.distErrorAuthErrorMod.AuthError = ^.asInstanceOf[js.Dynamic].applyDynamic("createUnexpectedError")(errDesc.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.azureMsalCommon.distErrorAuthErrorMod.AuthError]
}
