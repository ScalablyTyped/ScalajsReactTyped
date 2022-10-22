package typingsJapgolly.ssh2.mod

import typingsJapgolly.ssh2.ssh2Strings.password
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordAuthContext
  extends AuthContextBase
     with AuthContext {
  
  /** The method of authentication. */
  @JSName("method")
  var method_PasswordAuthContext: password = js.native
  
  /** The password sent by the client. */
  var password: String = js.native
  
  def requestChange(prompt: String, cb: ChangePasswordCallback): Unit = js.native
}
