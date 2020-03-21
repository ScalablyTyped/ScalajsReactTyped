package typingsJapgolly.sshpk.mod

import typingsJapgolly.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("sshpk", "Certificate")
@js.native
class Certificate protected () extends js.Object {
  def this(opts: js.Any) = this()
  var issuer: String = js.native
  var issuerKey: String = js.native
  var serial: String = js.native
  var signatures: String = js.native
  var subjectKey: String = js.native
  var subjects: js.Array[Identity] = js.native
  var validFrom: String = js.native
  var validUntil: String = js.native
  def fingerprint(algo: String): Fingerprint = js.native
  def hash(algo: String): String = js.native
  def isExpired(when: js.Date): Boolean = js.native
  def isSignedBy(issuerCert: Certificate): Boolean = js.native
  def isSignedByKey(issuerKey: Key): Boolean = js.native
  def signWith(key: Key): Unit = js.native
  def toBuffer(format: String): Buffer = js.native
  def toBuffer(format: String, options: js.Any): Buffer = js.native
  def toString(format: String): String = js.native
  def toString(format: String, options: js.Any): String = js.native
}

/* static members */
@JSImport("sshpk", "Certificate")
@js.native
object Certificate extends js.Object {
  var formats: Formats = js.native
  def create(subjectOrSubjects: String, key: Key, issuer: String, issuerKey: PrivateKey, options: js.Any): Certificate = js.native
  def createSelfSigned(subjectOrSubjects: String, key: Key, options: js.Any): Certificate = js.native
  def isCertificate(data: String, ver: String): Boolean = js.native
  def isCertificate(data: Buffer, ver: String): Boolean = js.native
  def parse(data: String, format: String, options: js.Any): Certificate = js.native
  def parse(data: Buffer, format: String, options: js.Any): Certificate = js.native
}

