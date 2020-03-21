package typingsJapgolly.ethers.ethersMod

import typingsJapgolly.ethers.ethersStrings.mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0
import typingsJapgolly.ethers.typesMod.Arrayish
import typingsJapgolly.ethers.typesMod.Wordlist
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ethers/dist/types/ethers", "HDNode")
@js.native
object HDNode extends js.Object {
  val defaultPath: mSlash44ApostropheSlash60ApostropheSlash0ApostropheSlash0Slash0 = js.native
  def entropyToMnemonic(entropy: Arrayish): String = js.native
  def entropyToMnemonic(entropy: Arrayish, wordlist: Wordlist): String = js.native
  def fromMnemonic(mnemonic: String): typingsJapgolly.ethers.typesMod.HDNode = js.native
  def fromMnemonic(mnemonic: String, wordlist: Wordlist): typingsJapgolly.ethers.typesMod.HDNode = js.native
  def fromSeed(seed: Arrayish): typingsJapgolly.ethers.typesMod.HDNode = js.native
  def isValidMnemonic(mnemonic: String): Boolean = js.native
  def isValidMnemonic(mnemonic: String, wordlist: Wordlist): Boolean = js.native
  def mnemonicToEntropy(mnemonic: String): String = js.native
  def mnemonicToEntropy(mnemonic: String, wordlist: Wordlist): String = js.native
  def mnemonicToSeed(mnemonic: String): String = js.native
  def mnemonicToSeed(mnemonic: String, password: String): String = js.native
}

