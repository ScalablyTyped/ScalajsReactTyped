package typingsJapgolly.pkijs.ocspresponseMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.Enumerated
import typingsJapgolly.pkijs.basicOCSPResponseMod.GetCertificateStatusResult
import typingsJapgolly.pkijs.certIDMod.CreateFroCertificateParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OCSPResponse extends js.Object {
  var responseBytes: js.UndefOr[typingsJapgolly.pkijs.responseBytesMod.default] = js.undefined
  var responseStatus: Enumerated
  /**
    * Making OCSP Request for specific certificate
    * @param {Certificate} certificate Certificate making OCSP Request for
    * @param {CreateFroCertificateParams} parameters Additional parameters
    * @returns {Promise}
    */
  def createForCertificate(certificate: typingsJapgolly.pkijs.certificateMod.default, parameters: CreateFroCertificateParams): js.Thenable[Unit]
  def fromSchema(schema: js.Any): Unit
  /**
    * Get OCSP response status for specific certificate
    * @param {Certificate} certificate
    * @param {Certificate} issuerCertificate
    * @returns {*}
    */
  def getCertificateStatus(
    certificate: typingsJapgolly.pkijs.certificateMod.default,
    issuerCertificate: typingsJapgolly.pkijs.certificateMod.default
  ): js.Thenable[GetCertificateStatusResult]
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OCSPResponse {
  @scala.inline
  def apply(
    createForCertificate: (typingsJapgolly.pkijs.certificateMod.default, CreateFroCertificateParams) => CallbackTo[js.Thenable[Unit]],
    fromSchema: js.Any => Callback,
    getCertificateStatus: (typingsJapgolly.pkijs.certificateMod.default, typingsJapgolly.pkijs.certificateMod.default) => CallbackTo[js.Thenable[GetCertificateStatusResult]],
    responseStatus: Enumerated,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    responseBytes: typingsJapgolly.pkijs.responseBytesMod.default = null
  ): OCSPResponse = {
    val __obj = js.Dynamic.literal(responseStatus = responseStatus.asInstanceOf[js.Any])
    __obj.updateDynamic("createForCertificate")(js.Any.fromFunction2((t0: typingsJapgolly.pkijs.certificateMod.default, t1: typingsJapgolly.pkijs.certIDMod.CreateFroCertificateParams) => createForCertificate(t0, t1).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("getCertificateStatus")(js.Any.fromFunction2((t0: typingsJapgolly.pkijs.certificateMod.default, t1: typingsJapgolly.pkijs.certificateMod.default) => getCertificateStatus(t0, t1).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (responseBytes != null) __obj.updateDynamic("responseBytes")(responseBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[OCSPResponse]
  }
}

