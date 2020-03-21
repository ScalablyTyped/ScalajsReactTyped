package typingsJapgolly.nodegit.credMod.Cred

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cred", "Cred")
@js.native
object ^ extends js.Object {
  def defaultNew(): typingsJapgolly.nodegit.credMod.Cred = js.native
  def sshKeyFromAgent(username: String): typingsJapgolly.nodegit.credMod.Cred = js.native
  def sshKeyMemoryNew(username: String, publicKey: String, privateKey: String, passphrase: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = js.native
  def sshKeyNew(username: String, publicKey: String, privateKey: String, passphrase: String): typingsJapgolly.nodegit.credMod.Cred = js.native
  def usernameNew(username: String): js.Promise[typingsJapgolly.nodegit.credMod.Cred] = js.native
  def userpassPlaintextNew(username: String, password: String): typingsJapgolly.nodegit.credMod.Cred = js.native
}

