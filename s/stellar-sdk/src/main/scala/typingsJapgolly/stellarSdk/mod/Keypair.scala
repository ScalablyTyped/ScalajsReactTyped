package typingsJapgolly.stellarSdk.mod

import typingsJapgolly.node.Buffer
import typingsJapgolly.stellarBase.AnonPublicKey
import typingsJapgolly.stellarBase.AnonType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("stellar-sdk", "Keypair")
@js.native
class Keypair protected ()
  extends typingsJapgolly.stellarBase.mod.Keypair {
  def this(keys: AnonPublicKey) = this()
  def this(keys: AnonType) = this()
}

/* static members */
@JSImport("stellar-sdk", "Keypair")
@js.native
object Keypair extends js.Object {
  def fromBase58Seed(secretSeed: String): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def fromPublicKey(publicKey: String): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def fromRawEd25519Seed(secretSeed: Buffer): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def fromSecret(secretKey: String): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def master(): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def master(networkPassphrase: String): typingsJapgolly.stellarBase.mod.Keypair = js.native
  def random(): typingsJapgolly.stellarBase.mod.Keypair = js.native
}

