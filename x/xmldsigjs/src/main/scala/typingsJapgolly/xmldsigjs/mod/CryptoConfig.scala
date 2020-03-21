package typingsJapgolly.xmldsigjs.mod

import org.scalajs.dom.crypto.Algorithm
import typingsJapgolly.std.AlgorithmIdentifier
import typingsJapgolly.xmldsigjs.algorithmMod.HashAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.IHashAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.ISignatureAlgorithm
import typingsJapgolly.xmldsigjs.algorithmMod.SignatureAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xmldsigjs", "CryptoConfig")
@js.native
class CryptoConfig ()
  extends typingsJapgolly.xmldsigjs.cryptoConfigMod.CryptoConfig

/* static members */
@JSImport("xmldsigjs", "CryptoConfig")
@js.native
object CryptoConfig extends js.Object {
  def CreateFromName(): typingsJapgolly.xmldsigjs.xmlMod.Transform = js.native
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
  def CreateFromName(name: String): typingsJapgolly.xmldsigjs.xmlMod.Transform = js.native
  def CreateHashAlgorithm(namespace: String): HashAlgorithm = js.native
  def CreateSignatureAlgorithm(method: typingsJapgolly.xmldsigjs.signatureMethodMod.SignatureMethod): SignatureAlgorithm = js.native
  def GetHashAlgorithm(algorithm: AlgorithmIdentifier): IHashAlgorithm = js.native
  def GetSignatureAlgorithm(algorithm: Algorithm): ISignatureAlgorithm = js.native
}

