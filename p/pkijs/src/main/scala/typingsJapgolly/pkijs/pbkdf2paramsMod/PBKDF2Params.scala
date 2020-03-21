package typingsJapgolly.pkijs.pbkdf2paramsMod

import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.CallbackTo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PBKDF2Params extends js.Object {
  var iterationCount: Double
  var keyLength: Double
  var prf: typingsJapgolly.pkijs.algorithmIdentifierMod.default
  var salt: js.Any
  def fromSchema(schema: js.Any): Unit
  def toJSON(): js.Any
  def toSchema(): js.Any
}

object PBKDF2Params {
  @scala.inline
  def apply(
    fromSchema: js.Any => Callback,
    iterationCount: Double,
    keyLength: Double,
    prf: typingsJapgolly.pkijs.algorithmIdentifierMod.default,
    salt: js.Any,
    toJSON: CallbackTo[js.Any],
    toSchema: CallbackTo[js.Any]
  ): PBKDF2Params = {
    val __obj = js.Dynamic.literal(iterationCount = iterationCount.asInstanceOf[js.Any], keyLength = keyLength.asInstanceOf[js.Any], prf = prf.asInstanceOf[js.Any], salt = salt.asInstanceOf[js.Any])
    __obj.updateDynamic("fromSchema")(js.Any.fromFunction1((t0: js.Any) => fromSchema(t0).runNow()))
    __obj.updateDynamic("toJSON")(toJSON.toJsFn)
    __obj.updateDynamic("toSchema")(toSchema.toJsFn)
    __obj.asInstanceOf[PBKDF2Params]
  }
}

