package typingsJapgolly.pkijs.rsaesoaepparamsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAESOAEPParams extends js.Object {
  var hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var maskGenAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var pSourceAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object RSAESOAEPParams {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    hashAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    maskGenAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    pSourceAlgorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): RSAESOAEPParams = {
    val __obj = js.Dynamic.literal(hashAlgorithm = hashAlgorithm.asInstanceOf[js.Any], maskGenAlgorithm = maskGenAlgorithm.asInstanceOf[js.Any], pSourceAlgorithm = pSourceAlgorithm.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[RSAESOAEPParams]
  }
}

