package typingsJapgolly.xmldsigjs

import org.scalajs.dom.crypto.Algorithm
import typingsJapgolly.std.AlgorithmIdentifier
import typingsJapgolly.xmldsigjs.algorithmMod.HashAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.IHashAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.SignatureAlgorithm
import typingsJapgolly.xmldsigjs.signatureMethodMod.SignatureMethod
import typingsJapgolly.xmldsigjs.xmlMod.Transform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs/build/types/crypto_config", JSImport.Namespace)
@js.native
object cryptoConfigMod extends js.Object {
  @js.native
  class CryptoConfig () extends js.Object
  
  /* static members */
  @js.native
  object CryptoConfig extends js.Object {
    def CreateFromName(): Transform = js.native
    /**
      * Creates Transform from given name
      * if name is not exist then throws error
      *
      * @static
      * @param {(string |)} [name=null]
      * @returns
      *
      * @memberOf CryptoConfig
      */
    def CreateFromName(name: String): Transform = js.native
    def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
    def CreateSignatureAlgorithm(method: SignatureMethod): SignatureAlgorithm = js.native
    def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
    def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
  }
  
}

