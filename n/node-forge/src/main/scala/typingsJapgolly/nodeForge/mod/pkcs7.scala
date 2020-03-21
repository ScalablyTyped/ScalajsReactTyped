package typingsJapgolly.nodeForge.mod

import typingsJapgolly.nodeForge.AnonAuthenticatedAttributes
import typingsJapgolly.nodeForge.AnonDetached
import typingsJapgolly.nodeForge.AnonValue
import typingsJapgolly.nodeForge.mod.asn1.Asn1
import typingsJapgolly.nodeForge.mod.pki.Certificate
import typingsJapgolly.nodeForge.mod.util.ByteBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pkcs7")
@js.native
object pkcs7 extends js.Object {
  @js.native
  trait PkcsSignedData extends js.Object {
    var content: js.UndefOr[String | ByteBuffer] = js.native
    var contentInfo: js.UndefOr[AnonValue] = js.native
    def addCertificate(certificate: String): Unit = js.native
    def addCertificate(certificate: Certificate): Unit = js.native
    def addSigner(options: AnonAuthenticatedAttributes): Unit = js.native
    def sign(): Unit = js.native
    def sign(options: AnonDetached): Unit = js.native
    def toAsn1(): Asn1 = js.native
  }
  
  def createSignedData(): PkcsSignedData = js.native
}

