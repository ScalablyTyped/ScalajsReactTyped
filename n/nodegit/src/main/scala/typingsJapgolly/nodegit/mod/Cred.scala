package typingsJapgolly.nodegit.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit", "Cred")
@js.native
open class Cred ()
  extends typingsJapgolly.nodegit.credMod.Cred
/* static members */
object Cred {
  
  @JSImport("nodegit", "Cred")
  @js.native
  val ^ : js.Any = js.native
  
  inline def defaultNew(): typingsJapgolly.nodegit.credMod.Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultNew")().asInstanceOf[typingsJapgolly.nodegit.credMod.Cred]
  
  inline def sshKeyFromAgent(username: String): typingsJapgolly.nodegit.credMod.Cred = ^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyFromAgent")(username.asInstanceOf[js.Any]).asInstanceOf[typingsJapgolly.nodegit.credMod.Cred]
  
  inline def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyMemoryNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typingsJapgolly.nodegit.credMod.Cred]]
  
  inline def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typingsJapgolly.nodegit.credMod.Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("sshKeyNew")(username.asInstanceOf[js.Any], publicKey.asInstanceOf[js.Any], privateKey.asInstanceOf[js.Any], passphrase.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.credMod.Cred]
  
  inline def usernameNew(username: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = ^.asInstanceOf[js.Dynamic].applyDynamic("usernameNew")(username.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typingsJapgolly.nodegit.credMod.Cred]]
  
  inline def userpassPlaintextNew(username: String, password: String): typingsJapgolly.nodegit.credMod.Cred = (^.asInstanceOf[js.Dynamic].applyDynamic("userpassPlaintextNew")(username.asInstanceOf[js.Any], password.asInstanceOf[js.Any])).asInstanceOf[typingsJapgolly.nodegit.credMod.Cred]
}
