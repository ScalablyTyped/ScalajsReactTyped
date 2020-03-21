package typingsJapgolly.pkijs.envelopedDataMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import org.scalajs.dom.crypto.Algorithm
import typingsJapgolly.pkijs.AnonHmacHashAlgorithm
import typingsJapgolly.pkijs.AnonKdfAlgorithm
import typingsJapgolly.pkijs.AnonRecipientCertificate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnvelopedData extends js.Object {
  var encryptedContentInfo: typingsJapgolly.pkijs.encryptedContentInfoMod.default
  var originatorInfo: js.UndefOr[typingsJapgolly.pkijs.originatorInfoMod.default] = js.undefined
  var recipientInfos: js.Array[typingsJapgolly.pkijs.recipientInfoMod.default]
  var unprotectedAttrs: js.UndefOr[js.Array[typingsJapgolly.pkijs.attributeMod.default]] = js.undefined
  var version: Double
  /**
    * Helpers function for filling "RecipientInfo" based on recipient's certificate.
    * Problem with WebCrypto is that for RSA certificates we have only one option - "key transport" and
    * for ECC certificates we also have one option - "key agreement". As soon as Google will implement
    * DH algorithm it would be possible to use "key agreement" also for RSA certificates.
    * @param {Certificate} [certificate] Recipient's certificate
    * @param {*} [parameters] Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} [variant] Variant = 1 is for "key transport", variant = 2 is for "key agreement". In fact the "variant" is unneccessary now because Google has no DH algorithm implementation. Thus key encryption scheme would be choosen by certificate type only: "key transport" for RSA and "key agreement" for ECC certificates.
    */
  def addRecipientByCertificate(
    certificate: typingsJapgolly.pkijs.certificateMod.default,
    parameters: AnonKdfAlgorithm,
    variant: Double
  ): Boolean
  /**
    * Add recipient based on pre-defined data like password or KEK
    * @param {ArrayBuffer} preDefinedData ArrayBuffer with pre-defined data
    * @param {*} parameters Additional parameters neccessary for "fine tunning" of encryption process
    * @param {number} variant Variant = 1 for pre-defined "key encryption key" (KEK). Variant = 2 for password-based encryption.
    */
  def addRecipientByPreDefinedData(
    preDefinedData: scala.scalajs.js.typedarray.ArrayBuffer,
    parameters: AnonHmacHashAlgorithm,
    variant: Double
  ): Boolean
  /**
    * Decrypt existing CMS Enveloped Data content
    * @param {number} recipientIndex Index of recipient
    * @param {*} parameters Additional parameters
    * @returns {Promise}
    */
  def decrypt(recipientIndex: Double, parameters: AnonRecipientCertificate): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  /**
    * Create a new CMS Enveloped Data content with encrypted data
    * @param {Algorithm} contentEncryptionAlgorithm WebCrypto algorithm. For the moment here could be only "AES-CBC" or "AES-GCM" algorithms.
    * @param {ArrayBuffer} contentToEncrypt Content to encrypt
    * @returns {Promise}
    */
  def encrypt(contentEncryptionAlgorithm: Algorithm, contentToEncrypt: scala.scalajs.js.typedarray.ArrayBuffer): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object EnvelopedData {
  @scala.inline
  def apply(
    addRecipientByCertificate: (typingsJapgolly.pkijs.certificateMod.default, AnonKdfAlgorithm, Double) => CallbackTo[Boolean],
    addRecipientByPreDefinedData: (scala.scalajs.js.typedarray.ArrayBuffer, AnonHmacHashAlgorithm, Double) => CallbackTo[Boolean],
    decrypt: (Double, AnonRecipientCertificate) => CallbackTo[js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]],
    encrypt: (Algorithm, scala.scalajs.js.typedarray.ArrayBuffer) => CallbackTo[js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer]],
    encryptedContentInfo: typingsJapgolly.pkijs.encryptedContentInfoMod.default,
    fromSchema: js.Any => Callback,
    recipientInfos: js.Array[typingsJapgolly.pkijs.recipientInfoMod.default],
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    version: Double,
    originatorInfo: typingsJapgolly.pkijs.originatorInfoMod.default = null,
    unprotectedAttrs: js.Array[typingsJapgolly.pkijs.attributeMod.default] = null
  ): EnvelopedData = {
    val __obj = js.Dynamic.literal(encryptedContentInfo = encryptedContentInfo.asInstanceOf[js.Any], recipientInfos = recipientInfos.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("addRecipientByCertificate")(js.Any.fromFunction3((t0: typingsJapgolly.pkijs.certificateMod.default, t1: typingsJapgolly.pkijs.AnonKdfAlgorithm, t2: scala.Double) => addRecipientByCertificate(t0, t1, t2).runNow()))
    __obj.updateDynamic("addRecipientByPreDefinedData")(js.Any.fromFunction3((t0: scala.scalajs.js.typedarray.ArrayBuffer, t1: typingsJapgolly.pkijs.AnonHmacHashAlgorithm, t2: scala.Double) => addRecipientByPreDefinedData(t0, t1, t2).runNow()))
    __obj.updateDynamic("decrypt")(js.Any.fromFunction2((t0: scala.Double, t1: typingsJapgolly.pkijs.AnonRecipientCertificate) => decrypt(t0, t1).runNow()))
    __obj.updateDynamic("encrypt")(js.Any.fromFunction2((t0: org.scalajs.dom.crypto.Algorithm, t1: scala.scalajs.js.typedarray.ArrayBuffer) => encrypt(t0, t1).runNow()))
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    if (originatorInfo != null) __obj.updateDynamic("originatorInfo")(originatorInfo.asInstanceOf[js.Any])
    if (unprotectedAttrs != null) __obj.updateDynamic("unprotectedAttrs")(unprotectedAttrs.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnvelopedData]
  }
}

