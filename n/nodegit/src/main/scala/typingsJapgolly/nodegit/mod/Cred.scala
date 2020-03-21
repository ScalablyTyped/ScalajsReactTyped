package typingsJapgolly.nodegit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit", "Cred")
@js.native
class Cred ()
  extends typingsJapgolly.nodegit.credMod.Cred

/* static members */
@JSImport("nodegit", "Cred")
@js.native
object Cred extends js.Object {
  def defaultNew(): typingsJapgolly.nodegit.credMod.Cred = js.native
  def sshKeyFromAgent(username: String): typingsJapgolly.nodegit.credMod.Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typingsJapgolly.nodegit.credMod.Cred = js.native
  def usernameNew(username: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): typingsJapgolly.nodegit.credMod.Cred = js.native
}

