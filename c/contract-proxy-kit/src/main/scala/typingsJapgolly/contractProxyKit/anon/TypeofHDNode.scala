package typingsJapgolly.contractProxyKit.anon

import org.scalablytyped.runtime.Instantiable8
import typingsJapgolly.ethers.mod.ethers.utils.HDNode
import typingsJapgolly.ethersprojectBytes.mod.BytesLike
import typingsJapgolly.ethersprojectHdnode.mod.Mnemonic
import typingsJapgolly.ethersprojectWordlists.mod.Wordlist
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofHDNode
  extends StObject
     with Instantiable8[
      /* constructorGuard */ Any, 
      /* privateKey */ String, 
      /* publicKey */ String, 
      /* parentFingerprint */ String, 
      /* chainCode */ String, 
      /* index */ Double, 
      /* depth */ Double, 
      /* mnemonicOrPath */ Mnemonic, 
      HDNode
    ] {
  
  def _fromSeed(seed: BytesLike, mnemonic: Mnemonic): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromExtendedKey(extendedKey: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromMnemonic(mnemonic: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: String, wordlist: Wordlist): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: Unit, wordlist: String): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  def fromMnemonic(mnemonic: String, password: Unit, wordlist: Wordlist): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
  
  def fromSeed(seed: BytesLike): typingsJapgolly.ethersprojectHdnode.mod.HDNode = js.native
}
