package typingsJapgolly.pkijs.pbes2paramsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBES2Params extends js.Object {
  var encryptionScheme: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var keyDerivationFunc: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBES2Params {
  @scala.inline
  def apply(
    encryptionScheme: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    fromSchema: js.Any => Callback,
    keyDerivationFunc: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PBES2Params = {
    val __obj = js.Dynamic.literal(encryptionScheme = encryptionScheme.asInstanceOf[js.Any], keyDerivationFunc = keyDerivationFunc.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PBES2Params]
  }
}

