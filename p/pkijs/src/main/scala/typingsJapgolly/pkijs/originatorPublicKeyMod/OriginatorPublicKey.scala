package typingsJapgolly.pkijs.originatorPublicKeyMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import typingsJapgolly.asn1js.mod.BitString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OriginatorPublicKey extends js.Object {
  var algorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var publicKey: BitString
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object OriginatorPublicKey {
  @scala.inline
  def apply(
    algorithm: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Callback,
    publicKey: BitString,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): OriginatorPublicKey = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[OriginatorPublicKey]
  }
}

