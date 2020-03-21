package typingsJapgolly.pkijs

import org.scalajs.dom.crypto.CryptoKey
import typingsJapgolly.pkijs.signedDataMod.VerifyParams
import typingsJapgolly.pkijs.signedDataMod.VerifyResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pkijs/src/TimeStampResp", JSImport.Namespace)
@js.native
object timeStampRespMod extends js.Object {
  @js.native
  trait TimeStampResp extends js.Object {
    var status: typingsJapgolly.pkijs.pkistatusinfoMod.default = js.native
    var timeStampToken: js.UndefOr[typingsJapgolly.pkijs.contentInfoMod.default] = js.native
    def fromSchema(schema: js.Any): Unit = js.native
    /**
      * Sign current TSP Response
      * @param {CryptoKey} privateKey Private key for "subjectPublicKeyInfo" structure
      * @param {string} [hashAlgorithm] Hashing algorithm. Default SHA-1
      * @returns {Promise}
      */
    def sign(privateKey: CryptoKey): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    def sign(privateKey: CryptoKey, hashAlgorithm: String): js.Thenable[scala.scalajs.js.typedarray.ArrayBuffer] = js.native
    def toJSON(): js.Any = js.native
    def toSchema(): js.Any = js.native
    /**
      * Verify current TSP Response
      * @param {VerifyParams} verificationParameters Input parameters for verification
      * @returns {Promise}
      */
    def verify(verificationParameters: VerifyParams): js.Thenable[VerifyResult] = js.native
  }
  
  @js.native
  class default () extends TimeStampResp {
    def this(params: js.Any) = this()
  }
  
  /* static members */
  @js.native
  object default extends js.Object {
    /**
      * Compare values with default values for all class members
      * @param {string} memberName String name for a class member
      * @param {*} memberValue Value to compare with default value
      */
    def compareWithDefault(memberName: String, memberValue: js.Any): Boolean = js.native
    def defaultValues(memberName: String): js.Any = js.native
    def schema(): js.Any = js.native
    def schema(parameters: js.Any): js.Any = js.native
  }
  
}

