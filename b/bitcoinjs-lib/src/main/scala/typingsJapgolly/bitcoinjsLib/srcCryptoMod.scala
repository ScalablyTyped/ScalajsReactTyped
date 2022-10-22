package typingsJapgolly.bitcoinjsLib

import typingsJapgolly.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcCryptoMod {
  
  @JSImport("bitcoinjs-lib/src/crypto", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hash160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def hash256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("hash256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
  
  inline def taggedHash(prefix: TaggedHashPrefix, data: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("taggedHash")(prefix.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Buffer]
  
  /* Rewritten from type alias, can be one of: 
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashchallenge
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashaux
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.BIP0340Slashnonce
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.TapLeaf
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.TapBranch
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.TapSighash
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.TapTweak
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.`KeyAgg list`
    - typingsJapgolly.bitcoinjsLib.bitcoinjsLibStrings.`KeyAgg coefficient`
  */
  trait TaggedHashPrefix extends StObject
}
