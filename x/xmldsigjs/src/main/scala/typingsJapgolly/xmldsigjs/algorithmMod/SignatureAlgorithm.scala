package typingsJapgolly.xmldsigjs.algorithmMod

import org.scalajs.dom.crypto.Algorithm
import org.scalajs.dom.crypto.CryptoKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typingsJapgolly.xmldsigjs.algorithmMod.IAlgorithm because Already inherited
- typingsJapgolly.xmldsigjs.algorithmMod.ISignatureAlgorithm because var conflicts: algorithm, namespaceURI. Inlined Sign, Verify, Verify */ @JSImport("xmldsigjs/build/types/algorithm", "SignatureAlgorithm")
@js.native
abstract class SignatureAlgorithm () extends XmlAlgorithm {
  /**
    * Sign the given string using the given key
    */
  def Sign(signedInfo: String, signingKey: CryptoKey, algorithm: Algorithm): js.Promise[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
  /**
    * Verify the given signature of the given string using key
    */
  def Verify(signedInfo: String, key: CryptoKey, signatureValue: scala.scalajs.js.typedarray.Uint8Array): js.Promise[Boolean] = js.native
  def Verify(
    signedInfo: String,
    key: CryptoKey,
    signatureValue: scala.scalajs.js.typedarray.Uint8Array,
    algorithm: Algorithm
  ): js.Promise[Boolean] = js.native
}

