package typingsJapgolly.pkijs.certIDMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Integer
import typingsJapgolly.asn1js.mod.OctetString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CertID extends js.Object {
  var hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var issuerKeyHash: OctetString
  var issuerNameHash: OctetString
  var serialNumber: Integer
  /**
    * Making OCSP certificate identifier for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typingsJapgolly.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
  def fromSchema(schema: js.Any): Unit
  /**
    * Check that two "CertIDs" are equal
    * @param {CertID} certificateID Identifier of the certificate to be checked
    * @returns {boolean}
    */
  def isEqual(certificateID: CertID): Boolean
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object CertID {
  @scala.inline
  def apply(
    createForCertificate: (typingsJapgolly.pkijs.certificateMod.default, CreateFroCertificateParams) => CallbackTo[js.Thenable[Unit]],
    fromSchema: js.Any => Callback,
    hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    isEqual: CertID => CallbackTo[Boolean],
    issuerKeyHash: OctetString,
    issuerNameHash: OctetString,
    serialNumber: Integer,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): CertID = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], issuerKeyHash = issuerKeyHash.asInstanceOf[js.Any], issuerNameHash = issuerNameHash.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any])
    __obj.updateDynamic("createForCertificate")(js.Any.fromFunction2((t0: typingsJapgolly.pkijs.certificateMod.default, t1: typingsJapgolly.pkijs.certIDMod.CreateFroCertificateParams) => createForCertificate(t0, t1).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("isEqual")(js.Any.fromFunction1((t0: typingsJapgolly.pkijs.certIDMod.CertID) => isEqual(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[CertID]
  }
}

