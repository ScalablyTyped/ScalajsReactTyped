package typingsJapgolly.nodeForge.mod.pkcs12

import typingsJapgolly.nodeForge.AnonAlgorithm
import typingsJapgolly.nodeForge.mod.asn1.Asn1
import typingsJapgolly.nodeForge.mod.pki.Certificate
import typingsJapgolly.nodeForge.mod.pki.PrivateKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs12.toPkcs12Asn1")
@js.native
object toPkcs12Asn1 extends js.Object {
  def apply(key: PrivateKey, cert: js.Array[Certificate]): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: String, options: AnonAlgorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: js.Array[Certificate], password: Null, options: AnonAlgorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: String, options: AnonAlgorithm): Asn1 = js.native
  def apply(key: PrivateKey, cert: Certificate, password: Null, options: AnonAlgorithm): Asn1 = js.native
}

