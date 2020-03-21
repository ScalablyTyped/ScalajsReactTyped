package typingsJapgolly.pkijs.rsassapssparamsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSASSAPSSParams extends js.Object {
  /**
    * Algorithms of hashing (DEFAULT sha1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  /**
    * Algorithm of "mask generaion function (MGF)" (DEFAULT mgf1SHA1)
    * 
    * @type {AlgorithmIdentifier}
    * @memberOf RSASSAPSSParams
    */
  var maskGenAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  /**
    * Salt length (DEFAULT 20)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var saltLength: Double
  /**
    * (DEFAULT 1)
    * 
    * @type {number}
    * @memberOf RSASSAPSSParams
    */
  var trailerField: Double
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSASSAPSSParams {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    saltLength: Double,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any],
    trailerField: Double
  ): RSASSAPSSParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], saltLength = saltLength.asInstanceOf[js.Any], trailerField = trailerField.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RSASSAPSSParams]
  }
}

